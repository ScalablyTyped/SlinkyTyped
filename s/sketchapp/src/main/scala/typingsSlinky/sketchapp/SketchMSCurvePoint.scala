package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.curvePoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSCurvePoint extends js.Object {
  var _class: curvePoint = js.native
  var cornerRadius: Double = js.native
  var curveFrom: SketchMSPointString = js.native
  var curveMode: SketchMSCurveMode = js.native
  var curveTo: SketchMSPointString = js.native
  var hasCurveFrom: Boolean = js.native
  var hasCurveTo: Boolean = js.native
  var point: SketchMSPointString = js.native
}

object SketchMSCurvePoint {
  @scala.inline
  def apply(
    _class: curvePoint,
    cornerRadius: Double,
    curveFrom: SketchMSPointString,
    curveMode: SketchMSCurveMode,
    curveTo: SketchMSPointString,
    hasCurveFrom: Boolean,
    hasCurveTo: Boolean,
    point: SketchMSPointString
  ): SketchMSCurvePoint = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], curveFrom = curveFrom.asInstanceOf[js.Any], curveMode = curveMode.asInstanceOf[js.Any], curveTo = curveTo.asInstanceOf[js.Any], hasCurveFrom = hasCurveFrom.asInstanceOf[js.Any], hasCurveTo = hasCurveTo.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSCurvePoint]
  }
  @scala.inline
  implicit class SketchMSCurvePointOps[Self <: SketchMSCurvePoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: curvePoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCornerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurveFrom(value: SketchMSPointString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curveFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurveMode(value: SketchMSCurveMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curveMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurveTo(value: SketchMSPointString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curveTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasCurveFrom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCurveFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasCurveTo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCurveTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoint(value: SketchMSPointString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

