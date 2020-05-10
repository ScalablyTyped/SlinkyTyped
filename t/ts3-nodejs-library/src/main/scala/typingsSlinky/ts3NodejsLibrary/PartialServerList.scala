package typingsSlinky.ts3NodejsLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/types/ResponseTypes.ServerList> */
@js.native
trait PartialServerList extends js.Object {
  var virtualserver_autostart: js.UndefOr[Double] = js.native
  var virtualserver_clientsonline: js.UndefOr[Double] = js.native
  var virtualserver_id: js.UndefOr[Double] = js.native
  var virtualserver_machine_id: js.UndefOr[String] = js.native
  var virtualserver_maxclients: js.UndefOr[Double] = js.native
  var virtualserver_name: js.UndefOr[String] = js.native
  var virtualserver_port: js.UndefOr[Double] = js.native
  var virtualserver_queryclientsonline: js.UndefOr[Double] = js.native
  var virtualserver_status: js.UndefOr[String] = js.native
  var virtualserver_unique_identifier: js.UndefOr[String] = js.native
  var virtualserver_uptime: js.UndefOr[Double] = js.native
}

object PartialServerList {
  @scala.inline
  def apply(): PartialServerList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialServerList]
  }
  @scala.inline
  implicit class PartialServerListOps[Self <: PartialServerList] (val x: Self) extends AnyVal {
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
    def withoutVirtualserver_autostart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_autostart")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_clientsonline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_clientsonline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_clientsonline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_clientsonline")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_id")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_machine_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_machine_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_machine_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_machine_id")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_maxclients(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_maxclients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_maxclients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_maxclients")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_name")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_port(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_port: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_port")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_queryclientsonline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_queryclientsonline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_queryclientsonline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_queryclientsonline")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_status(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_status")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_unique_identifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_unique_identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_unique_identifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_unique_identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_uptime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_uptime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_uptime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_uptime")(js.undefined)
        ret
    }
  }
  
}

