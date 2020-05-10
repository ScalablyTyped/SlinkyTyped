package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCOfferAnswerOptions extends js.Object {
  var voiceActivityDetection: js.UndefOr[scala.Boolean] = js.native
}

object RTCOfferAnswerOptions {
  @scala.inline
  def apply(): RTCOfferAnswerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCOfferAnswerOptions]
  }
  @scala.inline
  implicit class RTCOfferAnswerOptionsOps[Self <: RTCOfferAnswerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVoiceActivityDetection(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceActivityDetection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceActivityDetection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceActivityDetection")(js.undefined)
        ret
    }
  }
  
}

