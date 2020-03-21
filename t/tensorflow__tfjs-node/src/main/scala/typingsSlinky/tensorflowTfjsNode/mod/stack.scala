package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "stack")
@js.native
object stack extends js.Object {
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](tensors: js.Array[T | TensorLike]): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](tensors: js.Array[T | TensorLike], axis: Double): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
}

