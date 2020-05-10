package typingsSlinky.vara

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBreakPoints extends js.Object {
  var breakPoints: js.Array[js.Array[String | Double]] = js.native
  var width: Double = js.native
}

object AnonBreakPoints {
  @scala.inline
  def apply(breakPoints: js.Array[js.Array[String | Double]], width: Double): AnonBreakPoints = {
    val __obj = js.Dynamic.literal(breakPoints = breakPoints.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBreakPoints]
  }
  @scala.inline
  implicit class AnonBreakPointsOps[Self <: AnonBreakPoints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakPoints(value: js.Array[js.Array[String | Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

