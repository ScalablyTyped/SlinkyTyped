package typingsSlinky.skyway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnswerOptions extends js.Object {
  var audioBandwidth: js.UndefOr[Double] = js.native
  var audioCodec: js.UndefOr[String] = js.native
  var videoBandwidth: js.UndefOr[Double] = js.native
  var videoCodec: js.UndefOr[String] = js.native
}

object AnswerOptions {
  @scala.inline
  def apply(): AnswerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnswerOptions]
  }
  @scala.inline
  implicit class AnswerOptionsOps[Self <: AnswerOptions] (val x: Self) extends AnyVal {
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
  }
  
}

