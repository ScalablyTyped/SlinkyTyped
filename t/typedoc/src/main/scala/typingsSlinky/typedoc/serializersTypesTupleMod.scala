package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickNamedTupleMemberTypet
import typingsSlinky.typedoc.anon.PickTupleTypetype
import typingsSlinky.typedoc.modelsMod.TupleType
import typingsSlinky.typedoc.schemaMod.NamedTupleMemberType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import typingsSlinky.typedoc.typesTupleMod.NamedTupleMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/types/tuple", JSImport.Namespace)
@js.native
object serializersTypesTupleMod extends js.Object {
  
  @js.native
  class NamedTupleMemberTypeSerializer () extends TypeSerializerComponent[NamedTupleMember] {
    
    def toObject(tuple: NamedTupleMember, obj: PickNamedTupleMemberTypet): NamedTupleMemberType = js.native
  }
  
  @js.native
  class TupleTypeSerializer () extends TypeSerializerComponent[TupleType] {
    
    def toObject(tuple: TupleType, obj: PickTupleTypetype): typingsSlinky.typedoc.schemaMod.TupleType = js.native
  }
}
