package typingsSlinky.sipJs.userAgentsMod

import typingsSlinky.sipJs.dialogsMod.SessionDialog
import typingsSlinky.sipJs.incomingRequestMod.IncomingRequestDelegate
import typingsSlinky.sipJs.messagesMod.IncomingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/user-agents", "InfoUserAgentServer")
@js.native
class InfoUserAgentServer protected ()
  extends typingsSlinky.sipJs.infoUserAgentServerMod.InfoUserAgentServer {
  def this(dialog: SessionDialog, message: IncomingRequestMessage) = this()
  def this(dialog: SessionDialog, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
}
