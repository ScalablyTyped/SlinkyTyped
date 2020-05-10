package typingsSlinky.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHighestline extends js.Object {
  var highest_line: Double = js.native
  var lowest_line: Double = js.native
  var y_bottom: Double = js.native
  var y_top: Double = js.native
}

object AnonHighestline {
  @scala.inline
  def apply(highest_line: Double, lowest_line: Double, y_bottom: Double, y_top: Double): AnonHighestline = {
    val __obj = js.Dynamic.literal(highest_line = highest_line.asInstanceOf[js.Any], lowest_line = lowest_line.asInstanceOf[js.Any], y_bottom = y_bottom.asInstanceOf[js.Any], y_top = y_top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHighestline]
  }
  @scala.inline
  implicit class AnonHighestlineOps[Self <: AnonHighestline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighest_line(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highest_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLowest_line(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowest_line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY_bottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y_bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY_top(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y_top")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

