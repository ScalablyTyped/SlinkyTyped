package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickArrayTypetype
import typingsSlinky.typedoc.modelsMod.ArrayType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesArrayMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/array", "ArrayTypeSerializer")
  @js.native
  class ArrayTypeSerializer protected () extends TypeSerializerComponent[ArrayType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: ArrayType, obj: PickArrayTypetype): typingsSlinky.typedoc.schemaMod.ArrayType = js.native
  }
}
