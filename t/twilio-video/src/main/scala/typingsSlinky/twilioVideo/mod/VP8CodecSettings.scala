package typingsSlinky.twilioVideo.mod

import typingsSlinky.twilioVideo.twilioVideoStrings.VP8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VP8CodecSettings extends VideoCodecSettings {
  @JSName("codec")
  var codec_VP8CodecSettings: VP8 = js.native
  var simulcast: js.UndefOr[Boolean] = js.native
}

object VP8CodecSettings {
  @scala.inline
  def apply(codec: VP8): VP8CodecSettings = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any])
    __obj.asInstanceOf[VP8CodecSettings]
  }
  @scala.inline
  implicit class VP8CodecSettingsOps[Self <: VP8CodecSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodec(value: VP8): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSimulcast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulcast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimulcast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simulcast")(js.undefined)
        ret
    }
  }
  
}

