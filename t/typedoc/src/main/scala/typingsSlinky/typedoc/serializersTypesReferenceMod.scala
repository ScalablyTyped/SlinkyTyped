package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickReferenceTypetypePart
import typingsSlinky.typedoc.modelsMod.ReferenceType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesReferenceMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/reference", "ReferenceTypeSerializer")
  @js.native
  class ReferenceTypeSerializer protected () extends TypeSerializerComponent[ReferenceType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: ReferenceType, obj: PickReferenceTypetypePart): typingsSlinky.typedoc.schemaMod.ReferenceType = js.native
  }
}
