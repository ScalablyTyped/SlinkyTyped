package typingsSlinky.winrt.Windows.UI.Input.Inking

import typingsSlinky.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInkStrokeRenderingSegment extends js.Object {
  var bezierControlPoint1: Point = js.native
  var bezierControlPoint2: Point = js.native
  var position: Point = js.native
  var pressure: Double = js.native
  var tiltX: Double = js.native
  var tiltY: Double = js.native
  var twist: Double = js.native
}

object IInkStrokeRenderingSegment {
  @scala.inline
  def apply(
    bezierControlPoint1: Point,
    bezierControlPoint2: Point,
    position: Point,
    pressure: Double,
    tiltX: Double,
    tiltY: Double,
    twist: Double
  ): IInkStrokeRenderingSegment = {
    val __obj = js.Dynamic.literal(bezierControlPoint1 = bezierControlPoint1.asInstanceOf[js.Any], bezierControlPoint2 = bezierControlPoint2.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any], tiltX = tiltX.asInstanceOf[js.Any], tiltY = tiltY.asInstanceOf[js.Any], twist = twist.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInkStrokeRenderingSegment]
  }
  @scala.inline
  implicit class IInkStrokeRenderingSegmentOps[Self <: IInkStrokeRenderingSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBezierControlPoint1(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bezierControlPoint1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBezierControlPoint2(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bezierControlPoint2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPressure(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiltX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiltX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiltY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiltY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwist(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twist")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

