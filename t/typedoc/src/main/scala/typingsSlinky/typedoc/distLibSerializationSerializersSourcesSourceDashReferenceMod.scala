package typingsSlinky.typedoc

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.typedoc.distLibModelsSourcesFileMod.SourceReference
import typingsSlinky.typedoc.distLibSerializationComponentsMod.SerializerComponent
import typingsSlinky.typedoc.distLibSerializationSerializersModelsSourceDashReferenceDashWrapperMod.SourceReferenceWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/sources/source-reference", JSImport.Namespace)
@js.native
object distLibSerializationSerializersSourcesSourceDashReferenceMod extends js.Object {
  @js.native
  class SourceReferenceContainerSerializer () extends SerializerComponent[SourceReferenceWrapper] {
    @JSName("serializeGroupSymbol")
    var serializeGroupSymbol_SourceReferenceContainerSerializer: Instantiable1[/* sourceReference */ SourceReference, SourceReferenceWrapper] = js.native
  }
  
  /* static members */
  @js.native
  object SourceReferenceContainerSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

