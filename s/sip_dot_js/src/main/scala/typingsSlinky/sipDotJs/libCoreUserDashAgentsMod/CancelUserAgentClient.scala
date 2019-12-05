package typingsSlinky.sipDotJs.libCoreUserDashAgentsMod

import typingsSlinky.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
import typingsSlinky.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "CancelUserAgentClient")
@js.native
class CancelUserAgentClient protected ()
  extends typingsSlinky.sipDotJs.libCoreUserDashAgentsCancelDashUserDashAgentDashClientMod.CancelUserAgentClient {
  def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
  def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
}

