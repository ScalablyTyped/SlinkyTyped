package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibConverterComponentsMod.TypeNodeConverter
import typingsSlinky.typedoc.distLibConverterContextMod.Context
import typingsSlinky.typedoc.distLibModelsTypesMod.Type
import typingsSlinky.typescript.typescriptMod.TypeReference
import typingsSlinky.typescript.typescriptMod.TypeReferenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/reference", JSImport.Namespace)
@js.native
object distLibConverterTypesReferenceMod extends js.Object {
  @js.native
  class ReferenceConverter () extends TypeNodeConverter[TypeReference, TypeReferenceNode] {
    var convertLiteral: js.Any = js.native
    def convertType(context: Context, `type`: TypeReference): js.UndefOr[Type] = js.native
    def supportsType(context: Context, `type`: TypeReference): Boolean = js.native
  }
  
}

