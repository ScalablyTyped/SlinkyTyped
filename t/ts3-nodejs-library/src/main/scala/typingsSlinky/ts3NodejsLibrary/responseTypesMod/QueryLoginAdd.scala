package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryLoginAdd extends js.Object {
  var cldbid: Double = js.native
  var client_login_name: String = js.native
  var client_login_password: String = js.native
  var sid: Double = js.native
}

object QueryLoginAdd {
  @scala.inline
  def apply(cldbid: Double, client_login_name: String, client_login_password: String, sid: Double): QueryLoginAdd = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], client_login_name = client_login_name.asInstanceOf[js.Any], client_login_password = client_login_password.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLoginAdd]
  }
  @scala.inline
  implicit class QueryLoginAddOps[Self <: QueryLoginAdd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCldbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cldbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_login_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_login_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_login_password(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_login_password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

