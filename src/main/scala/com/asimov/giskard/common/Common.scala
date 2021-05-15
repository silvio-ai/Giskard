package com.asimov.giskard.common

import scala.swing.SimpleSwingApplication

object Common {

  def getResourceUrl(_class: SimpleSwingApplication, path: String) = _class.resourceFromClassloader(path) ensuring(_ != null, "Couldn't find icon " + path)

}
