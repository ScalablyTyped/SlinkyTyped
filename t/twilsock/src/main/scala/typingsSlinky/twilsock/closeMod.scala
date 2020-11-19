package typingsSlinky.twilsock

import typingsSlinky.twilsock.abstractmessageMod.AbstractMessage
import typingsSlinky.twilsock.protocolMod.Protocol.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilsock/lib/protocol/messages/close", JSImport.Namespace)
@js.native
object closeMod extends js.Object {
  
  @js.native
  class Close () extends AbstractMessage {
    
    val method: MessageType = js.native
  }
}
