package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibConverterComponentsMod.ConverterTypeComponent
import typingsSlinky.typedoc.distLibConverterContextMod.Context
import typingsSlinky.typedoc.distLibModelsTypesMod.PredicateType
import typingsSlinky.typescript.typescriptMod.Node
import typingsSlinky.typescript.typescriptMod.TypePredicateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/predicate", JSImport.Namespace)
@js.native
object distLibConverterTypesPredicateMod extends js.Object {
  @js.native
  class PredicateConverter () extends ConverterTypeComponent {
    def convertNode(context: Context, node: TypePredicateNode): PredicateType = js.native
    def supportsNode(_context: Context, node: Node): Boolean = js.native
  }
  
}

