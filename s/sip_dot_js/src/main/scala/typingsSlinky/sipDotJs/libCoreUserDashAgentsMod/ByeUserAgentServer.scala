package typingsSlinky.sipDotJs.libCoreUserDashAgentsMod

import typingsSlinky.sipDotJs.libCoreDialogsMod.SessionDialog
import typingsSlinky.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import typingsSlinky.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "ByeUserAgentServer")
@js.native
class ByeUserAgentServer protected ()
  extends typingsSlinky.sipDotJs.libCoreUserDashAgentsByeDashUserDashAgentDashServerMod.ByeUserAgentServer {
  def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
  def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
}

