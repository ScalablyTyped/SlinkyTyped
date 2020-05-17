package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "batchNorm")
@js.native
object batchNorm extends js.Object {
  def apply[R /* <: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank */](
    x: Tensor[R] | TensorLike,
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    offset: Tensor[R] | Tensor1D | TensorLike
  ): Tensor[R] = js.native
  def apply[R /* <: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank */](
    x: Tensor[R] | TensorLike,
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    offset: Tensor[R] | Tensor1D | TensorLike,
    scale: Tensor[R] | Tensor1D | TensorLike
  ): Tensor[R] = js.native
  def apply[R /* <: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank */](
    x: Tensor[R] | TensorLike,
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    offset: Tensor[R] | Tensor1D | TensorLike,
    scale: Tensor[R] | Tensor1D | TensorLike,
    varianceEpsilon: Double
  ): Tensor[R] = js.native
  def apply[R /* <: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank */](x: TensorLike, mean: Tensor[R] | Tensor1D, variance: Tensor[R] | Tensor1D): Tensor[R] = js.native
  def apply[R /* <: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank */](x: TensorLike, mean: Tensor[R] | Tensor1D, variance: TensorLike): Tensor[R] = js.native
  def apply[R /* <: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank */](x: TensorLike, mean: TensorLike, variance: Tensor[R] | Tensor1D): Tensor[R] = js.native
  def apply[R /* <: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank */](x: TensorLike, mean: TensorLike, variance: TensorLike): Tensor[R] = js.native
  def apply[R /* <: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank */](x: Tensor[R], mean: Tensor[R] | Tensor1D, variance: Tensor[R] | Tensor1D): Tensor[R] = js.native
  def apply[R /* <: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank */](x: Tensor[R], mean: Tensor[R] | Tensor1D, variance: TensorLike): Tensor[R] = js.native
  def apply[R /* <: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank */](x: Tensor[R], mean: TensorLike, variance: Tensor[R] | Tensor1D): Tensor[R] = js.native
  def apply[R /* <: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank */](x: Tensor[R], mean: TensorLike, variance: TensorLike): Tensor[R] = js.native
}

