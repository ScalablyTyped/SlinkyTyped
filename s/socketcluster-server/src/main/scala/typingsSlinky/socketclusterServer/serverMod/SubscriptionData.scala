package typingsSlinky.socketclusterServer.serverMod

import typingsSlinky.socketclusterServer.serversocketMod.SubscribeData
import typingsSlinky.socketclusterServer.serversocketMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionData extends SubscribeData {
  var socket: typingsSlinky.socketclusterServer.serversocketMod.^
}

object SubscriptionData {
  @scala.inline
  def apply(
    channel: String,
    socket: typingsSlinky.socketclusterServer.serversocketMod.^,
    subscriptionOptions: SubscriptionOptions
  ): SubscriptionData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], subscriptionOptions = subscriptionOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubscriptionData]
  }
}

