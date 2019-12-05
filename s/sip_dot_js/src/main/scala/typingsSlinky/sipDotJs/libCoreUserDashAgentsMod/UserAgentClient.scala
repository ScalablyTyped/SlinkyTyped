package typingsSlinky.sipDotJs.libCoreUserDashAgentsMod

import typingsSlinky.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
import typingsSlinky.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import typingsSlinky.sipDotJs.libCoreUserDashAgentsUserDashAgentDashClientMod.ClientTransactionConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "UserAgentClient")
@js.native
class UserAgentClient protected ()
  extends typingsSlinky.sipDotJs.libCoreUserDashAgentsUserDashAgentDashClientMod.UserAgentClient {
  def this(
    transactionConstructor: ClientTransactionConstructor,
    core: UserAgentCore,
    message: OutgoingRequestMessage
  ) = this()
  def this(
    transactionConstructor: ClientTransactionConstructor,
    core: UserAgentCore,
    message: OutgoingRequestMessage,
    delegate: OutgoingRequestDelegate
  ) = this()
}

