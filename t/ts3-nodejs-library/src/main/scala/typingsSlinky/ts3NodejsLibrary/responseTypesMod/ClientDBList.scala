package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientDBList extends js.Object {
  var cldbid: Double = js.native
  var client_created: Double = js.native
  var client_description: String = js.native
  var client_lastconnected: Double = js.native
  var client_lastip: String = js.native
  var client_login_name: String = js.native
  var client_nickname: String = js.native
  var client_totalconnections: Double = js.native
  var client_unique_identifier: String = js.native
  var count: Double = js.native
}

object ClientDBList {
  @scala.inline
  def apply(
    cldbid: Double,
    client_created: Double,
    client_description: String,
    client_lastconnected: Double,
    client_lastip: String,
    client_login_name: String,
    client_nickname: String,
    client_totalconnections: Double,
    client_unique_identifier: String,
    count: Double
  ): ClientDBList = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], client_created = client_created.asInstanceOf[js.Any], client_description = client_description.asInstanceOf[js.Any], client_lastconnected = client_lastconnected.asInstanceOf[js.Any], client_lastip = client_lastip.asInstanceOf[js.Any], client_login_name = client_login_name.asInstanceOf[js.Any], client_nickname = client_nickname.asInstanceOf[js.Any], client_totalconnections = client_totalconnections.asInstanceOf[js.Any], client_unique_identifier = client_unique_identifier.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientDBList]
  }
  @scala.inline
  implicit class ClientDBListOps[Self <: ClientDBList] (val x: Self) extends AnyVal {
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
    def withClient_created(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_description(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_description")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

