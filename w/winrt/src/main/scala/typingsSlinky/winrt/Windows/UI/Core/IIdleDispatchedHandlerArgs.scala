package typingsSlinky.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIdleDispatchedHandlerArgs extends js.Object {
  var isDispatcherIdle: Boolean = js.native
}

object IIdleDispatchedHandlerArgs {
  @scala.inline
  def apply(isDispatcherIdle: Boolean): IIdleDispatchedHandlerArgs = {
    val __obj = js.Dynamic.literal(isDispatcherIdle = isDispatcherIdle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIdleDispatchedHandlerArgs]
  }
  @scala.inline
  implicit class IIdleDispatchedHandlerArgsOps[Self <: IIdleDispatchedHandlerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDispatcherIdle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDispatcherIdle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

