package typingsSlinky.typedoc

import typingsSlinky.typedoc.modelsMod.TypeParameterReflection
import typingsSlinky.typedoc.schemaMod.Reflection
import typingsSlinky.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersReflectionsTypeParameterMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections/type-parameter", "TypeParameterReflectionSerializer")
  @js.native
  class TypeParameterReflectionSerializer protected () extends ReflectionSerializerComponent[TypeParameterReflection] {
    def this(owner: Serializer) = this()
    
    def toObject(typeParameter: TypeParameterReflection, obj: Reflection): typingsSlinky.typedoc.schemaMod.TypeParameterReflection = js.native
  }
}
