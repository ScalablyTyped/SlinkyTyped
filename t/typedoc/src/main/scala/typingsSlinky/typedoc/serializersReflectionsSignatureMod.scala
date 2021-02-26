package typingsSlinky.typedoc

import typingsSlinky.typedoc.modelsMod.SignatureReflection
import typingsSlinky.typedoc.schemaMod.Reflection
import typingsSlinky.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersReflectionsSignatureMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections/signature", "SignatureReflectionSerializer")
  @js.native
  class SignatureReflectionSerializer protected () extends ReflectionSerializerComponent[SignatureReflection] {
    def this(owner: Serializer) = this()
    
    def toObject(signature: SignatureReflection, obj: Reflection): typingsSlinky.typedoc.schemaMod.SignatureReflection = js.native
  }
}
