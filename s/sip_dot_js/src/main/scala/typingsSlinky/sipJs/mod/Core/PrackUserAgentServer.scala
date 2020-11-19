package typingsSlinky.sipJs.mod.Core

import typingsSlinky.sipJs.incomingRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.PrackUserAgentServer")
@js.native
class PrackUserAgentServer protected ()
  extends typingsSlinky.sipJs.coreMod.PrackUserAgentServer {
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
