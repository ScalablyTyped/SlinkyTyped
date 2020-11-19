package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/noThisAssignmentRule", JSImport.Namespace)
@js.native
object noThisAssignmentRuleMod extends js.Object {
  
  @js.native
  class Rule () extends AbstractRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    var FAILURE_STRING_BINDINGS: String = js.native
    
    def FAILURE_STRING_FACTORY_IDENTIFIERS(name: String): String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
