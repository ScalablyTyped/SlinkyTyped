package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickQueryTypetype
import typingsSlinky.typedoc.modelsMod.QueryType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesQueryMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/query", "QueryTypeSerializer")
  @js.native
  class QueryTypeSerializer protected () extends TypeSerializerComponent[QueryType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: QueryType, obj: PickQueryTypetype): typingsSlinky.typedoc.schemaMod.QueryType = js.native
  }
}
