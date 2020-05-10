package typingsSlinky.ts3NodejsLibrary.propertyTypesMod

import typingsSlinky.ts3NodejsLibrary.enumMod.Codec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelEdit extends js.Object {
  var channel_codec: js.UndefOr[Codec] = js.native
  var channel_codec_is_unencrypted: js.UndefOr[Double] = js.native
  var channel_codec_quality: js.UndefOr[Double] = js.native
  var channel_description: js.UndefOr[String] = js.native
  var channel_flag_default: js.UndefOr[Double] = js.native
  var channel_flag_maxclients_unlimited: js.UndefOr[Double] = js.native
  var channel_flag_maxfamilyclients_inherited: js.UndefOr[Double] = js.native
  var channel_flag_permanent: js.UndefOr[Double] = js.native
  var channel_flag_semi_permanent: js.UndefOr[Double] = js.native
  var channel_flag_temporary: js.UndefOr[Double] = js.native
  var channel_maxclients: js.UndefOr[Double] = js.native
  var channel_maxfamilyclients: js.UndefOr[Double] = js.native
  var channel_name: js.UndefOr[String] = js.native
  var channel_name_phonetic: js.UndefOr[String] = js.native
  var channel_needed_talk_power: js.UndefOr[Double] = js.native
  var channel_order: js.UndefOr[Double] = js.native
  var channel_password: js.UndefOr[String] = js.native
  var channel_topic: js.UndefOr[String] = js.native
  var cid: js.UndefOr[Double] = js.native
  var cpid: js.UndefOr[Double] = js.native
}

object ChannelEdit {
  @scala.inline
  def apply(): ChannelEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelEdit]
  }
  @scala.inline
  implicit class ChannelEditOps[Self <: ChannelEdit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

