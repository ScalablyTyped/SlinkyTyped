package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaveShaperOptions extends AudioNodeOptions {
  var curve: js.UndefOr[js.Array[Double] | js.typedarray.Float32Array] = js.undefined
  var oversample: js.UndefOr[OverSampleType] = js.undefined
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurveFloat32Array(value: js.typedarray.Float32Array): Self = this.set("curve", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurve(value: js.Array[Double] | js.typedarray.Float32Array): Self = this.set("curve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurve: Self = this.set("curve", js.undefined)
    @scala.inline
    def setOversample(value: OverSampleType): Self = this.set("oversample", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOversample: Self = this.set("oversample", js.undefined)
  }
  
}

