package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickIntersectionTypetype
import typingsSlinky.typedoc.modelsMod.IntersectionType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/types/intersection", JSImport.Namespace)
@js.native
object typesIntersectionMod extends js.Object {
  
  @js.native
  class IntersectionTypeSerializer () extends TypeSerializerComponent[IntersectionType] {
    
    def toObject(`type`: IntersectionType, obj: PickIntersectionTypetype): typingsSlinky.typedoc.schemaMod.IntersectionType = js.native
  }
}
