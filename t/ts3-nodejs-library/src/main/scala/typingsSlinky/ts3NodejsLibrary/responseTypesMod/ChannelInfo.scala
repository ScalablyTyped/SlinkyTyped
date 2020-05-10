package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelInfo extends js.Object {
  var channel_banner_gfx_url: String = js.native
  var channel_banner_mode: Double = js.native
  var channel_codec: Double = js.native
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
  var channel_flag_semi_permanent: Double = js.native
  var channel_forced_silence: Double = js.native
  var channel_icon_id: Double = js.native
  var channel_maxclients: Double = js.native
  var channel_maxfamilyclients: Double = js.native
  var channel_name: String = js.native
  var channel_name_phonetic: String = js.native
  var channel_needed_talk_power: Double = js.native
  var channel_order: Double = js.native
  var channel_password: String = js.native
  var channel_security_salt: String = js.native
  var channel_topic: String = js.native
  var pid: Double = js.native
  var seconds_empty: Double = js.native
}

object ChannelInfo {
  @scala.inline
  def apply(
    channel_banner_gfx_url: String,
    channel_banner_mode: Double,
    channel_codec: Double,
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
    channel_flag_semi_permanent: Double,
    channel_forced_silence: Double,
    channel_icon_id: Double,
    channel_maxclients: Double,
    channel_maxfamilyclients: Double,
    channel_name: String,
    channel_name_phonetic: String,
    channel_needed_talk_power: Double,
    channel_order: Double,
    channel_password: String,
    channel_security_salt: String,
    channel_topic: String,
    pid: Double,
    seconds_empty: Double
  ): ChannelInfo = {
    val __obj = js.Dynamic.literal(channel_banner_gfx_url = channel_banner_gfx_url.asInstanceOf[js.Any], channel_banner_mode = channel_banner_mode.asInstanceOf[js.Any], channel_codec = channel_codec.asInstanceOf[js.Any], channel_codec_is_unencrypted = channel_codec_is_unencrypted.asInstanceOf[js.Any], channel_codec_latency_factor = channel_codec_latency_factor.asInstanceOf[js.Any], channel_codec_quality = channel_codec_quality.asInstanceOf[js.Any], channel_delete_delay = channel_delete_delay.asInstanceOf[js.Any], channel_description = channel_description.asInstanceOf[js.Any], channel_filepath = channel_filepath.asInstanceOf[js.Any], channel_flag_default = channel_flag_default.asInstanceOf[js.Any], channel_flag_maxclients_unlimited = channel_flag_maxclients_unlimited.asInstanceOf[js.Any], channel_flag_maxfamilyclients_inherited = channel_flag_maxfamilyclients_inherited.asInstanceOf[js.Any], channel_flag_maxfamilyclients_unlimited = channel_flag_maxfamilyclients_unlimited.asInstanceOf[js.Any], channel_flag_password = channel_flag_password.asInstanceOf[js.Any], channel_flag_permanent = channel_flag_permanent.asInstanceOf[js.Any], channel_flag_semi_permanent = channel_flag_semi_permanent.asInstanceOf[js.Any], channel_forced_silence = channel_forced_silence.asInstanceOf[js.Any], channel_icon_id = channel_icon_id.asInstanceOf[js.Any], channel_maxclients = channel_maxclients.asInstanceOf[js.Any], channel_maxfamilyclients = channel_maxfamilyclients.asInstanceOf[js.Any], channel_name = channel_name.asInstanceOf[js.Any], channel_name_phonetic = channel_name_phonetic.asInstanceOf[js.Any], channel_needed_talk_power = channel_needed_talk_power.asInstanceOf[js.Any], channel_order = channel_order.asInstanceOf[js.Any], channel_password = channel_password.asInstanceOf[js.Any], channel_security_salt = channel_security_salt.asInstanceOf[js.Any], channel_topic = channel_topic.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], seconds_empty = seconds_empty.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelInfo]
  }
  @scala.inline
  implicit class ChannelInfoOps[Self <: ChannelInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withChannel_codec(value: Double): Self = {
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
    def withChannel_flag_semi_permanent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_semi_permanent")(value.asInstanceOf[js.Any])
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
    def withPid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeconds_empty(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seconds_empty")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

