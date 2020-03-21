package typingsSlinky.tensorflowTfjsCore.opsMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "mean")
@js.native
object mean extends js.Object {
  def apply[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
}

