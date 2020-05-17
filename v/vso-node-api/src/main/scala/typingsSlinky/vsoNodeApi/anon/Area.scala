package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Area extends js.Object {
  var area: scala.Double = js.native
  var iteration: scala.Double = js.native
}

object Area {
  @scala.inline
  def apply(area: scala.Double, iteration: scala.Double): Area = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Area]
  }
  @scala.inline
  implicit class AreaOps[Self <: Area] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIteration(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iteration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

