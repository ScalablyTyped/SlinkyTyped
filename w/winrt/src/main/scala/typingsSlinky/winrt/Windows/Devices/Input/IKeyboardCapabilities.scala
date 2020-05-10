package typingsSlinky.winrt.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeyboardCapabilities extends js.Object {
  var keyboardPresent: Double = js.native
}

object IKeyboardCapabilities {
  @scala.inline
  def apply(keyboardPresent: Double): IKeyboardCapabilities = {
    val __obj = js.Dynamic.literal(keyboardPresent = keyboardPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyboardCapabilities]
  }
  @scala.inline
  implicit class IKeyboardCapabilitiesOps[Self <: IKeyboardCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyboardPresent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardPresent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

