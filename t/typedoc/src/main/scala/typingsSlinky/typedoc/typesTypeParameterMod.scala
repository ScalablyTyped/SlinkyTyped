package typingsSlinky.typedoc

import typingsSlinky.typedoc.componentsMod.TypeNodeConverter
import typingsSlinky.typescript.mod.Type
import typingsSlinky.typescript.mod.TypeReferenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/type-parameter", JSImport.Namespace)
@js.native
object typesTypeParameterMod extends js.Object {
  @js.native
  class TypeParameterConverter () extends TypeNodeConverter[Type, TypeReferenceNode]
  
}

