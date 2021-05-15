package com.asimov.giskard.ui

import java.awt.Polygon
import scala.collection.mutable.ListBuffer
import scala.swing.Image

class ClickableMap(var image: Image) {
  var polygons: ListBuffer[Polygon] = new ListBuffer[Polygon]
  var symbols: ListBuffer[String] = new ListBuffer[String]
  var sound1Filenames: ListBuffer[String] = new ListBuffer[String]
  var sound2Filenames: ListBuffer[String] = new ListBuffer[String]

  def addRectangle(xTopLeft: Int, yTopLeft: Int, xBottomRight: Int, yBottomRight: Int, symbol: String): Unit = {
    this.addRectangle(xTopLeft, yTopLeft, xBottomRight, yBottomRight, symbol, null, null)
  }

  def addRectangle(xTopLeft: Int, yTopLeft: Int, xBottomRight: Int, yBottomRight: Int, symbol: String, sound1Filename: String): Unit = {
    this.addRectangle(xTopLeft, yTopLeft, xBottomRight, yBottomRight, symbol, sound1Filename, null)
  }

  def addRectangle(xTopLeft: Int, yTopLeft: Int, xBottomRight: Int, yBottomRight: Int, symbol: String, sound1Filename: String, sound2Filename: String): Unit = {
    val xPoly = Array(xTopLeft, xBottomRight, xBottomRight, xTopLeft)
    val yPoly = Array(yTopLeft, yTopLeft, yBottomRight, yBottomRight)
    val poly = new Polygon(xPoly, yPoly, xPoly.length)
    polygons += poly
    symbols += symbol
    sound1Filenames += sound1Filename
    sound2Filenames += sound2Filename
  }

}
