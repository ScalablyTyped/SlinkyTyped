package typingsSlinky.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelList extends js.Object {
  /** only in server version >= 3.11.x */
  var channel_banner_gfx_url: String = js.native
  /** only in server version >= 3.11.x */
  var channel_banner_mode: Double = js.native
  var channel_codec: Double = js.native
  var channel_codec_quality: Double = js.native
  var channel_flag_default: Double = js.native
  var channel_flag_password: Double = js.native
  var channel_flag_permanent: Double = js.native
  var channel_flag_semi_permanent: Double = js.native
  var channel_icon_id: Double = js.native
  var channel_maxclients: Double = js.native
  var channel_maxfamilyclients: Double = js.native
  var channel_name: String = js.native
  var channel_needed_subscribe_power: Double = js.native
  var channel_needed_talk_power: Double = js.native
  var channel_order: Double = js.native
  var channel_topic: String = js.native
  var cid: Double = js.native
  var pid: Double = js.native
  var seconds_empty: Double = js.native
  var total_clients: Double = js.native
  var total_clients_family: Double = js.native
}

object ChannelList {
  @scala.inline
  def apply(
    channel_banner_gfx_url: String,
    channel_banner_mode: Double,
    channel_codec: Double,
    channel_codec_quality: Double,
    channel_flag_default: Double,
    channel_flag_password: Double,
    channel_flag_permanent: Double,
    channel_flag_semi_permanent: Double,
    channel_icon_id: Double,
    channel_maxclients: Double,
    channel_maxfamilyclients: Double,
    channel_name: String,
    channel_needed_subscribe_power: Double,
    channel_needed_talk_power: Double,
    channel_order: Double,
    channel_topic: String,
    cid: Double,
    pid: Double,
    seconds_empty: Double,
    total_clients: Double,
    total_clients_family: Double
  ): ChannelList = {
    val __obj = js.Dynamic.literal(channel_banner_gfx_url = channel_banner_gfx_url.asInstanceOf[js.Any], channel_banner_mode = channel_banner_mode.asInstanceOf[js.Any], channel_codec = channel_codec.asInstanceOf[js.Any], channel_codec_quality = channel_codec_quality.asInstanceOf[js.Any], channel_flag_default = channel_flag_default.asInstanceOf[js.Any], channel_flag_password = channel_flag_password.asInstanceOf[js.Any], channel_flag_permanent = channel_flag_permanent.asInstanceOf[js.Any], channel_flag_semi_permanent = channel_flag_semi_permanent.asInstanceOf[js.Any], channel_icon_id = channel_icon_id.asInstanceOf[js.Any], channel_maxclients = channel_maxclients.asInstanceOf[js.Any], channel_maxfamilyclients = channel_maxfamilyclients.asInstanceOf[js.Any], channel_name = channel_name.asInstanceOf[js.Any], channel_needed_subscribe_power = channel_needed_subscribe_power.asInstanceOf[js.Any], channel_needed_talk_power = channel_needed_talk_power.asInstanceOf[js.Any], channel_order = channel_order.asInstanceOf[js.Any], channel_topic = channel_topic.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], seconds_empty = seconds_empty.asInstanceOf[js.Any], total_clients = total_clients.asInstanceOf[js.Any], total_clients_family = total_clients_family.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelList]
  }
  @scala.inline
  implicit class ChannelListOps[Self <: ChannelList] (val x: Self) extends AnyVal {
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
    def withChannel_codec_quality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_codec_quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChannel_flag_default(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel_flag_default")(value.asInstanceOf[js.Any])
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
  }
  
}

