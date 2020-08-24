package typingsSlinky.typedoc

import typingsSlinky.typedoc.modelsMod.ContainerReflection
import typingsSlinky.typedoc.schemaMod.Reflection
import typingsSlinky.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/reflections/container", JSImport.Namespace)
@js.native
object reflectionsContainerMod extends js.Object {
  @js.native
  class ContainerReflectionSerializer () extends ReflectionSerializerComponent[ContainerReflection] {
    def toObject(container: ContainerReflection, obj: Reflection): typingsSlinky.typedoc.schemaMod.ContainerReflection = js.native
  }
  
}

