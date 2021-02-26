package typingsSlinky.xhrMock

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.std.ProgressEventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockProgressEventMod {
  
  @JSImport("xhr-mock/lib/MockProgressEvent", JSImport.Default)
  @js.native
  class default protected () extends MockProgressEvent {
    def this(`type`: String) = this()
    def this(`type`: String, eventInitDict: ProgressEventInit) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.std.Event because Already inherited
  - typingsSlinky.std.ProgressEvent because var conflicts: cancelBubble, returnValue. Inlined target_ProgressEvent, total, loaded, lengthComputable */ @js.native
  trait MockProgressEvent
    extends typingsSlinky.xhrMock.mockEventMod.default {
    
    def initProgressEvent(
      typeArg: String,
      canBubbleArg: Boolean,
      cancelableArg: Boolean,
      lengthComputableArg: Boolean,
      loadedArg: Double,
      totalArg: Double
    ): Unit = js.native
    
    val lengthComputable: Boolean = js.native
    
    val loaded: Double = js.native
    
    @JSName("target")
    val target_ProgressEvent: EventTarget | Null = js.native
    
    val total: Double = js.native
  }
}
