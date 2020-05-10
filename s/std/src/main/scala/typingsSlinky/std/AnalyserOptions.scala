package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyserOptions extends AudioNodeOptions {
  var fftSize: js.UndefOr[Double] = js.native
  var maxDecibels: js.UndefOr[Double] = js.native
  var minDecibels: js.UndefOr[Double] = js.native
  var smoothingTimeConstant: js.UndefOr[Double] = js.native
}

object AnalyserOptions {
  @scala.inline
  def apply(): AnalyserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyserOptions]
  }
  @scala.inline
  implicit class AnalyserOptionsOps[Self <: AnalyserOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withMaxDecibels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDecibels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDecibels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDecibels")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDecibels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDecibels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDecibels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDecibels")(js.undefined)
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

