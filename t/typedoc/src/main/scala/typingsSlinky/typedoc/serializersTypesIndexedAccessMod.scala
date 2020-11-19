package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickIndexedAccessTypetype
import typingsSlinky.typedoc.modelsMod.IndexedAccessType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/types/indexed-access", JSImport.Namespace)
@js.native
object serializersTypesIndexedAccessMod extends js.Object {
  
  @js.native
  class IndexedAccessTypeSerializer () extends TypeSerializerComponent[IndexedAccessType] {
    
    def toObject(`type`: IndexedAccessType, obj: PickIndexedAccessTypetype): typingsSlinky.typedoc.schemaMod.IndexedAccessType = js.native
  }
}
