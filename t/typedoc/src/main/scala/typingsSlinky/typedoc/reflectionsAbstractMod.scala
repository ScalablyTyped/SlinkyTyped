package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PartialReflection
import typingsSlinky.typedoc.modelsMod.Reflection
import typingsSlinky.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionsAbstractMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections/abstract", "ReflectionSerializer")
  @js.native
  class ReflectionSerializer protected () extends ReflectionSerializerComponent[Reflection] {
    def this(owner: Serializer) = this()
    
    def toObject(reflection: Reflection, obj: PartialReflection): typingsSlinky.typedoc.schemaMod.Reflection = js.native
  }
  /* static members */
  object ReflectionSerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflections/abstract", "ReflectionSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflections/abstract", "ReflectionSerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    @scala.inline
    def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
}
