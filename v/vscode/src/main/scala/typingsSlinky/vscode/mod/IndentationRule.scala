package typingsSlinky.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndentationRule extends StObject {
  
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
  implicit class IndentationRuleMutableBuilder[Self <: IndentationRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecreaseIndentPattern(value: js.RegExp): Self = StObject.set(x, "decreaseIndentPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreaseIndentPattern(value: js.RegExp): Self = StObject.set(x, "increaseIndentPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentNextLinePattern(value: js.RegExp): Self = StObject.set(x, "indentNextLinePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentNextLinePatternUndefined: Self = StObject.set(x, "indentNextLinePattern", js.undefined)
    
    @scala.inline
    def setUnIndentedLinePattern(value: js.RegExp): Self = StObject.set(x, "unIndentedLinePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnIndentedLinePatternUndefined: Self = StObject.set(x, "unIndentedLinePattern", js.undefined)
  }
}
