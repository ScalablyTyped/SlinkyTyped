package typingsSlinky.ts3NodejsLibrary.propertyTypesMod

import typingsSlinky.ts3NodejsLibrary.enumMod.CodecEncryptionMode
import typingsSlinky.ts3NodejsLibrary.enumMod.HostBannerMode
import typingsSlinky.ts3NodejsLibrary.enumMod.HostMessageMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerEdit extends js.Object {
  var virtualserver_antiflood_points_needed_command_block: js.UndefOr[Double] = js.native
  var virtualserver_antiflood_points_needed_ip_block: js.UndefOr[Double] = js.native
  var virtualserver_antiflood_points_needed_plugin_block: js.UndefOr[Double] = js.native
  var virtualserver_antiflood_points_tick_reduce: js.UndefOr[Double] = js.native
  var virtualserver_autostart: js.UndefOr[Double] = js.native
  var virtualserver_codec_encryption_mode: js.UndefOr[CodecEncryptionMode] = js.native
  var virtualserver_complain_autoban_count: js.UndefOr[Double] = js.native
  var virtualserver_complain_autoban_time: js.UndefOr[Double] = js.native
  var virtualserver_complain_remove_time: js.UndefOr[Double] = js.native
  var virtualserver_default_channel_admin_group: js.UndefOr[Double] = js.native
  var virtualserver_default_channel_group: js.UndefOr[Double] = js.native
  var virtualserver_default_server_group: js.UndefOr[Double] = js.native
  var virtualserver_download_quota: js.UndefOr[Double] = js.native
  var virtualserver_hostbanner_gfx_interval: js.UndefOr[Double] = js.native
  var virtualserver_hostbanner_gfx_url: js.UndefOr[String] = js.native
  var virtualserver_hostbanner_mode: js.UndefOr[HostBannerMode] = js.native
  var virtualserver_hostbanner_url: js.UndefOr[String] = js.native
  var virtualserver_hostbutton_gfx_url: js.UndefOr[String] = js.native
  var virtualserver_hostbutton_tooltip: js.UndefOr[String] = js.native
  var virtualserver_hostbutton_url: js.UndefOr[String] = js.native
  var virtualserver_hostmessage: js.UndefOr[String] = js.native
  var virtualserver_hostmessage_mode: js.UndefOr[HostMessageMode] = js.native
  var virtualserver_icon_id: js.UndefOr[Double] = js.native
  var virtualserver_log_channel: js.UndefOr[Double] = js.native
  var virtualserver_log_client: js.UndefOr[Double] = js.native
  var virtualserver_log_filetransfer: js.UndefOr[Double] = js.native
  var virtualserver_log_permissions: js.UndefOr[Double] = js.native
  var virtualserver_log_query: js.UndefOr[Double] = js.native
  var virtualserver_log_server: js.UndefOr[Double] = js.native
  var virtualserver_machine_id: js.UndefOr[String] = js.native
  var virtualserver_max_download_total_bandwidth: js.UndefOr[Double] = js.native
  var virtualserver_max_upload_total_bandwidth: js.UndefOr[Double] = js.native
  var virtualserver_maxclients: js.UndefOr[Double] = js.native
  var virtualserver_min_android_version: js.UndefOr[Double] = js.native
  var virtualserver_min_client_version: js.UndefOr[Double] = js.native
  var virtualserver_min_clients_in_channel_before_forced_silence: js.UndefOr[Double] = js.native
  var virtualserver_min_ios_version: js.UndefOr[Double] = js.native
  var virtualserver_name: js.UndefOr[String] = js.native
  var virtualserver_name_phonetic: js.UndefOr[String] = js.native
  var virtualserver_needed_identity_security_level: js.UndefOr[Double] = js.native
  var virtualserver_password: js.UndefOr[String] = js.native
  var virtualserver_port: js.UndefOr[Double] = js.native
  var virtualserver_priority_speaker_dimm_modificator: js.UndefOr[Double] = js.native
  var virtualserver_reserved_slots: js.UndefOr[Double] = js.native
  var virtualserver_status: js.UndefOr[String] = js.native
  var virtualserver_upload_quota: js.UndefOr[Double] = js.native
  var virtualserver_weblist_enabled: js.UndefOr[Double] = js.native
  var virtualserver_welcomemessage: js.UndefOr[String] = js.native
}

object ServerEdit {
  @scala.inline
  def apply(): ServerEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerEdit]
  }
  @scala.inline
  implicit class ServerEditOps[Self <: ServerEdit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVirtualserver_antiflood_points_needed_command_block(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_antiflood_points_needed_command_block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_antiflood_points_needed_command_block: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_antiflood_points_needed_command_block")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_antiflood_points_needed_ip_block(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_antiflood_points_needed_ip_block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_antiflood_points_needed_ip_block: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_antiflood_points_needed_ip_block")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_antiflood_points_needed_plugin_block(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_antiflood_points_needed_plugin_block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_antiflood_points_needed_plugin_block: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_antiflood_points_needed_plugin_block")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_antiflood_points_tick_reduce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_antiflood_points_tick_reduce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_antiflood_points_tick_reduce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_antiflood_points_tick_reduce")(js.undefined)
        ret
    }
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
    def withVirtualserver_codec_encryption_mode(value: CodecEncryptionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_codec_encryption_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_codec_encryption_mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_codec_encryption_mode")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_complain_autoban_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_complain_autoban_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_complain_autoban_count: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_complain_autoban_count")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_complain_autoban_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_complain_autoban_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_complain_autoban_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_complain_autoban_time")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_complain_remove_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_complain_remove_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_complain_remove_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_complain_remove_time")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_default_channel_admin_group(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_default_channel_admin_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_default_channel_admin_group: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_default_channel_admin_group")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_default_channel_group(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_default_channel_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_default_channel_group: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_default_channel_group")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_default_server_group(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_default_server_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_default_server_group: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_default_server_group")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_download_quota(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_download_quota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_download_quota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_download_quota")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_hostbanner_gfx_interval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_hostbanner_gfx_interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_hostbanner_gfx_interval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_hostbanner_gfx_interval")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_hostbanner_gfx_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_hostbanner_gfx_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_hostbanner_gfx_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_hostbanner_gfx_url")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_hostbanner_mode(value: HostBannerMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_hostbanner_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_hostbanner_mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_hostbanner_mode")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_hostbanner_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_hostbanner_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_hostbanner_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_hostbanner_url")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_hostbutton_gfx_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_hostbutton_gfx_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_hostbutton_gfx_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_hostbutton_gfx_url")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_hostbutton_tooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_hostbutton_tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_hostbutton_tooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_hostbutton_tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_hostbutton_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_hostbutton_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_hostbutton_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_hostbutton_url")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_hostmessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_hostmessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_hostmessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_hostmessage")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_hostmessage_mode(value: HostMessageMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_hostmessage_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_hostmessage_mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_hostmessage_mode")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_icon_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_icon_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_icon_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_icon_id")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_log_channel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_log_channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_log_channel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_log_channel")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_log_client(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_log_client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_log_client: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_log_client")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_log_filetransfer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_log_filetransfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_log_filetransfer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_log_filetransfer")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_log_permissions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_log_permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_log_permissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_log_permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_log_query(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_log_query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_log_query: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_log_query")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_log_server(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_log_server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_log_server: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_log_server")(js.undefined)
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
    def withVirtualserver_max_download_total_bandwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_max_download_total_bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_max_download_total_bandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_max_download_total_bandwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_max_upload_total_bandwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_max_upload_total_bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_max_upload_total_bandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_max_upload_total_bandwidth")(js.undefined)
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
    def withVirtualserver_min_android_version(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_min_android_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_min_android_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_min_android_version")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_min_client_version(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_min_client_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_min_client_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_min_client_version")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_min_clients_in_channel_before_forced_silence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_min_clients_in_channel_before_forced_silence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_min_clients_in_channel_before_forced_silence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_min_clients_in_channel_before_forced_silence")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_min_ios_version(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_min_ios_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_min_ios_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_min_ios_version")(js.undefined)
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
    def withVirtualserver_name_phonetic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_name_phonetic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_name_phonetic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_name_phonetic")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_needed_identity_security_level(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_needed_identity_security_level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_needed_identity_security_level: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_needed_identity_security_level")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_password(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_password: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_password")(js.undefined)
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
    def withVirtualserver_priority_speaker_dimm_modificator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_priority_speaker_dimm_modificator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_priority_speaker_dimm_modificator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_priority_speaker_dimm_modificator")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_reserved_slots(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_reserved_slots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_reserved_slots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_reserved_slots")(js.undefined)
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
    def withVirtualserver_upload_quota(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_upload_quota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_upload_quota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_upload_quota")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_weblist_enabled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_weblist_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_weblist_enabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_weblist_enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_welcomemessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_welcomemessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_welcomemessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_welcomemessage")(js.undefined)
        ret
    }
  }
  
}

