package typingsSlinky.typedoc

import typingsSlinky.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersSourcesMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/sources", "SourceReferenceContainerSerializer")
  @js.native
  class SourceReferenceContainerSerializer protected ()
    extends typingsSlinky.typedoc.sourceReferenceMod.SourceReferenceContainerSerializer {
    def this(owner: Serializer) = this()
  }
  /* static members */
  object SourceReferenceContainerSerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/sources", "SourceReferenceContainerSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/sources", "SourceReferenceContainerSerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    @scala.inline
    def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
}
