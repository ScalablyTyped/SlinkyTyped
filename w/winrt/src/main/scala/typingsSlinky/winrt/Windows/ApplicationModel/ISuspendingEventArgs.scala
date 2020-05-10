package typingsSlinky.winrt.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuspendingEventArgs extends js.Object {
  var suspendingOperation: SuspendingOperation = js.native
}

object ISuspendingEventArgs {
  @scala.inline
  def apply(suspendingOperation: SuspendingOperation): ISuspendingEventArgs = {
    val __obj = js.Dynamic.literal(suspendingOperation = suspendingOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuspendingEventArgs]
  }
  @scala.inline
  implicit class ISuspendingEventArgsOps[Self <: ISuspendingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuspendingOperation(value: SuspendingOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspendingOperation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

