package typingsSlinky.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInnerRadius extends js.Object {
  var innerRadius: Double = js.native
  var outerRadius: Double = js.native
  var phiSegments: Double = js.native
  var thetaLength: Double = js.native
  var thetaSegments: Double = js.native
  var thetaStart: Double = js.native
}

object AnonInnerRadius {
  @scala.inline
  def apply(
    innerRadius: Double,
    outerRadius: Double,
    phiSegments: Double,
    thetaLength: Double,
    thetaSegments: Double,
    thetaStart: Double
  ): AnonInnerRadius = {
    val __obj = js.Dynamic.literal(innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any], phiSegments = phiSegments.asInstanceOf[js.Any], thetaLength = thetaLength.asInstanceOf[js.Any], thetaSegments = thetaSegments.asInstanceOf[js.Any], thetaStart = thetaStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInnerRadius]
  }
  @scala.inline
  implicit class AnonInnerRadiusOps[Self <: AnonInnerRadius] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInnerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhiSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phiSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThetaLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thetaLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThetaSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thetaSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThetaStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thetaStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

