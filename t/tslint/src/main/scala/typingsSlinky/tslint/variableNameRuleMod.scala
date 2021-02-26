package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object variableNameRuleMod {
  
  @JSImport("tslint/lib/rules/variableNameRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/variableNameRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/variableNameRule", "Rule.FAILURE_STRING_CONST")
    @js.native
    def FAILURE_STRING_CONST: String = js.native
    @scala.inline
    def FAILURE_STRING_CONST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_CONST")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/variableNameRule", "Rule.KEYWORD_FAILURE")
    @js.native
    def KEYWORD_FAILURE: String = js.native
    @scala.inline
    def KEYWORD_FAILURE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEYWORD_FAILURE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/variableNameRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
