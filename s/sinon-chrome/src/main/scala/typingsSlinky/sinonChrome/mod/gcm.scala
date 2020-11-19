package typingsSlinky.sinonChrome.mod

import typingsSlinky.sinonChrome.mod.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sinon-chrome", "gcm")
@js.native
object gcm extends js.Object {
  
  var onMessage: Event = js.native
  
  var onMessagesDeleted: Event = js.native
  
  var onSendError: Event = js.native
  
  var register: SinonChromeStub = js.native
  
  var send: SinonChromeStub = js.native
  
  var unregister: SinonChromeStub = js.native
}
