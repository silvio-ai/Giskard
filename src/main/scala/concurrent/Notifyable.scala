package concurrent

trait Notifyable {
  def onCompletion(caller: Any, result: Any): Unit
  def onProgress(caller: Any, progress: Any): Unit
  def onInterruption(caller: Any): Unit
  def onError(caller: Any, error: Any): Unit
}
