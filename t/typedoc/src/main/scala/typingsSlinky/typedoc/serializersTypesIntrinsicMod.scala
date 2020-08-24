package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickIntrinsicTypetype
import typingsSlinky.typedoc.modelsMod.IntrinsicType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types/intrinsic", JSImport.Namespace)
@js.native
object serializersTypesIntrinsicMod extends js.Object {
  @js.native
  class IntrinsicTypeSerializer () extends TypeSerializerComponent[IntrinsicType] {
    def toObject(`type`: IntrinsicType, obj: PickIntrinsicTypetype): typingsSlinky.typedoc.schemaMod.IntrinsicType = js.native
  }
  
}

