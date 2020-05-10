package typingsSlinky.socketclusterServer.serverMod

import typingsSlinky.socketclusterServer.serversocketMod.DeauthenticateData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeauthenticationData extends DeauthenticateData {
  var socket: typingsSlinky.socketclusterServer.serversocketMod.^ = js.native
}

object DeauthenticationData {
  @scala.inline
  def apply(socket: typingsSlinky.socketclusterServer.serversocketMod.^): DeauthenticationData = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeauthenticationData]
  }
  @scala.inline
  implicit class DeauthenticationDataOps[Self <: DeauthenticationData] (val x: Self) extends AnyVal {
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

