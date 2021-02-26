package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IOptions
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.NamedImports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noDefaultImportRuleMod {
  
  @JSImport("tslint/lib/rules/noDefaultImportRule", "Rule")
  @js.native
  class Rule protected () extends AbstractRule {
    def this(options: IOptions) = this()
    
    var getRuleOptions: js.Any = js.native
    
    var isFromModulesConfigOption: js.Any = js.native
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/noDefaultImportRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/noDefaultImportRule", "Rule.FAILURE_STRING")
    @js.native
    def FAILURE_STRING: String = js.native
    @scala.inline
    def FAILURE_STRING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILURE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/rules/noDefaultImportRule", "Rule.getNamedDefaultImport")
    @js.native
    def getNamedDefaultImport(namedBindings: NamedImports): Identifier | Null = js.native
    
    @JSImport("tslint/lib/rules/noDefaultImportRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    @scala.inline
    def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
