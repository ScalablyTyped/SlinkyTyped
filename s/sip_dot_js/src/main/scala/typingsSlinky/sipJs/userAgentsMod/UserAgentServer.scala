package typingsSlinky.sipJs.userAgentsMod

import typingsSlinky.sipJs.incomingRequestMod.IncomingRequestDelegate
import typingsSlinky.sipJs.messagesMod.IncomingRequestMessage
import typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore
import typingsSlinky.sipJs.userAgentServerMod.ServerTransactionConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "UserAgentServer")
@js.native
class UserAgentServer protected ()
  extends typingsSlinky.sipJs.userAgentServerMod.UserAgentServer {
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

