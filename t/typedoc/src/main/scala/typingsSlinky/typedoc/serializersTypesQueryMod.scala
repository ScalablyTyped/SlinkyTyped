package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickQueryTypetype
import typingsSlinky.typedoc.modelsMod.QueryType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/types/query", JSImport.Namespace)
@js.native
object serializersTypesQueryMod extends js.Object {
  
  @js.native
  class QueryTypeSerializer () extends TypeSerializerComponent[QueryType] {
    
    def toObject(`type`: QueryType, obj: PickQueryTypetype): typingsSlinky.typedoc.schemaMod.QueryType = js.native
  }
}
