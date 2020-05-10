package typingsSlinky.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents 2D coordinate that is used to convey the values of timed text style properties. */
@js.native
trait TimedTextPoint extends js.Object {
  /** The units of the coordinates, either pixels or percentage. */
  var unit: TimedTextUnit = js.native
  /** The X coordinate of the point. */
  var x: Double = js.native
  /** The Y coordinate of the point. */
  var y: Double = js.native
}

object TimedTextPoint {
  @scala.inline
  def apply(unit: TimedTextUnit, x: Double, y: Double): TimedTextPoint = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextPoint]
  }
  @scala.inline
  implicit class TimedTextPointOps[Self <: TimedTextPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnit(value: TimedTextUnit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
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

