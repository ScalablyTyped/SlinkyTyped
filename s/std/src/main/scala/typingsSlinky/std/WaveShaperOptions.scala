package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaveShaperOptions extends AudioNodeOptions {
  var curve: js.UndefOr[js.Array[Double] | js.typedarray.Float32Array] = js.native
  var oversample: js.UndefOr[OverSampleType] = js.native
}

object WaveShaperOptions {
  @scala.inline
  def apply(): WaveShaperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaveShaperOptions]
  }
  @scala.inline
  implicit class WaveShaperOptionsOps[Self <: WaveShaperOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurveFloat32Array(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurve(value: js.Array[Double] | js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curve")(js.undefined)
        ret
    }
    @scala.inline
    def withOversample(value: OverSampleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oversample")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOversample: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oversample")(js.undefined)
        ret
    }
  }
  
}

