package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/fileNameCasingRule", JSImport.Namespace)
@js.native
object fileNameCasingRuleMod extends js.Object {
  
  @js.native
  class Rule () extends AbstractRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    var FAILURE_STRING: js.Any = js.native
    
    var metadata: IRuleMetadata = js.native
    
    def showWarning(message: String): Unit = js.native
    
    var stylizedNameForCasing: js.Any = js.native
  }
}
