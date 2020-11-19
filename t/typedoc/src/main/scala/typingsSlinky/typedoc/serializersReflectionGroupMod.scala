package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PartialReflectionGroup
import typingsSlinky.typedoc.reflectionGroupMod.ReflectionGroup
import typingsSlinky.typedoc.serializationComponentsMod.SerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/reflection-group", JSImport.Namespace)
@js.native
object serializersReflectionGroupMod extends js.Object {
  
  @js.native
  class ReflectionGroupSerializer () extends SerializerComponent[ReflectionGroup] {
    
    def toObject(group: ReflectionGroup, obj: PartialReflectionGroup): typingsSlinky.typedoc.schemaMod.ReflectionGroup = js.native
  }
  /* static members */
  @js.native
  object ReflectionGroupSerializer extends js.Object {
    
    var PRIORITY: Double = js.native
  }
}
