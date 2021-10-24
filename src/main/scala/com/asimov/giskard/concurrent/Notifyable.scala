package com.asimov.giskard.concurrent

sealed trait Notifyable[T] {
  def onMessage(sender: Notifyable[T], msg: T): Unit
}
