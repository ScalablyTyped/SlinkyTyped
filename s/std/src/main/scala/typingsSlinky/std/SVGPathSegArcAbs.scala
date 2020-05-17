package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathSegArcAbs extends SVGPathSeg {
  var angle: Double = js.native
  var largeArcFlag: scala.Boolean = js.native
  var r1: Double = js.native
  var r2: Double = js.native
  var sweepFlag: scala.Boolean = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object SVGPathSegArcAbs {
  @scala.inline
  def apply(
    PATHSEG_ARC_ABS: Double,
    PATHSEG_ARC_REL: Double,
    PATHSEG_CLOSEPATH: Double,
    PATHSEG_CURVETO_CUBIC_ABS: Double,
    PATHSEG_CURVETO_CUBIC_REL: Double,
    PATHSEG_CURVETO_CUBIC_SMOOTH_ABS: Double,
    PATHSEG_CURVETO_CUBIC_SMOOTH_REL: Double,
    PATHSEG_CURVETO_QUADRATIC_ABS: Double,
    PATHSEG_CURVETO_QUADRATIC_REL: Double,
    PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS: Double,
    PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL: Double,
    PATHSEG_LINETO_ABS: Double,
    PATHSEG_LINETO_HORIZONTAL_ABS: Double,
    PATHSEG_LINETO_HORIZONTAL_REL: Double,
    PATHSEG_LINETO_REL: Double,
    PATHSEG_LINETO_VERTICAL_ABS: Double,
    PATHSEG_LINETO_VERTICAL_REL: Double,
    PATHSEG_MOVETO_ABS: Double,
    PATHSEG_MOVETO_REL: Double,
    PATHSEG_UNKNOWN: Double,
    angle: Double,
    largeArcFlag: scala.Boolean,
    pathSegType: Double,
    pathSegTypeAsLetter: java.lang.String,
    r1: Double,
    r2: Double,
    sweepFlag: scala.Boolean,
    x: Double,
    y: Double
  ): SVGPathSegArcAbs = {
    val __obj = js.Dynamic.literal(PATHSEG_ARC_ABS = PATHSEG_ARC_ABS.asInstanceOf[js.Any], PATHSEG_ARC_REL = PATHSEG_ARC_REL.asInstanceOf[js.Any], PATHSEG_CLOSEPATH = PATHSEG_CLOSEPATH.asInstanceOf[js.Any], PATHSEG_CURVETO_CUBIC_ABS = PATHSEG_CURVETO_CUBIC_ABS.asInstanceOf[js.Any], PATHSEG_CURVETO_CUBIC_REL = PATHSEG_CURVETO_CUBIC_REL.asInstanceOf[js.Any], PATHSEG_CURVETO_CUBIC_SMOOTH_ABS = PATHSEG_CURVETO_CUBIC_SMOOTH_ABS.asInstanceOf[js.Any], PATHSEG_CURVETO_CUBIC_SMOOTH_REL = PATHSEG_CURVETO_CUBIC_SMOOTH_REL.asInstanceOf[js.Any], PATHSEG_CURVETO_QUADRATIC_ABS = PATHSEG_CURVETO_QUADRATIC_ABS.asInstanceOf[js.Any], PATHSEG_CURVETO_QUADRATIC_REL = PATHSEG_CURVETO_QUADRATIC_REL.asInstanceOf[js.Any], PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS = PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS.asInstanceOf[js.Any], PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL = PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL.asInstanceOf[js.Any], PATHSEG_LINETO_ABS = PATHSEG_LINETO_ABS.asInstanceOf[js.Any], PATHSEG_LINETO_HORIZONTAL_ABS = PATHSEG_LINETO_HORIZONTAL_ABS.asInstanceOf[js.Any], PATHSEG_LINETO_HORIZONTAL_REL = PATHSEG_LINETO_HORIZONTAL_REL.asInstanceOf[js.Any], PATHSEG_LINETO_REL = PATHSEG_LINETO_REL.asInstanceOf[js.Any], PATHSEG_LINETO_VERTICAL_ABS = PATHSEG_LINETO_VERTICAL_ABS.asInstanceOf[js.Any], PATHSEG_LINETO_VERTICAL_REL = PATHSEG_LINETO_VERTICAL_REL.asInstanceOf[js.Any], PATHSEG_MOVETO_ABS = PATHSEG_MOVETO_ABS.asInstanceOf[js.Any], PATHSEG_MOVETO_REL = PATHSEG_MOVETO_REL.asInstanceOf[js.Any], PATHSEG_UNKNOWN = PATHSEG_UNKNOWN.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], largeArcFlag = largeArcFlag.asInstanceOf[js.Any], pathSegType = pathSegType.asInstanceOf[js.Any], pathSegTypeAsLetter = pathSegTypeAsLetter.asInstanceOf[js.Any], r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any], sweepFlag = sweepFlag.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGPathSegArcAbs]
  }
  @scala.inline
  implicit class SVGPathSegArcAbsOps[Self <: org.scalajs.dom.raw.SVGPathSegArcAbs] (val x: Self) extends AnyVal {
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
    def withLargeArcFlag(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeArcFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSweepFlag(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sweepFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

