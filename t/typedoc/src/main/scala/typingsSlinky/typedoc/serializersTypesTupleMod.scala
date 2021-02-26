package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickNamedTupleMemberTypet
import typingsSlinky.typedoc.anon.PickTupleTypetype
import typingsSlinky.typedoc.modelsMod.TupleType
import typingsSlinky.typedoc.schemaMod.NamedTupleMemberType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import typingsSlinky.typedoc.typesTupleMod.NamedTupleMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesTupleMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/tuple", "NamedTupleMemberTypeSerializer")
  @js.native
  class NamedTupleMemberTypeSerializer protected () extends TypeSerializerComponent[NamedTupleMember] {
    def this(owner: Serializer) = this()
    
    def toObject(tuple: NamedTupleMember, obj: PickNamedTupleMemberTypet): NamedTupleMemberType = js.native
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/tuple", "TupleTypeSerializer")
  @js.native
  class TupleTypeSerializer protected () extends TypeSerializerComponent[TupleType] {
    def this(owner: Serializer) = this()
    
    def toObject(tuple: TupleType, obj: PickTupleTypetype): typingsSlinky.typedoc.schemaMod.TupleType = js.native
  }
}
