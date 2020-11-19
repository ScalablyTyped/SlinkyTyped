package typingsSlinky.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDecreaseIndentPattern(value: js.RegExp): Self = this.set("decreaseIndentPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreaseIndentPattern(value: js.RegExp): Self = this.set("increaseIndentPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentNextLinePattern(value: js.RegExp): Self = this.set("indentNextLinePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentNextLinePattern: Self = this.set("indentNextLinePattern", js.undefined)
    
    @scala.inline
    def setUnIndentedLinePattern(value: js.RegExp): Self = this.set("unIndentedLinePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnIndentedLinePattern: Self = this.set("unIndentedLinePattern", js.undefined)
  }
}
