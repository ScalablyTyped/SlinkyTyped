package typingsSlinky.twilsock

import typingsSlinky.std.Set
import typingsSlinky.twilsock.initReplyMod.ContinuationTokenStatus
import typingsSlinky.twilsock.initregistrationMod.InitRegistration
import typingsSlinky.twilsock.protocolMod.Protocol.Request
import typingsSlinky.twilsock.telemetryMod.TelemetryEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagesMod {
  
  @JSImport("twilsock/lib/protocol/messages", "Close")
  @js.native
  class Close ()
    extends typingsSlinky.twilsock.closeMod.Close
  
  @JSImport("twilsock/lib/protocol/messages", "Init")
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
  
  @JSImport("twilsock/lib/protocol/messages", "InitReply")
  @js.native
  class InitReply protected ()
    extends typingsSlinky.twilsock.initReplyMod.InitReply {
    def this(
      id: String,
      continuationToken: String,
      continuationTokenStatus: ContinuationTokenStatus,
      offlineStorage: js.Any,
      initRegistrations: js.Any,
      debugInfo: js.Any,
      confirmedCapabilities: Set[String]
    ) = this()
  }
  
  @JSImport("twilsock/lib/protocol/messages", "Message")
  @js.native
  class Message protected ()
    extends typingsSlinky.twilsock.messageMod.Message {
    def this(grant: String, contentType: String, request: Request) = this()
  }
  
  @JSImport("twilsock/lib/protocol/messages", "Reply")
  @js.native
  class Reply protected ()
    extends typingsSlinky.twilsock.replyMod.Reply {
    def this(id: String) = this()
  }
  
  @JSImport("twilsock/lib/protocol/messages", "Telemetry")
  @js.native
  class Telemetry protected ()
    extends typingsSlinky.twilsock.telemetryMod.Telemetry {
    def this(events: js.Array[TelemetryEvent]) = this()
  }
  
  @JSImport("twilsock/lib/protocol/messages", "Update")
  @js.native
  class Update protected ()
    extends typingsSlinky.twilsock.updateMod.Update {
    def this(token: String) = this()
  }
}
