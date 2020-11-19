package typingsSlinky.tslint

import typingsSlinky.tslint.ruleMod.IRuleMetadata
import typingsSlinky.tslint.typedRuleMod.TypedRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/returnUndefinedRule", JSImport.Namespace)
@js.native
object returnUndefinedRuleMod extends js.Object {
  
  @js.native
  class Rule () extends TypedRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    var FAILURE_STRING_VALUE_RETURN: String = js.native
    
    var FAILURE_STRING_VOID_RETURN: String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
