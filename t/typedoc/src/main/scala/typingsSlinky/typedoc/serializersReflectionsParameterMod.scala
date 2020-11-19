package typingsSlinky.typedoc

import typingsSlinky.typedoc.modelsMod.ParameterReflection
import typingsSlinky.typedoc.schemaMod.Reflection
import typingsSlinky.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/reflections/parameter", JSImport.Namespace)
@js.native
object serializersReflectionsParameterMod extends js.Object {
  
  @js.native
  class ParameterReflectionSerializer () extends ReflectionSerializerComponent[ParameterReflection] {
    
    def toObject(parameter: ParameterReflection, obj: Reflection): typingsSlinky.typedoc.schemaMod.ParameterReflection = js.native
  }
}
