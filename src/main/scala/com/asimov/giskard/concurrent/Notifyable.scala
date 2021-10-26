package com.asimov.giskard.concurrent

trait Notifyable[T] {
  def onMessage(sender: Notifyable[T], msg: T): Unit
}
