package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PartialReflectionCategory
import typingsSlinky.typedoc.reflectionCategoryMod.ReflectionCategory
import typingsSlinky.typedoc.serializationComponentsMod.SerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/reflection-category", JSImport.Namespace)
@js.native
object serializersReflectionCategoryMod extends js.Object {
  @js.native
  class ReflectionCategorySerializer () extends SerializerComponent[ReflectionCategory] {
    def toObject(category: ReflectionCategory, obj: PartialReflectionCategory): typingsSlinky.typedoc.schemaMod.ReflectionCategory = js.native
  }
  
  /* static members */
  @js.native
  object ReflectionCategorySerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

