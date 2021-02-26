package typingsSlinky.sinonChrome.mod

import typingsSlinky.sinon.mod.SinonSpy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object events {
  
  @js.native
  trait Event
    extends typingsSlinky.chrome.chrome.events.Event[js.Function] {
    
    // Methods
    def addListener(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
    ): js.Any = js.native
    @JSName("addListener")
    var addListener_Original: SinonSpy[js.Array[_], _] = js.native
    
    def applyTrigger(args: js.Array[_]): Unit = js.native
    
    def applyTriggerAsync(args: js.Array[_]): Unit = js.native
    
    def dispatch(args: js.Any*): Unit = js.native
    
    // Methods
    def hasListener(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
    ): js.Any = js.native
    @JSName("hasListener")
    var hasListener_Original: SinonSpy[js.Array[_], _] = js.native
    
    // Methods
    def removeListener(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
    ): js.Any = js.native
    @JSName("removeListener")
    var removeListener_Original: SinonSpy[js.Array[_], _] = js.native
    
    // Methods
    def removeListeners(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
    ): js.Any = js.native
    @JSName("removeListeners")
    var removeListeners_Original: SinonSpy[js.Array[_], _] = js.native
    
    def trigger(args: js.Any*): Unit = js.native
    
    def triggerAsync(args: js.Any*): Unit = js.native
  }
}
