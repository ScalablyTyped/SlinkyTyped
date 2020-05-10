package typingsSlinky.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonXMax extends js.Object {
  var xMax: Double = js.native
  var xMin: Double = js.native
  var yMax: Double = js.native
  var yMin: Double = js.native
}

object AnonXMax {
  @scala.inline
  def apply(xMax: Double, xMin: Double, yMax: Double, yMin: Double): AnonXMax = {
    val __obj = js.Dynamic.literal(xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXMax]
  }
  @scala.inline
  implicit class AnonXMaxOps[Self <: AnonXMax] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withXMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yMin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

