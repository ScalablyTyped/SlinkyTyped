package typingsSlinky.tslint

import typingsSlinky.tslint.ruleMod.IRuleMetadata
import typingsSlinky.tslint.typedRuleMod.TypedRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/strictStringExpressionsRule", JSImport.Namespace)
@js.native
object strictStringExpressionsRuleMod extends js.Object {
  
  @js.native
  class Rule () extends TypedRule {
    
    var getRuleOptions: js.Any = js.native
  }
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    var CONVERSION_REQUIRED: String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
