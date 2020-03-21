package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "inTopKAsync")
@js.native
object inTopKAsync extends js.Object {
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: T, targets: U): js.Promise[U] = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: T, targets: U, k: Double): js.Promise[U] = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: T, targets: TensorLike): js.Promise[U] = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: T, targets: TensorLike, k: Double): js.Promise[U] = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: TensorLike, targets: U): js.Promise[U] = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: TensorLike, targets: U, k: Double): js.Promise[U] = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: TensorLike, targets: TensorLike): js.Promise[U] = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: TensorLike, targets: TensorLike, k: Double): js.Promise[U] = js.native
}

