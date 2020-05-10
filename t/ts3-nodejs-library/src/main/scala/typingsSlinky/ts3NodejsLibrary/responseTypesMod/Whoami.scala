package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Whoami extends js.Object {
  var client_channel_id: Double = js.native
  var client_database_id: Double = js.native
  var client_id: Double = js.native
  var client_login_name: String = js.native
  var client_nickname: String = js.native
  var client_origin_server_id: Double = js.native
  var client_unique_identifier: String = js.native
  var virtualserver_id: Double = js.native
  var virtualserver_port: Double = js.native
  var virtualserver_status: String = js.native
  var virtualserver_unique_identifier: String = js.native
}

object Whoami {
  @scala.inline
  def apply(
    client_channel_id: Double,
    client_database_id: Double,
    client_id: Double,
    client_login_name: String,
    client_nickname: String,
    client_origin_server_id: Double,
    client_unique_identifier: String,
    virtualserver_id: Double,
    virtualserver_port: Double,
    virtualserver_status: String,
    virtualserver_unique_identifier: String
  ): Whoami = {
    val __obj = js.Dynamic.literal(client_channel_id = client_channel_id.asInstanceOf[js.Any], client_database_id = client_database_id.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], client_login_name = client_login_name.asInstanceOf[js.Any], client_nickname = client_nickname.asInstanceOf[js.Any], client_origin_server_id = client_origin_server_id.asInstanceOf[js.Any], client_unique_identifier = client_unique_identifier.asInstanceOf[js.Any], virtualserver_id = virtualserver_id.asInstanceOf[js.Any], virtualserver_port = virtualserver_port.asInstanceOf[js.Any], virtualserver_status = virtualserver_status.asInstanceOf[js.Any], virtualserver_unique_identifier = virtualserver_unique_identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Whoami]
  }
  @scala.inline
  implicit class WhoamiOps[Self <: Whoami] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_channel_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_channel_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_database_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_database_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_login_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_login_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_nickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_nickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_origin_server_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_origin_server_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_unique_identifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_unique_identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualserver_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualserver_port(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualserver_status(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualserver_unique_identifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_unique_identifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

