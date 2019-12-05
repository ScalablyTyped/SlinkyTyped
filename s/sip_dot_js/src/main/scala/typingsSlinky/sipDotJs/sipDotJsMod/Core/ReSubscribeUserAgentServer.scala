package typingsSlinky.sipDotJs.sipDotJsMod.Core

import typingsSlinky.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.ReSubscribeUserAgentServer")
@js.native
class ReSubscribeUserAgentServer protected ()
  extends typingsSlinky.sipDotJs.libCoreMod.ReSubscribeUserAgentServer {
  def this(
    dialog: typingsSlinky.sipDotJs.libCoreDialogsMod.Dialog,
    message: typingsSlinky.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
  ) = this()
  def this(
    dialog: typingsSlinky.sipDotJs.libCoreDialogsMod.Dialog,
    message: typingsSlinky.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}

