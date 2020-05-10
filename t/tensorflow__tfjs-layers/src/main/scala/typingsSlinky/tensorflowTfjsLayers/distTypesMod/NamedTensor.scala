package typingsSlinky.tensorflowTfjsLayers.distTypesMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedTensor extends js.Object {
  var name: String = js.native
  var tensor: Tensor[Rank] = js.native
}

object NamedTensor {
  @scala.inline
  def apply(name: String, tensor: Tensor[Rank]): NamedTensor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tensor = tensor.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedTensor]
  }
  @scala.inline
  implicit class NamedTensorOps[Self <: NamedTensor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTensor(value: Tensor[Rank]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tensor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

