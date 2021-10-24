package com.asimov.giskard.ui

import com.asimov.giskard.concurrent.{GiskardMessages, Notifyable, NewSymbol}

import java.awt.{AlphaComposite, Color, Graphics2D, Toolkit}
import java.awt.geom.AffineTransform
import scala.swing.{Dimension, Panel, Point}
import javax.sound.sampled.AudioSystem
import javax.sound.sampled.Clip
import javax.sound.sampled.DataLine
import java.io.BufferedInputStream
import java.awt.datatransfer.StringSelection
import java.awt.event.InputEvent
import scala.swing.event.MouseReleased

class ClickableMapPanel(map: ClickableMap) extends Panel {
  var currentMapIndex: Int = -1
  val alpha: Float = 0.2f
  val fill = Color.BLUE
  var currentSymbol = ""
  var doClipboard = true
  var receiver: Notifyable[GiskardMessages] = null

  if (map != null) {
    val w = map.image.getWidth(null)
    val h = map.image.getHeight(null)
    preferredSize = new Dimension(w, h)
  }

  listenTo(mouse.clicks)
  reactions += {
    case e: MouseReleased => {
      currentMapIndex = getSymbolIndex(e.point)
      if(currentMapIndex >= 0) {
        val oldSymbol = currentSymbol
        currentSymbol = map.symbols(currentMapIndex)
        repaint()
        e.modifiers match {
          case InputEvent.SHIFT_DOWN_MASK => {
            val filename = map.sound1Filenames(currentMapIndex)
            if (filename != null) playPhonemeSound(filename)
          }
          case InputEvent.ALT_DOWN_MASK => {
            val filename = map.sound2Filenames(currentMapIndex)
            if (filename != null) playPhonemeSound(filename)
          }
          case InputEvent.CTRL_DOWN_MASK => {
            if (oldSymbol != null) currentSymbol = oldSymbol + currentSymbol
            if (doClipboard) copy2Clipboard(currentSymbol)
            if(receiver != null) receiver.onMessage(null, NewSymbol(currentSymbol))  //.onCompletion(this, currentSymbol)
          }
          case _ => {
            if (doClipboard) copy2Clipboard(currentSymbol)
            if(receiver != null) receiver.onMessage(null, NewSymbol(currentSymbol))  //.onCompletion(this, currentSymbol)
          }
        }
      }
    }
  }

  def getSymbolIndex(point: Point): Int = {
    for(i <- 0 until map.polygons.length) if(map.polygons(i).contains(point)) return i
    -1
  }

  override def paint(g:Graphics2D) = {
    super.paint(g)
    g.drawImage(map.image, new AffineTransform(), null)
    g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha))
    g.setColor(this.fill)
    if (this.currentMapIndex > -1) {
      g.fillPolygon(map.polygons(currentMapIndex))
    }
  }


  def copy2Clipboard(value: String): Unit = {
    if(value != null) {
      val ss = new StringSelection(value)
      val clpbrd = Toolkit.getDefaultToolkit.getSystemClipboard
      try clpbrd.setContents(ss, null)
      catch {
        case e: Exception =>
      }
    }
  }


  def playPhonemeSound(filename: String): Unit = {
    new Thread(new Runnable() {
      override def run(): Unit = {
        try {
          val bufferedIn = new BufferedInputStream(classOf[Nothing].getResourceAsStream("/sounds/" + filename))
          val audioStream = AudioSystem.getAudioInputStream(bufferedIn)
          val info = new DataLine.Info(classOf[Clip], audioStream.getFormat)
          val clip = AudioSystem.getLine(info).asInstanceOf[Clip]
          clip.open(audioStream)
          clip.start()
        } catch {
          case e: Exception =>
            System.err.println(e.getMessage)
        }
      }
    }).start()
  }

}
