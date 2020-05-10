package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCRtpContributingSource extends js.Object {
  var audioLevel: js.UndefOr[Double] = js.native
  var rtpTimestamp: Double = js.native
  var source: Double = js.native
  var timestamp: Double = js.native
}

object RTCRtpContributingSource {
  @scala.inline
  def apply(rtpTimestamp: Double, source: Double, timestamp: Double): RTCRtpContributingSource = {
    val __obj = js.Dynamic.literal(rtpTimestamp = rtpTimestamp.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpContributingSource]
  }
  @scala.inline
  implicit class RTCRtpContributingSourceOps[Self <: RTCRtpContributingSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRtpTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtpTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioLevel")(js.undefined)
        ret
    }
  }
  
}

