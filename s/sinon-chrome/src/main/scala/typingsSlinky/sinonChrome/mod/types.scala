package typingsSlinky.sinonChrome.mod

import typingsSlinky.sinonChrome.mod.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sinon-chrome", "types")
@js.native
object types extends js.Object {
  
  @js.native
  trait StubbedChromeSetting extends js.Object {
    
    // Methods
    def clear(args: js.Any*): js.Any = js.native
    @JSName("clear")
    var clear_Original: SinonChromeStub = js.native
    
    // Methods
    def get(args: js.Any*): js.Any = js.native
    @JSName("get")
    var get_Original: SinonChromeStub = js.native
    
    var onChange: Event = js.native
    
    // Methods
    def set(args: js.Any*): js.Any = js.native
    @JSName("set")
    var set_Original: SinonChromeStub = js.native
  }
}
