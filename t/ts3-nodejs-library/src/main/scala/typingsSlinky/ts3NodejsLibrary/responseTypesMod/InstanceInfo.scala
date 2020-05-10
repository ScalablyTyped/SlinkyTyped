package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceInfo extends js.Object {
  var serverinstance_database_version: Double = js.native
  var serverinstance_filetransfer_port: Double = js.native
  var serverinstance_guest_serverquery_group: Double = js.native
  var serverinstance_max_download_total_bandwidth: Double = js.native
  var serverinstance_max_upload_total_bandwidth: Double = js.native
  var serverinstance_pending_connections_per_ip: Double = js.native
  var serverinstance_permissions_version: Double = js.native
  var serverinstance_serverquery_flood_ban_time: Double = js.native
  var serverinstance_serverquery_flood_commands: Double = js.native
  var serverinstance_serverquery_max_connections_per_ip: Double = js.native
  var serverinstance_template_channeladmin_group: Double = js.native
  var serverinstance_template_channeldefault_group: Double = js.native
  var serverinstance_template_serveradmin_group: Double = js.native
  var serverinstance_template_serverdefault_group: Double = js.native
}

object InstanceInfo {
  @scala.inline
  def apply(
    serverinstance_database_version: Double,
    serverinstance_filetransfer_port: Double,
    serverinstance_guest_serverquery_group: Double,
    serverinstance_max_download_total_bandwidth: Double,
    serverinstance_max_upload_total_bandwidth: Double,
    serverinstance_pending_connections_per_ip: Double,
    serverinstance_permissions_version: Double,
    serverinstance_serverquery_flood_ban_time: Double,
    serverinstance_serverquery_flood_commands: Double,
    serverinstance_serverquery_max_connections_per_ip: Double,
    serverinstance_template_channeladmin_group: Double,
    serverinstance_template_channeldefault_group: Double,
    serverinstance_template_serveradmin_group: Double,
    serverinstance_template_serverdefault_group: Double
  ): InstanceInfo = {
    val __obj = js.Dynamic.literal(serverinstance_database_version = serverinstance_database_version.asInstanceOf[js.Any], serverinstance_filetransfer_port = serverinstance_filetransfer_port.asInstanceOf[js.Any], serverinstance_guest_serverquery_group = serverinstance_guest_serverquery_group.asInstanceOf[js.Any], serverinstance_max_download_total_bandwidth = serverinstance_max_download_total_bandwidth.asInstanceOf[js.Any], serverinstance_max_upload_total_bandwidth = serverinstance_max_upload_total_bandwidth.asInstanceOf[js.Any], serverinstance_pending_connections_per_ip = serverinstance_pending_connections_per_ip.asInstanceOf[js.Any], serverinstance_permissions_version = serverinstance_permissions_version.asInstanceOf[js.Any], serverinstance_serverquery_flood_ban_time = serverinstance_serverquery_flood_ban_time.asInstanceOf[js.Any], serverinstance_serverquery_flood_commands = serverinstance_serverquery_flood_commands.asInstanceOf[js.Any], serverinstance_serverquery_max_connections_per_ip = serverinstance_serverquery_max_connections_per_ip.asInstanceOf[js.Any], serverinstance_template_channeladmin_group = serverinstance_template_channeladmin_group.asInstanceOf[js.Any], serverinstance_template_channeldefault_group = serverinstance_template_channeldefault_group.asInstanceOf[js.Any], serverinstance_template_serveradmin_group = serverinstance_template_serveradmin_group.asInstanceOf[js.Any], serverinstance_template_serverdefault_group = serverinstance_template_serverdefault_group.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceInfo]
  }
  @scala.inline
  implicit class InstanceInfoOps[Self <: InstanceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServerinstance_database_version(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_database_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerinstance_filetransfer_port(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_filetransfer_port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerinstance_guest_serverquery_group(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_guest_serverquery_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerinstance_max_download_total_bandwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_max_download_total_bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerinstance_max_upload_total_bandwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_max_upload_total_bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerinstance_pending_connections_per_ip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_pending_connections_per_ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerinstance_permissions_version(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_permissions_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerinstance_serverquery_flood_ban_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_serverquery_flood_ban_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerinstance_serverquery_flood_commands(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_serverquery_flood_commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerinstance_serverquery_max_connections_per_ip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_serverquery_max_connections_per_ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerinstance_template_channeladmin_group(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_template_channeladmin_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerinstance_template_channeldefault_group(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_template_channeldefault_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerinstance_template_serveradmin_group(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_template_serveradmin_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerinstance_template_serverdefault_group(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_template_serverdefault_group")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

