package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import typingsSlinky.tslint.tslintNumbers.`-1`
import typingsSlinky.tslint.tslintNumbers.`0`
import typingsSlinky.tslint.tslintNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/memberOrderingRule", JSImport.Namespace)
@js.native
object memberOrderingRuleMod extends js.Object {
  
  @js.native
  class Rule () extends AbstractRule
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    def FAILURE_STRING_ALPHABETIZE(prevName: String, curName: String): String = js.native
    
    var metadata: IRuleMetadata = js.native
    
    def stringCompare(a: String, b: String): `1` | `-1` | `0` = js.native
  }
}
