package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickTypeOperatorTypetype
import typingsSlinky.typedoc.modelsMod.TypeOperatorType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/types/type-operator", JSImport.Namespace)
@js.native
object serializersTypesTypeOperatorMod extends js.Object {
  
  @js.native
  class TypeOperatorTypeSerializer () extends TypeSerializerComponent[TypeOperatorType] {
    
    def toObject(`type`: TypeOperatorType, obj: PickTypeOperatorTypetype): typingsSlinky.typedoc.schemaMod.TypeOperatorType = js.native
  }
}
