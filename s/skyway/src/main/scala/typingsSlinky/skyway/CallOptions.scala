package typingsSlinky.skyway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallOptions extends js.Object {
  var audioBandwidth: js.UndefOr[Double] = js.native
  var audioCodec: js.UndefOr[String] = js.native
  var audioReceiveEnabled: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String] = js.native
  var metadata: js.UndefOr[js.Any] = js.native
  var videoBandWidth: js.UndefOr[Double] = js.native
  var videoCodec: js.UndefOr[String] = js.native
  var videoReceiveEnabled: js.UndefOr[Boolean] = js.native
}

object CallOptions {
  @scala.inline
  def apply(): CallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallOptions]
  }
  @scala.inline
  implicit class CallOptionsOps[Self <: CallOptions] (val x: Self) extends AnyVal {
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
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoBandWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoBandWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoBandWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoBandWidth")(js.undefined)
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

