package typingsSlinky.ts3NodejsLibrary.anon

import typingsSlinky.ts3NodejsLibrary.enumMod.ApiKeyScope
import typingsSlinky.ts3NodejsLibrary.enumMod.ClientType
import typingsSlinky.ts3NodejsLibrary.enumMod.Codec
import typingsSlinky.ts3NodejsLibrary.enumMod.CodecEncryptionMode
import typingsSlinky.ts3NodejsLibrary.enumMod.HostBannerMode
import typingsSlinky.ts3NodejsLibrary.enumMod.HostMessageMode
import typingsSlinky.ts3NodejsLibrary.enumMod.TextMessageTargetMode
import typingsSlinky.ts3NodejsLibrary.enumMod.TokenType
import typingsSlinky.ts3NodejsLibrary.responseTypesMod.TokenCustomSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/types/QueryResponse.QueryResponseTypes> */
@js.native
trait PartialQueryResponseTypes extends js.Object {
  var apikey: js.UndefOr[String] = js.native
  var average_speed: js.UndefOr[Double] = js.native
  var banid: js.UndefOr[Double] = js.native
  var build: js.UndefOr[Double] = js.native
  var cfid: js.UndefOr[Double] = js.native
  var cgid: js.UndefOr[Double] = js.native
  var channel_banner_gfx_url: js.UndefOr[String] = js.native
  var channel_banner_mode: js.UndefOr[Double] = js.native
  var channel_codec: js.UndefOr[Codec] = js.native
  var channel_codec_is_unencrypted: js.UndefOr[Double] = js.native
  var channel_codec_latency_factor: js.UndefOr[Double] = js.native
  var channel_codec_quality: js.UndefOr[Double] = js.native
  var channel_delete_delay: js.UndefOr[Double] = js.native
  var channel_description: js.UndefOr[String] = js.native
  var channel_filepath: js.UndefOr[String] = js.native
  var channel_flag_default: js.UndefOr[Double] = js.native
  var channel_flag_maxclients_unlimited: js.UndefOr[Double] = js.native
  var channel_flag_maxfamilyclients_inherited: js.UndefOr[Double] = js.native
  var channel_flag_maxfamilyclients_unlimited: js.UndefOr[Double] = js.native
  var channel_flag_password: js.UndefOr[Double] = js.native
  var channel_flag_permanent: js.UndefOr[Double] = js.native
  var channel_flag_private: js.UndefOr[Double] = js.native
  var channel_flag_semi_permanent: js.UndefOr[Double] = js.native
  var channel_flag_temporary: js.UndefOr[Double] = js.native
  var channel_forced_silence: js.UndefOr[Double] = js.native
  var channel_icon_id: js.UndefOr[Double] = js.native
  var channel_maxclients: js.UndefOr[Double] = js.native
  var channel_maxfamilyclients: js.UndefOr[Double] = js.native
  var channel_name: js.UndefOr[String] = js.native
  var channel_name_phonetic: js.UndefOr[String] = js.native
  var channel_needed_subscribe_power: js.UndefOr[Double] = js.native
  var channel_needed_talk_power: js.UndefOr[Double] = js.native
  var channel_order: js.UndefOr[Double] = js.native
  var channel_password: js.UndefOr[String] = js.native
  var channel_security_salt: js.UndefOr[String] = js.native
  var channel_topic: js.UndefOr[String] = js.native
  var cid: js.UndefOr[Double] = js.native
  var cldbid: js.UndefOr[Double] = js.native
  var clid: js.UndefOr[Double] = js.native
  var client_away: js.UndefOr[Double] = js.native
  var client_away_message: js.UndefOr[String] = js.native
  var client_badges: js.UndefOr[String] = js.native
  var client_base64HashClientUID: js.UndefOr[String] = js.native
  var client_channel_group_id: js.UndefOr[Double] = js.native
  var client_channel_group_inherited_channel_id: js.UndefOr[Double] = js.native
  var client_channel_id: js.UndefOr[Double] = js.native
  var client_country: js.UndefOr[String] = js.native
  var client_created: js.UndefOr[Double] = js.native
  var client_database_id: js.UndefOr[Double] = js.native
  var client_default_channel: js.UndefOr[Double] = js.native
  var client_default_token: js.UndefOr[String] = js.native
  var client_description: js.UndefOr[String] = js.native
  var client_flag_avatar: js.UndefOr[String] = js.native
  var client_flag_talking: js.UndefOr[Double] = js.native
  var client_icon_id: js.UndefOr[Double] = js.native
  var client_id: js.UndefOr[Double] = js.native
  var client_idle_time: js.UndefOr[Double] = js.native
  var client_input_hardware: js.UndefOr[Double] = js.native
  var client_input_muted: js.UndefOr[Double] = js.native
  var client_integrations: js.UndefOr[String] = js.native
  var client_is_channel_commander: js.UndefOr[Double] = js.native
  var client_is_priority_speaker: js.UndefOr[Double] = js.native
  var client_is_recording: js.UndefOr[Double] = js.native
  var client_is_talker: js.UndefOr[Double] = js.native
  var client_lastconnected: js.UndefOr[Double] = js.native
  var client_lastip: js.UndefOr[String] = js.native
  var client_login_name: js.UndefOr[String] = js.native
  var client_login_password: js.UndefOr[String] = js.native
  var client_meta_data: js.UndefOr[String] = js.native
  var client_month_bytes_downloaded: js.UndefOr[Double] = js.native
  var client_month_bytes_uploaded: js.UndefOr[Double] = js.native
  var client_myteamspeak_avatar: js.UndefOr[String] = js.native
  var client_myteamspeak_id: js.UndefOr[String] = js.native
  var client_needed_serverquery_view_power: js.UndefOr[Double] = js.native
  var client_nickname: js.UndefOr[String] = js.native
  var client_nickname_phonetic: js.UndefOr[String] = js.native
  var client_origin_server_id: js.UndefOr[Double] = js.native
  var client_output_hardware: js.UndefOr[Double] = js.native
  var client_output_muted: js.UndefOr[Double] = js.native
  var client_outputonly_muted: js.UndefOr[Double] = js.native
  var client_platform: js.UndefOr[String] = js.native
  var client_security_hash: js.UndefOr[String] = js.native
  var client_servergroups: js.UndefOr[js.Array[Double]] = js.native
  var client_signed_badges: js.UndefOr[String] = js.native
  var client_talk_power: js.UndefOr[Double] = js.native
  var client_talk_request: js.UndefOr[Double] = js.native
  var client_talk_request_msg: js.UndefOr[String] = js.native
  var client_total_bytes_downloaded: js.UndefOr[Double] = js.native
  var client_total_bytes_uploaded: js.UndefOr[Double] = js.native
  var client_totalconnections: js.UndefOr[Double] = js.native
  var client_type: js.UndefOr[ClientType] = js.native
  var client_unique_identifier: js.UndefOr[String] = js.native
  var client_version: js.UndefOr[String] = js.native
  var client_version_sign: js.UndefOr[String] = js.native
  var clientftfid: js.UndefOr[Double] = js.native
  var cluid: js.UndefOr[String] = js.native
  var connection_bandwidth_received_last_minute_total: js.UndefOr[Double] = js.native
  var connection_bandwidth_received_last_second_total: js.UndefOr[Double] = js.native
  var connection_bandwidth_sent_last_minute_total: js.UndefOr[Double] = js.native
  var connection_bandwidth_sent_last_second_total: js.UndefOr[Double] = js.native
  var connection_bytes_received_control: js.UndefOr[Double] = js.native
  var connection_bytes_received_keepalive: js.UndefOr[Double] = js.native
  var connection_bytes_received_speech: js.UndefOr[Double] = js.native
  var connection_bytes_received_total: js.UndefOr[Double] = js.native
  var connection_bytes_sent_control: js.UndefOr[Double] = js.native
  var connection_bytes_sent_keepalive: js.UndefOr[Double] = js.native
  var connection_bytes_sent_speech: js.UndefOr[Double] = js.native
  var connection_bytes_sent_total: js.UndefOr[Double] = js.native
  var connection_client_ip: js.UndefOr[String] = js.native
  var connection_connected_time: js.UndefOr[Double] = js.native
  var connection_filetransfer_bandwidth_received: js.UndefOr[Double] = js.native
  var connection_filetransfer_bandwidth_sent: js.UndefOr[Double] = js.native
  var connection_filetransfer_bytes_received_total: js.UndefOr[Double] = js.native
  var connection_filetransfer_bytes_sent_total: js.UndefOr[Double] = js.native
  var connection_packetloss_total: js.UndefOr[Double] = js.native
  var connection_packets_received_control: js.UndefOr[Double] = js.native
  var connection_packets_received_keepalive: js.UndefOr[Double] = js.native
  var connection_packets_received_speech: js.UndefOr[Double] = js.native
  var connection_packets_received_total: js.UndefOr[Double] = js.native
  var connection_packets_sent_control: js.UndefOr[Double] = js.native
  var connection_packets_sent_keepalive: js.UndefOr[Double] = js.native
  var connection_packets_sent_speech: js.UndefOr[Double] = js.native
  var connection_packets_sent_total: js.UndefOr[Double] = js.native
  var connection_ping: js.UndefOr[Double] = js.native
  var count: js.UndefOr[Double] = js.native
  var cpid: js.UndefOr[Double] = js.native
  var created: js.UndefOr[Double] = js.native
  var created_at: js.UndefOr[Double] = js.native
  var ctid: js.UndefOr[Double] = js.native
  var current_speed: js.UndefOr[Double] = js.native
  var datetime: js.UndefOr[Double] = js.native
  var desc: js.UndefOr[String] = js.native
  var duration: js.UndefOr[Double] = js.native
  var end: js.UndefOr[Double] = js.native
  var enforcements: js.UndefOr[Double] = js.native
  var expires_at: js.UndefOr[Double] = js.native
  var extra_msg: js.UndefOr[String] = js.native
  var failed_permid: js.UndefOr[Double] = js.native
  var fcldbid: js.UndefOr[Double] = js.native
  var file_size: js.UndefOr[Double] = js.native
  var flag_read: js.UndefOr[Double] = js.native
  var fname: js.UndefOr[String] = js.native
  var ftkey: js.UndefOr[String] = js.native
  var hash: js.UndefOr[String] = js.native
  var host_timestamp_utc: js.UndefOr[Double] = js.native
  var iconid: js.UndefOr[Double] = js.native
  var id: js.UndefOr[Double] = js.native
  var id1: js.UndefOr[Double] = js.native
  var id2: js.UndefOr[Double] = js.native
  var ident: js.UndefOr[String] = js.native
  var instance_uptime: js.UndefOr[Double] = js.native
  var invokercldbid: js.UndefOr[Double] = js.native
  var invokerid: js.UndefOr[Double] = js.native
  var invokername: js.UndefOr[String] = js.native
  var invokeruid: js.UndefOr[String] = js.native
  var ip: js.UndefOr[String] = js.native
  var l: js.UndefOr[String] = js.native
  var last_pos: js.UndefOr[Double] = js.native
  var lastnickname: js.UndefOr[String] = js.native
  var message: js.UndefOr[String] = js.native
  var msg: js.UndefOr[String] = js.native
  var msgid: js.UndefOr[Double] = js.native
  var mytsid: js.UndefOr[String] = js.native
  var n: js.UndefOr[Double] = js.native
  var n_member_addp: js.UndefOr[Double] = js.native
  var n_member_removep: js.UndefOr[Double] = js.native
  var n_modifyp: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var namemode: js.UndefOr[Double] = js.native
  var nickname: js.UndefOr[String] = js.native
  var order: js.UndefOr[Double] = js.native
  var p: js.UndefOr[Double] = js.native
  var path: js.UndefOr[String] = js.native
  var permdesc: js.UndefOr[String] = js.native
  var permid: js.UndefOr[Double] = js.native
  var permname: js.UndefOr[String] = js.native
  var permnegated: js.UndefOr[Double] = js.native
  var permsid: js.UndefOr[String] = js.native
  var permskip: js.UndefOr[Double] = js.native
  var permvalue: js.UndefOr[Double] = js.native
  var pid: js.UndefOr[Double] = js.native
  var platform: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var proto: js.UndefOr[Double] = js.native
  var pw_clear: js.UndefOr[String] = js.native
  var reason: js.UndefOr[String] = js.native
  var reasonid: js.UndefOr[Double] = js.native
  var reasonmsg: js.UndefOr[String] = js.native
  var runtime: js.UndefOr[Double] = js.native
  var s: js.UndefOr[Double] = js.native
  var salt: js.UndefOr[String] = js.native
  var savedb: js.UndefOr[Double] = js.native
  var scope: js.UndefOr[ApiKeyScope] = js.native
  var seconds_empty: js.UndefOr[Double] = js.native
  var sender: js.UndefOr[Double] = js.native
  var server_id: js.UndefOr[Double] = js.native
  var serverftfid: js.UndefOr[Double] = js.native
  var serverinstance_database_version: js.UndefOr[Double] = js.native
  var serverinstance_filetransfer_port: js.UndefOr[Double] = js.native
  var serverinstance_guest_serverquery_group: js.UndefOr[Double] = js.native
  var serverinstance_max_download_total_bandwidth: js.UndefOr[Double] = js.native
  var serverinstance_max_upload_total_bandwidth: js.UndefOr[Double] = js.native
  var serverinstance_pending_connections_per_ip: js.UndefOr[Double] = js.native
  var serverinstance_permissions_version: js.UndefOr[Double] = js.native
  var serverinstance_serverquery_flood_ban_time: js.UndefOr[Double] = js.native
  var serverinstance_serverquery_flood_commands: js.UndefOr[Double] = js.native
  var serverinstance_serverquery_flood_time: js.UndefOr[Double] = js.native
  var serverinstance_serverquery_max_connections_per_ip: js.UndefOr[Double] = js.native
  var serverinstance_template_channeladmin_group: js.UndefOr[Double] = js.native
  var serverinstance_template_channeldefault_group: js.UndefOr[Double] = js.native
  var serverinstance_template_serveradmin_group: js.UndefOr[Double] = js.native
  var serverinstance_template_serverdefault_group: js.UndefOr[Double] = js.native
  var sgid: js.UndefOr[Double] = js.native
  var sid: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
  var sizedone: js.UndefOr[Double] = js.native
  var snapshot: js.UndefOr[String] = js.native
  var sortid: js.UndefOr[Double] = js.native
  var start: js.UndefOr[Double] = js.native
  var status: js.UndefOr[Double] = js.native
  var subject: js.UndefOr[String] = js.native
  var t: js.UndefOr[Double] = js.native
  var target: js.UndefOr[Double] = js.native
  var targetmode: js.UndefOr[TextMessageTargetMode] = js.native
  var tcid: js.UndefOr[Double] = js.native
  var tcldbid: js.UndefOr[Double] = js.native
  var time_left: js.UndefOr[Double] = js.native
  var timestamp: js.UndefOr[Double] = js.native
  var tname: js.UndefOr[String] = js.native
  var token: js.UndefOr[String] = js.native
  var token1: js.UndefOr[String] = js.native
  var token2: js.UndefOr[String] = js.native
  var token_created: js.UndefOr[Double] = js.native
  var token_customset: js.UndefOr[js.Array[TokenCustomSet]] = js.native
  var token_description: js.UndefOr[String] = js.native
  var token_id1: js.UndefOr[Double] = js.native
  var token_id2: js.UndefOr[Double] = js.native
  var token_type: js.UndefOr[TokenType] = js.native
  var tokencustomset: js.UndefOr[js.Array[TokenCustomSet]] = js.native
  var total_clients: js.UndefOr[Double] = js.native
  var total_clients_family: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[Double] = js.native
  var uid: js.UndefOr[String] = js.native
  var v: js.UndefOr[Double] = js.native
  var value: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
  var virtualserver_antiflood_points_needed_command_block: js.UndefOr[Double] = js.native
  var virtualserver_antiflood_points_needed_ip_block: js.UndefOr[Double] = js.native
  var virtualserver_antiflood_points_needed_plugin_block: js.UndefOr[Double] = js.native
  var virtualserver_antiflood_points_tick_reduce: js.UndefOr[Double] = js.native
  var virtualserver_ask_for_privilegekey: js.UndefOr[Double] = js.native
  var virtualserver_autostart: js.UndefOr[Double] = js.native
  var virtualserver_channel_temp_delete_delay_default: js.UndefOr[Double] = js.native
  var virtualserver_channelsonline: js.UndefOr[Double] = js.native
  var virtualserver_client_connections: js.UndefOr[Double] = js.native
  var virtualserver_clientsonline: js.UndefOr[Double] = js.native
  var virtualserver_codec_encryption_mode: js.UndefOr[CodecEncryptionMode] = js.native
  var virtualserver_complain_autoban_count: js.UndefOr[Double] = js.native
  var virtualserver_complain_autoban_time: js.UndefOr[Double] = js.native
  var virtualserver_complain_remove_time: js.UndefOr[Double] = js.native
  var virtualserver_created: js.UndefOr[Double] = js.native
  var virtualserver_default_channel_admin_group: js.UndefOr[Double] = js.native
  var virtualserver_default_channel_group: js.UndefOr[Double] = js.native
  var virtualserver_default_server_group: js.UndefOr[Double] = js.native
  var virtualserver_download_quota: js.UndefOr[Double] = js.native
  var virtualserver_filebase: js.UndefOr[String] = js.native
  var virtualserver_flag_password: js.UndefOr[Double] = js.native
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
  var virtualserver_id: js.UndefOr[Double] = js.native
  var virtualserver_ip: js.UndefOr[js.Array[String]] = js.native
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
  var virtualserver_month_bytes_downloaded: js.UndefOr[Double] = js.native
  var virtualserver_month_bytes_uploaded: js.UndefOr[Double] = js.native
  var virtualserver_name: js.UndefOr[String] = js.native
  var virtualserver_name_phonetic: js.UndefOr[String] = js.native
  var virtualserver_needed_identity_security_level: js.UndefOr[Double] = js.native
  var virtualserver_nickname: js.UndefOr[String] = js.native
  var virtualserver_password: js.UndefOr[String] = js.native
  var virtualserver_platform: js.UndefOr[String] = js.native
  var virtualserver_port: js.UndefOr[Double] = js.native
  var virtualserver_priority_speaker_dimm_modificator: js.UndefOr[Double] = js.native
  var virtualserver_query_client_connections: js.UndefOr[Double] = js.native
  var virtualserver_queryclientsonline: js.UndefOr[Double] = js.native
  var virtualserver_reserved_slots: js.UndefOr[Double] = js.native
  var virtualserver_status: js.UndefOr[String] = js.native
  var virtualserver_total_bytes_downloaded: js.UndefOr[Double] = js.native
  var virtualserver_total_bytes_uploaded: js.UndefOr[Double] = js.native
  var virtualserver_total_packetloss_control: js.UndefOr[Double] = js.native
  var virtualserver_total_packetloss_keepalive: js.UndefOr[Double] = js.native
  var virtualserver_total_packetloss_speech: js.UndefOr[Double] = js.native
  var virtualserver_total_packetloss_total: js.UndefOr[Double] = js.native
  var virtualserver_total_ping: js.UndefOr[Double] = js.native
  var virtualserver_unique_identifier: js.UndefOr[String] = js.native
  var virtualserver_upload_quota: js.UndefOr[Double] = js.native
  var virtualserver_uptime: js.UndefOr[Double] = js.native
  var virtualserver_version: js.UndefOr[String] = js.native
  var virtualserver_weblist_enabled: js.UndefOr[Double] = js.native
  var virtualserver_welcomemessage: js.UndefOr[String] = js.native
  var virtualservers_running_total: js.UndefOr[Double] = js.native
  var virtualservers_total_channels_online: js.UndefOr[Double] = js.native
  var virtualservers_total_clients_online: js.UndefOr[Double] = js.native
  var virtualservers_total_maxclients: js.UndefOr[Double] = js.native
}

object PartialQueryResponseTypes {
  @scala.inline
  def apply(): PartialQueryResponseTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialQueryResponseTypes]
  }
  @scala.inline
  implicit class PartialQueryResponseTypesOps[Self <: PartialQueryResponseTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApikey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apikey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApikey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apikey")(js.undefined)
        ret
    }
    @scala.inline
    def withAverage_speed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average_speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverage_speed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average_speed")(js.undefined)
        ret
    }
    @scala.inline
    def withBanid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBanid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banid")(js.undefined)
        ret
    }
    @scala.inline
    def withBuild(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.undefined)
        ret
    }
    @scala.inline
    def withCfid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cfid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCfid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cfid")(js.undefined)
        ret
    }
    @scala.inline
    def withCgid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cgid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCgid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cgid")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_banner_gfx_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_banner_gfx_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_banner_gfx_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_banner_gfx_url")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_banner_mode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_banner_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_banner_mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_banner_mode")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_codec(value: Codec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_codec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_codec")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_codec_is_unencrypted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_codec_is_unencrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_codec_is_unencrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_codec_is_unencrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_codec_latency_factor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_codec_latency_factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_codec_latency_factor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_codec_latency_factor")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_codec_quality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_codec_quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_codec_quality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_codec_quality")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_delete_delay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_delete_delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_delete_delay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_delete_delay")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_description(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_description")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_filepath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_filepath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_filepath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_filepath")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_flag_default(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_flag_default: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_default")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_flag_maxclients_unlimited(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_maxclients_unlimited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_flag_maxclients_unlimited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_maxclients_unlimited")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_flag_maxfamilyclients_inherited(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_maxfamilyclients_inherited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_flag_maxfamilyclients_inherited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_maxfamilyclients_inherited")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_flag_maxfamilyclients_unlimited(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_maxfamilyclients_unlimited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_flag_maxfamilyclients_unlimited: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_maxfamilyclients_unlimited")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_flag_password(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_flag_password: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_password")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_flag_permanent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_permanent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_flag_permanent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_permanent")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_flag_private(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_flag_private: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_private")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_flag_semi_permanent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_semi_permanent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_flag_semi_permanent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_semi_permanent")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_flag_temporary(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_temporary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_flag_temporary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_temporary")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_forced_silence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_forced_silence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_forced_silence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_forced_silence")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_icon_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_icon_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_icon_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_icon_id")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_maxclients(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_maxclients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_maxclients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_maxclients")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_maxfamilyclients(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_maxfamilyclients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_maxfamilyclients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_maxfamilyclients")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_name")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_name_phonetic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_name_phonetic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_name_phonetic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_name_phonetic")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_needed_subscribe_power(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_needed_subscribe_power")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_needed_subscribe_power: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_needed_subscribe_power")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_needed_talk_power(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_needed_talk_power")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_needed_talk_power: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_needed_talk_power")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_order(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_order: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_order")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_password(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_password: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_password")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_security_salt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_security_salt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_security_salt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_security_salt")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel_topic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel_topic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_topic")(js.undefined)
        ret
    }
    @scala.inline
    def withCid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cid")(js.undefined)
        ret
    }
    @scala.inline
    def withCldbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cldbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCldbid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cldbid")(js.undefined)
        ret
    }
    @scala.inline
    def withClid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clid")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_away(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_away")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_away: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_away")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_away_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_away_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_away_message: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_away_message")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_badges(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_badges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_badges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_badges")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_base64HashClientUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_base64HashClientUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_base64HashClientUID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_base64HashClientUID")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_channel_group_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_channel_group_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_channel_group_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_channel_group_id")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_channel_group_inherited_channel_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_channel_group_inherited_channel_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_channel_group_inherited_channel_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_channel_group_inherited_channel_id")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_channel_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_channel_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_channel_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_channel_id")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_country(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_country: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_country")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_created(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_created: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_created")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_database_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_database_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_database_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_database_id")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_default_channel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_default_channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_default_channel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_default_channel")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_default_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_default_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_default_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_default_token")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_description(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_description")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_flag_avatar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_flag_avatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_flag_avatar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_flag_avatar")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_flag_talking(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_flag_talking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_flag_talking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_flag_talking")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_icon_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_icon_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_icon_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_icon_id")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_id")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_idle_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_idle_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_idle_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_idle_time")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_input_hardware(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_input_hardware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_input_hardware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_input_hardware")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_input_muted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_input_muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_input_muted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_input_muted")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_integrations(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_integrations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_integrations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_integrations")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_is_channel_commander(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_is_channel_commander")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_is_channel_commander: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_is_channel_commander")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_is_priority_speaker(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_is_priority_speaker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_is_priority_speaker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_is_priority_speaker")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_is_recording(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_is_recording")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_is_recording: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_is_recording")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_is_talker(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_is_talker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_is_talker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_is_talker")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_lastconnected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_lastconnected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_lastconnected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_lastconnected")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_lastip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_lastip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_lastip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_lastip")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_login_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_login_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_login_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_login_name")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_login_password(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_login_password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_login_password: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_login_password")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_meta_data(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_meta_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_meta_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_meta_data")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_month_bytes_downloaded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_month_bytes_downloaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_month_bytes_downloaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_month_bytes_downloaded")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_month_bytes_uploaded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_month_bytes_uploaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_month_bytes_uploaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_month_bytes_uploaded")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_myteamspeak_avatar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_myteamspeak_avatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_myteamspeak_avatar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_myteamspeak_avatar")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_myteamspeak_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_myteamspeak_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_myteamspeak_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_myteamspeak_id")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_needed_serverquery_view_power(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_needed_serverquery_view_power")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_needed_serverquery_view_power: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_needed_serverquery_view_power")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_nickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_nickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_nickname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_nickname")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_nickname_phonetic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_nickname_phonetic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_nickname_phonetic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_nickname_phonetic")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_origin_server_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_origin_server_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_origin_server_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_origin_server_id")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_output_hardware(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_output_hardware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_output_hardware: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_output_hardware")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_output_muted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_output_muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_output_muted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_output_muted")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_outputonly_muted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_outputonly_muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_outputonly_muted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_outputonly_muted")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_platform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_platform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_platform")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_security_hash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_security_hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_security_hash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_security_hash")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_servergroups(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_servergroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_servergroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_servergroups")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_signed_badges(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_signed_badges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_signed_badges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_signed_badges")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_talk_power(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_talk_power")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_talk_power: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_talk_power")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_talk_request(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_talk_request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_talk_request: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_talk_request")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_talk_request_msg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_talk_request_msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_talk_request_msg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_talk_request_msg")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_total_bytes_downloaded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_total_bytes_downloaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_total_bytes_downloaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_total_bytes_downloaded")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_total_bytes_uploaded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_total_bytes_uploaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_total_bytes_uploaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_total_bytes_uploaded")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_totalconnections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_totalconnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_totalconnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_totalconnections")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_type(value: ClientType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_type")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_unique_identifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_unique_identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_unique_identifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_unique_identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_version")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_version_sign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_version_sign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_version_sign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_version_sign")(js.undefined)
        ret
    }
    @scala.inline
    def withClientftfid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientftfid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientftfid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientftfid")(js.undefined)
        ret
    }
    @scala.inline
    def withCluid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCluid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluid")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_bandwidth_received_last_minute_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bandwidth_received_last_minute_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_bandwidth_received_last_minute_total: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bandwidth_received_last_minute_total")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_bandwidth_received_last_second_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bandwidth_received_last_second_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_bandwidth_received_last_second_total: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bandwidth_received_last_second_total")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_bandwidth_sent_last_minute_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bandwidth_sent_last_minute_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_bandwidth_sent_last_minute_total: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bandwidth_sent_last_minute_total")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_bandwidth_sent_last_second_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bandwidth_sent_last_second_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_bandwidth_sent_last_second_total: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bandwidth_sent_last_second_total")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_bytes_received_control(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_received_control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_bytes_received_control: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_received_control")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_bytes_received_keepalive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_received_keepalive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_bytes_received_keepalive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_received_keepalive")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_bytes_received_speech(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_received_speech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_bytes_received_speech: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_received_speech")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_bytes_received_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_received_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_bytes_received_total: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_received_total")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_bytes_sent_control(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_sent_control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_bytes_sent_control: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_sent_control")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_bytes_sent_keepalive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_sent_keepalive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_bytes_sent_keepalive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_sent_keepalive")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_bytes_sent_speech(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_sent_speech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_bytes_sent_speech: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_sent_speech")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_bytes_sent_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_sent_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_bytes_sent_total: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_sent_total")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_client_ip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_client_ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_client_ip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_client_ip")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_connected_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_connected_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_connected_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_connected_time")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_filetransfer_bandwidth_received(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_filetransfer_bandwidth_received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_filetransfer_bandwidth_received: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_filetransfer_bandwidth_received")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_filetransfer_bandwidth_sent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_filetransfer_bandwidth_sent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_filetransfer_bandwidth_sent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_filetransfer_bandwidth_sent")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_filetransfer_bytes_received_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_filetransfer_bytes_received_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_filetransfer_bytes_received_total: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_filetransfer_bytes_received_total")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_filetransfer_bytes_sent_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_filetransfer_bytes_sent_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_filetransfer_bytes_sent_total: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_filetransfer_bytes_sent_total")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_packetloss_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packetloss_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_packetloss_total: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packetloss_total")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_packets_received_control(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_received_control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_packets_received_control: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_received_control")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_packets_received_keepalive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_received_keepalive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_packets_received_keepalive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_received_keepalive")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_packets_received_speech(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_received_speech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_packets_received_speech: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_received_speech")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_packets_received_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_received_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_packets_received_total: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_received_total")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_packets_sent_control(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_sent_control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_packets_sent_control: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_sent_control")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_packets_sent_keepalive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_sent_keepalive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_packets_sent_keepalive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_sent_keepalive")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_packets_sent_speech(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_sent_speech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_packets_sent_speech: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_sent_speech")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_packets_sent_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_sent_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_packets_sent_total: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_sent_total")(js.undefined)
        ret
    }
    @scala.inline
    def withConnection_ping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_ping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection_ping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_ping")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withCpid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpid")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(js.undefined)
        ret
    }
    @scala.inline
    def withCtid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCtid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctid")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrent_speed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrent_speed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_speed")(js.undefined)
        ret
    }
    @scala.inline
    def withDatetime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatetime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetime")(js.undefined)
        ret
    }
    @scala.inline
    def withDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforcements(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforcements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforcements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforcements")(js.undefined)
        ret
    }
    @scala.inline
    def withExpires_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_at")(js.undefined)
        ret
    }
    @scala.inline
    def withExtra_msg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra_msg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_msg")(js.undefined)
        ret
    }
    @scala.inline
    def withFailed_permid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed_permid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailed_permid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed_permid")(js.undefined)
        ret
    }
    @scala.inline
    def withFcldbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fcldbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFcldbid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fcldbid")(js.undefined)
        ret
    }
    @scala.inline
    def withFile_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_size")(js.undefined)
        ret
    }
    @scala.inline
    def withFlag_read(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag_read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlag_read: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag_read")(js.undefined)
        ret
    }
    @scala.inline
    def withFname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fname")(js.undefined)
        ret
    }
    @scala.inline
    def withFtkey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ftkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFtkey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ftkey")(js.undefined)
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withHost_timestamp_utc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host_timestamp_utc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost_timestamp_utc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host_timestamp_utc")(js.undefined)
        ret
    }
    @scala.inline
    def withIconid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconid")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withId1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id1")(js.undefined)
        ret
    }
    @scala.inline
    def withId2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id2")(js.undefined)
        ret
    }
    @scala.inline
    def withIdent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ident")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ident")(js.undefined)
        ret
    }
    @scala.inline
    def withInstance_uptime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance_uptime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance_uptime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance_uptime")(js.undefined)
        ret
    }
    @scala.inline
    def withInvokercldbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokercldbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvokercldbid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokercldbid")(js.undefined)
        ret
    }
    @scala.inline
    def withInvokerid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokerid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvokerid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokerid")(js.undefined)
        ret
    }
    @scala.inline
    def withInvokername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvokername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokername")(js.undefined)
        ret
    }
    @scala.inline
    def withInvokeruid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokeruid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvokeruid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokeruid")(js.undefined)
        ret
    }
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(js.undefined)
        ret
    }
    @scala.inline
    def withL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_pos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_pos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_pos")(js.undefined)
        ret
    }
    @scala.inline
    def withLastnickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastnickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastnickname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastnickname")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(js.undefined)
        ret
    }
    @scala.inline
    def withMsgid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsgid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgid")(js.undefined)
        ret
    }
    @scala.inline
    def withMytsid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mytsid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMytsid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mytsid")(js.undefined)
        ret
    }
    @scala.inline
    def withN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(js.undefined)
        ret
    }
    @scala.inline
    def withN_member_addp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n_member_addp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutN_member_addp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n_member_addp")(js.undefined)
        ret
    }
    @scala.inline
    def withN_member_removep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n_member_removep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutN_member_removep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n_member_removep")(js.undefined)
        ret
    }
    @scala.inline
    def withN_modifyp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n_modifyp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutN_modifyp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n_modifyp")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNamemode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamemode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namemode")(js.undefined)
        ret
    }
    @scala.inline
    def withNickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNickname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withP(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPermdesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permdesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermdesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permdesc")(js.undefined)
        ret
    }
    @scala.inline
    def withPermid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permid")(js.undefined)
        ret
    }
    @scala.inline
    def withPermname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permname")(js.undefined)
        ret
    }
    @scala.inline
    def withPermnegated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permnegated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermnegated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permnegated")(js.undefined)
        ret
    }
    @scala.inline
    def withPermsid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permsid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermsid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permsid")(js.undefined)
        ret
    }
    @scala.inline
    def withPermskip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permskip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermskip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permskip")(js.undefined)
        ret
    }
    @scala.inline
    def withPermvalue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permvalue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermvalue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permvalue")(js.undefined)
        ret
    }
    @scala.inline
    def withPid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pid")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withProto(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proto")(js.undefined)
        ret
    }
    @scala.inline
    def withPw_clear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pw_clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPw_clear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pw_clear")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonid")(js.undefined)
        ret
    }
    @scala.inline
    def withReasonmsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonmsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasonmsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonmsg")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(js.undefined)
        ret
    }
    @scala.inline
    def withS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(js.undefined)
        ret
    }
    @scala.inline
    def withSalt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSalt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(js.undefined)
        ret
    }
    @scala.inline
    def withSavedb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavedb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedb")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: ApiKeyScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSeconds_empty(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds_empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeconds_empty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds_empty")(js.undefined)
        ret
    }
    @scala.inline
    def withSender(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sender")(js.undefined)
        ret
    }
    @scala.inline
    def withServer_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServer_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server_id")(js.undefined)
        ret
    }
    @scala.inline
    def withServerftfid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverftfid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerftfid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverftfid")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_database_version(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_database_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_database_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_database_version")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_filetransfer_port(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_filetransfer_port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_filetransfer_port: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_filetransfer_port")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_guest_serverquery_group(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_guest_serverquery_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_guest_serverquery_group: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_guest_serverquery_group")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_max_download_total_bandwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_max_download_total_bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_max_download_total_bandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_max_download_total_bandwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_max_upload_total_bandwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_max_upload_total_bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_max_upload_total_bandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_max_upload_total_bandwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_pending_connections_per_ip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_pending_connections_per_ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_pending_connections_per_ip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_pending_connections_per_ip")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_permissions_version(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_permissions_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_permissions_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_permissions_version")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_serverquery_flood_ban_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_serverquery_flood_ban_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_serverquery_flood_ban_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_serverquery_flood_ban_time")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_serverquery_flood_commands(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_serverquery_flood_commands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_serverquery_flood_commands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_serverquery_flood_commands")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_serverquery_flood_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_serverquery_flood_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_serverquery_flood_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_serverquery_flood_time")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_serverquery_max_connections_per_ip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_serverquery_max_connections_per_ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_serverquery_max_connections_per_ip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_serverquery_max_connections_per_ip")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_template_channeladmin_group(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_template_channeladmin_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_template_channeladmin_group: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_template_channeladmin_group")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_template_channeldefault_group(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_template_channeldefault_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_template_channeldefault_group: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_template_channeldefault_group")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_template_serveradmin_group(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_template_serveradmin_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_template_serveradmin_group: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_template_serveradmin_group")(js.undefined)
        ret
    }
    @scala.inline
    def withServerinstance_template_serverdefault_group(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_template_serverdefault_group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerinstance_template_serverdefault_group: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_template_serverdefault_group")(js.undefined)
        ret
    }
    @scala.inline
    def withSgid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sgid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSgid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sgid")(js.undefined)
        ret
    }
    @scala.inline
    def withSid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sid")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSizedone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizedone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizedone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizedone")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(js.undefined)
        ret
    }
    @scala.inline
    def withSortid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortid")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
    @scala.inline
    def withT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetmode(value: TextMessageTargetMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetmode")(js.undefined)
        ret
    }
    @scala.inline
    def withTcid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTcid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcid")(js.undefined)
        ret
    }
    @scala.inline
    def withTcldbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcldbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTcldbid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcldbid")(js.undefined)
        ret
    }
    @scala.inline
    def withTime_left(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime_left: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_left")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withTname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tname")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
    @scala.inline
    def withToken1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token1")(js.undefined)
        ret
    }
    @scala.inline
    def withToken2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token2")(js.undefined)
        ret
    }
    @scala.inline
    def withToken_created(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken_created: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_created")(js.undefined)
        ret
    }
    @scala.inline
    def withToken_customset(value: js.Array[TokenCustomSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_customset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken_customset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_customset")(js.undefined)
        ret
    }
    @scala.inline
    def withToken_description(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_description")(js.undefined)
        ret
    }
    @scala.inline
    def withToken_id1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_id1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken_id1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_id1")(js.undefined)
        ret
    }
    @scala.inline
    def withToken_id2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_id2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken_id2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_id2")(js.undefined)
        ret
    }
    @scala.inline
    def withToken_type(value: TokenType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_type")(js.undefined)
        ret
    }
    @scala.inline
    def withTokencustomset(value: js.Array[TokenCustomSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokencustomset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokencustomset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokencustomset")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal_clients(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_clients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_clients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_clients")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal_clients_family(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_clients_family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_clients_family: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_clients_family")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
        ret
    }
    @scala.inline
    def withV(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
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
    def withVirtualserver_ask_for_privilegekey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_ask_for_privilegekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_ask_for_privilegekey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_ask_for_privilegekey")(js.undefined)
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
    def withVirtualserver_channel_temp_delete_delay_default(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_channel_temp_delete_delay_default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_channel_temp_delete_delay_default: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_channel_temp_delete_delay_default")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualserver_channelsonline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_channelsonline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualserver_channelsonline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_channelsonline")(js.undefined)
        ret
    }
  }
  
}

