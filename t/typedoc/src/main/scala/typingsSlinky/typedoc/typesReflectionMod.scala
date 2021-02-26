package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickReflectionTypetype
import typingsSlinky.typedoc.modelsMod.ReflectionType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReflectionMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/reflection", "ReflectionTypeSerializer")
  @js.native
  class ReflectionTypeSerializer protected () extends TypeSerializerComponent[ReflectionType] {
    def this(owner: Serializer) = this()
    
    def toObject(reference: ReflectionType, obj: PickReflectionTypetype): typingsSlinky.typedoc.schemaMod.ReflectionType = js.native
    
    var visited: js.Any = js.native
  }
}
