package typingsSlinky.socketclusterServer.serverMod

import typingsSlinky.socketclusterServer.serversocketMod.UnsubscribeData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsubscriptionData extends UnsubscribeData {
  var socket: typingsSlinky.socketclusterServer.serversocketMod.^ = js.native
}

object UnsubscriptionData {
  @scala.inline
  def apply(channel: String, socket: typingsSlinky.socketclusterServer.serversocketMod.^): UnsubscriptionData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsubscriptionData]
  }
  @scala.inline
  implicit class UnsubscriptionDataOps[Self <: UnsubscriptionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSocket(value: typingsSlinky.socketclusterServer.serversocketMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

