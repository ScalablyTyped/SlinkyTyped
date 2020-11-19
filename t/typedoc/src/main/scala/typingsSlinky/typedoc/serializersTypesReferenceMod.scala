package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickReferenceTypetypePart
import typingsSlinky.typedoc.modelsMod.ReferenceType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/types/reference", JSImport.Namespace)
@js.native
object serializersTypesReferenceMod extends js.Object {
  
  @js.native
  class ReferenceTypeSerializer () extends TypeSerializerComponent[ReferenceType] {
    
    def toObject(`type`: ReferenceType, obj: PickReferenceTypetypePart): typingsSlinky.typedoc.schemaMod.ReferenceType = js.native
  }
}
