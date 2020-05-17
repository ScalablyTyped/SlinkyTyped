package typingsSlinky.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the flash settings on a capture device. */
@js.native
trait FlashControl extends js.Object {
  /** Gets or sets a value indicating whether focus assist light is enabled on the capture device. */
  var assistantLightEnabled: Boolean = js.native
  /** Gets a value indicating whether focus assist light is supported by the capture device. */
  var assistantLightSupported: Boolean = js.native
  /** Gets or sets a value that specifies if flash is automatically set. */
  var auto: Boolean = js.native
  /** Gets a value that specifies if the flash on the capture device is enabled or disabled. */
  var enabled: Boolean = js.native
  /** Gets or sets the intensity of the flash. */
  var powerPercent: Double = js.native
  /** Gets a value that specifics if the device allows the torch LED power settings to be changed. */
  var powerSupported: Boolean = js.native
  /** Gets a value that specifies if the red eye reduction is enabled or disabled. */
  var redEyeReduction: Boolean = js.native
  /** Gets a value that specifies if the capture device supports red eye reduction. */
  var redEyeReductionSupported: Boolean = js.native
  /** Gets a value that specifies if the capture device supports the flash control. */
  var supported: Boolean = js.native
}

object FlashControl {
  @scala.inline
  def apply(
    assistantLightEnabled: Boolean,
    assistantLightSupported: Boolean,
    auto: Boolean,
    enabled: Boolean,
    powerPercent: Double,
    powerSupported: Boolean,
    redEyeReduction: Boolean,
    redEyeReductionSupported: Boolean,
    supported: Boolean
  ): FlashControl = {
    val __obj = js.Dynamic.literal(assistantLightEnabled = assistantLightEnabled.asInstanceOf[js.Any], assistantLightSupported = assistantLightSupported.asInstanceOf[js.Any], auto = auto.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], powerPercent = powerPercent.asInstanceOf[js.Any], powerSupported = powerSupported.asInstanceOf[js.Any], redEyeReduction = redEyeReduction.asInstanceOf[js.Any], redEyeReductionSupported = redEyeReductionSupported.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashControl]
  }
  @scala.inline
  implicit class FlashControlOps[Self <: FlashControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssistantLightEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assistantLightEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssistantLightSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assistantLightSupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withRedEyeReduction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redEyeReduction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedEyeReductionSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redEyeReductionSupported")(value.asInstanceOf[js.Any])
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

