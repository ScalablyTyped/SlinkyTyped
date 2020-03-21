package typingsSlinky.sipJs.userAgentsMod

import typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage
import typingsSlinky.sipJs.subscribeMod.OutgoingSubscribeRequestDelegate
import typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents", "SubscribeUserAgentClient")
@js.native
class SubscribeUserAgentClient protected ()
  extends typingsSlinky.sipJs.subscribeUserAgentClientMod.SubscribeUserAgentClient {
  def this(core: UserAgentCore, message: OutgoingRequestMessage) = this()
  def this(core: UserAgentCore, message: OutgoingRequestMessage, delegate: OutgoingSubscribeRequestDelegate) = this()
}

