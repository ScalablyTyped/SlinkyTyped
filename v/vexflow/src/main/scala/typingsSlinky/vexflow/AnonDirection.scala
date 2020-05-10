package typingsSlinky.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDirection extends js.Object {
  var direction: Double = js.native
  var first_x: Double = js.native
  var first_y: Double = js.native
  var last_x: Double = js.native
  var last_y: Double = js.native
}

object AnonDirection {
  @scala.inline
  def apply(direction: Double, first_x: Double, first_y: Double, last_x: Double, last_y: Double): AnonDirection = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], first_x = first_x.asInstanceOf[js.Any], first_y = first_y.asInstanceOf[js.Any], last_x = last_x.asInstanceOf[js.Any], last_y = last_y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirection]
  }
  @scala.inline
  implicit class AnonDirectionOps[Self <: AnonDirection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst_x(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst_y(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_x(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_y(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

