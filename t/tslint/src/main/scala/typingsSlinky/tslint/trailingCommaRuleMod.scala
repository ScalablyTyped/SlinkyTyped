package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trailingCommaRuleMod {
  
  @JSImport("tslint/lib/rules/trailingCommaRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/trailingCommaRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/trailingCommaRule", "Rule.FAILURE_STRING_ALWAYS")
    @js.native
    def FAILURE_STRING_ALWAYS: String = js.native
    @scala.inline
    def FAILURE_STRING_ALWAYS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_ALWAYS")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/trailingCommaRule", "Rule.FAILURE_STRING_FORBIDDEN")
    @js.native
    def FAILURE_STRING_FORBIDDEN: String = js.native
    @scala.inline
    def FAILURE_STRING_FORBIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_FORBIDDEN")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/trailingCommaRule", "Rule.FAILURE_STRING_NEVER")
    @js.native
    def FAILURE_STRING_NEVER: String = js.native
    @scala.inline
    def FAILURE_STRING_NEVER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_NEVER")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/trailingCommaRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
