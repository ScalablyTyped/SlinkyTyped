package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importBlacklistRuleMod {
  
  @JSImport("tslint/lib/rules/importBlacklistRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/importBlacklistRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/importBlacklistRule", "Rule.FAILURE_STRING_REGEX")
    @js.native
    def FAILURE_STRING_REGEX: String = js.native
    @scala.inline
    def FAILURE_STRING_REGEX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_REGEX")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/importBlacklistRule", "Rule.IMPLICIT_NAMED_IMPORT_FAILURE_STRING")
    @js.native
    def IMPLICIT_NAMED_IMPORT_FAILURE_STRING: String = js.native
    @scala.inline
    def IMPLICIT_NAMED_IMPORT_FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMPLICIT_NAMED_IMPORT_FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/importBlacklistRule", "Rule.MAKE_NAMED_IMPORT_FAILURE_STRING")
    @js.native
    def MAKE_NAMED_IMPORT_FAILURE_STRING(importName: String): String = js.native
    
    @JSImport("tslint/lib/rules/importBlacklistRule", "Rule.WHOLE_MODULE_FAILURE_STRING")
    @js.native
    def WHOLE_MODULE_FAILURE_STRING: String = js.native
    @scala.inline
    def WHOLE_MODULE_FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WHOLE_MODULE_FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/importBlacklistRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
