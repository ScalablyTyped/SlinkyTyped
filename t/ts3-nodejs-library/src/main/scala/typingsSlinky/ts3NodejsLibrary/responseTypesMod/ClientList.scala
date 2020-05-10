package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientList extends js.Object {
  var cid: Double = js.native
  var clid: Double = js.native
  var client_away: Double = js.native
  var client_away_message: String = js.native
  var client_badges: String = js.native
  var client_channel_group_id: Double = js.native
  var client_channel_group_inherited_channel_id: Double = js.native
  var client_country: String = js.native
  var client_created: Double = js.native
  var client_database_id: Double = js.native
  var client_flag_talking: Double = js.native
  var client_idle_time: Double = js.native
  var client_input_hardware: Double = js.native
  var client_input_muted: Double = js.native
  var client_is_channel_commander: Double = js.native
  var client_is_priority_speaker: Double = js.native
  var client_is_recording: Double = js.native
  var client_is_talker: Double = js.native
  var client_lastconnected: Double = js.native
  var client_nickname: String = js.native
  var client_output_hardware: Double = js.native
  var client_output_muted: Double = js.native
  var client_platform: String = js.native
  var client_servergroups: js.Array[Double] = js.native
  var client_talk_power: Double = js.native
  var client_type: Double = js.native
  var client_unique_identifier: String = js.native
  var client_version: String = js.native
  var connection_client_ip: String = js.native
}

object ClientList {
  @scala.inline
  def apply(
    cid: Double,
    clid: Double,
    client_away: Double,
    client_away_message: String,
    client_badges: String,
    client_channel_group_id: Double,
    client_channel_group_inherited_channel_id: Double,
    client_country: String,
    client_created: Double,
    client_database_id: Double,
    client_flag_talking: Double,
    client_idle_time: Double,
    client_input_hardware: Double,
    client_input_muted: Double,
    client_is_channel_commander: Double,
    client_is_priority_speaker: Double,
    client_is_recording: Double,
    client_is_talker: Double,
    client_lastconnected: Double,
    client_nickname: String,
    client_output_hardware: Double,
    client_output_muted: Double,
    client_platform: String,
    client_servergroups: js.Array[Double],
    client_talk_power: Double,
    client_type: Double,
    client_unique_identifier: String,
    client_version: String,
    connection_client_ip: String
  ): ClientList = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], clid = clid.asInstanceOf[js.Any], client_away = client_away.asInstanceOf[js.Any], client_away_message = client_away_message.asInstanceOf[js.Any], client_badges = client_badges.asInstanceOf[js.Any], client_channel_group_id = client_channel_group_id.asInstanceOf[js.Any], client_channel_group_inherited_channel_id = client_channel_group_inherited_channel_id.asInstanceOf[js.Any], client_country = client_country.asInstanceOf[js.Any], client_created = client_created.asInstanceOf[js.Any], client_database_id = client_database_id.asInstanceOf[js.Any], client_flag_talking = client_flag_talking.asInstanceOf[js.Any], client_idle_time = client_idle_time.asInstanceOf[js.Any], client_input_hardware = client_input_hardware.asInstanceOf[js.Any], client_input_muted = client_input_muted.asInstanceOf[js.Any], client_is_channel_commander = client_is_channel_commander.asInstanceOf[js.Any], client_is_priority_speaker = client_is_priority_speaker.asInstanceOf[js.Any], client_is_recording = client_is_recording.asInstanceOf[js.Any], client_is_talker = client_is_talker.asInstanceOf[js.Any], client_lastconnected = client_lastconnected.asInstanceOf[js.Any], client_nickname = client_nickname.asInstanceOf[js.Any], client_output_hardware = client_output_hardware.asInstanceOf[js.Any], client_output_muted = client_output_muted.asInstanceOf[js.Any], client_platform = client_platform.asInstanceOf[js.Any], client_servergroups = client_servergroups.asInstanceOf[js.Any], client_talk_power = client_talk_power.asInstanceOf[js.Any], client_type = client_type.asInstanceOf[js.Any], client_unique_identifier = client_unique_identifier.asInstanceOf[js.Any], client_version = client_version.asInstanceOf[js.Any], connection_client_ip = connection_client_ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientList]
  }
  @scala.inline
  implicit class ClientListOps[Self <: ClientList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cid")(value.asInstanceOf[js.Any])
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
    def withClient_flag_talking(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_flag_talking")(value.asInstanceOf[js.Any])
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
    def withClient_nickname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_nickname")(value.asInstanceOf[js.Any])
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
    def withClient_platform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_servergroups(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_servergroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_talk_power(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_talk_power")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient_type(value: Double): Self = {
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
    def withConnection_client_ip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_client_ip")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

