package typingsSlinky.winrtUwp.Windows.Media.Devices.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the focus capabilities of the capture device for frames in a variable photo sequences. */
@js.native
trait FrameFocusCapabilities extends js.Object {
  /** Gets the maximum focus length supported by the capture device for a frame in a variable photo sequence, specified in millimeters. */
  var max: Double = js.native
  /** Gets the minimum focus length supported by the capture device for a frame in a variable photo sequence, specified in millimeters. */
  var min: Double = js.native
  /** Gets the smallest focus increment supported by the capture device for a frame in a variable photo sequence, specified in millimeters. */
  var step: Double = js.native
  /** Gets a value that indicates if the capture device supports the focus control for frames in a variable photo sequence. */
  var supported: Boolean = js.native
}

object FrameFocusCapabilities {
  @scala.inline
  def apply(max: Double, min: Double, step: Double, supported: Boolean): FrameFocusCapabilities = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameFocusCapabilities]
  }
  @scala.inline
  implicit class FrameFocusCapabilitiesOps[Self <: FrameFocusCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
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

