package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.Begin
import typingsSlinky.typedoc.modelsMod.ProjectReflection
import typingsSlinky.typedoc.schemaMod.ModelToObject
import typingsSlinky.typedoc.serializationComponentsMod.SerializerComponent
import typingsSlinky.typedoc.utilsEventsMod.EventDispatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializer", JSImport.Namespace)
@js.native
object serializerMod extends js.Object {
  
  @js.native
  class Serializer () extends EventDispatcher {
    
    def addSerializer(serializer: SerializerComponent[_]): Unit = js.native
    
    var findSerializers: js.Any = js.native
    
    def projectToObject(value: ProjectReflection): ModelToObject[ProjectReflection] = js.native
    def projectToObject(value: ProjectReflection, eventData: Begin): ModelToObject[ProjectReflection] = js.native
    
    var serializers: js.Any = js.native
    
    def toObject[T](value: T): ModelToObject[T] = js.native
    def toObject[T](value: T, init: js.Object): ModelToObject[T] = js.native
  }
  /* static members */
  @js.native
  object Serializer extends js.Object {
    
    var EVENT_BEGIN: String = js.native
    
    var EVENT_END: String = js.native
  }
}
