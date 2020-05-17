package typingsSlinky.tensorflowTfjsData.anon

import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor2D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spectrogram extends js.Object {
  var spectrogram: Tensor3D = js.native
  var waveform: Tensor2D = js.native
}

object Spectrogram {
  @scala.inline
  def apply(spectrogram: Tensor3D, waveform: Tensor2D): Spectrogram = {
    val __obj = js.Dynamic.literal(spectrogram = spectrogram.asInstanceOf[js.Any], waveform = waveform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spectrogram]
  }
  @scala.inline
  implicit class SpectrogramOps[Self <: Spectrogram] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpectrogram(value: Tensor3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spectrogram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaveform(value: Tensor2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waveform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

