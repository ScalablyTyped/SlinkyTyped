package typingsSlinky.twilsock

import typingsSlinky.twilsock.abstractmessageMod.AbstractMessage
import typingsSlinky.twilsock.protocolMod.Protocol.MessageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/protocol/messages/reply", JSImport.Namespace)
@js.native
object replyMod extends js.Object {
  @js.native
  class Reply protected () extends AbstractMessage {
    def this(id: String) = this()
    val body: js.Any = js.native
    val header: js.Any = js.native
    val method: MessageType = js.native
    val payload_type: /* "application/json" */ String = js.native
    val status: AnonCode = js.native
  }
  
}

