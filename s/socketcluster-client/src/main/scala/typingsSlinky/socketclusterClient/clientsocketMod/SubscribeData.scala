package typingsSlinky.socketclusterClient.clientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeData extends js.Object {
  var channel: String = js.native
  var subscriptionOptions: SubscribeOptions = js.native
}

object SubscribeData {
  @scala.inline
  def apply(channel: String, subscriptionOptions: SubscribeOptions): SubscribeData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], subscriptionOptions = subscriptionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeData]
  }
  @scala.inline
  implicit class SubscribeDataOps[Self <: SubscribeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscriptionOptions(value: SubscribeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

