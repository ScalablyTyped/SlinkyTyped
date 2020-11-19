package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/unifiedSignaturesRule", JSImport.Namespace)
@js.native
object unifiedSignaturesRuleMod extends js.Object {
  
  @js.native
  class Rule () extends AbstractRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    def FAILURE_STRING_OMITTING_REST_PARAMETER(): String = js.native
    def FAILURE_STRING_OMITTING_REST_PARAMETER(otherLine: Double): String = js.native
    
    def FAILURE_STRING_OMITTING_SINGLE_PARAMETER(): String = js.native
    def FAILURE_STRING_OMITTING_SINGLE_PARAMETER(otherLine: Double): String = js.native
    
    def FAILURE_STRING_SINGLE_PARAMETER_DIFFERENCE(otherLine: js.UndefOr[scala.Nothing], type1: String, type2: String): String = js.native
    def FAILURE_STRING_SINGLE_PARAMETER_DIFFERENCE(otherLine: Double, type1: String, type2: String): String = js.native
    
    var FAILURE_STRING_START: js.Any = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
