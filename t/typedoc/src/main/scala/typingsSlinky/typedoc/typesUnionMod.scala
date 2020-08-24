package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickUnionTypetype
import typingsSlinky.typedoc.modelsMod.UnionType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types/union", JSImport.Namespace)
@js.native
object typesUnionMod extends js.Object {
  @js.native
  class UnionTypeSerializer () extends TypeSerializerComponent[UnionType] {
    def toObject(`type`: UnionType, obj: PickUnionTypetype): typingsSlinky.typedoc.schemaMod.UnionType = js.native
  }
  
}

