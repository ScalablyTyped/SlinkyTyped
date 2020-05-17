package typingsSlinky.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Radius extends js.Object {
  var radius: Double = js.native
  var segments: Double = js.native
  var thetaLength: Double = js.native
  var thetaStart: Double = js.native
}

object Radius {
  @scala.inline
  def apply(radius: Double, segments: Double, thetaLength: Double, thetaStart: Double): Radius = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], thetaLength = thetaLength.asInstanceOf[js.Any], thetaStart = thetaStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radius]
  }
  @scala.inline
  implicit class RadiusOps[Self <: Radius] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segments")(value.asInstanceOf[js.Any])
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

