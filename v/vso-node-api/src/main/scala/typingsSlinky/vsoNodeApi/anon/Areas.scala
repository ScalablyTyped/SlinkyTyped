package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Areas extends js.Object {
  var areas: scala.Double = js.native
  var iterations: scala.Double = js.native
}

object Areas {
  @scala.inline
  def apply(areas: scala.Double, iterations: scala.Double): Areas = {
    val __obj = js.Dynamic.literal(areas = areas.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Areas]
  }
  @scala.inline
  implicit class AreasOps[Self <: Areas] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAreas(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIterations(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

