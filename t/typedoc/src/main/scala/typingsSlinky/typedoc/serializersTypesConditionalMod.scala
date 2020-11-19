package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickConditionalTypetypeTy
import typingsSlinky.typedoc.modelsMod.ConditionalType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/types/conditional", JSImport.Namespace)
@js.native
object serializersTypesConditionalMod extends js.Object {
  
  @js.native
  class ConditionalTypeSerializer () extends TypeSerializerComponent[ConditionalType] {
    
    def toObject(conditional: ConditionalType, obj: PickConditionalTypetypeTy): typingsSlinky.typedoc.schemaMod.ConditionalType = js.native
  }
}
