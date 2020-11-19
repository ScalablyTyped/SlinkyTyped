package typingsSlinky.sipJs.userAgentsMod

import typingsSlinky.sipJs.incomingRequestMod.IncomingRequestDelegate
import typingsSlinky.sipJs.messagesMod.IncomingRequestMessage
import typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/user-agents", "RegisterUserAgentServer")
@js.native
class RegisterUserAgentServer protected ()
  extends typingsSlinky.sipJs.registerUserAgentServerMod.RegisterUserAgentServer {
  def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
  def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
}
