package typingsSlinky.ts3NodejsLibrary.queryResponseMod

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

@js.native
trait QueryResponseTypes extends js.Object {
  var apikey: String = js.native
  var average_speed: Double = js.native
  var banid: Double = js.native
  var build: Double = js.native
  var cfid: Double = js.native
  var cgid: Double = js.native
  var channel_banner_gfx_url: String = js.native
  var channel_banner_mode: Double = js.native
  var channel_codec: Codec = js.native
  var channel_codec_is_unencrypted: Double = js.native
  var channel_codec_latency_factor: Double = js.native
  var channel_codec_quality: Double = js.native
  var channel_delete_delay: Double = js.native
  var channel_description: String = js.native
  var channel_filepath: String = js.native
  var channel_flag_default: Double = js.native
  var channel_flag_maxclients_unlimited: Double = js.native
  var channel_flag_maxfamilyclients_inherited: Double = js.native
  var channel_flag_maxfamilyclients_unlimited: Double = js.native
  var channel_flag_password: Double = js.native
  var channel_flag_permanent: Double = js.native
  var channel_flag_private: Double = js.native
  var channel_flag_semi_permanent: Double = js.native
  var channel_flag_temporary: Double = js.native
  var channel_forced_silence: Double = js.native
  var channel_icon_id: Double = js.native
  var channel_maxclients: Double = js.native
  var channel_maxfamilyclients: Double = js.native
  var channel_name: String = js.native
  var channel_name_phonetic: String = js.native
  var channel_needed_subscribe_power: Double = js.native
  var channel_needed_talk_power: Double = js.native
  var channel_order: Double = js.native
  var channel_password: String = js.native
  var channel_security_salt: String = js.native
  var channel_topic: String = js.native
  var cid: Double = js.native
  var cldbid: Double = js.native
  var clid: Double = js.native
  var client_away: Double = js.native
  var client_away_message: String = js.native
  var client_badges: String = js.native
  var client_base64HashClientUID: String = js.native
  var client_channel_group_id: Double = js.native
  var client_channel_group_inherited_channel_id: Double = js.native
  var client_channel_id: Double = js.native
  var client_country: String = js.native
  var client_created: Double = js.native
  var client_database_id: Double = js.native
  var client_default_channel: Double = js.native
  var client_default_token: String = js.native
  var client_description: String = js.native
  var client_flag_avatar: String = js.native
  var client_flag_talking: Double = js.native
  var client_icon_id: Double = js.native
  var client_id: Double = js.native
  var client_idle_time: Double = js.native
  var client_input_hardware: Double = js.native
  var client_input_muted: Double = js.native
  var client_integrations: String = js.native
  var client_is_channel_commander: Double = js.native
  var client_is_priority_speaker: Double = js.native
  var client_is_recording: Double = js.native
  var client_is_talker: Double = js.native
  var client_lastconnected: Double = js.native
  var client_lastip: String = js.native
  var client_login_name: String = js.native
  var client_login_password: String = js.native
  var client_meta_data: String = js.native
  var client_month_bytes_downloaded: Double = js.native
  var client_month_bytes_uploaded: Double = js.native
  var client_myteamspeak_avatar: String = js.native
  var client_myteamspeak_id: String = js.native
  var client_needed_serverquery_view_power: Double = js.native
  var client_nickname: String = js.native
  var client_nickname_phonetic: String = js.native
  var client_origin_server_id: Double = js.native
  var client_output_hardware: Double = js.native
  var client_output_muted: Double = js.native
  var client_outputonly_muted: Double = js.native
  var client_platform: String = js.native
  var client_security_hash: String = js.native
  var client_servergroups: js.Array[Double] = js.native
  var client_signed_badges: String = js.native
  var client_talk_power: Double = js.native
  var client_talk_request: Double = js.native
  var client_talk_request_msg: String = js.native
  var client_total_bytes_downloaded: Double = js.native
  var client_total_bytes_uploaded: Double = js.native
  var client_totalconnections: Double = js.native
  var client_type: ClientType = js.native
  var client_unique_identifier: String = js.native
  var client_version: String = js.native
  var client_version_sign: String = js.native
  var clientftfid: Double = js.native
  var cluid: String = js.native
  var connection_bandwidth_received_last_minute_total: Double = js.native
  var connection_bandwidth_received_last_second_total: Double = js.native
  var connection_bandwidth_sent_last_minute_total: Double = js.native
  var connection_bandwidth_sent_last_second_total: Double = js.native
  var connection_bytes_received_control: Double = js.native
  var connection_bytes_received_keepalive: Double = js.native
  var connection_bytes_received_speech: Double = js.native
  var connection_bytes_received_total: Double = js.native
  var connection_bytes_sent_control: Double = js.native
  var connection_bytes_sent_keepalive: Double = js.native
  var connection_bytes_sent_speech: Double = js.native
  var connection_bytes_sent_total: Double = js.native
  var connection_client_ip: String = js.native
  var connection_connected_time: Double = js.native
  var connection_filetransfer_bandwidth_received: Double = js.native
  var connection_filetransfer_bandwidth_sent: Double = js.native
  var connection_filetransfer_bytes_received_total: Double = js.native
  var connection_filetransfer_bytes_sent_total: Double = js.native
  var connection_packetloss_total: Double = js.native
  var connection_packets_received_control: Double = js.native
  var connection_packets_received_keepalive: Double = js.native
  var connection_packets_received_speech: Double = js.native
  var connection_packets_received_total: Double = js.native
  var connection_packets_sent_control: Double = js.native
  var connection_packets_sent_keepalive: Double = js.native
  var connection_packets_sent_speech: Double = js.native
  var connection_packets_sent_total: Double = js.native
  var connection_ping: Double = js.native
  var count: Double = js.native
  var cpid: Double = js.native
  var created: Double = js.native
  var created_at: Double = js.native
  var ctid: Double = js.native
  var current_speed: Double = js.native
  var datetime: Double = js.native
  var desc: String = js.native
  var duration: Double = js.native
  var end: Double = js.native
  var enforcements: Double = js.native
  var expires_at: Double = js.native
  var extra_msg: String = js.native
  var failed_permid: Double = js.native
  var fcldbid: Double = js.native
  var file_size: Double = js.native
  var flag_read: Double = js.native
  var fname: String = js.native
  var ftkey: String = js.native
  var hash: String = js.native
  var host_timestamp_utc: Double = js.native
  var iconid: Double = js.native
  var id: Double = js.native
  var id1: Double = js.native
  var id2: Double = js.native
  var ident: String = js.native
  var instance_uptime: Double = js.native
  var invokercldbid: Double = js.native
  var invokerid: Double = js.native
  var invokername: String = js.native
  var invokeruid: String = js.native
  var ip: String = js.native
  var l: String = js.native
  var last_pos: Double = js.native
  var lastnickname: String = js.native
  var message: String = js.native
  var msg: String = js.native
  var msgid: Double = js.native
  var mytsid: String = js.native
  var n: Double = js.native
  var n_member_addp: Double = js.native
  var n_member_removep: Double = js.native
  var n_modifyp: Double = js.native
  var name: String = js.native
  var namemode: Double = js.native
  var nickname: String = js.native
  var order: Double = js.native
  var p: Double = js.native
  var path: String = js.native
  var permdesc: String = js.native
  var permid: Double = js.native
  var permname: String = js.native
  var permnegated: Double = js.native
  var permsid: String = js.native
  var permskip: Double = js.native
  var permvalue: Double = js.native
  var pid: Double = js.native
  var platform: String = js.native
  var port: Double = js.native
  var proto: Double = js.native
  var pw_clear: String = js.native
  var reason: String = js.native
  var reasonid: Double = js.native
  var reasonmsg: String = js.native
  var runtime: Double = js.native
  var s: Double = js.native
  var salt: String = js.native
  var savedb: Double = js.native
  var scope: ApiKeyScope = js.native
  var seconds_empty: Double = js.native
  var sender: Double = js.native
  var server_id: Double = js.native
  var serverftfid: Double = js.native
  var serverinstance_database_version: Double = js.native
  var serverinstance_filetransfer_port: Double = js.native
  var serverinstance_guest_serverquery_group: Double = js.native
  var serverinstance_max_download_total_bandwidth: Double = js.native
  var serverinstance_max_upload_total_bandwidth: Double = js.native
  var serverinstance_pending_connections_per_ip: Double = js.native
  var serverinstance_permissions_version: Double = js.native
  var serverinstance_serverquery_flood_ban_time: Double = js.native
  var serverinstance_serverquery_flood_commands: Double = js.native
  var serverinstance_serverquery_flood_time: Double = js.native
  var serverinstance_serverquery_max_connections_per_ip: Double = js.native
  var serverinstance_template_channeladmin_group: Double = js.native
  var serverinstance_template_channeldefault_group: Double = js.native
  var serverinstance_template_serveradmin_group: Double = js.native
  var serverinstance_template_serverdefault_group: Double = js.native
  var sgid: Double = js.native
  var sid: Double = js.native
  var size: Double = js.native
  var sizedone: Double = js.native
  var snapshot: String = js.native
  var sortid: Double = js.native
  var start: Double = js.native
  var status: Double = js.native
  var subject: String = js.native
  var t: Double = js.native
  var target: Double = js.native
  var targetmode: TextMessageTargetMode = js.native
  var tcid: Double = js.native
  var tcldbid: Double = js.native
  var time_left: Double = js.native
  var timestamp: Double = js.native
  var tname: String = js.native
  var token: String = js.native
  var token1: String = js.native
  var token2: String = js.native
  var token_created: Double = js.native
  var token_customset: js.Array[TokenCustomSet] = js.native
  var token_description: String = js.native
  var token_id1: Double = js.native
  var token_id2: Double = js.native
  var token_type: TokenType = js.native
  var tokencustomset: js.Array[TokenCustomSet] = js.native
  var total_clients: Double = js.native
  var total_clients_family: Double = js.native
  var `type`: Double = js.native
  var uid: String = js.native
  var v: Double = js.native
  var value: String = js.native
  var version: String = js.native
  var virtualserver_antiflood_points_needed_command_block: Double = js.native
  var virtualserver_antiflood_points_needed_ip_block: Double = js.native
  var virtualserver_antiflood_points_needed_plugin_block: Double = js.native
  var virtualserver_antiflood_points_tick_reduce: Double = js.native
  var virtualserver_ask_for_privilegekey: Double = js.native
  var virtualserver_autostart: Double = js.native
  var virtualserver_channel_temp_delete_delay_default: Double = js.native
  var virtualserver_channelsonline: Double = js.native
  var virtualserver_client_connections: Double = js.native
  var virtualserver_clientsonline: Double = js.native
  var virtualserver_codec_encryption_mode: CodecEncryptionMode = js.native
  var virtualserver_complain_autoban_count: Double = js.native
  var virtualserver_complain_autoban_time: Double = js.native
  var virtualserver_complain_remove_time: Double = js.native
  var virtualserver_created: Double = js.native
  var virtualserver_default_channel_admin_group: Double = js.native
  var virtualserver_default_channel_group: Double = js.native
  var virtualserver_default_server_group: Double = js.native
  var virtualserver_download_quota: Double = js.native
  var virtualserver_filebase: String = js.native
  var virtualserver_flag_password: Double = js.native
  var virtualserver_hostbanner_gfx_interval: Double = js.native
  var virtualserver_hostbanner_gfx_url: String = js.native
  var virtualserver_hostbanner_mode: HostBannerMode = js.native
  var virtualserver_hostbanner_url: String = js.native
  var virtualserver_hostbutton_gfx_url: String = js.native
  var virtualserver_hostbutton_tooltip: String = js.native
  var virtualserver_hostbutton_url: String = js.native
  var virtualserver_hostmessage: String = js.native
  var virtualserver_hostmessage_mode: HostMessageMode = js.native
  var virtualserver_icon_id: Double = js.native
  var virtualserver_id: Double = js.native
  var virtualserver_ip: js.Array[String] = js.native
  var virtualserver_log_channel: Double = js.native
  var virtualserver_log_client: Double = js.native
  var virtualserver_log_filetransfer: Double = js.native
  var virtualserver_log_permissions: Double = js.native
  var virtualserver_log_query: Double = js.native
  var virtualserver_log_server: Double = js.native
  var virtualserver_machine_id: String = js.native
  var virtualserver_max_download_total_bandwidth: Double = js.native
  var virtualserver_max_upload_total_bandwidth: Double = js.native
  var virtualserver_maxclients: Double = js.native
  var virtualserver_min_android_version: Double = js.native
  var virtualserver_min_client_version: Double = js.native
  var virtualserver_min_clients_in_channel_before_forced_silence: Double = js.native
  var virtualserver_min_ios_version: Double = js.native
  var virtualserver_month_bytes_downloaded: Double = js.native
  var virtualserver_month_bytes_uploaded: Double = js.native
  var virtualserver_name: String = js.native
  var virtualserver_name_phonetic: String = js.native
  var virtualserver_needed_identity_security_level: Double = js.native
  var virtualserver_nickname: String = js.native
  var virtualserver_password: String = js.native
  var virtualserver_platform: String = js.native
  var virtualserver_port: Double = js.native
  var virtualserver_priority_speaker_dimm_modificator: Double = js.native
  var virtualserver_query_client_connections: Double = js.native
  var virtualserver_queryclientsonline: Double = js.native
  var virtualserver_reserved_slots: Double = js.native
  var virtualserver_status: String = js.native
  var virtualserver_total_bytes_downloaded: Double = js.native
  var virtualserver_total_bytes_uploaded: Double = js.native
  var virtualserver_total_packetloss_control: Double = js.native
  var virtualserver_total_packetloss_keepalive: Double = js.native
  var virtualserver_total_packetloss_speech: Double = js.native
  var virtualserver_total_packetloss_total: Double = js.native
  var virtualserver_total_ping: Double = js.native
  var virtualserver_unique_identifier: String = js.native
  var virtualserver_upload_quota: Double = js.native
  var virtualserver_uptime: Double = js.native
  var virtualserver_version: String = js.native
  var virtualserver_weblist_enabled: Double = js.native
  var virtualserver_welcomemessage: String = js.native
  var virtualservers_running_total: Double = js.native
  var virtualservers_total_channels_online: Double = js.native
  var virtualservers_total_clients_online: Double = js.native
  var virtualservers_total_maxclients: Double = js.native
}

object QueryResponseTypes {
  @scala.inline
  def apply(
    apikey: String,
    average_speed: Double,
    banid: Double,
    build: Double,
    cfid: Double,
    cgid: Double,
    channel_banner_gfx_url: String,
    channel_banner_mode: Double,
    channel_codec: Codec,
    channel_codec_is_unencrypted: Double,
    channel_codec_latency_factor: Double,
    channel_codec_quality: Double,
    channel_delete_delay: Double,
    channel_description: String,
    channel_filepath: String,
    channel_flag_default: Double,
    channel_flag_maxclients_unlimited: Double,
    channel_flag_maxfamilyclients_inherited: Double,
    channel_flag_maxfamilyclients_unlimited: Double,
    channel_flag_password: Double,
    channel_flag_permanent: Double,
    channel_flag_private: Double,
    channel_flag_semi_permanent: Double,
    channel_flag_temporary: Double,
    channel_forced_silence: Double,
    channel_icon_id: Double,
    channel_maxclients: Double,
    channel_maxfamilyclients: Double,
    channel_name: String,
    channel_name_phonetic: String,
    channel_needed_subscribe_power: Double,
    channel_needed_talk_power: Double,
    channel_order: Double,
    channel_password: String,
    channel_security_salt: String,
    channel_topic: String,
    cid: Double,
    cldbid: Double,
    clid: Double,
    client_away: Double,
    client_away_message: String,
    client_badges: String,
    client_base64HashClientUID: String,
    client_channel_group_id: Double,
    client_channel_group_inherited_channel_id: Double,
    client_channel_id: Double,
    client_country: String,
    client_created: Double,
    client_database_id: Double,
    client_default_channel: Double,
    client_default_token: String,
    client_description: String,
    client_flag_avatar: String,
    client_flag_talking: Double,
    client_icon_id: Double,
    client_id: Double,
    client_idle_time: Double,
    client_input_hardware: Double,
    client_input_muted: Double,
    client_integrations: String,
    client_is_channel_commander: Double,
    client_is_priority_speaker: Double,
    client_is_recording: Double,
    client_is_talker: Double,
    client_lastconnected: Double,
    client_lastip: String,
    client_login_name: String,
    client_login_password: String,
    client_meta_data: String,
    client_month_bytes_downloaded: Double,
    client_month_bytes_uploaded: Double,
    client_myteamspeak_avatar: String,
    client_myteamspeak_id: String,
    client_needed_serverquery_view_power: Double,
    client_nickname: String,
    client_nickname_phonetic: String,
    client_origin_server_id: Double,
    client_output_hardware: Double,
    client_output_muted: Double,
    client_outputonly_muted: Double,
    client_platform: String,
    client_security_hash: String,
    client_servergroups: js.Array[Double],
    client_signed_badges: String,
    client_talk_power: Double,
    client_talk_request: Double,
    client_talk_request_msg: String,
    client_total_bytes_downloaded: Double,
    client_total_bytes_uploaded: Double,
    client_totalconnections: Double,
    client_type: ClientType,
    client_unique_identifier: String,
    client_version: String,
    client_version_sign: String,
    clientftfid: Double,
    cluid: String,
    connection_bandwidth_received_last_minute_total: Double,
    connection_bandwidth_received_last_second_total: Double,
    connection_bandwidth_sent_last_minute_total: Double,
    connection_bandwidth_sent_last_second_total: Double,
    connection_bytes_received_control: Double,
    connection_bytes_received_keepalive: Double,
    connection_bytes_received_speech: Double,
    connection_bytes_received_total: Double,
    connection_bytes_sent_control: Double,
    connection_bytes_sent_keepalive: Double,
    connection_bytes_sent_speech: Double,
    connection_bytes_sent_total: Double,
    connection_client_ip: String,
    connection_connected_time: Double,
    connection_filetransfer_bandwidth_received: Double,
    connection_filetransfer_bandwidth_sent: Double,
    connection_filetransfer_bytes_received_total: Double,
    connection_filetransfer_bytes_sent_total: Double,
    connection_packetloss_total: Double,
    connection_packets_received_control: Double,
    connection_packets_received_keepalive: Double,
    connection_packets_received_speech: Double,
    connection_packets_received_total: Double,
    connection_packets_sent_control: Double,
    connection_packets_sent_keepalive: Double,
    connection_packets_sent_speech: Double,
    connection_packets_sent_total: Double,
    connection_ping: Double,
    count: Double,
    cpid: Double,
    created: Double,
    created_at: Double,
    ctid: Double,
    current_speed: Double,
    datetime: Double,
    desc: String,
    duration: Double,
    end: Double,
    enforcements: Double,
    expires_at: Double,
    extra_msg: String,
    failed_permid: Double,
    fcldbid: Double,
    file_size: Double,
    flag_read: Double,
    fname: String,
    ftkey: String,
    hash: String,
    host_timestamp_utc: Double,
    iconid: Double,
    id: Double,
    id1: Double,
    id2: Double,
    ident: String,
    instance_uptime: Double,
    invokercldbid: Double,
    invokerid: Double,
    invokername: String,
    invokeruid: String,
    ip: String,
    l: String,
    last_pos: Double,
    lastnickname: String,
    message: String,
    msg: String,
    msgid: Double,
    mytsid: String,
    n: Double,
    n_member_addp: Double,
    n_member_removep: Double,
    n_modifyp: Double,
    name: String,
    namemode: Double,
    nickname: String,
    order: Double,
    p: Double,
    path: String,
    permdesc: String,
    permid: Double,
    permname: String,
    permnegated: Double,
    permsid: String,
    permskip: Double,
    permvalue: Double,
    pid: Double,
    platform: String,
    port: Double,
    proto: Double,
    pw_clear: String,
    reason: String,
    reasonid: Double,
    reasonmsg: String,
    runtime: Double,
    s: Double,
    salt: String,
    savedb: Double,
    scope: ApiKeyScope,
    seconds_empty: Double,
    sender: Double,
    server_id: Double,
    serverftfid: Double,
    serverinstance_database_version: Double,
    serverinstance_filetransfer_port: Double,
    serverinstance_guest_serverquery_group: Double,
    serverinstance_max_download_total_bandwidth: Double,
    serverinstance_max_upload_total_bandwidth: Double,
    serverinstance_pending_connections_per_ip: Double,
    serverinstance_permissions_version: Double,
    serverinstance_serverquery_flood_ban_time: Double,
    serverinstance_serverquery_flood_commands: Double,
    serverinstance_serverquery_flood_time: Double,
    serverinstance_serverquery_max_connections_per_ip: Double,
    serverinstance_template_channeladmin_group: Double,
    serverinstance_template_channeldefault_group: Double,
    serverinstance_template_serveradmin_group: Double,
    serverinstance_template_serverdefault_group: Double,
    sgid: Double,
    sid: Double,
    size: Double,
    sizedone: Double,
    snapshot: String,
    sortid: Double,
    start: Double,
    status: Double,
    subject: String,
    t: Double,
    target: Double,
    targetmode: TextMessageTargetMode,
    tcid: Double,
    tcldbid: Double,
    time_left: Double,
    timestamp: Double,
    tname: String,
    token: String,
    token1: String,
    token2: String,
    token_created: Double,
    token_customset: js.Array[TokenCustomSet],
    token_description: String,
    token_id1: Double,
    token_id2: Double,
    token_type: TokenType,
    tokencustomset: js.Array[TokenCustomSet],
    total_clients: Double,
    total_clients_family: Double,
    `type`: Double,
    uid: String,
    v: Double,
    value: String,
    version: String,
    virtualserver_antiflood_points_needed_command_block: Double,
    virtualserver_antiflood_points_needed_ip_block: Double,
    virtualserver_antiflood_points_needed_plugin_block: Double,
    virtualserver_antiflood_points_tick_reduce: Double,
    virtualserver_ask_for_privilegekey: Double,
    virtualserver_autostart: Double,
    virtualserver_channel_temp_delete_delay_default: Double,
    virtualserver_channelsonline: Double
  ): QueryResponseTypes = {
    val __obj = js.Dynamic.literal(apikey = apikey.asInstanceOf[js.Any], average_speed = average_speed.asInstanceOf[js.Any], banid = banid.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], cfid = cfid.asInstanceOf[js.Any], cgid = cgid.asInstanceOf[js.Any], channel_banner_gfx_url = channel_banner_gfx_url.asInstanceOf[js.Any], channel_banner_mode = channel_banner_mode.asInstanceOf[js.Any], channel_codec = channel_codec.asInstanceOf[js.Any], channel_codec_is_unencrypted = channel_codec_is_unencrypted.asInstanceOf[js.Any], channel_codec_latency_factor = channel_codec_latency_factor.asInstanceOf[js.Any], channel_codec_quality = channel_codec_quality.asInstanceOf[js.Any], channel_delete_delay = channel_delete_delay.asInstanceOf[js.Any], channel_description = channel_description.asInstanceOf[js.Any], channel_filepath = channel_filepath.asInstanceOf[js.Any], channel_flag_default = channel_flag_default.asInstanceOf[js.Any], channel_flag_maxclients_unlimited = channel_flag_maxclients_unlimited.asInstanceOf[js.Any], channel_flag_maxfamilyclients_inherited = channel_flag_maxfamilyclients_inherited.asInstanceOf[js.Any], channel_flag_maxfamilyclients_unlimited = channel_flag_maxfamilyclients_unlimited.asInstanceOf[js.Any], channel_flag_password = channel_flag_password.asInstanceOf[js.Any], channel_flag_permanent = channel_flag_permanent.asInstanceOf[js.Any], channel_flag_private = channel_flag_private.asInstanceOf[js.Any], channel_flag_semi_permanent = channel_flag_semi_permanent.asInstanceOf[js.Any], channel_flag_temporary = channel_flag_temporary.asInstanceOf[js.Any], channel_forced_silence = channel_forced_silence.asInstanceOf[js.Any], channel_icon_id = channel_icon_id.asInstanceOf[js.Any], channel_maxclients = channel_maxclients.asInstanceOf[js.Any], channel_maxfamilyclients = channel_maxfamilyclients.asInstanceOf[js.Any], channel_name = channel_name.asInstanceOf[js.Any], channel_name_phonetic = channel_name_phonetic.asInstanceOf[js.Any], channel_needed_subscribe_power = channel_needed_subscribe_power.asInstanceOf[js.Any], channel_needed_talk_power = channel_needed_talk_power.asInstanceOf[js.Any], channel_order = channel_order.asInstanceOf[js.Any], channel_password = channel_password.asInstanceOf[js.Any], channel_security_salt = channel_security_salt.asInstanceOf[js.Any], channel_topic = channel_topic.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], cldbid = cldbid.asInstanceOf[js.Any], clid = clid.asInstanceOf[js.Any], client_away = client_away.asInstanceOf[js.Any], client_away_message = client_away_message.asInstanceOf[js.Any], client_badges = client_badges.asInstanceOf[js.Any], client_base64HashClientUID = client_base64HashClientUID.asInstanceOf[js.Any], client_channel_group_id = client_channel_group_id.asInstanceOf[js.Any], client_channel_group_inherited_channel_id = client_channel_group_inherited_channel_id.asInstanceOf[js.Any], client_channel_id = client_channel_id.asInstanceOf[js.Any], client_country = client_country.asInstanceOf[js.Any], client_created = client_created.asInstanceOf[js.Any], client_database_id = client_database_id.asInstanceOf[js.Any], client_default_channel = client_default_channel.asInstanceOf[js.Any], client_default_token = client_default_token.asInstanceOf[js.Any], client_description = client_description.asInstanceOf[js.Any], client_flag_avatar = client_flag_avatar.asInstanceOf[js.Any], client_flag_talking = client_flag_talking.asInstanceOf[js.Any], client_icon_id = client_icon_id.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], client_idle_time = client_idle_time.asInstanceOf[js.Any], client_input_hardware = client_input_hardware.asInstanceOf[js.Any], client_input_muted = client_input_muted.asInstanceOf[js.Any], client_integrations = client_integrations.asInstanceOf[js.Any], client_is_channel_commander = client_is_channel_commander.asInstanceOf[js.Any], client_is_priority_speaker = client_is_priority_speaker.asInstanceOf[js.Any], client_is_recording = client_is_recording.asInstanceOf[js.Any], client_is_talker = client_is_talker.asInstanceOf[js.Any], client_lastconnected = client_lastconnected.asInstanceOf[js.Any], client_lastip = client_lastip.asInstanceOf[js.Any], client_login_name = client_login_name.asInstanceOf[js.Any], client_login_password = client_login_password.asInstanceOf[js.Any], client_meta_data = client_meta_data.asInstanceOf[js.Any], client_month_bytes_downloaded = client_month_bytes_downloaded.asInstanceOf[js.Any], client_month_bytes_uploaded = client_month_bytes_uploaded.asInstanceOf[js.Any], client_myteamspeak_avatar = client_myteamspeak_avatar.asInstanceOf[js.Any], client_myteamspeak_id = client_myteamspeak_id.asInstanceOf[js.Any], client_needed_serverquery_view_power = client_needed_serverquery_view_power.asInstanceOf[js.Any], client_nickname = client_nickname.asInstanceOf[js.Any], client_nickname_phonetic = client_nickname_phonetic.asInstanceOf[js.Any], client_origin_server_id = client_origin_server_id.asInstanceOf[js.Any], client_output_hardware = client_output_hardware.asInstanceOf[js.Any], client_output_muted = client_output_muted.asInstanceOf[js.Any], client_outputonly_muted = client_outputonly_muted.asInstanceOf[js.Any], client_platform = client_platform.asInstanceOf[js.Any], client_security_hash = client_security_hash.asInstanceOf[js.Any], client_servergroups = client_servergroups.asInstanceOf[js.Any], client_signed_badges = client_signed_badges.asInstanceOf[js.Any], client_talk_power = client_talk_power.asInstanceOf[js.Any], client_talk_request = client_talk_request.asInstanceOf[js.Any], client_talk_request_msg = client_talk_request_msg.asInstanceOf[js.Any], client_total_bytes_downloaded = client_total_bytes_downloaded.asInstanceOf[js.Any], client_total_bytes_uploaded = client_total_bytes_uploaded.asInstanceOf[js.Any], client_totalconnections = client_totalconnections.asInstanceOf[js.Any], client_type = client_type.asInstanceOf[js.Any], client_unique_identifier = client_unique_identifier.asInstanceOf[js.Any], client_version = client_version.asInstanceOf[js.Any], client_version_sign = client_version_sign.asInstanceOf[js.Any], clientftfid = clientftfid.asInstanceOf[js.Any], cluid = cluid.asInstanceOf[js.Any], connection_bandwidth_received_last_minute_total = connection_bandwidth_received_last_minute_total.asInstanceOf[js.Any], connection_bandwidth_received_last_second_total = connection_bandwidth_received_last_second_total.asInstanceOf[js.Any], connection_bandwidth_sent_last_minute_total = connection_bandwidth_sent_last_minute_total.asInstanceOf[js.Any], connection_bandwidth_sent_last_second_total = connection_bandwidth_sent_last_second_total.asInstanceOf[js.Any], connection_bytes_received_control = connection_bytes_received_control.asInstanceOf[js.Any], connection_bytes_received_keepalive = connection_bytes_received_keepalive.asInstanceOf[js.Any], connection_bytes_received_speech = connection_bytes_received_speech.asInstanceOf[js.Any], connection_bytes_received_total = connection_bytes_received_total.asInstanceOf[js.Any], connection_bytes_sent_control = connection_bytes_sent_control.asInstanceOf[js.Any], connection_bytes_sent_keepalive = connection_bytes_sent_keepalive.asInstanceOf[js.Any], connection_bytes_sent_speech = connection_bytes_sent_speech.asInstanceOf[js.Any], connection_bytes_sent_total = connection_bytes_sent_total.asInstanceOf[js.Any], connection_client_ip = connection_client_ip.asInstanceOf[js.Any], connection_connected_time = connection_connected_time.asInstanceOf[js.Any], connection_filetransfer_bandwidth_received = connection_filetransfer_bandwidth_received.asInstanceOf[js.Any], connection_filetransfer_bandwidth_sent = connection_filetransfer_bandwidth_sent.asInstanceOf[js.Any], connection_filetransfer_bytes_received_total = connection_filetransfer_bytes_received_total.asInstanceOf[js.Any], connection_filetransfer_bytes_sent_total = connection_filetransfer_bytes_sent_total.asInstanceOf[js.Any], connection_packetloss_total = connection_packetloss_total.asInstanceOf[js.Any], connection_packets_received_control = connection_packets_received_control.asInstanceOf[js.Any], connection_packets_received_keepalive = connection_packets_received_keepalive.asInstanceOf[js.Any], connection_packets_received_speech = connection_packets_received_speech.asInstanceOf[js.Any], connection_packets_received_total = connection_packets_received_total.asInstanceOf[js.Any], connection_packets_sent_control = connection_packets_sent_control.asInstanceOf[js.Any], connection_packets_sent_keepalive = connection_packets_sent_keepalive.asInstanceOf[js.Any], connection_packets_sent_speech = connection_packets_sent_speech.asInstanceOf[js.Any], connection_packets_sent_total = connection_packets_sent_total.asInstanceOf[js.Any], connection_ping = connection_ping.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], cpid = cpid.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], ctid = ctid.asInstanceOf[js.Any], current_speed = current_speed.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], enforcements = enforcements.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], extra_msg = extra_msg.asInstanceOf[js.Any], failed_permid = failed_permid.asInstanceOf[js.Any], fcldbid = fcldbid.asInstanceOf[js.Any], file_size = file_size.asInstanceOf[js.Any], flag_read = flag_read.asInstanceOf[js.Any], fname = fname.asInstanceOf[js.Any], ftkey = ftkey.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], host_timestamp_utc = host_timestamp_utc.asInstanceOf[js.Any], iconid = iconid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], id1 = id1.asInstanceOf[js.Any], id2 = id2.asInstanceOf[js.Any], ident = ident.asInstanceOf[js.Any], instance_uptime = instance_uptime.asInstanceOf[js.Any], invokercldbid = invokercldbid.asInstanceOf[js.Any], invokerid = invokerid.asInstanceOf[js.Any], invokername = invokername.asInstanceOf[js.Any], invokeruid = invokeruid.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], last_pos = last_pos.asInstanceOf[js.Any], lastnickname = lastnickname.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], msgid = msgid.asInstanceOf[js.Any], mytsid = mytsid.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], n_member_addp = n_member_addp.asInstanceOf[js.Any], n_member_removep = n_member_removep.asInstanceOf[js.Any], n_modifyp = n_modifyp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namemode = namemode.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], permdesc = permdesc.asInstanceOf[js.Any], permid = permid.asInstanceOf[js.Any], permname = permname.asInstanceOf[js.Any], permnegated = permnegated.asInstanceOf[js.Any], permsid = permsid.asInstanceOf[js.Any], permskip = permskip.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], pw_clear = pw_clear.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], reasonid = reasonid.asInstanceOf[js.Any], reasonmsg = reasonmsg.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any], savedb = savedb.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], seconds_empty = seconds_empty.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], server_id = server_id.asInstanceOf[js.Any], serverftfid = serverftfid.asInstanceOf[js.Any], serverinstance_database_version = serverinstance_database_version.asInstanceOf[js.Any], serverinstance_filetransfer_port = serverinstance_filetransfer_port.asInstanceOf[js.Any], serverinstance_guest_serverquery_group = serverinstance_guest_serverquery_group.asInstanceOf[js.Any], serverinstance_max_download_total_bandwidth = serverinstance_max_download_total_bandwidth.asInstanceOf[js.Any], serverinstance_max_upload_total_bandwidth = serverinstance_max_upload_total_bandwidth.asInstanceOf[js.Any], serverinstance_pending_connections_per_ip = serverinstance_pending_connections_per_ip.asInstanceOf[js.Any], serverinstance_permissions_version = serverinstance_permissions_version.asInstanceOf[js.Any], serverinstance_serverquery_flood_ban_time = serverinstance_serverquery_flood_ban_time.asInstanceOf[js.Any], serverinstance_serverquery_flood_commands = serverinstance_serverquery_flood_commands.asInstanceOf[js.Any], serverinstance_serverquery_flood_time = serverinstance_serverquery_flood_time.asInstanceOf[js.Any], serverinstance_serverquery_max_connections_per_ip = serverinstance_serverquery_max_connections_per_ip.asInstanceOf[js.Any], serverinstance_template_channeladmin_group = serverinstance_template_channeladmin_group.asInstanceOf[js.Any], serverinstance_template_channeldefault_group = serverinstance_template_channeldefault_group.asInstanceOf[js.Any], serverinstance_template_serveradmin_group = serverinstance_template_serveradmin_group.asInstanceOf[js.Any], serverinstance_template_serverdefault_group = serverinstance_template_serverdefault_group.asInstanceOf[js.Any], sgid = sgid.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sizedone = sizedone.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], sortid = sortid.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetmode = targetmode.asInstanceOf[js.Any], tcid = tcid.asInstanceOf[js.Any], tcldbid = tcldbid.asInstanceOf[js.Any], time_left = time_left.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tname = tname.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], token1 = token1.asInstanceOf[js.Any], token2 = token2.asInstanceOf[js.Any], token_created = token_created.asInstanceOf[js.Any], token_customset = token_customset.asInstanceOf[js.Any], token_description = token_description.asInstanceOf[js.Any], token_id1 = token_id1.asInstanceOf[js.Any], token_id2 = token_id2.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any], tokencustomset = tokencustomset.asInstanceOf[js.Any], total_clients = total_clients.asInstanceOf[js.Any], total_clients_family = total_clients_family.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], virtualserver_antiflood_points_needed_command_block = virtualserver_antiflood_points_needed_command_block.asInstanceOf[js.Any], virtualserver_antiflood_points_needed_ip_block = virtualserver_antiflood_points_needed_ip_block.asInstanceOf[js.Any], virtualserver_antiflood_points_needed_plugin_block = virtualserver_antiflood_points_needed_plugin_block.asInstanceOf[js.Any], virtualserver_antiflood_points_tick_reduce = virtualserver_antiflood_points_tick_reduce.asInstanceOf[js.Any], virtualserver_ask_for_privilegekey = virtualserver_ask_for_privilegekey.asInstanceOf[js.Any], virtualserver_autostart = virtualserver_autostart.asInstanceOf[js.Any], virtualserver_channel_temp_delete_delay_default = virtualserver_channel_temp_delete_delay_default.asInstanceOf[js.Any], virtualserver_channelsonline = virtualserver_channelsonline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResponseTypes]
  }
  @scala.inline
  implicit class QueryResponseTypesOps[Self <: QueryResponseTypes] (val x: Self) extends AnyVal {
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
    def withAverage_speed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average_speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBanid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuild(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCfid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cfid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCgid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cgid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_banner_gfx_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_banner_gfx_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_banner_mode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_banner_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_codec(value: Codec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_codec_is_unencrypted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_codec_is_unencrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_codec_latency_factor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_codec_latency_factor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_codec_quality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_codec_quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_delete_delay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_delete_delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_description(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_filepath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_filepath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_flag_default(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_flag_maxclients_unlimited(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_maxclients_unlimited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_flag_maxfamilyclients_inherited(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_maxfamilyclients_inherited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_flag_maxfamilyclients_unlimited(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_maxfamilyclients_unlimited")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_flag_password(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_flag_permanent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_permanent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_flag_private(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_flag_semi_permanent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_semi_permanent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_flag_temporary(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_temporary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_forced_silence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_forced_silence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_icon_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_icon_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_maxclients(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_maxclients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_maxfamilyclients(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_maxfamilyclients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_name_phonetic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_name_phonetic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_needed_subscribe_power(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_needed_subscribe_power")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_needed_talk_power(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_needed_talk_power")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_order(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_password(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_security_salt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_security_salt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_topic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCldbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cldbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_away(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_away")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_away_message(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_away_message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_badges(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_badges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_base64HashClientUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_base64HashClientUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_channel_group_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_channel_group_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_channel_group_inherited_channel_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_channel_group_inherited_channel_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_channel_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_channel_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_country(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_country")(value.asInstanceOf[js.Any])
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
    def withClient_default_channel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_default_channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_default_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_default_token")(value.asInstanceOf[js.Any])
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
    def withClient_flag_talking(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_flag_talking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_icon_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_icon_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_idle_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_idle_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_input_hardware(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_input_hardware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_input_muted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_input_muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_integrations(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_integrations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_is_channel_commander(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_is_channel_commander")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_is_priority_speaker(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_is_priority_speaker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_is_recording(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_is_recording")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_is_talker(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_is_talker")(value.asInstanceOf[js.Any])
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
    def withClient_login_password(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_login_password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_meta_data(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_meta_data")(value.asInstanceOf[js.Any])
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
    def withClient_myteamspeak_avatar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_myteamspeak_avatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_myteamspeak_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_myteamspeak_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_needed_serverquery_view_power(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_needed_serverquery_view_power")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_nickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_nickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_nickname_phonetic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_nickname_phonetic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_origin_server_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_origin_server_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_output_hardware(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_output_hardware")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_output_muted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_output_muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_outputonly_muted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_outputonly_muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_platform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_security_hash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_security_hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_servergroups(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_servergroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_signed_badges(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_signed_badges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_talk_power(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_talk_power")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_talk_request(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_talk_request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_talk_request_msg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_talk_request_msg")(value.asInstanceOf[js.Any])
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
    def withClient_type(value: ClientType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_unique_identifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_unique_identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_version_sign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_version_sign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientftfid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientftfid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCluid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cluid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_bandwidth_received_last_minute_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bandwidth_received_last_minute_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_bandwidth_received_last_second_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bandwidth_received_last_second_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_bandwidth_sent_last_minute_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bandwidth_sent_last_minute_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_bandwidth_sent_last_second_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bandwidth_sent_last_second_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_bytes_received_control(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_received_control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_bytes_received_keepalive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_received_keepalive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_bytes_received_speech(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_received_speech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_bytes_received_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_received_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_bytes_sent_control(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_sent_control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_bytes_sent_keepalive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_sent_keepalive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_bytes_sent_speech(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_sent_speech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_bytes_sent_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_bytes_sent_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_client_ip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_client_ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_connected_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_connected_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_filetransfer_bandwidth_received(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_filetransfer_bandwidth_received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_filetransfer_bandwidth_sent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_filetransfer_bandwidth_sent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_filetransfer_bytes_received_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_filetransfer_bytes_received_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_filetransfer_bytes_sent_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_filetransfer_bytes_sent_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_packetloss_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packetloss_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_packets_received_control(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_received_control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_packets_received_keepalive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_received_keepalive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_packets_received_speech(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_received_speech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_packets_received_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_received_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_packets_sent_control(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_sent_control")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_packets_sent_keepalive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_sent_keepalive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_packets_sent_speech(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_sent_speech")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_packets_sent_total(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_packets_sent_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection_ping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_ping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCpid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cpid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreated_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrent_speed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current_speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatetime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnforcements(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforcements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtra_msg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra_msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailed_permid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failed_permid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFcldbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fcldbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlag_read(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag_read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFtkey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ftkey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost_timestamp_utc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host_timestamp_utc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ident")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstance_uptime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance_uptime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvokercldbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokercldbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvokerid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokerid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvokername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokername")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvokeruid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invokeruid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_pos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastnickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastnickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsgid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMytsid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mytsid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withN_member_addp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n_member_addp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withN_member_removep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n_member_removep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withN_modifyp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n_modifyp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamemode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nickname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermdesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permdesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermnegated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permnegated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermsid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permsid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermskip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permskip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPermvalue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permvalue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProto(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPw_clear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pw_clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReasonid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReasonmsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasonmsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuntime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSalt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSavedb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("savedb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: ApiKeyScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeconds_empty(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds_empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSender(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServer_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerftfid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverftfid")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withServerinstance_serverquery_flood_time(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverinstance_serverquery_flood_time")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withSgid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sgid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizedone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizedone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetmode(value: TextMessageTargetMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTcid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTcldbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tcldbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime_left(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken_created(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken_customset(value: js.Array[TokenCustomSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_customset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken_description(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken_id1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_id1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken_id2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_id2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken_type(value: TokenType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokencustomset(value: js.Array[TokenCustomSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokencustomset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_clients(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_clients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_clients_family(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_clients_family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withV(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualserver_antiflood_points_needed_command_block(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_antiflood_points_needed_command_block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualserver_antiflood_points_needed_ip_block(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_antiflood_points_needed_ip_block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualserver_antiflood_points_needed_plugin_block(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_antiflood_points_needed_plugin_block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualserver_antiflood_points_tick_reduce(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_antiflood_points_tick_reduce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualserver_ask_for_privilegekey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_ask_for_privilegekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualserver_autostart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_autostart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualserver_channel_temp_delete_delay_default(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_channel_temp_delete_delay_default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVirtualserver_channelsonline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualserver_channelsonline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

