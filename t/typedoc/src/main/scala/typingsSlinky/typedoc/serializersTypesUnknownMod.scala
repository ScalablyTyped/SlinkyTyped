package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickUnknownTypetype
import typingsSlinky.typedoc.modelsMod.UnknownType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/types/unknown", JSImport.Namespace)
@js.native
object serializersTypesUnknownMod extends js.Object {
  
  @js.native
  class UnknownTypeSerializer () extends TypeSerializerComponent[UnknownType] {
    
    def toObject(`type`: UnknownType, obj: PickUnknownTypetype): typingsSlinky.typedoc.schemaMod.UnknownType = js.native
  }
}
