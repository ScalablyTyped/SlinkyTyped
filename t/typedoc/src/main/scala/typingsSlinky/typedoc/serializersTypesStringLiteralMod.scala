package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PickStringLiteralTypetype
import typingsSlinky.typedoc.modelsMod.StringLiteralType
import typingsSlinky.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types/string-literal", JSImport.Namespace)
@js.native
object serializersTypesStringLiteralMod extends js.Object {
  @js.native
  class StringLiteralTypeSerializer () extends TypeSerializerComponent[StringLiteralType] {
    def toObject(`type`: StringLiteralType, obj: PickStringLiteralTypetype): typingsSlinky.typedoc.schemaMod.StringLiteralType = js.native
  }
  
}

