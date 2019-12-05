package typingsSlinky.sipDotJs.libCoreUserDashAgentsMod

import typingsSlinky.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate
import typingsSlinky.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typingsSlinky.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import typingsSlinky.sipDotJs.libCoreUserDashAgentsUserDashAgentDashServerMod.ServerTransactionConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "UserAgentServer")
@js.native
class UserAgentServer protected ()
  extends typingsSlinky.sipDotJs.libCoreUserDashAgentsUserDashAgentDashServerMod.UserAgentServer {
  def this(
    transactionConstructor: ServerTransactionConstructor,
    core: UserAgentCore,
    message: IncomingRequestMessage
  ) = this()
  def this(
    transactionConstructor: ServerTransactionConstructor,
    core: UserAgentCore,
    message: IncomingRequestMessage,
    delegate: IncomingRequestDelegate
  ) = this()
}

