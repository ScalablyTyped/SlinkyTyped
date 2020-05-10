package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnEnterRule extends js.Object {
  /**
  		 * The action to execute.
  		 */
  var action: EnterAction = js.native
  /**
  		 * This rule will only execute if the text after the cursor matches this regular expression.
  		 */
  var afterText: js.UndefOr[js.RegExp] = js.native
  /**
  		 * This rule will only execute if the text before the cursor matches this regular expression.
  		 */
  var beforeText: js.RegExp = js.native
}

object OnEnterRule {
  @scala.inline
  def apply(action: EnterAction, beforeText: js.RegExp): OnEnterRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], beforeText = beforeText.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEnterRule]
  }
  @scala.inline
  implicit class OnEnterRuleOps[Self <: OnEnterRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: EnterAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeText(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterText(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterText")(js.undefined)
        ret
    }
  }
  
}

