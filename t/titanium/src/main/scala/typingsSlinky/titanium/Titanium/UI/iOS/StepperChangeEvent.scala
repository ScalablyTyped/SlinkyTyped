package typingsSlinky.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Fired every time the stepper value changes.
			 */
@js.native
trait StepperChangeEvent extends StepperBaseEvent {
  /**
  				 * The maximum value of the stepper.
  				 */
  var maximum: Double = js.native
  /**
  				 * The minimum value of the stepper.
  				 */
  var minimum: Double = js.native
  /**
  				 * The current value of the stepper.
  				 */
  var value: Double = js.native
}

object StepperChangeEvent {
  @scala.inline
  def apply(maximum: Double, minimum: Double, source: Stepper, value: Double): StepperChangeEvent = {
    val __obj = js.Dynamic.literal(maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepperChangeEvent]
  }
  @scala.inline
  implicit class StepperChangeEventOps[Self <: StepperChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimum")(value.asInstanceOf[js.Any])
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

