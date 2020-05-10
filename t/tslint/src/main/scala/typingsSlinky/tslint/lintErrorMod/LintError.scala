package typingsSlinky.tslint.lintErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintError extends js.Object {
  var endPos: PositionInFile = js.native
  var message: String = js.native
  var startPos: PositionInFile = js.native
}

object LintError {
  @scala.inline
  def apply(endPos: PositionInFile, message: String, startPos: PositionInFile): LintError = {
    val __obj = js.Dynamic.literal(endPos = endPos.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintError]
  }
  @scala.inline
  implicit class LintErrorOps[Self <: LintError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndPos(value: PositionInFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartPos(value: PositionInFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

