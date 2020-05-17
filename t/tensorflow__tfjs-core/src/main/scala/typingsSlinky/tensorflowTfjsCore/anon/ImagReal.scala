package typingsSlinky.tensorflowTfjsCore.anon

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagReal extends js.Object {
  var imag: Tensor[Rank] = js.native
  var real: Tensor[Rank] = js.native
}

object ImagReal {
  @scala.inline
  def apply(imag: Tensor[Rank], real: Tensor[Rank]): ImagReal = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagReal]
  }
  @scala.inline
  implicit class ImagRealOps[Self <: ImagReal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImag(value: Tensor[Rank]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReal(value: Tensor[Rank]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("real")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

