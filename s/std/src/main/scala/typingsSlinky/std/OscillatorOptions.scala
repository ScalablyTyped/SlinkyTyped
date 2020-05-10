package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OscillatorOptions extends AudioNodeOptions {
  var detune: js.UndefOr[Double] = js.native
  var frequency: js.UndefOr[Double] = js.native
  var periodicWave: js.UndefOr[org.scalajs.dom.raw.PeriodicWave] = js.native
  var `type`: js.UndefOr[OscillatorType] = js.native
}

object OscillatorOptions {
  @scala.inline
  def apply(): OscillatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OscillatorOptions]
  }
  @scala.inline
  implicit class OscillatorOptionsOps[Self <: OscillatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetune(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detune")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetune: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detune")(js.undefined)
        ret
    }
    @scala.inline
    def withFrequency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriodicWave(value: org.scalajs.dom.raw.PeriodicWave): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodicWave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriodicWave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodicWave")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: OscillatorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

