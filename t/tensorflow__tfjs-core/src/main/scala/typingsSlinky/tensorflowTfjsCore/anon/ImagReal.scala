package typingsSlinky.tensorflowTfjsCore.anon

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagReal extends js.Object {
  var imag: Tensor[Rank]
  var real: Tensor[Rank]
}

object ImagReal {
  @scala.inline
  def apply(imag: Tensor[Rank], real: Tensor[Rank]): ImagReal = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagReal]
  }
}

