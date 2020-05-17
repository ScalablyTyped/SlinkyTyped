package typingsSlinky.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents settings for a FocusControl object. */
@js.native
trait FocusSettings extends js.Object {
  /** Gets or sets a value indicating the auto focus range setting. */
  var autoFocusRange: AutoFocusRange = js.native
  /** Gets or sets a value that indicates to the driver if it should disable determining a focus position when the focus search fails. */
  var disableDriverFallback: Boolean = js.native
  /** Gets or sets a value indicating the manual focus distance setting. */
  var distance: ManualFocusDistance = js.native
  /** Gets or sets a value indicating the focus mode setting. */
  var mode: FocusMode = js.native
  /** Gets or sets the focus value setting. */
  var value: Double = js.native
  /** Gets or sets a value indicating whether the capture device should wait for focus before capturing. */
  var waitForFocus: Boolean = js.native
}

object FocusSettings {
  @scala.inline
  def apply(
    autoFocusRange: AutoFocusRange,
    disableDriverFallback: Boolean,
    distance: ManualFocusDistance,
    mode: FocusMode,
    value: Double,
    waitForFocus: Boolean
  ): FocusSettings = {
    val __obj = js.Dynamic.literal(autoFocusRange = autoFocusRange.asInstanceOf[js.Any], disableDriverFallback = disableDriverFallback.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], waitForFocus = waitForFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusSettings]
  }
  @scala.inline
  implicit class FocusSettingsOps[Self <: FocusSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFocusRange(value: AutoFocusRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocusRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableDriverFallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDriverFallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: ManualFocusDistance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: FocusMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaitForFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitForFocus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

