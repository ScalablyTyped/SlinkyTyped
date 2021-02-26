package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickConditionalTypetypeTy
import typingsSlinky.typedoc.modelsMod.ConditionalType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesConditionalMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/conditional", "ConditionalTypeSerializer")
  @js.native
  class ConditionalTypeSerializer protected () extends TypeSerializerComponent[ConditionalType] {
    def this(owner: Serializer) = this()
    
    def toObject(conditional: ConditionalType, obj: PickConditionalTypetypeTy): typingsSlinky.typedoc.schemaMod.ConditionalType = js.native
  }
}
