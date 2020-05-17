package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Firstxpx extends js.Object {
  var direction: Double = js.native
  var first_x_px: Double = js.native
  var first_ys: js.Array[Double] = js.native
  var last_x_px: Double = js.native
  var last_ys: js.Array[Double] = js.native
}

object Firstxpx {
  @scala.inline
  def apply(
    direction: Double,
    first_x_px: Double,
    first_ys: js.Array[Double],
    last_x_px: Double,
    last_ys: js.Array[Double]
  ): Firstxpx = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], first_x_px = first_x_px.asInstanceOf[js.Any], first_ys = first_ys.asInstanceOf[js.Any], last_x_px = last_x_px.asInstanceOf[js.Any], last_ys = last_ys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firstxpx]
  }
  @scala.inline
  implicit class FirstxpxOps[Self <: Firstxpx] (val x: Self) extends AnyVal {
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
    def withFirst_x_px(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_x_px")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst_ys(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_ys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_x_px(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_x_px")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_ys(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_ys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

