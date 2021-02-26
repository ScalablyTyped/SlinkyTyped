package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickUnknownTypetype
import typingsSlinky.typedoc.modelsMod.UnknownType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesUnknownMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/unknown", "UnknownTypeSerializer")
  @js.native
  class UnknownTypeSerializer protected () extends TypeSerializerComponent[UnknownType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: UnknownType, obj: PickUnknownTypetype): typingsSlinky.typedoc.schemaMod.UnknownType = js.native
  }
}
