package typingsSlinky.winrtUwp.Windows.Media.Devices

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for modifying exposure levels of captured photos. */
@js.native
trait ExposureCompensationControl extends js.Object {
  /** Gets the maximum exposure time. */
  var max: Double = js.native
  /** Gets the minimum exposure time. */
  var min: Double = js.native
  /** Gets the smallest exposure compensation increment supported by the capture device. */
  var step: Double = js.native
  /** Gets a value that specifies if the capture device supports the exposure compensation control. */
  var supported: Boolean = js.native
  /** Gets the exposure compensation level. */
  var value: Double = js.native
  /**
    * Asynchronously sets the exposure compensation.
    * @param value The exposure compensation level to set the Value property to. The minimum and maximum values are specified by Min and Max .
    * @return The object that is used to control the asynchronous operation.
    */
  def setValueAsync(value: Double): IPromiseWithIAsyncAction = js.native
}

object ExposureCompensationControl {
  @scala.inline
  def apply(
    max: Double,
    min: Double,
    setValueAsync: Double => IPromiseWithIAsyncAction,
    step: Double,
    supported: Boolean,
    value: Double
  ): ExposureCompensationControl = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], setValueAsync = js.Any.fromFunction1(setValueAsync), step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExposureCompensationControl]
  }
  @scala.inline
  implicit class ExposureCompensationControlOps[Self <: ExposureCompensationControl] (val x: Self) extends AnyVal {
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

