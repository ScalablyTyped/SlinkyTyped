package typingsSlinky.ts3NodejsLibrary.propertyTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientUpdate extends js.Object {
  var client_nickname: String = js.native
}

object ClientUpdate {
  @scala.inline
  def apply(client_nickname: String): ClientUpdate = {
    val __obj = js.Dynamic.literal(client_nickname = client_nickname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientUpdate]
  }
  @scala.inline
  implicit class ClientUpdateOps[Self <: ClientUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_nickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_nickname")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

