package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeLine extends js.Object {
  var code: String = js.native
  var line: Double = js.native
  var point: Double = js.native
}

object CodeLine {
  @scala.inline
  def apply(code: String, line: Double, point: Double): CodeLine = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeLine]
  }
  @scala.inline
  implicit class CodeLineOps[Self <: CodeLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

