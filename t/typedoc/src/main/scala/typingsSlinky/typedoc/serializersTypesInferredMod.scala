package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.TypePickInferredTypetype
import typingsSlinky.typedoc.modelsMod.InferredType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types/inferred", JSImport.Namespace)
@js.native
object serializersTypesInferredMod extends js.Object {
  @js.native
  class InferredTypeSerializer () extends TypeSerializerComponent[InferredType] {
    def toObject(inferred: InferredType, obj: TypePickInferredTypetype): typingsSlinky.typedoc.schemaMod.InferredType = js.native
  }
  
}

