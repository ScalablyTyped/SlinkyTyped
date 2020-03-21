package typingsSlinky.typedoc

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.typedoc.abstractMod.ReflectionKind
import typingsSlinky.typedoc.reflectionGroupMod.ReflectionGroup
import typingsSlinky.typedoc.serializationComponentsMod.SerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/reflection-group", JSImport.Namespace)
@js.native
object serializersReflectionGroupMod extends js.Object {
  @js.native
  class ReflectionGroupSerializer () extends SerializerComponent[ReflectionGroup] {
    @JSName("serializeGroupSymbol")
    var serializeGroupSymbol_ReflectionGroupSerializer: Instantiable2[/* title */ String, /* kind */ ReflectionKind, ReflectionGroup] = js.native
  }
  
  /* static members */
  @js.native
  object ReflectionGroupSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

