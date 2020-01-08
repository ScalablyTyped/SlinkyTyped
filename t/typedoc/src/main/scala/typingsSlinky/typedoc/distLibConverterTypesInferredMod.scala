package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibConverterComponentsMod.TypeNodeConverter
import typingsSlinky.typedoc.distLibConverterContextMod.Context
import typingsSlinky.typescript.typescriptMod.InferTypeNode
import typingsSlinky.typescript.typescriptMod.Type
import typingsSlinky.typescript.typescriptMod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/inferred", JSImport.Namespace)
@js.native
object distLibConverterTypesInferredMod extends js.Object {
  @js.native
  class InferredConverter () extends TypeNodeConverter[Type, InferTypeNode] {
    def supportsNode(_context: Context, node: TypeNode): Boolean = js.native
  }
  
}

