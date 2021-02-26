package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PartialReflectionGroup
import typingsSlinky.typedoc.reflectionGroupMod.ReflectionGroup
import typingsSlinky.typedoc.serializationComponentsMod.SerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersReflectionGroupMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflection-group", "ReflectionGroupSerializer")
  @js.native
  class ReflectionGroupSerializer protected () extends SerializerComponent[ReflectionGroup] {
    def this(owner: Serializer) = this()
    
    def toObject(group: ReflectionGroup, obj: PartialReflectionGroup): typingsSlinky.typedoc.schemaMod.ReflectionGroup = js.native
  }
  /* static members */
  object ReflectionGroupSerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflection-group", "ReflectionGroupSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflection-group", "ReflectionGroupSerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    @scala.inline
    def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
}
