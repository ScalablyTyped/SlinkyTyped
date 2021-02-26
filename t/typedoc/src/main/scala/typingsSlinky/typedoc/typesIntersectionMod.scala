package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickIntersectionTypetype
import typingsSlinky.typedoc.modelsMod.IntersectionType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIntersectionMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/intersection", "IntersectionTypeSerializer")
  @js.native
  class IntersectionTypeSerializer protected () extends TypeSerializerComponent[IntersectionType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: IntersectionType, obj: PickIntersectionTypetype): typingsSlinky.typedoc.schemaMod.IntersectionType = js.native
  }
}
