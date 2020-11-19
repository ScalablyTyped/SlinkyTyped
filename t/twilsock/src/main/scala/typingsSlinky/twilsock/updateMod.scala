package typingsSlinky.twilsock

import typingsSlinky.twilsock.abstractmessageMod.AbstractMessage
import typingsSlinky.twilsock.protocolMod.Protocol.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilsock/lib/protocol/messages/update", JSImport.Namespace)
@js.native
object updateMod extends js.Object {
  
  @js.native
  class Update protected () extends AbstractMessage {
    def this(token: String) = this()
    
    val method: MessageType = js.native
    
    val token: String = js.native
  }
}
