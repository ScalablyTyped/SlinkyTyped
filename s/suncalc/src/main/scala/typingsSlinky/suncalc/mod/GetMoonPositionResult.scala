package typingsSlinky.suncalc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMoonPositionResult extends js.Object {
  var altitude: Double = js.native
  var azimuth: Double = js.native
  var distance: Double = js.native
  var parallacticAngle: Double = js.native
}

object GetMoonPositionResult {
  @scala.inline
  def apply(altitude: Double, azimuth: Double, distance: Double, parallacticAngle: Double): GetMoonPositionResult = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], azimuth = azimuth.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], parallacticAngle = parallacticAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMoonPositionResult]
  }
  @scala.inline
  implicit class GetMoonPositionResultOps[Self <: GetMoonPositionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAzimuth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("azimuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParallacticAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallacticAngle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

