package typingsSlinky.sipJs.coreMod

import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.userAgentClientMod.ClientTransactionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "UserAgentClient")
@js.native
class UserAgentClient protected ()
  extends typingsSlinky.sipJs.userAgentsMod.UserAgentClient {
  def this(
    transactionConstructor: ClientTransactionConstructor,
    core: typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage
  ) = this()
  def this(
    transactionConstructor: ClientTransactionConstructor,
    core: typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage,
    delegate: OutgoingRequestDelegate
  ) = this()
}
