package typingsSlinky.socketclusterServer.serverMod

import typingsSlinky.socketclusterServer.serversocketMod.BadAuthTokenData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BadSocketAuthTokenData extends BadAuthTokenData {
  var socket: typingsSlinky.socketclusterServer.serversocketMod.^ = js.native
}

object BadSocketAuthTokenData {
  @scala.inline
  def apply(
    authError: js.Error,
    signedAuthToken: String,
    socket: typingsSlinky.socketclusterServer.serversocketMod.^
  ): BadSocketAuthTokenData = {
    val __obj = js.Dynamic.literal(authError = authError.asInstanceOf[js.Any], signedAuthToken = signedAuthToken.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadSocketAuthTokenData]
  }
  @scala.inline
  implicit class BadSocketAuthTokenDataOps[Self <: BadSocketAuthTokenData] (val x: Self) extends AnyVal {
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

