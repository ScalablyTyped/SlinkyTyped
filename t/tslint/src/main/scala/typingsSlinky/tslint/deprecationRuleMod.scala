package typingsSlinky.tslint

import typingsSlinky.tslint.ruleMod.IRuleMetadata
import typingsSlinky.tslint.typedRuleMod.TypedRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/deprecationRule", JSImport.Namespace)
@js.native
object deprecationRuleMod extends js.Object {
  
  @js.native
  class Rule () extends TypedRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    def FAILURE_STRING(name: String, message: String): String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
