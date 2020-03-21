package typingsSlinky.typedoc

import typingsSlinky.typedoc.modelsMod.ReflectionType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types/reflection", JSImport.Namespace)
@js.native
object typesReflectionMod extends js.Object {
  @js.native
  class ReflectionTypeSerializer () extends TypeSerializerComponent[ReflectionType] {
    var declaration: js.UndefOr[js.Any] = js.native
  }
  
}

