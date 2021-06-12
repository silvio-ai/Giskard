package com.asimov.giskard.ui

import scala.swing.BorderPanel.Position.Center
import javax.swing.SwingUtilities
import scala.swing._

object GiskardUI extends SimpleSwingApplication {

  val ui = new BorderPanel {
    val map = new ClickableMapPanel(IPAClickableMap)
    layout(map) = Center
  }

  override def top: Frame = new MainFrame {
    resizable = false
    contents = ui
    title = "Giskard"
    location = new Point(400, 100)
  }
}

@main def main = {
  val giskardUI = GiskardUI
  SwingUtilities.invokeLater(new Runnable {
    def run = {
      giskardUI.top.peer.setVisible(true)
    }
  })

}