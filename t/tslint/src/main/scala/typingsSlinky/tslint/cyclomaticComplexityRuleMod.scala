package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/cyclomaticComplexityRule", JSImport.Namespace)
@js.native
object cyclomaticComplexityRuleMod extends js.Object {
  
  @js.native
  class Rule () extends AbstractRule {
    
    /* private */ def threshold: js.Any = js.native
  }
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    var DEFAULT_THRESHOLD: Double = js.native
    
    def FAILURE_STRING(expected: Double, actual: Double): String = js.native
    def FAILURE_STRING(expected: Double, actual: Double, name: String): String = js.native
    
    var MINIMUM_THRESHOLD: Double = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
