package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickTypeParameterTypetype
import typingsSlinky.typedoc.modelsMod.TypeParameterType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types/type-parameter", JSImport.Namespace)
@js.native
object serializersTypesTypeParameterMod extends js.Object {
  @js.native
  class TypeParameterTypeSerializer () extends TypeSerializerComponent[TypeParameterType] {
    def toObject(`type`: TypeParameterType, obj: PickTypeParameterTypetype): typingsSlinky.typedoc.schemaMod.TypeParameterType = js.native
  }
  
}

