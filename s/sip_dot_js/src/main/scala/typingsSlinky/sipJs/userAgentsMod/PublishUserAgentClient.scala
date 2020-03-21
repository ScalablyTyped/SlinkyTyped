package typingsSlinky.sipJs.userAgentsMod

import typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage
import typingsSlinky.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "PublishUserAgentClient")
@js.native
class PublishUserAgentClient protected ()
  extends typingsSlinky.sipJs.publishUserAgentClientMod.PublishUserAgentClient {
  def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
  def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingRequestDelegate) = this()
}

