package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/noDuplicateImportsRule", JSImport.Namespace)
@js.native
object noDuplicateImportsRuleMod extends js.Object {
  
  @js.native
  class Rule () extends AbstractRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    def FAILURE_STRING(module: String): String = js.native
    
    def NAMESPACE_FAILURE_STRING(module: String): String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
