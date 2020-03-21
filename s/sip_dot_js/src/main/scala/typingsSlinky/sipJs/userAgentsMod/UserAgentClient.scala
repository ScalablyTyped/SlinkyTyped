package typingsSlinky.sipJs.userAgentsMod

import typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.userAgentClientMod.ClientTransactionConstructor
import typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "UserAgentClient")
@js.native
class UserAgentClient protected ()
  extends typingsSlinky.sipJs.userAgentClientMod.UserAgentClient {
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

