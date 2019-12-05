package typingsSlinky.twilsock

import typingsSlinky.twilsock.libProtocolInitregistrationMod.InitRegistration
import typingsSlinky.twilsock.libProtocolMessagesInitReplyMod.ContinuationTokenStatus
import typingsSlinky.twilsock.libProtocolProtocolMod.Protocol.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/protocol/messages", JSImport.Namespace)
@js.native
object libProtocolMessagesMod extends js.Object {
  @js.native
  class Close ()
    extends typingsSlinky.twilsock.libProtocolMessagesCloseMod.Close
  
  @js.native
  class Init protected ()
    extends typingsSlinky.twilsock.libProtocolMessagesInitMod.Init {
    def this(token: String, continuationToken: String, metadata: js.Object) = this()
    def this(
      token: String,
      continuationToken: String,
      metadata: js.Object,
      registrations: js.Array[InitRegistration]
    ) = this()
    def this(
      token: String,
      continuationToken: String,
      metadata: js.Object,
      registrations: js.Array[InitRegistration],
      tweaks: js.Object
    ) = this()
  }
  
  @js.native
  class InitReply protected ()
    extends typingsSlinky.twilsock.libProtocolMessagesInitReplyMod.InitReply {
    def this(
      id: String,
      continuationToken: String,
      continuationTokenStatus: ContinuationTokenStatus,
      offlineStorage: js.Any,
      initRegistrations: js.Any,
      debugInfo: js.Any
    ) = this()
  }
  
  @js.native
  class Message protected ()
    extends typingsSlinky.twilsock.libProtocolMessagesMessageMod.Message {
    def this(grant: String, contentType: String, request: Request) = this()
  }
  
  @js.native
  class Reply protected ()
    extends typingsSlinky.twilsock.libProtocolMessagesReplyMod.Reply {
    def this(id: String) = this()
  }
  
  @js.native
  class Update protected ()
    extends typingsSlinky.twilsock.libProtocolMessagesUpdateMod.Update {
    def this(token: String) = this()
  }
  
}

