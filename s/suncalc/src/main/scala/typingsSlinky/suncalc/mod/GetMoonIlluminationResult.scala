package typingsSlinky.suncalc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMoonIlluminationResult extends js.Object {
  var angle: Double = js.native
  var fraction: Double = js.native
  var phase: Double = js.native
}

object GetMoonIlluminationResult {
  @scala.inline
  def apply(angle: Double, fraction: Double, phase: Double): GetMoonIlluminationResult = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], fraction = fraction.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMoonIlluminationResult]
  }
  @scala.inline
  implicit class GetMoonIlluminationResultOps[Self <: GetMoonIlluminationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFraction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phase")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

