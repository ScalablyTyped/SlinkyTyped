package typingsSlinky.typedoc

import typingsSlinky.typedoc.modelsMod.DeclarationReflection
import typingsSlinky.typedoc.schemaMod.ContainerReflection
import typingsSlinky.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersReflectionsDeclarationMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections/declaration", "DeclarationReflectionSerializer")
  @js.native
  class DeclarationReflectionSerializer protected () extends ReflectionSerializerComponent[DeclarationReflection] {
    def this(owner: Serializer) = this()
    
    def toObject(declaration: DeclarationReflection, obj: ContainerReflection): typingsSlinky.typedoc.schemaMod.DeclarationReflection = js.native
  }
  /* static members */
  object DeclarationReflectionSerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflections/declaration", "DeclarationReflectionSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflections/declaration", "DeclarationReflectionSerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    @scala.inline
    def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
}
