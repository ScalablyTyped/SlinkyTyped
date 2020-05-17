package typingsSlinky.tensorflowTfjsCore.anon

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grad[O /* <: Tensor[Rank] */, I /* <: Tensor[Rank] */] extends js.Object {
  var grad: I = js.native
  var value: O = js.native
}

object Grad {
  @scala.inline
  def apply[O, I](grad: I, value: O): Grad[O, I] = {
    val __obj = js.Dynamic.literal(grad = grad.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grad[O, I]]
  }
  @scala.inline
  implicit class GradOps[Self[o, i] <: Grad[o, i], O, I] (val x: Self[O, I]) extends AnyVal {
    @scala.inline
    def duplicate: Self[O, I] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[O, I]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[O, I]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[O, I]) with Other]
    @scala.inline
    def withGrad(value: I): Self[O, I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: O): Self[O, I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

