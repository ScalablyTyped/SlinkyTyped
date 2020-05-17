package typingsSlinky.winrtUwp.Windows.UI.Input.Inking

import typingsSlinky.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single segment of a complete ink stroke. */
@js.native
trait InkStrokeRenderingSegment extends js.Object {
  /** Gets the first control point for the Bézier curve. */
  var bezierControlPoint1: Point = js.native
  /** Gets the second control point for the Bézier curve. */
  var bezierControlPoint2: Point = js.native
  /** Gets the end point of the segment. */
  var position: Point = js.native
  /** Gets the pressure of the contact on the digitizer surface. */
  var pressure: Double = js.native
  /** Gets the tilt of the contact along the x axis. */
  var tiltX: Double = js.native
  /** Gets the tilt of the contact along the y axis. */
  var tiltY: Double = js.native
  /** Gets the twist of the contact along the rotational axis. */
  var twist: Double = js.native
}

object InkStrokeRenderingSegment {
  @scala.inline
  def apply(
    bezierControlPoint1: Point,
    bezierControlPoint2: Point,
    position: Point,
    pressure: Double,
    tiltX: Double,
    tiltY: Double,
    twist: Double
  ): InkStrokeRenderingSegment = {
    val __obj = js.Dynamic.literal(bezierControlPoint1 = bezierControlPoint1.asInstanceOf[js.Any], bezierControlPoint2 = bezierControlPoint2.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any], tiltX = tiltX.asInstanceOf[js.Any], tiltY = tiltY.asInstanceOf[js.Any], twist = twist.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkStrokeRenderingSegment]
  }
  @scala.inline
  implicit class InkStrokeRenderingSegmentOps[Self <: InkStrokeRenderingSegment] (val x: Self) extends AnyVal {
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

