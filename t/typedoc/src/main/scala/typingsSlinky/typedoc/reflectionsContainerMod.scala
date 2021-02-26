package typingsSlinky.typedoc

import typingsSlinky.typedoc.modelsMod.ContainerReflection
import typingsSlinky.typedoc.schemaMod.Reflection
import typingsSlinky.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionsContainerMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections/container", "ContainerReflectionSerializer")
  @js.native
  class ContainerReflectionSerializer protected () extends ReflectionSerializerComponent[ContainerReflection] {
    def this(owner: Serializer) = this()
    
    def toObject(container: ContainerReflection, obj: Reflection): typingsSlinky.typedoc.schemaMod.ContainerReflection = js.native
  }
}
