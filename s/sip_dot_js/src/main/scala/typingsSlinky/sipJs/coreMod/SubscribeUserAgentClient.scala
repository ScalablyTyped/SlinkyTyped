package typingsSlinky.sipJs.coreMod

import typingsSlinky.sipJs.subscribeMod.OutgoingSubscribeRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "SubscribeUserAgentClient")
@js.native
class SubscribeUserAgentClient protected ()
  extends typingsSlinky.sipJs.userAgentsMod.SubscribeUserAgentClient {
  def this(
    core: typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage
  ) = this()
  def this(
    core: typingsSlinky.sipJs.userAgentCoreMod.UserAgentCore,
    message: typingsSlinky.sipJs.messagesMod.OutgoingRequestMessage,
    delegate: OutgoingSubscribeRequestDelegate
  ) = this()
}

