package typingsSlinky.winrtUwp.Windows.Devices.Pwm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PwmPin extends js.Object {
  var close: js.Any = js.native
   /* unmapped type */ var controller: js.Any = js.native
   /* unmapped type */ var getActiveDutyCyclePercentage: js.Any = js.native
   /* unmapped type */ var isStarted: js.Any = js.native
   /* unmapped type */ var polarity: js.Any = js.native
   /* unmapped type */ var setActiveDutyCyclePercentage: js.Any = js.native
   /* unmapped type */ var start: js.Any = js.native
   /* unmapped type */ var stop: js.Any = js.native
}

object PwmPin {
  @scala.inline
  def apply(
    close: js.Any,
    controller: js.Any,
    getActiveDutyCyclePercentage: js.Any,
    isStarted: js.Any,
    polarity: js.Any,
    setActiveDutyCyclePercentage: js.Any,
    start: js.Any,
    stop: js.Any
  ): PwmPin = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], getActiveDutyCyclePercentage = getActiveDutyCyclePercentage.asInstanceOf[js.Any], isStarted = isStarted.asInstanceOf[js.Any], polarity = polarity.asInstanceOf[js.Any], setActiveDutyCyclePercentage = setActiveDutyCyclePercentage.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PwmPin]
  }
  @scala.inline
  implicit class PwmPinOps[Self <: PwmPin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withController(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetActiveDutyCyclePercentage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveDutyCyclePercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsStarted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolarity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polarity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetActiveDutyCyclePercentage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveDutyCyclePercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStop(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

