package typingsSlinky.swiper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCurrentX extends js.Object {
  var currentX: Double = js.native
  var currentY: Double = js.native
  var diff: Double = js.native
  var startX: Double = js.native
  var startY: Double = js.native
}

object AnonCurrentX {
  @scala.inline
  def apply(currentX: Double, currentY: Double, diff: Double, startX: Double, startY: Double): AnonCurrentX = {
    val __obj = js.Dynamic.literal(currentX = currentX.asInstanceOf[js.Any], currentY = currentY.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrentX]
  }
  @scala.inline
  implicit class AnonCurrentXOps[Self <: AnonCurrentX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiff(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

