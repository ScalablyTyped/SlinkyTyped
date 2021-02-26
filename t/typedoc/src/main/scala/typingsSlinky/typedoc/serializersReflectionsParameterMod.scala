package typingsSlinky.typedoc

import typingsSlinky.typedoc.modelsMod.ParameterReflection
import typingsSlinky.typedoc.schemaMod.Reflection
import typingsSlinky.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersReflectionsParameterMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections/parameter", "ParameterReflectionSerializer")
  @js.native
  class ParameterReflectionSerializer protected () extends ReflectionSerializerComponent[ParameterReflection] {
    def this(owner: Serializer) = this()
    
    def toObject(parameter: ParameterReflection, obj: Reflection): typingsSlinky.typedoc.schemaMod.ParameterReflection = js.native
  }
}
