package typingsSlinky.sipJs.coreMod

import typingsSlinky.sipJs.incomingRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "ByeUserAgentServer")
@js.native
class ByeUserAgentServer protected ()
  extends typingsSlinky.sipJs.userAgentsMod.ByeUserAgentServer {
  def this(
    dialog: typingsSlinky.sipJs.dialogsMod.SessionDialog,
    message: typingsSlinky.sipJs.messagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialog: typingsSlinky.sipJs.dialogsMod.SessionDialog,
    message: typingsSlinky.sipJs.messagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}
