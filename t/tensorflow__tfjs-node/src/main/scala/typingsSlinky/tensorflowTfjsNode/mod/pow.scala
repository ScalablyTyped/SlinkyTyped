package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "pow")
@js.native
object pow extends js.Object {
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](base: TensorLike, exp: TensorLike): T = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](base: TensorLike, exp: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]): T = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](base: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], exp: TensorLike): T = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
    base: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    exp: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): T = js.native
}

