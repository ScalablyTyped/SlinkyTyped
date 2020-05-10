package typingsSlinky.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodingParameters extends js.Object {
  var maxAudioBitrate: js.UndefOr[Double | Null] = js.native
  var maxVideoBitrate: js.UndefOr[Double | Null] = js.native
}

object EncodingParameters {
  @scala.inline
  def apply(): EncodingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncodingParameters]
  }
  @scala.inline
  implicit class EncodingParametersOps[Self <: EncodingParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxAudioBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAudioBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAudioBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAudioBitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAudioBitrateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAudioBitrate")(null)
        ret
    }
    @scala.inline
    def withMaxVideoBitrate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVideoBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVideoBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVideoBitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxVideoBitrateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVideoBitrate")(null)
        ret
    }
  }
  
}

