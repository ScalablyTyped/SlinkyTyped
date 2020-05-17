package typingsSlinky.smoothie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineWidth extends js.Object {
  var lineWidth: Double = js.native
  var strokeStyle: String = js.native
}

object LineWidth {
  @scala.inline
  def apply(lineWidth: Double, strokeStyle: String): LineWidth = {
    val __obj = js.Dynamic.literal(lineWidth = lineWidth.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineWidth]
  }
  @scala.inline
  implicit class LineWidthOps[Self <: LineWidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

