package typingsSlinky.winrtUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an equalizer band for the equalizer effect. */
@js.native
trait EqualizerBand extends js.Object {
  /** Gets or sets the bandwidth for the equalizer band. */
  var bandwidth: Double = js.native
  /** Gets or sets the frequency center for the equalizer band. */
  var frequencyCenter: Double = js.native
  /** Gets or sets the gain for the equalizer band. */
  var gain: Double = js.native
}

object EqualizerBand {
  @scala.inline
  def apply(bandwidth: Double, frequencyCenter: Double, gain: Double): EqualizerBand = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], frequencyCenter = frequencyCenter.asInstanceOf[js.Any], gain = gain.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqualizerBand]
  }
  @scala.inline
  implicit class EqualizerBandOps[Self <: EqualizerBand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBandwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrequencyCenter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequencyCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGain(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gain")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

