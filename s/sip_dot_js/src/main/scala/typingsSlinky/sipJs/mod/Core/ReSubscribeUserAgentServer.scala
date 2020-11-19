package typingsSlinky.sipJs.mod.Core

import typingsSlinky.sipJs.incomingRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.ReSubscribeUserAgentServer")
@js.native
class ReSubscribeUserAgentServer protected ()
  extends typingsSlinky.sipJs.coreMod.ReSubscribeUserAgentServer {
  def this(
    dialog: typingsSlinky.sipJs.dialogsMod.Dialog,
    message: typingsSlinky.sipJs.messagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialog: typingsSlinky.sipJs.dialogsMod.Dialog,
    message: typingsSlinky.sipJs.messagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}
