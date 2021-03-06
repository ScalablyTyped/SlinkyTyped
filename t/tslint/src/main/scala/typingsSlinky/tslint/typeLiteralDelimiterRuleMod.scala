package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeLiteralDelimiterRuleMod {
  
  @JSImport("tslint/lib/rules/typeLiteralDelimiterRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
    
    var getRuleOptions: js.Any = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/typeLiteralDelimiterRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/typeLiteralDelimiterRule", "Rule.FAILURE_STRING_COMMA")
    @js.native
    def FAILURE_STRING_COMMA: String = js.native
    @scala.inline
    def FAILURE_STRING_COMMA_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_COMMA")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/typeLiteralDelimiterRule", "Rule.FAILURE_STRING_MISSING")
    @js.native
    def FAILURE_STRING_MISSING: String = js.native
    @scala.inline
    def FAILURE_STRING_MISSING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_MISSING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/typeLiteralDelimiterRule", "Rule.FAILURE_STRING_TRAILING")
    @js.native
    def FAILURE_STRING_TRAILING: String = js.native
    @scala.inline
    def FAILURE_STRING_TRAILING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING_TRAILING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/typeLiteralDelimiterRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
