package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.TypePickInferredTypetype
import typingsSlinky.typedoc.modelsMod.InferredType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesInferredMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/inferred", "InferredTypeSerializer")
  @js.native
  class InferredTypeSerializer protected () extends TypeSerializerComponent[InferredType] {
    def this(owner: Serializer) = this()
    
    def toObject(inferred: InferredType, obj: TypePickInferredTypetype): typingsSlinky.typedoc.schemaMod.InferredType = js.native
  }
}
