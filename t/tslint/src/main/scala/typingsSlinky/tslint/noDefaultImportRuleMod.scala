package typingsSlinky.tslint

import typingsSlinky.tslint.mod.Rules.AbstractRule
import typingsSlinky.tslint.ruleMod.IRuleMetadata
import typingsSlinky.typescript.mod.Identifier
import typingsSlinky.typescript.mod.NamedImports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/rules/noDefaultImportRule", JSImport.Namespace)
@js.native
object noDefaultImportRuleMod extends js.Object {
  
  @js.native
  class Rule () extends AbstractRule {
    
    var getRuleOptions: js.Any = js.native
    
    var isFromModulesConfigOption: js.Any = js.native
  }
  /* static members */
  @js.native
  object Rule extends js.Object {
    
    var FAILURE_STRING: String = js.native
    
    def getNamedDefaultImport(namedBindings: NamedImports): Identifier | Null = js.native
    
    var metadata: IRuleMetadata = js.native
  }
}
