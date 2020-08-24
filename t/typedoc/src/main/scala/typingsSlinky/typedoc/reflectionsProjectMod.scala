package typingsSlinky.typedoc

import typingsSlinky.typedoc.modelsMod.ProjectReflection
import typingsSlinky.typedoc.schemaMod.ContainerReflection
import typingsSlinky.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/reflections/project", JSImport.Namespace)
@js.native
object reflectionsProjectMod extends js.Object {
  @js.native
  class ProjectReflectionSerializer () extends ReflectionSerializerComponent[ProjectReflection] {
    def toObject(container: ProjectReflection, obj: ContainerReflection): typingsSlinky.typedoc.schemaMod.ProjectReflection = js.native
  }
  
  /* static members */
  @js.native
  object ProjectReflectionSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

