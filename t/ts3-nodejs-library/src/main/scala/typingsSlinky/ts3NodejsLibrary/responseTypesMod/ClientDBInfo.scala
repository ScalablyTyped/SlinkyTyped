package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientDBInfo extends js.Object {
  var client_base64HashClientUID: String = js.native
  var client_created: Double = js.native
  var client_database_id: Double = js.native
  var client_description: String = js.native
  var client_flag_avatar: String = js.native
  var client_lastconnected: Double = js.native
  var client_lastip: String = js.native
  var client_month_bytes_downloaded: Double = js.native
  var client_month_bytes_uploaded: Double = js.native
  var client_nickname: String = js.native
  var client_total_bytes_downloaded: Double = js.native
  var client_total_bytes_uploaded: Double = js.native
  var client_totalconnections: Double = js.native
  var client_unique_identifier: String = js.native
}

object ClientDBInfo {
  @scala.inline
  def apply(
    client_base64HashClientUID: String,
    client_created: Double,
    client_database_id: Double,
    client_description: String,
    client_flag_avatar: String,
    client_lastconnected: Double,
    client_lastip: String,
    client_month_bytes_downloaded: Double,
    client_month_bytes_uploaded: Double,
    client_nickname: String,
    client_total_bytes_downloaded: Double,
    client_total_bytes_uploaded: Double,
    client_totalconnections: Double,
    client_unique_identifier: String
  ): ClientDBInfo = {
    val __obj = js.Dynamic.literal(client_base64HashClientUID = client_base64HashClientUID.asInstanceOf[js.Any], client_created = client_created.asInstanceOf[js.Any], client_database_id = client_database_id.asInstanceOf[js.Any], client_description = client_description.asInstanceOf[js.Any], client_flag_avatar = client_flag_avatar.asInstanceOf[js.Any], client_lastconnected = client_lastconnected.asInstanceOf[js.Any], client_lastip = client_lastip.asInstanceOf[js.Any], client_month_bytes_downloaded = client_month_bytes_downloaded.asInstanceOf[js.Any], client_month_bytes_uploaded = client_month_bytes_uploaded.asInstanceOf[js.Any], client_nickname = client_nickname.asInstanceOf[js.Any], client_total_bytes_downloaded = client_total_bytes_downloaded.asInstanceOf[js.Any], client_total_bytes_uploaded = client_total_bytes_uploaded.asInstanceOf[js.Any], client_totalconnections = client_totalconnections.asInstanceOf[js.Any], client_unique_identifier = client_unique_identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientDBInfo]
  }
  @scala.inline
  implicit class ClientDBInfoOps[Self <: ClientDBInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_base64HashClientUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_base64HashClientUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_created(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_database_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_database_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_description(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_flag_avatar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_flag_avatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_lastconnected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_lastconnected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_lastip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_lastip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_month_bytes_downloaded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_month_bytes_downloaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_month_bytes_uploaded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_month_bytes_uploaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_nickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_nickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_total_bytes_downloaded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_total_bytes_downloaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_total_bytes_uploaded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_total_bytes_uploaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_totalconnections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_totalconnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_unique_identifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_unique_identifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

