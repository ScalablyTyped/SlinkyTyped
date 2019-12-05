package typingsSlinky.tslint

import typingsSlinky.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typingsSlinky.tslint.tslintMod.Rules.AbstractRule
import typingsSlinky.tslint.tslintStrings.after
import typingsSlinky.tslint.tslintStrings.before
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/typedefWhitespaceRule", JSImport.Namespace)
@js.native
object libRulesTypedefWhitespaceRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    var metadata: IRuleMetadata = js.native
    @JSName("FAILURE_STRING")
    def FAILURE_STRING_after(option: String, location: after, `type`: String): String = js.native
    @JSName("FAILURE_STRING")
    def FAILURE_STRING_before(option: String, location: before, `type`: String): String = js.native
  }
  
}

