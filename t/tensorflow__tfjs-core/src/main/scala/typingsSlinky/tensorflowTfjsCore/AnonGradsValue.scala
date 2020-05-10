package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGradsValue[O /* <: Tensor[Rank] */] extends js.Object {
  var grads: js.Array[Tensor[Rank]] = js.native
  var value: O = js.native
}

object AnonGradsValue {
  @scala.inline
  def apply[O](grads: js.Array[Tensor[Rank]], value: O): AnonGradsValue[O] = {
    val __obj = js.Dynamic.literal(grads = grads.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGradsValue[O]]
  }
  @scala.inline
  implicit class AnonGradsValueOps[Self[o] <: AnonGradsValue[o], O] (val x: Self[O]) extends AnyVal {
    @scala.inline
    def duplicate: Self[O] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[O]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[O] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[O] with Other]
    @scala.inline
    def withGrads(value: js.Array[Tensor[Rank]]): Self[O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: O): Self[O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

