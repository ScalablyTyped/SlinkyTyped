package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickUnionTypetype
import typingsSlinky.typedoc.modelsMod.UnionType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUnionMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/union", "UnionTypeSerializer")
  @js.native
  class UnionTypeSerializer protected () extends TypeSerializerComponent[UnionType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: UnionType, obj: PickUnionTypetype): typingsSlinky.typedoc.schemaMod.UnionType = js.native
  }
}
