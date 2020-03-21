package typingsSlinky.sipJs.userAgentsMod

import typingsSlinky.sipJs.incomingRequestMod.IncomingRequestDelegate
import typingsSlinky.sipJs.messagesMod.IncomingRequestMessage
import typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "SubscribeUserAgentServer")
@js.native
class SubscribeUserAgentServer protected ()
  extends typingsSlinky.sipJs.subscribeUserAgentServerMod.SubscribeUserAgentServer {
  def this(core: UserAgentCore, message: IncomingRequestMessage) = this()
  def this(core: UserAgentCore, message: IncomingRequestMessage, delegate: IncomingRequestDelegate) = this()
}

