package typingsSlinky.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHeightSegments extends js.Object {
  var height: Double = js.native
  var heightSegments: Double = js.native
  var openEnded: Boolean = js.native
  var radialSegments: Double = js.native
  var radiusBottom: Double = js.native
  var radiusTop: Double = js.native
  var thetaLength: Double = js.native
  var thetaStart: Double = js.native
}

object AnonHeightSegments {
  @scala.inline
  def apply(
    height: Double,
    heightSegments: Double,
    openEnded: Boolean,
    radialSegments: Double,
    radiusBottom: Double,
    radiusTop: Double,
    thetaLength: Double,
    thetaStart: Double
  ): AnonHeightSegments = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], heightSegments = heightSegments.asInstanceOf[js.Any], openEnded = openEnded.asInstanceOf[js.Any], radialSegments = radialSegments.asInstanceOf[js.Any], radiusBottom = radiusBottom.asInstanceOf[js.Any], radiusTop = radiusTop.asInstanceOf[js.Any], thetaLength = thetaLength.asInstanceOf[js.Any], thetaStart = thetaStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeightSegments]
  }
  @scala.inline
  implicit class AnonHeightSegmentsOps[Self <: AnonHeightSegments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeightSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenEnded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openEnded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadialSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadiusBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadiusTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusTop")(value.asInstanceOf[js.Any])
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
  }
  
}

