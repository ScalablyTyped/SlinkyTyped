package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "expandDims")
@js.native
object expandDims extends js.Object {
  def apply[R2 /* <: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank */](x: TensorLike): Tensor[R2] = js.native
  def apply[R2 /* <: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank */](x: TensorLike, axis: Double): Tensor[R2] = js.native
  def apply[R2 /* <: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank */](x: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]): Tensor[R2] = js.native
  def apply[R2 /* <: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank */](x: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], axis: Double): Tensor[R2] = js.native
}

