package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noRedundantJsdocRuleMod {
  
  @JSImport("tslint/lib/rules/noRedundantJsdocRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/noRedundantJsdocRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/noRedundantJsdocRule", "Rule.FAILURE_STRING_NO_COMMENT")
    @js.native
    def FAILURE_STRING_NO_COMMENT(tagName: String): String = js.native
    
    @JSImport("tslint/lib/rules/noRedundantJsdocRule", "Rule.FAILURE_STRING_REDUNDANT_TAG")
    @js.native
    def FAILURE_STRING_REDUNDANT_TAG(tagName: String): String = js.native
    
    @JSImport("tslint/lib/rules/noRedundantJsdocRule", "Rule.FAILURE_STRING_REDUNDANT_TYPE")
    @js.native
    def FAILURE_STRING_REDUNDANT_TYPE: String = js.native
    @scala.inline
    def FAILURE_STRING_REDUNDANT_TYPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_REDUNDANT_TYPE")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noRedundantJsdocRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
