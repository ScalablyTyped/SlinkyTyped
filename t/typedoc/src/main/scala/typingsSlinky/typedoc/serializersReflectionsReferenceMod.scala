package typingsSlinky.typedoc

import typingsSlinky.typedoc.modelsMod.ReferenceReflection
import typingsSlinky.typedoc.schemaMod.DeclarationReflection
import typingsSlinky.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersReflectionsReferenceMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections/reference", "ReferenceReflectionSerializer")
  @js.native
  class ReferenceReflectionSerializer protected () extends ReflectionSerializerComponent[ReferenceReflection] {
    def this(owner: Serializer) = this()
    
    def toObject(ref: ReferenceReflection, obj: DeclarationReflection): typingsSlinky.typedoc.schemaMod.ReferenceReflection = js.native
  }
  /* static members */
  object ReferenceReflectionSerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflections/reference", "ReferenceReflectionSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflections/reference", "ReferenceReflectionSerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    @scala.inline
    def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
}
