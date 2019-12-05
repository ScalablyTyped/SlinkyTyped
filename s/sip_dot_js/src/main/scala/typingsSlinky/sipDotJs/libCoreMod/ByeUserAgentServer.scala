package typingsSlinky.sipDotJs.libCoreMod

import typingsSlinky.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ByeUserAgentServer")
@js.native
class ByeUserAgentServer protected ()
  extends typingsSlinky.sipDotJs.libCoreUserDashAgentsMod.ByeUserAgentServer {
  def this(
    dialog: typingsSlinky.sipDotJs.libCoreDialogsMod.SessionDialog,
    message: typingsSlinky.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialog: typingsSlinky.sipDotJs.libCoreDialogsMod.SessionDialog,
    message: typingsSlinky.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}

