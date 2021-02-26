package typingsSlinky.sipJs.coreMod

import typingsSlinky.sipJs.incomingRequestMod.IncomingRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "ReSubscribeUserAgentServer")
@js.native
class ReSubscribeUserAgentServer protected ()
  extends typingsSlinky.sipJs.userAgentsMod.ReSubscribeUserAgentServer {
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
