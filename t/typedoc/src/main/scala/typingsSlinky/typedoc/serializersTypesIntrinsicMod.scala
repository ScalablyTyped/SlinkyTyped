package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickIntrinsicTypetype
import typingsSlinky.typedoc.modelsMod.IntrinsicType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesIntrinsicMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/intrinsic", "IntrinsicTypeSerializer")
  @js.native
  class IntrinsicTypeSerializer protected () extends TypeSerializerComponent[IntrinsicType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: IntrinsicType, obj: PickIntrinsicTypetype): typingsSlinky.typedoc.schemaMod.IntrinsicType = js.native
  }
}
