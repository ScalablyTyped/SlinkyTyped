package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickTypeParameterTypetype
import typingsSlinky.typedoc.modelsMod.TypeParameterType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesTypeParameterMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/type-parameter", "TypeParameterTypeSerializer")
  @js.native
  class TypeParameterTypeSerializer protected () extends TypeSerializerComponent[TypeParameterType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: TypeParameterType, obj: PickTypeParameterTypetype): typingsSlinky.typedoc.schemaMod.TypeParameterType = js.native
  }
}
