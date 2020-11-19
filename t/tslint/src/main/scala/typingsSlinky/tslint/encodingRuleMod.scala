package typingsSlinky.tslint

import typingsSlinky.tslint.libUtilsMod.Encoding
import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/encodingRule", JSImport.Namespace)
@js.native
object encodingRuleMod extends js.Object {
  
  @js.native
  class Rule () extends AbstractRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    def FAILURE_STRING(actual: Encoding): String = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
