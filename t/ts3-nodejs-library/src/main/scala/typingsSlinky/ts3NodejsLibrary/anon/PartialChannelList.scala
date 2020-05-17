package typingsSlinky.ts3NodejsLibrary.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/types/ResponseTypes.ChannelList> */
@js.native
trait PartialChannelList extends js.Object {
  var channel_banner_gfx_url: js.UndefOr[String] = js.native
  var channel_banner_mode: js.UndefOr[Double] = js.native
  var channel_codec: js.UndefOr[Double] = js.native
  var channel_codec_quality: js.UndefOr[Double] = js.native
  var channel_flag_default: js.UndefOr[Double] = js.native
  var channel_flag_password: js.UndefOr[Double] = js.native
  var channel_flag_permanent: js.UndefOr[Double] = js.native
  var channel_flag_semi_permanent: js.UndefOr[Double] = js.native
  var channel_icon_id: js.UndefOr[Double] = js.native
  var channel_maxclients: js.UndefOr[Double] = js.native
  var channel_maxfamilyclients: js.UndefOr[Double] = js.native
  var channel_name: js.UndefOr[String] = js.native
  var channel_needed_subscribe_power: js.UndefOr[Double] = js.native
  var channel_needed_talk_power: js.UndefOr[Double] = js.native
  var channel_order: js.UndefOr[Double] = js.native
  var channel_topic: js.UndefOr[String] = js.native
  var cid: js.UndefOr[Double] = js.native
  var pid: js.UndefOr[Double] = js.native
  var seconds_empty: js.UndefOr[Double] = js.native
  var total_clients: js.UndefOr[Double] = js.native
  var total_clients_family: js.UndefOr[Double] = js.native
}

object PartialChannelList {
  @scala.inline
  def apply(): PartialChannelList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChannelList]
  }
  @scala.inline
  implicit class PartialChannelListOps[Self <: PartialChannelList] (val x: Self) extends AnyVal {
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
    def withChannel_codec(value: Double): Self = {
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
  }
  
}

