package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeriodicWaveOptions extends PeriodicWaveConstraints {
  var imag: js.UndefOr[js.Array[Double] | js.typedarray.Float32Array] = js.native
  var real: js.UndefOr[js.Array[Double] | js.typedarray.Float32Array] = js.native
}

object PeriodicWaveOptions {
  @scala.inline
  def apply(): PeriodicWaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeriodicWaveOptions]
  }
  @scala.inline
  implicit class PeriodicWaveOptionsOps[Self <: PeriodicWaveOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImagFloat32Array(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImag(value: js.Array[Double] | js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imag")(js.undefined)
        ret
    }
    @scala.inline
    def withRealFloat32Array(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("real")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReal(value: js.Array[Double] | js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("real")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("real")(js.undefined)
        ret
    }
  }
  
}

