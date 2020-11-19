package typingsSlinky.twilsock

import typingsSlinky.twilsock.initReplyMod.ContinuationTokenStatus
import typingsSlinky.twilsock.initregistrationMod.InitRegistration
import typingsSlinky.twilsock.protocolMod.Protocol.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilsock/lib/protocol/messages", JSImport.Namespace)
@js.native
object messagesMod extends js.Object {
  
  @js.native
  class Close ()
    extends typingsSlinky.twilsock.closeMod.Close
  
  @js.native
  class Init protected ()
    extends typingsSlinky.twilsock.initMod.Init {
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
      registrations: js.UndefOr[scala.Nothing],
      tweaks: js.Object
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
    extends typingsSlinky.twilsock.initReplyMod.InitReply {
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
    extends typingsSlinky.twilsock.messageMod.Message {
    def this(grant: String, contentType: String, request: Request) = this()
  }
  
  @js.native
  class Reply protected ()
    extends typingsSlinky.twilsock.replyMod.Reply {
    def this(id: String) = this()
  }
  
  @js.native
  class Update protected ()
    extends typingsSlinky.twilsock.updateMod.Update {
    def this(token: String) = this()
  }
}
