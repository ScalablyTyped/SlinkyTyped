package typingsSlinky.sipDotJs.libCoreUserDashAgentsMod

import typingsSlinky.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import typingsSlinky.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typingsSlinky.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "SubscribeUserAgentServer")
@js.native
class SubscribeUserAgentServer protected ()
  extends typingsSlinky.sipDotJs.libCoreUserDashAgentsSubscribeDashUserDashAgentDashServerMod.SubscribeUserAgentServer {
  def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
  def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
}

