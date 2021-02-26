package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.OptionallyTypedRule
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unnecessaryBindRuleMod {
  
  @JSImport("tslint/lib/rules/unnecessaryBindRule", "Rule")
  @js.native
  class Rule protected () extends OptionallyTypedRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/unnecessaryBindRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/unnecessaryBindRule", "Rule.FAILURE_STRING_ARROW")
    @js.native
    def FAILURE_STRING_ARROW: String = js.native
    @scala.inline
    def FAILURE_STRING_ARROW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_ARROW")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/unnecessaryBindRule", "Rule.FAILURE_STRING_FUNCTION")
    @js.native
    def FAILURE_STRING_FUNCTION: String = js.native
    @scala.inline
    def FAILURE_STRING_FUNCTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_FUNCTION")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/unnecessaryBindRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
