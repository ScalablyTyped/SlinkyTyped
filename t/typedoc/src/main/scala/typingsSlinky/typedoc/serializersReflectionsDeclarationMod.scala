package typingsSlinky.typedoc

import typingsSlinky.typedoc.modelsMod.DeclarationReflection
import typingsSlinky.typedoc.schemaMod.ContainerReflection
import typingsSlinky.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/reflections/declaration", JSImport.Namespace)
@js.native
object serializersReflectionsDeclarationMod extends js.Object {
  
  @js.native
  class DeclarationReflectionSerializer () extends ReflectionSerializerComponent[DeclarationReflection] {
    
    def toObject(declaration: DeclarationReflection, obj: ContainerReflection): typingsSlinky.typedoc.schemaMod.DeclarationReflection = js.native
  }
  /* static members */
  @js.native
  object DeclarationReflectionSerializer extends js.Object {
    
    var PRIORITY: Double = js.native
  }
}
