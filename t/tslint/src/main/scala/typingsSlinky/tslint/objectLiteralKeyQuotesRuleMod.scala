package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectLiteralKeyQuotesRuleMod {
  
  @JSImport("tslint/lib/rules/objectLiteralKeyQuotesRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/objectLiteralKeyQuotesRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/objectLiteralKeyQuotesRule", "Rule.INCONSISTENT_PROPERTY")
    @js.native
    def INCONSISTENT_PROPERTY: String = js.native
    @scala.inline
    def INCONSISTENT_PROPERTY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INCONSISTENT_PROPERTY")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/objectLiteralKeyQuotesRule", "Rule.UNNEEDED_QUOTES")
    @js.native
    def UNNEEDED_QUOTES(name: String): String = js.native
    
    @JSImport("tslint/lib/rules/objectLiteralKeyQuotesRule", "Rule.UNQUOTED_PROPERTY")
    @js.native
    def UNQUOTED_PROPERTY(name: String): String = js.native
    
    @JSImport("tslint/lib/rules/objectLiteralKeyQuotesRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
