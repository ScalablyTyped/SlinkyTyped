package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the rate at which the device is rotating around all three axes. */
@js.native
trait DeviceRotationRate extends js.Object {
  val alpha: Double | Null = js.native
  val beta: Double | Null = js.native
  val gamma: Double | Null = js.native
}

object DeviceRotationRate {
  @scala.inline
  def apply(): DeviceRotationRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceRotationRate]
  }
  @scala.inline
  implicit class DeviceRotationRateOps[Self <: org.scalajs.dom.experimental.deviceorientation.DeviceRotationRate] (val x: Self) extends AnyVal {
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

