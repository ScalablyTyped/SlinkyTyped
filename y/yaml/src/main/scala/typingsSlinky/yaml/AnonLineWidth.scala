package typingsSlinky.yaml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLineWidth extends js.Object {
  /**
    * Maximum line width (set to `0` to disable folding).
    *
    * Default: `80`
    */
  var lineWidth: Double = js.native
  /**
    * Minimum width for highly-indented content.
    *
    * Default: `20`
    */
  var minContentWidth: Double = js.native
}

object AnonLineWidth {
  @scala.inline
  def apply(lineWidth: Double, minContentWidth: Double): AnonLineWidth = {
    val __obj = js.Dynamic.literal(lineWidth = lineWidth.asInstanceOf[js.Any], minContentWidth = minContentWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLineWidth]
  }
  @scala.inline
  implicit class AnonLineWidthOps[Self <: AnonLineWidth] (val x: Self) extends AnyVal {
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
    def withMinContentWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minContentWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

