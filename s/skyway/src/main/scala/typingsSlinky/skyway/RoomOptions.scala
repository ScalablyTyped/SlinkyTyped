package typingsSlinky.skyway

import org.scalajs.dom.experimental.mediastream.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomOptions extends js.Object {
  var audioBandwidth: js.UndefOr[Double] = js.native
  var audioCodec: js.UndefOr[String] = js.native
  var audioReceiveEnabled: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[String] = js.native
  var stream: js.UndefOr[MediaStream] = js.native
  var videoBandwidth: js.UndefOr[Double] = js.native
  var videoCodec: js.UndefOr[String] = js.native
  var videoReceiveEnabled: js.UndefOr[Boolean] = js.native
}

object RoomOptions {
  @scala.inline
  def apply(): RoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomOptions]
  }
  @scala.inline
  implicit class RoomOptionsOps[Self <: RoomOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioBandwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioBandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioBandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioBandwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioCodec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioCodec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioCodec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioCodec")(js.undefined)
        ret
    }
    @scala.inline
    def withAudioReceiveEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioReceiveEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioReceiveEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioReceiveEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withStream(value: MediaStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStream: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoBandwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoBandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoBandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoBandwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoCodec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCodec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoCodec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoCodec")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoReceiveEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoReceiveEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoReceiveEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoReceiveEnabled")(js.undefined)
        ret
    }
  }
  
}

