package typingsSlinky.sipJs.mod.Core

import typingsSlinky.sipJs.incomingRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.MessageUserAgentServer")
@js.native
class MessageUserAgentServer protected ()
  extends typingsSlinky.sipJs.coreMod.MessageUserAgentServer {
  def this(
    core: typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsSlinky.sipJs.messagesMod.IncomingRequestMessage
  ) = this()
  def this(
    core: typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsSlinky.sipJs.messagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}
