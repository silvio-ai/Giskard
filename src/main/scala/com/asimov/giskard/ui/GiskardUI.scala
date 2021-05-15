package com.asimov.giskard.ui

import scala.swing.BorderPanel.Position.Center
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
