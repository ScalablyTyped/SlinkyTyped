package typingsSlinky.sipJs.userAgentsMod

import typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "MessageUserAgentClient")
@js.native
class MessageUserAgentClient protected ()
  extends typingsSlinky.sipJs.messageUserAgentClientMod.MessageUserAgentClient {
  def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
  def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
}

