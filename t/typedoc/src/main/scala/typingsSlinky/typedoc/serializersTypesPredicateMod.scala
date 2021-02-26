package typingsSlinky.typedoc

import typingsSlinky.typedoc.modelsMod.PredicateType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesPredicateMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/predicate", "PredicateTypeSerializer")
  @js.native
  class PredicateTypeSerializer protected () extends TypeSerializerComponent[PredicateType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: PredicateType, obj: js.Any): js.Any = js.native
  }
}
