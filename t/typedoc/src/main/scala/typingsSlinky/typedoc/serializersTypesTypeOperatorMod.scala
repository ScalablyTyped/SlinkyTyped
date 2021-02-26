package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickTypeOperatorTypetype
import typingsSlinky.typedoc.modelsMod.TypeOperatorType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesTypeOperatorMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/type-operator", "TypeOperatorTypeSerializer")
  @js.native
  class TypeOperatorTypeSerializer protected () extends TypeSerializerComponent[TypeOperatorType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: TypeOperatorType, obj: PickTypeOperatorTypetype): typingsSlinky.typedoc.schemaMod.TypeOperatorType = js.native
  }
}
