package concurrent

trait Notifyable {
  def onCompletion(caller: Any, result: Any)
  def onProgress(caller: Any, progress: Any)
  def onInterruption(caller: Any)
  def onError(caller: Any, error: Any)
}
