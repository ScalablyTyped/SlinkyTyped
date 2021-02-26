package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickIndexedAccessTypetype
import typingsSlinky.typedoc.modelsMod.IndexedAccessType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesIndexedAccessMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/indexed-access", "IndexedAccessTypeSerializer")
  @js.native
  class IndexedAccessTypeSerializer protected () extends TypeSerializerComponent[IndexedAccessType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: IndexedAccessType, obj: PickIndexedAccessTypetype): typingsSlinky.typedoc.schemaMod.IndexedAccessType = js.native
  }
}
