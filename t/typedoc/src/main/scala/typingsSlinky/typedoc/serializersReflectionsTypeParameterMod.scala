package typingsSlinky.typedoc

import typingsSlinky.typedoc.modelsMod.TypeParameterReflection
import typingsSlinky.typedoc.schemaMod.Reflection
import typingsSlinky.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/reflections/type-parameter", JSImport.Namespace)
@js.native
object serializersReflectionsTypeParameterMod extends js.Object {
  
  @js.native
  class TypeParameterReflectionSerializer () extends ReflectionSerializerComponent[TypeParameterReflection] {
    
    def toObject(typeParameter: TypeParameterReflection, obj: Reflection): typingsSlinky.typedoc.schemaMod.TypeParameterReflection = js.native
  }
}
