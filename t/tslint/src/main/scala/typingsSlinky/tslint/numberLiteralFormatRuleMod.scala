package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/numberLiteralFormatRule", JSImport.Namespace)
@js.native
object numberLiteralFormatRuleMod extends js.Object {
  
  @js.native
  class Rule () extends AbstractRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    var FAILURE_STRING_LEADING_0: String = js.native
    
    var FAILURE_STRING_LEADING_DECIMAL: String = js.native
    
    var FAILURE_STRING_NOT_UPPERCASE: String = js.native
    
    var FAILURE_STRING_TRAILING_0: String = js.native
    
    var FAILURE_STRING_TRAILING_DECIMAL: String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
