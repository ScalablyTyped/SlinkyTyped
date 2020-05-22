package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnEnterRule extends js.Object {
  /**
    * The action to execute.
    */
  var action: EnterAction
  /**
    * This rule will only execute if the text after the cursor matches this regular expression.
    */
  var afterText: js.UndefOr[js.RegExp] = js.undefined
  /**
    * This rule will only execute if the text before the cursor matches this regular expression.
    */
  var beforeText: js.RegExp
}

object OnEnterRule {
  @scala.inline
  def apply(action: EnterAction, beforeText: js.RegExp, afterText: js.RegExp = null): OnEnterRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], beforeText = beforeText.asInstanceOf[js.Any])
    if (afterText != null) __obj.updateDynamic("afterText")(afterText.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEnterRule]
  }
}

