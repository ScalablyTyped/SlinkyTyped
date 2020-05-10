package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientFind extends js.Object {
  var clid: Double = js.native
  var client_nickname: String = js.native
}

object ClientFind {
  @scala.inline
  def apply(clid: Double, client_nickname: String): ClientFind = {
    val __obj = js.Dynamic.literal(clid = clid.asInstanceOf[js.Any], client_nickname = client_nickname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientFind]
  }
  @scala.inline
  implicit class ClientFindOps[Self <: ClientFind] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_nickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_nickname")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

