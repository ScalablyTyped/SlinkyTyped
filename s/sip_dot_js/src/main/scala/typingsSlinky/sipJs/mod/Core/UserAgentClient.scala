package typingsSlinky.sipJs.mod.Core

import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.userAgentClientMod.ClientTransactionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.UserAgentClient")
@js.native
class UserAgentClient protected ()
  extends typingsSlinky.sipJs.coreMod.UserAgentClient {
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
