package typingsSlinky.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the torch LED settings on a capture device. */
@js.native
trait TorchControl extends js.Object {
  /** Gets or sets a value that enables and disables the torch LED on the device. */
  var enabled: Boolean = js.native
  /** Gets or sets the intensity of the torch LED. */
  var powerPercent: Double = js.native
  /** Gets a value that specifics if the device allows the torch LED power settings to be changed. */
  var powerSupported: Boolean = js.native
  /** Gets a value that specifies if the capture device supports the torch control. */
  var supported: Boolean = js.native
}

object TorchControl {
  @scala.inline
  def apply(enabled: Boolean, powerPercent: Double, powerSupported: Boolean, supported: Boolean): TorchControl = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], powerPercent = powerPercent.asInstanceOf[js.Any], powerSupported = powerSupported.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[TorchControl]
  }
  @scala.inline
  implicit class TorchControlOps[Self <: TorchControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powerSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supported")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

