package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArea extends js.Object {
  var area: Double = js.native
  var iteration: Double = js.native
}

object AnonArea {
  @scala.inline
  def apply(area: Double, iteration: Double): AnonArea = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArea]
  }
  @scala.inline
  implicit class AnonAreaOps[Self <: AnonArea] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIteration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iteration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

