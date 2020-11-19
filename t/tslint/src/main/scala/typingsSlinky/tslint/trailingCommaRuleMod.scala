package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/trailingCommaRule", JSImport.Namespace)
@js.native
object trailingCommaRuleMod extends js.Object {
  
  @js.native
  class Rule () extends AbstractRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    var FAILURE_STRING_ALWAYS: String = js.native
    
    var FAILURE_STRING_FORBIDDEN: String = js.native
    
    var FAILURE_STRING_NEVER: String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
