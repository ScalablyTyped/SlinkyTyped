package typingsSlinky.twilsock

import typingsSlinky.twilsock.abstractmessageMod.AbstractMessage
import typingsSlinky.twilsock.anon.Code
import typingsSlinky.twilsock.protocolMod.Protocol.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replyMod {
  
  @JSImport("twilsock/lib/protocol/messages/reply", "Reply")
  @js.native
  class Reply protected () extends AbstractMessage {
    def this(id: String) = this()
    
    val body: js.Any = js.native
    
    val header: js.Any = js.native
    
    val method: MessageType = js.native
    
    val payload_type: /* "application/json" */ String = js.native
    
    val status: Code = js.native
  }
}
