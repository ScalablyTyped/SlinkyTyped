package typingsSlinky.winrtUwp.Windows.Media.Devices

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the zoom settings on a capture device. */
@js.native
trait ZoomControl extends js.Object {
  /** Gets the maximum zoom value supported by the capture device. */
  var max: Double = js.native
  /** Gets the minimum zoom value supported by the capture device. */
  var min: Double = js.native
  /** Gets a value indicating the current zoom transition mode. */
  var mode: ZoomTransitionMode = js.native
  /** Gets the smallest zoom value increment supported by the capture device. */
  var step: Double = js.native
  /** Gets a value indicating whether zoom control is supported by the capture device. */
  var supported: Boolean = js.native
  /** Gets the list of ZoomTransitionMode values indicating the modes supported by the capture device. */
  var supportedModes: IVectorView[ZoomTransitionMode] = js.native
  /** Gets or sets the zoom value to be used by the capture device. */
  var value: Double = js.native
  /**
    * Configures the zoom control with the provided zoom settings.
    * @param settings The zoom settings.
    */
  def configure(settings: ZoomSettings): Unit = js.native
}

object ZoomControl {
  @scala.inline
  def apply(
    configure: ZoomSettings => Unit,
    max: Double,
    min: Double,
    mode: ZoomTransitionMode,
    step: Double,
    supported: Boolean,
    supportedModes: IVectorView[ZoomTransitionMode],
    value: Double
  ): ZoomControl = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure), max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], supportedModes = supportedModes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomControl]
  }
  @scala.inline
  implicit class ZoomControlOps[Self <: ZoomControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigure(value: ZoomSettings => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configure")(js.Any.fromFunction1(value))
        ret
    }
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
    def withMode(value: ZoomTransitionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withSupportedModes(value: IVectorView[ZoomTransitionMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

