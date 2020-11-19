package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.ConverterTypeComponent
import typingsSlinky.typedoc.contextMod.Context
import typingsSlinky.typedoc.modelsTypesMod.PredicateType
import typingsSlinky.typescript.mod.Node
import typingsSlinky.typescript.mod.TypePredicateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/types/predicate", JSImport.Namespace)
@js.native
object predicateMod extends js.Object {
  
  @js.native
  class PredicateConverter () extends ConverterTypeComponent {
    
    def convertNode(context: Context, node: TypePredicateNode): PredicateType = js.native
    
    def supportsNode(_context: Context, node: Node): Boolean = js.native
  }
}
