package typingsSlinky.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBackgroundTask extends js.Object {
  
  def run(taskInstance: IBackgroundTaskInstance): Unit = js.native
}
object IBackgroundTask {
  
  @scala.inline
  def apply(run: IBackgroundTaskInstance => Unit): IBackgroundTask = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[IBackgroundTask]
  }
  
  @scala.inline
  implicit class IBackgroundTaskOps[Self <: IBackgroundTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRun(value: IBackgroundTaskInstance => Unit): Self = this.set("run", js.Any.fromFunction1(value))
  }
}
