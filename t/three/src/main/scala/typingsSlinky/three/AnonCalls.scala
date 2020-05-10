package typingsSlinky.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCalls extends js.Object {
  var calls: Double = js.native
  var frame: Double = js.native
  var lines: Double = js.native
  var points: Double = js.native
  var triangles: Double = js.native
}

object AnonCalls {
  @scala.inline
  def apply(calls: Double, frame: Double, lines: Double, points: Double, triangles: Double): AnonCalls = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], triangles = triangles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCalls]
  }
  @scala.inline
  implicit class AnonCallsOps[Self <: AnonCalls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalls(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrame(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriangles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

