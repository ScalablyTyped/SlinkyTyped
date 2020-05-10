package typingsSlinky.tsutils.utilUtilMod

import typingsSlinky.typescript.mod.TextRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineRange extends TextRange {
  var contentLength: Double = js.native
}

object LineRange {
  @scala.inline
  def apply(contentLength: Double, end: Double, pos: Double): LineRange = {
    val __obj = js.Dynamic.literal(contentLength = contentLength.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineRange]
  }
  @scala.inline
  implicit class LineRangeOps[Self <: LineRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

