package typingsSlinky.sipDotJs.libCoreUserDashAgentsMod

import typingsSlinky.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
import typingsSlinky.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "RegisterUserAgentClient")
@js.native
class RegisterUserAgentClient protected ()
  extends typingsSlinky.sipDotJs.libCoreUserDashAgentsRegisterDashUserDashAgentDashClientMod.RegisterUserAgentClient {
  def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
  def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
}

