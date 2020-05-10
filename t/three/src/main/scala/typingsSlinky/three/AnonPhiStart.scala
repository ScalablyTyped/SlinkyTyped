package typingsSlinky.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPhiStart extends js.Object {
  var heightSegments: Double = js.native
  var phiLength: Double = js.native
  var phiStart: Double = js.native
  var radius: Double = js.native
  var thetaLength: Double = js.native
  var thetaStart: Double = js.native
  var widthSegments: Double = js.native
}

object AnonPhiStart {
  @scala.inline
  def apply(
    heightSegments: Double,
    phiLength: Double,
    phiStart: Double,
    radius: Double,
    thetaLength: Double,
    thetaStart: Double,
    widthSegments: Double
  ): AnonPhiStart = {
    val __obj = js.Dynamic.literal(heightSegments = heightSegments.asInstanceOf[js.Any], phiLength = phiLength.asInstanceOf[js.Any], phiStart = phiStart.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], thetaLength = thetaLength.asInstanceOf[js.Any], thetaStart = thetaStart.asInstanceOf[js.Any], widthSegments = widthSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPhiStart]
  }
  @scala.inline
  implicit class AnonPhiStartOps[Self <: AnonPhiStart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeightSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhiLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phiLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhiStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phiStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThetaLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thetaLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThetaStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thetaStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidthSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthSegments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

