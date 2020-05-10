package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceMotionEventInit extends EventInit {
  var acceleration: js.UndefOr[DeviceMotionEventAccelerationInit] = js.native
  var accelerationIncludingGravity: js.UndefOr[DeviceMotionEventAccelerationInit] = js.native
  var interval: js.UndefOr[Double] = js.native
  var rotationRate: js.UndefOr[DeviceMotionEventRotationRateInit] = js.native
}

object DeviceMotionEventInit {
  @scala.inline
  def apply(): DeviceMotionEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMotionEventInit]
  }
  @scala.inline
  implicit class DeviceMotionEventInitOps[Self <: org.scalajs.dom.experimental.deviceorientation.DeviceMotionEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceleration(value: DeviceMotionEventAccelerationInit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceleration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceleration")(js.undefined)
        ret
    }
    @scala.inline
    def withAccelerationIncludingGravity(value: DeviceMotionEventAccelerationInit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerationIncludingGravity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccelerationIncludingGravity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accelerationIncludingGravity")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationRate(value: DeviceMotionEventRotationRateInit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationRate")(js.undefined)
        ret
    }
  }
  
}

