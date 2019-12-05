package typingsSlinky.sipDotJs.libCoreMod

import typingsSlinky.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "RegisterUserAgentServer")
@js.native
class RegisterUserAgentServer protected ()
  extends typingsSlinky.sipDotJs.libCoreUserDashAgentsMod.RegisterUserAgentServer {
  def this(
    core: typingsSlinky.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    message: typingsSlinky.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
  ) = this()
  def this(
    core: typingsSlinky.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore,
    message: typingsSlinky.sipDotJs.libCoreMessagesMod.IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}

