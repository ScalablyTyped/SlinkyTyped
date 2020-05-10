package typingsSlinky.tensorflowTfjsData.typesMod

import org.scalajs.dom.experimental.mediastream.MediaTrackConstraints
import typingsSlinky.tensorflowTfjsData.tensorflowTfjsDataNumbers.`44100`
import typingsSlinky.tensorflowTfjsData.tensorflowTfjsDataNumbers.`48000`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MicrophoneConfig extends js.Object {
  var audioTrackConstraints: js.UndefOr[MediaTrackConstraints] = js.native
  var columnTruncateLength: js.UndefOr[Double] = js.native
  var fftSize: js.UndefOr[Double] = js.native
  var includeSpectrogram: js.UndefOr[Boolean] = js.native
  var includeWaveform: js.UndefOr[Boolean] = js.native
  var numFramesPerSpectrogram: js.UndefOr[Double] = js.native
  var sampleRateHz: js.UndefOr[`44100` | `48000`] = js.native
  var smoothingTimeConstant: js.UndefOr[Double] = js.native
}

object MicrophoneConfig {
  @scala.inline
  def apply(): MicrophoneConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MicrophoneConfig]
  }
  @scala.inline
  implicit class MicrophoneConfigOps[Self <: MicrophoneConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioTrackConstraints(value: MediaTrackConstraints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioTrackConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioTrackConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioTrackConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnTruncateLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTruncateLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnTruncateLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnTruncateLength")(js.undefined)
        ret
    }
    @scala.inline
    def withFftSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fftSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFftSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fftSize")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeSpectrogram(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSpectrogram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSpectrogram: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSpectrogram")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeWaveform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeWaveform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeWaveform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeWaveform")(js.undefined)
        ret
    }
    @scala.inline
    def withNumFramesPerSpectrogram(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFramesPerSpectrogram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumFramesPerSpectrogram: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numFramesPerSpectrogram")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleRateHz(value: `44100` | `48000`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRateHz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleRateHz: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRateHz")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothingTimeConstant(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothingTimeConstant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothingTimeConstant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothingTimeConstant")(js.undefined)
        ret
    }
  }
  
}

