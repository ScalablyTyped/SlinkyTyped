package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.PartialSourceReference
import typingsSlinky.typedoc.schemaMod.SourceReference
import typingsSlinky.typedoc.serializationComponentsMod.SerializerComponent
import typingsSlinky.typedoc.serializerMod.Serializer
import typingsSlinky.typedoc.serializersModelsMod.SourceReferenceWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceReferenceMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/sources/source-reference", "SourceReferenceContainerSerializer")
  @js.native
  class SourceReferenceContainerSerializer protected () extends SerializerComponent[SourceReferenceWrapper] {
    def this(owner: Serializer) = this()
    
    def toObject(hasSourceReference: SourceReferenceWrapper, obj: PartialSourceReference): SourceReference = js.native
  }
  /* static members */
  object SourceReferenceContainerSerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/sources/source-reference", "SourceReferenceContainerSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/sources/source-reference", "SourceReferenceContainerSerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    @scala.inline
    def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
}
