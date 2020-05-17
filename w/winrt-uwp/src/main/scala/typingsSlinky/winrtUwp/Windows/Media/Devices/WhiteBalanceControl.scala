package typingsSlinky.winrtUwp.Windows.Media.Devices

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the white balance settings on a capture device. */
@js.native
trait WhiteBalanceControl extends js.Object {
  /** Gets the maximum white balance value. */
  var max: Double = js.native
  /** Gets the minimum white balance value. */
  var min: Double = js.native
  /** Gets the color temperature preset. */
  var preset: ColorTemperaturePreset = js.native
  /** Gets the step value. */
  var step: Double = js.native
  /** Gets a value that specifies if the capture device supports the white balance control. */
  var supported: Boolean = js.native
  /** Gets the color temperature value. */
  var value: Double = js.native
  /**
    * Asynchronously sets the color temperature Preset .
    * @param preset The color temperate preset to set the Preset property to.
    * @return The object that is used to control the asynchronous operation.
    */
  def setPresetAsync(preset: ColorTemperaturePreset): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously sets the color temperature Value .
    * @param temperature The temperature value to set the Value property to.
    * @return The object that is used to control the asynchronous operation.
    */
  def setValueAsync(temperature: Double): IPromiseWithIAsyncAction = js.native
}

object WhiteBalanceControl {
  @scala.inline
  def apply(
    max: Double,
    min: Double,
    preset: ColorTemperaturePreset,
    setPresetAsync: ColorTemperaturePreset => IPromiseWithIAsyncAction,
    setValueAsync: Double => IPromiseWithIAsyncAction,
    step: Double,
    supported: Boolean,
    value: Double
  ): WhiteBalanceControl = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], preset = preset.asInstanceOf[js.Any], setPresetAsync = js.Any.fromFunction1(setPresetAsync), setValueAsync = js.Any.fromFunction1(setValueAsync), step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteBalanceControl]
  }
  @scala.inline
  implicit class WhiteBalanceControlOps[Self <: WhiteBalanceControl] (val x: Self) extends AnyVal {
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
    def withPreset(value: ColorTemperaturePreset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetPresetAsync(value: ColorTemperaturePreset => IPromiseWithIAsyncAction): Self = {
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
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

