package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsOverlapping extends js.Object {
  var isOverlapping: Double = js.native
  var oK: Double = js.native
}

object AnonIsOverlapping {
  @scala.inline
  def apply(isOverlapping: Double, oK: Double): AnonIsOverlapping = {
    val __obj = js.Dynamic.literal(isOverlapping = isOverlapping.asInstanceOf[js.Any], oK = oK.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsOverlapping]
  }
  @scala.inline
  implicit class AnonIsOverlappingOps[Self <: AnonIsOverlapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsOverlapping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOverlapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOK(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oK")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

