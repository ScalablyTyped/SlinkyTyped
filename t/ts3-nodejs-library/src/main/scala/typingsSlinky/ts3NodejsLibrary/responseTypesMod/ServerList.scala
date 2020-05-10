package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerList extends js.Object {
  var virtualserver_autostart: Double = js.native
  var virtualserver_clientsonline: Double = js.native
  var virtualserver_id: Double = js.native
  var virtualserver_machine_id: String = js.native
  var virtualserver_maxclients: Double = js.native
  var virtualserver_name: String = js.native
  var virtualserver_port: Double = js.native
  var virtualserver_queryclientsonline: Double = js.native
  var virtualserver_status: String = js.native
  var virtualserver_unique_identifier: String = js.native
  var virtualserver_uptime: Double = js.native
}

object ServerList {
  @scala.inline
  def apply(
    virtualserver_autostart: Double,
    virtualserver_clientsonline: Double,
    virtualserver_id: Double,
    virtualserver_machine_id: String,
    virtualserver_maxclients: Double,
    virtualserver_name: String,
    virtualserver_port: Double,
    virtualserver_queryclientsonline: Double,
    virtualserver_status: String,
    virtualserver_unique_identifier: String,
    virtualserver_uptime: Double
  ): ServerList = {
    val __obj = js.Dynamic.literal(virtualserver_autostart = virtualserver_autostart.asInstanceOf[js.Any], virtualserver_clientsonline = virtualserver_clientsonline.asInstanceOf[js.Any], virtualserver_id = virtualserver_id.asInstanceOf[js.Any], virtualserver_machine_id = virtualserver_machine_id.asInstanceOf[js.Any], virtualserver_maxclients = virtualserver_maxclients.asInstanceOf[js.Any], virtualserver_name = virtualserver_name.asInstanceOf[js.Any], virtualserver_port = virtualserver_port.asInstanceOf[js.Any], virtualserver_queryclientsonline = virtualserver_queryclientsonline.asInstanceOf[js.Any], virtualserver_status = virtualserver_status.asInstanceOf[js.Any], virtualserver_unique_identifier = virtualserver_unique_identifier.asInstanceOf[js.Any], virtualserver_uptime = virtualserver_uptime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerList]
  }
  @scala.inline
  implicit class ServerListOps[Self <: ServerList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVirtualserver_autostart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_autostart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualserver_clientsonline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_clientsonline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualserver_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualserver_machine_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_machine_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualserver_maxclients(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_maxclients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualserver_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualserver_port(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualserver_queryclientsonline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_queryclientsonline")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withVirtualserver_uptime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_uptime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

