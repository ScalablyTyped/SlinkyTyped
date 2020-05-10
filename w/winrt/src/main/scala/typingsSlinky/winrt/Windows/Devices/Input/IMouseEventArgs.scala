package typingsSlinky.winrt.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMouseEventArgs extends js.Object {
  var mouseDelta: MouseDelta = js.native
}

object IMouseEventArgs {
  @scala.inline
  def apply(mouseDelta: MouseDelta): IMouseEventArgs = {
    val __obj = js.Dynamic.literal(mouseDelta = mouseDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseEventArgs]
  }
  @scala.inline
  implicit class IMouseEventArgsOps[Self <: IMouseEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMouseDelta(value: MouseDelta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseDelta")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

