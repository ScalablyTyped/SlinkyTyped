package typingsSlinky.typedoc

import typingsSlinky.typedoc.modelsMod.ProjectReflection
import typingsSlinky.typedoc.schemaMod.ContainerReflection
import typingsSlinky.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionsProjectMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections/project", "ProjectReflectionSerializer")
  @js.native
  class ProjectReflectionSerializer protected () extends ReflectionSerializerComponent[ProjectReflection] {
    def this(owner: Serializer) = this()
    
    def toObject(container: ProjectReflection, obj: ContainerReflection): typingsSlinky.typedoc.schemaMod.ProjectReflection = js.native
  }
  /* static members */
  object ProjectReflectionSerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflections/project", "ProjectReflectionSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflections/project", "ProjectReflectionSerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    @scala.inline
    def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
}
