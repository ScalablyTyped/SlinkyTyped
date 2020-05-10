package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCRtpSynchronizationSource extends RTCRtpContributingSource {
  var voiceActivityFlag: js.UndefOr[scala.Boolean] = js.native
}

object RTCRtpSynchronizationSource {
  @scala.inline
  def apply(rtpTimestamp: Double, source: Double, timestamp: Double): RTCRtpSynchronizationSource = {
    val __obj = js.Dynamic.literal(rtpTimestamp = rtpTimestamp.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpSynchronizationSource]
  }
  @scala.inline
  implicit class RTCRtpSynchronizationSourceOps[Self <: RTCRtpSynchronizationSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVoiceActivityFlag(value: scala.Boolean): Self = {
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

