package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PartialReflection
import typingsSlinky.typedoc.modelsMod.Reflection
import typingsSlinky.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/reflections/abstract", JSImport.Namespace)
@js.native
object reflectionsAbstractMod extends js.Object {
  @js.native
  class ReflectionSerializer () extends ReflectionSerializerComponent[Reflection] {
    def toObject(reflection: Reflection, obj: PartialReflection): typingsSlinky.typedoc.schemaMod.Reflection = js.native
  }
  
  /* static members */
  @js.native
  object ReflectionSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

