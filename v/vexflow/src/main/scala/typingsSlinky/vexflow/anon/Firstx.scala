package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Firstx extends js.Object {
  var first_x: Double = js.native
  var first_y: Double = js.native
  var last_x: Double = js.native
  var last_y: Double = js.native
  var staff_height: Double = js.native
}

object Firstx {
  @scala.inline
  def apply(first_x: Double, first_y: Double, last_x: Double, last_y: Double, staff_height: Double): Firstx = {
    val __obj = js.Dynamic.literal(first_x = first_x.asInstanceOf[js.Any], first_y = first_y.asInstanceOf[js.Any], last_x = last_x.asInstanceOf[js.Any], last_y = last_y.asInstanceOf[js.Any], staff_height = staff_height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firstx]
  }
  @scala.inline
  implicit class FirstxOps[Self <: Firstx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withStaff_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staff_height")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

