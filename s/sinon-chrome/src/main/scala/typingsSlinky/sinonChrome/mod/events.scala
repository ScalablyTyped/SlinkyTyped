package typingsSlinky.sinonChrome.mod

import typingsSlinky.sinon.mod.SinonSpy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sinon-chrome", "events")
@js.native
object events extends js.Object {
  
  @js.native
  trait Event
    extends typingsSlinky.chrome.chrome.events.Event[js.Function] {
    
    // Methods
    def addListener(args: js.Any*): js.Any = js.native
    @JSName("addListener")
    var addListener_Original: SinonSpy = js.native
    
    def applyTrigger(args: js.Array[_]): Unit = js.native
    
    def applyTriggerAsync(args: js.Array[_]): Unit = js.native
    
    def dispatch(args: js.Any*): Unit = js.native
    
    // Methods
    def hasListener(args: js.Any*): js.Any = js.native
    @JSName("hasListener")
    var hasListener_Original: SinonSpy = js.native
    
    // Methods
    def removeListener(args: js.Any*): js.Any = js.native
    @JSName("removeListener")
    var removeListener_Original: SinonSpy = js.native
    
    // Methods
    def removeListeners(args: js.Any*): js.Any = js.native
    @JSName("removeListeners")
    var removeListeners_Original: SinonSpy = js.native
    
    def trigger(args: js.Any*): Unit = js.native
    
    def triggerAsync(args: js.Any*): Unit = js.native
  }
}
