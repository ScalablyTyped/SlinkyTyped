package typingsSlinky.winrtUwp.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports the ability to determine the capabilities of any connected hardware keyboards. */
@js.native
trait KeyboardCapabilities extends js.Object {
  /** Gets a value that indicates whether a hardware keyboard is detected. */
  var keyboardPresent: Double = js.native
}

object KeyboardCapabilities {
  @scala.inline
  def apply(keyboardPresent: Double): KeyboardCapabilities = {
    val __obj = js.Dynamic.literal(keyboardPresent = keyboardPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardCapabilities]
  }
  @scala.inline
  implicit class KeyboardCapabilitiesOps[Self <: KeyboardCapabilities] (val x: Self) extends AnyVal {
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

