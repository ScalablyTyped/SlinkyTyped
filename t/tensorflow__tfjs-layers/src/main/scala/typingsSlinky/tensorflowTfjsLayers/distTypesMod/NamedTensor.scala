package typingsSlinky.tensorflowTfjsLayers.distTypesMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedTensor extends js.Object {
  var name: String
  var tensor: Tensor_[Rank]
}

object NamedTensor {
  @scala.inline
  def apply(name: String, tensor: Tensor_[Rank]): NamedTensor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tensor = tensor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NamedTensor]
  }
}

