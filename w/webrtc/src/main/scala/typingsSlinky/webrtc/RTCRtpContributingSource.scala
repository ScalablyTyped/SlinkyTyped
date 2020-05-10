package typingsSlinky.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#dom-rtcrtpcontributingsource
@js.native
trait RTCRtpContributingSource extends js.Object {
  //readonly timestamp: number;
  var source: Double = js.native
  //readonly audioLevel: number | null;
  val voiceActivityFlag: js.UndefOr[Boolean] = js.native
}

object RTCRtpContributingSource {
  @scala.inline
  def apply(source: Double): RTCRtpContributingSource = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpContributingSource]
  }
  @scala.inline
  implicit class RTCRtpContributingSourceOps[Self <: RTCRtpContributingSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVoiceActivityFlag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceActivityFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceActivityFlag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voiceActivityFlag")(js.undefined)
        ret
    }
  }
  
}

