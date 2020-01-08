package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibConverterComponentsMod.TypeNodeConverter
import typingsSlinky.typedoc.distLibConverterContextMod.Context
import typingsSlinky.typescript.typescriptMod.IndexedAccessTypeNode
import typingsSlinky.typescript.typescriptMod.Type
import typingsSlinky.typescript.typescriptMod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/indexed-access", JSImport.Namespace)
@js.native
object distLibConverterTypesIndexedDashAccessMod extends js.Object {
  @js.native
  class IndexedAccessConverter () extends TypeNodeConverter[Type, IndexedAccessTypeNode] {
    def supportsNode(context: Context, node: TypeNode): Boolean = js.native
  }
  
}

