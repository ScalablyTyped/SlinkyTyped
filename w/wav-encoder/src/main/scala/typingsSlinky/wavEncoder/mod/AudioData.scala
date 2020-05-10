package typingsSlinky.wavEncoder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioData extends js.Object {
  var channelData: js.Array[js.typedarray.Float32Array] = js.native
  var sampleRate: Double = js.native
}

object AudioData {
  @scala.inline
  def apply(channelData: js.Array[js.typedarray.Float32Array], sampleRate: Double): AudioData = {
    val __obj = js.Dynamic.literal(channelData = channelData.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioData]
  }
  @scala.inline
  implicit class AudioDataOps[Self <: AudioData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelData(value: js.Array[js.typedarray.Float32Array]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSampleRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

