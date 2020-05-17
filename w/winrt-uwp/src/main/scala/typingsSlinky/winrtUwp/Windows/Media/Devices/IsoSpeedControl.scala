package typingsSlinky.winrtUwp.Windows.Media.Devices

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the ISO film speed settings on a capture device. */
@js.native
trait IsoSpeedControl extends js.Object {
  /** Gets a value indicating whether auto ISO speed is enabled. */
  var auto: Boolean = js.native
  /** Gets the maximum ISO speed supported by the capture device. */
  var max: Double = js.native
  /** Gets the minimum ISO speed supported by the capture device. */
  var min: Double = js.native
  /** Gets the ISO film speed preset. */
  var preset: IsoSpeedPreset = js.native
  /** Gets the smallest ISO speed increment supported by the capture device. */
  var step: Double = js.native
  /** Gets a value the specifies if the capture device supports the ISO speed control. */
  var supported: Boolean = js.native
  /** Gets the ISO presets that the capture device supports. */
  var supportedPresets: IVectorView[IsoSpeedPreset] = js.native
  /** Gets the current ISO speed value. */
  var value: Double = js.native
  /**
    * Sets the ISO speed to automatic.
    * @return An asynchronous action.
    */
  def setAutoAsync(): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously sets the ISO film speed Preset .
    * @param preset The ISO preset value to set the Preset property to.
    * @return The object that is used to control the asynchronous operation.
    */
  def setPresetAsync(preset: IsoSpeedPreset): IPromiseWithIAsyncAction = js.native
  /**
    * Sets the ISO speed value.
    * @param isoSpeed The ISO speed value.
    * @return An asynchronous action.
    */
  def setValueAsync(isoSpeed: Double): IPromiseWithIAsyncAction = js.native
}

object IsoSpeedControl {
  @scala.inline
  def apply(
    auto: Boolean,
    max: Double,
    min: Double,
    preset: IsoSpeedPreset,
    setAutoAsync: () => IPromiseWithIAsyncAction,
    setPresetAsync: IsoSpeedPreset => IPromiseWithIAsyncAction,
    setValueAsync: Double => IPromiseWithIAsyncAction,
    step: Double,
    supported: Boolean,
    supportedPresets: IVectorView[IsoSpeedPreset],
    value: Double
  ): IsoSpeedControl = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], preset = preset.asInstanceOf[js.Any], setAutoAsync = js.Any.fromFunction0(setAutoAsync), setPresetAsync = js.Any.fromFunction1(setPresetAsync), setValueAsync = js.Any.fromFunction1(setValueAsync), step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], supportedPresets = supportedPresets.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsoSpeedControl]
  }
  @scala.inline
  implicit class IsoSpeedControlOps[Self <: IsoSpeedControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(value.asInstanceOf[js.Any])
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
    def withPreset(value: IsoSpeedPreset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetAutoAsync(value: () => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetPresetAsync(value: IsoSpeedPreset => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPresetAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetValueAsync(value: Double => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValueAsync")(js.Any.fromFunction1(value))
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
    def withSupportedPresets(value: IVectorView[IsoSpeedPreset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedPresets")(value.asInstanceOf[js.Any])
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

