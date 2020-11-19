package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: EnterAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeText(value: js.RegExp): Self = this.set("beforeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterText(value: js.RegExp): Self = this.set("afterText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterText: Self = this.set("afterText", js.undefined)
  }
}
