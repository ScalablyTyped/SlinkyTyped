package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndentationRule extends js.Object {
  /**
  		 * If a line matches this pattern, then all the lines after it should be unindented once (until another rule matches).
  		 */
  var decreaseIndentPattern: js.RegExp = js.native
  /**
  		 * If a line matches this pattern, then all the lines after it should be indented once (until another rule matches).
  		 */
  var increaseIndentPattern: js.RegExp = js.native
  /**
  		 * If a line matches this pattern, then **only the next line** after it should be indented once.
  		 */
  var indentNextLinePattern: js.UndefOr[js.RegExp] = js.native
  /**
  		 * If a line matches this pattern, then its indentation should not be changed and it should not be evaluated against the other rules.
  		 */
  var unIndentedLinePattern: js.UndefOr[js.RegExp] = js.native
}

object IndentationRule {
  @scala.inline
  def apply(decreaseIndentPattern: js.RegExp, increaseIndentPattern: js.RegExp): IndentationRule = {
    val __obj = js.Dynamic.literal(decreaseIndentPattern = decreaseIndentPattern.asInstanceOf[js.Any], increaseIndentPattern = increaseIndentPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndentationRule]
  }
  @scala.inline
  implicit class IndentationRuleOps[Self <: IndentationRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecreaseIndentPattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decreaseIndentPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncreaseIndentPattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increaseIndentPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndentNextLinePattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentNextLinePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentNextLinePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentNextLinePattern")(js.undefined)
        ret
    }
    @scala.inline
    def withUnIndentedLinePattern(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unIndentedLinePattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnIndentedLinePattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unIndentedLinePattern")(js.undefined)
        ret
    }
  }
  
}

