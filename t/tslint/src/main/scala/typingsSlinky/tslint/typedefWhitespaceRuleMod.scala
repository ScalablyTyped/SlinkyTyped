package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import typingsSlinky.tslint.tslintStrings.after
import typingsSlinky.tslint.tslintStrings.before
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typedefWhitespaceRuleMod {
  
  @JSImport("tslint/lib/rules/typedefWhitespaceRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/typedefWhitespaceRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/typedefWhitespaceRule", "Rule.FAILURE_STRING")
    @js.native
    def FAILURE_STRING_after(option: String, location: after, `type`: String): String = js.native
    @JSImport("tslint/lib/rules/typedefWhitespaceRule", "Rule.FAILURE_STRING")
    @js.native
    def FAILURE_STRING_before(option: String, location: before, `type`: String): String = js.native
    
    @JSImport("tslint/lib/rules/typedefWhitespaceRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
