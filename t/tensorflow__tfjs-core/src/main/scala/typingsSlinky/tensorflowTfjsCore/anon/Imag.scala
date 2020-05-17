package typingsSlinky.tensorflowTfjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Imag extends js.Object {
  var imag: js.typedarray.Float32Array = js.native
  var real: js.typedarray.Float32Array = js.native
}

object Imag {
  @scala.inline
  def apply(imag: js.typedarray.Float32Array, real: js.typedarray.Float32Array): Imag = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imag]
  }
  @scala.inline
  implicit class ImagOps[Self <: Imag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImag(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReal(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("real")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

