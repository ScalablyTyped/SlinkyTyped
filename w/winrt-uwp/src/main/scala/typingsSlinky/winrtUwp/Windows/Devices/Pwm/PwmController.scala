package typingsSlinky.winrtUwp.Windows.Devices.Pwm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PwmController extends js.Object {
   /* unmapped type */ var actualFrequency: js.Any = js.native
   /* unmapped type */ var maxFrequency: js.Any = js.native
   /* unmapped type */ var minFrequency: js.Any = js.native
   /* unmapped type */ var openPin: js.Any = js.native
   /* unmapped type */ var pinCount: js.Any = js.native
   /* unmapped type */ var setDesiredFrequency: js.Any = js.native
}

object PwmController {
  @scala.inline
  def apply(
    actualFrequency: js.Any,
    maxFrequency: js.Any,
    minFrequency: js.Any,
    openPin: js.Any,
    pinCount: js.Any,
    setDesiredFrequency: js.Any
  ): PwmController = {
    val __obj = js.Dynamic.literal(actualFrequency = actualFrequency.asInstanceOf[js.Any], maxFrequency = maxFrequency.asInstanceOf[js.Any], minFrequency = minFrequency.asInstanceOf[js.Any], openPin = openPin.asInstanceOf[js.Any], pinCount = pinCount.asInstanceOf[js.Any], setDesiredFrequency = setDesiredFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[PwmController]
  }
  @scala.inline
  implicit class PwmControllerOps[Self <: PwmController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActualFrequency(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actualFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxFrequency(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinFrequency(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenPin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openPin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinCount(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDesiredFrequency(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDesiredFrequency")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

