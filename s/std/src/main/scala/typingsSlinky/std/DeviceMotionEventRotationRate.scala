package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceMotionEventRotationRate extends js.Object {
  val alpha: Double | Null = js.native
  val beta: Double | Null = js.native
  val gamma: Double | Null = js.native
}

object DeviceMotionEventRotationRate {
  @scala.inline
  def apply(): DeviceMotionEventRotationRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMotionEventRotationRate]
  }
  @scala.inline
  implicit class DeviceMotionEventRotationRateOps[Self <: DeviceMotionEventRotationRate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlphaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(null)
        ret
    }
    @scala.inline
    def withBeta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBetaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beta")(null)
        ret
    }
    @scala.inline
    def withGamma(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGammaNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gamma")(null)
        ret
    }
  }
  
}

