package typingsSlinky.signaturePad.mod.SignaturePad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bezier extends js.Object {
  var control1: CurveControl = js.native
  var control2: CurveControl = js.native
  var endPoint: Point = js.native
  var endWidth: Double = js.native
  var startPoint: Point = js.native
  var startWidth: Double = js.native
  def _point(t: Double, start: Double, c1: Double, c2: Double, end: Double): Double = js.native
  def length(): Double = js.native
}

object Bezier {
  @scala.inline
  def apply(
    _point: (Double, Double, Double, Double, Double) => Double,
    control1: CurveControl,
    control2: CurveControl,
    endPoint: Point,
    endWidth: Double,
    length: () => Double,
    startPoint: Point,
    startWidth: Double
  ): Bezier = {
    val __obj = js.Dynamic.literal(_point = js.Any.fromFunction5(_point), control1 = control1.asInstanceOf[js.Any], control2 = control2.asInstanceOf[js.Any], endPoint = endPoint.asInstanceOf[js.Any], endWidth = endWidth.asInstanceOf[js.Any], length = js.Any.fromFunction0(length), startPoint = startPoint.asInstanceOf[js.Any], startWidth = startWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bezier]
  }
  @scala.inline
  implicit class BezierOps[Self <: Bezier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_point(value: (Double, Double, Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_point")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withControl1(value: CurveControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControl2(value: CurveControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("control2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStartPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

