package typingsSlinky.tslint

import typingsSlinky.tslint.optionallyTypedRuleMod.OptionallyTypedRule
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/objectLiteralSortKeysRule", JSImport.Namespace)
@js.native
object objectLiteralSortKeysRuleMod extends js.Object {
  
  @js.native
  class Rule () extends OptionallyTypedRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    def FAILURE_STRING_ALPHABETICAL(name: String): String = js.native
    
    def FAILURE_STRING_SHORTHAND_FIRST(name: String): String = js.native
    
    def FAILURE_STRING_USE_DECLARATION_ORDER(propName: String): String = js.native
    def FAILURE_STRING_USE_DECLARATION_ORDER(propName: String, typeName: String): String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
