package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCOfferOptions extends RTCOfferAnswerOptions {
  var iceRestart: js.UndefOr[scala.Boolean] = js.native
  var offerToReceiveAudio: js.UndefOr[scala.Boolean] = js.native
  var offerToReceiveVideo: js.UndefOr[scala.Boolean] = js.native
}

object RTCOfferOptions {
  @scala.inline
  def apply(): RTCOfferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCOfferOptions]
  }
  @scala.inline
  implicit class RTCOfferOptionsOps[Self <: org.scalajs.dom.experimental.webrtc.RTCOfferOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIceRestart(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceRestart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIceRestart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iceRestart")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferToReceiveAudio(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerToReceiveAudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferToReceiveAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerToReceiveAudio")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferToReceiveVideo(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerToReceiveVideo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferToReceiveVideo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerToReceiveVideo")(js.undefined)
        ret
    }
  }
  
}

