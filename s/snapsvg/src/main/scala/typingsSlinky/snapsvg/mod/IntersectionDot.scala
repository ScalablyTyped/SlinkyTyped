package typingsSlinky.snapsvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntersectionDot extends js.Object {
  var bez1: js.Array[Double] = js.native
  var bez2: js.Array[Double] = js.native
  var segment1: Double = js.native
  var segment2: Double = js.native
  var t1: Double = js.native
  var t2: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object IntersectionDot {
  @scala.inline
  def apply(
    bez1: js.Array[Double],
    bez2: js.Array[Double],
    segment1: Double,
    segment2: Double,
    t1: Double,
    t2: Double,
    x: Double,
    y: Double
  ): IntersectionDot = {
    val __obj = js.Dynamic.literal(bez1 = bez1.asInstanceOf[js.Any], bez2 = bez2.asInstanceOf[js.Any], segment1 = segment1.asInstanceOf[js.Any], segment2 = segment2.asInstanceOf[js.Any], t1 = t1.asInstanceOf[js.Any], t2 = t2.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionDot]
  }
  @scala.inline
  implicit class IntersectionDotOps[Self <: IntersectionDot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBez1(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bez1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBez2(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bez2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegment1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegment2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t2")(value.asInstanceOf[js.Any])
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

