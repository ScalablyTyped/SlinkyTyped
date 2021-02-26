package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickStringLiteralTypetype
import typingsSlinky.typedoc.modelsMod.StringLiteralType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesStringLiteralMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/string-literal", "StringLiteralTypeSerializer")
  @js.native
  class StringLiteralTypeSerializer protected () extends TypeSerializerComponent[StringLiteralType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: StringLiteralType, obj: PickStringLiteralTypetype): typingsSlinky.typedoc.schemaMod.StringLiteralType = js.native
  }
}
