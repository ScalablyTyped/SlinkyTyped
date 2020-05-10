package typingsSlinky.ts3NodejsLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/types/ResponseTypes.ClientList> */
@js.native
trait PartialClientList extends js.Object {
  var cid: js.UndefOr[Double] = js.native
  var clid: js.UndefOr[Double] = js.native
  var client_away: js.UndefOr[Double] = js.native
  var client_away_message: js.UndefOr[String] = js.native
  var client_badges: js.UndefOr[String] = js.native
  var client_channel_group_id: js.UndefOr[Double] = js.native
  var client_channel_group_inherited_channel_id: js.UndefOr[Double] = js.native
  var client_country: js.UndefOr[String] = js.native
  var client_created: js.UndefOr[Double] = js.native
  var client_database_id: js.UndefOr[Double] = js.native
  var client_flag_talking: js.UndefOr[Double] = js.native
  var client_idle_time: js.UndefOr[Double] = js.native
  var client_input_hardware: js.UndefOr[Double] = js.native
  var client_input_muted: js.UndefOr[Double] = js.native
  var client_is_channel_commander: js.UndefOr[Double] = js.native
  var client_is_priority_speaker: js.UndefOr[Double] = js.native
  var client_is_recording: js.UndefOr[Double] = js.native
  var client_is_talker: js.UndefOr[Double] = js.native
  var client_lastconnected: js.UndefOr[Double] = js.native
  var client_nickname: js.UndefOr[String] = js.native
  var client_output_hardware: js.UndefOr[Double] = js.native
  var client_output_muted: js.UndefOr[Double] = js.native
  var client_platform: js.UndefOr[String] = js.native
  var client_servergroups: js.UndefOr[js.Array[Double]] = js.native
  var client_talk_power: js.UndefOr[Double] = js.native
  var client_type: js.UndefOr[Double] = js.native
  var client_unique_identifier: js.UndefOr[String] = js.native
  var client_version: js.UndefOr[String] = js.native
  var connection_client_ip: js.UndefOr[String] = js.native
}

object PartialClientList {
  @scala.inline
  def apply(): PartialClientList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClientList]
  }
  @scala.inline
  implicit class PartialClientListOps[Self <: PartialClientList] (val x: Self) extends AnyVal {
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
    def withoutCid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cid")(js.undefined)
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
    def withClient_type(value: Double): Self = {
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
  }
  
}

