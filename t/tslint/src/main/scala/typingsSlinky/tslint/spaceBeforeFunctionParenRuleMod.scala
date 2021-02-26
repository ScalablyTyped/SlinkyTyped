package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spaceBeforeFunctionParenRuleMod {
  
  @JSImport("tslint/lib/rules/spaceBeforeFunctionParenRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/spaceBeforeFunctionParenRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/spaceBeforeFunctionParenRule", "Rule.INVALID_WHITESPACE_ERROR")
    @js.native
    def INVALID_WHITESPACE_ERROR: String = js.native
    @scala.inline
    def INVALID_WHITESPACE_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_WHITESPACE_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/spaceBeforeFunctionParenRule", "Rule.MISSING_WHITESPACE_ERROR")
    @js.native
    def MISSING_WHITESPACE_ERROR: String = js.native
    @scala.inline
    def MISSING_WHITESPACE_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MISSING_WHITESPACE_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/spaceBeforeFunctionParenRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
