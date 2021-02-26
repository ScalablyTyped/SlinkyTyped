package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import typingsSlinky.tslint.tslintNumbers.`-1`
import typingsSlinky.tslint.tslintNumbers.`0`
import typingsSlinky.tslint.tslintNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memberOrderingRuleMod {
  
  @JSImport("tslint/lib/rules/memberOrderingRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/memberOrderingRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/memberOrderingRule", "Rule.FAILURE_STRING_ALPHABETIZE")
    @js.native
    def FAILURE_STRING_ALPHABETIZE(prevName: String, curName: String): String = js.native
    
    @JSImport("tslint/lib/rules/memberOrderingRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/memberOrderingRule", "Rule.stringCompare")
    @js.native
    def stringCompare(a: String, b: String): `1` | `-1` | `0` = js.native
  }
}
