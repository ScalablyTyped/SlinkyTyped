package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noDuplicateImportsRuleMod {
  
  @JSImport("tslint/lib/rules/noDuplicateImportsRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/noDuplicateImportsRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/noDuplicateImportsRule", "Rule.FAILURE_STRING")
    @js.native
    def FAILURE_STRING(module: String): String = js.native
    
    @JSImport("tslint/lib/rules/noDuplicateImportsRule", "Rule.NAMESPACE_FAILURE_STRING")
    @js.native
    def NAMESPACE_FAILURE_STRING(module: String): String = js.native
    
    @JSImport("tslint/lib/rules/noDuplicateImportsRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
