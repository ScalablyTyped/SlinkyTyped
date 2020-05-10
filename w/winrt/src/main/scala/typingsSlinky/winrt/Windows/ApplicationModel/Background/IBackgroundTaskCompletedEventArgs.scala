package typingsSlinky.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundTaskCompletedEventArgs extends js.Object {
  var instanceId: String = js.native
  def checkResult(): Unit = js.native
}

object IBackgroundTaskCompletedEventArgs {
  @scala.inline
  def apply(checkResult: () => Unit, instanceId: String): IBackgroundTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(checkResult = js.Any.fromFunction0(checkResult), instanceId = instanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundTaskCompletedEventArgs]
  }
  @scala.inline
  implicit class IBackgroundTaskCompletedEventArgsOps[Self <: IBackgroundTaskCompletedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckResult(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkResult")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

