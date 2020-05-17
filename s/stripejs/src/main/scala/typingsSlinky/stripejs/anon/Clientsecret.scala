package typingsSlinky.stripejs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clientsecret extends js.Object {
  var client_secret: String = js.native
  var id: String = js.native
}

object Clientsecret {
  @scala.inline
  def apply(client_secret: String, id: String): Clientsecret = {
    val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clientsecret]
  }
  @scala.inline
  implicit class ClientsecretOps[Self <: Clientsecret] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_secret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

