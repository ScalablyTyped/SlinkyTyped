package typingsSlinky.tensorflowTfjsCore.opsMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "gather")
@js.native
object gather extends js.Object {
  def apply[T /* <: Tensor[Rank] */](x: T, indices: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: T, indices: TensorLike, axis: Double): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: T, indices: Tensor[Rank]): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: T, indices: Tensor[Rank], axis: Double): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, indices: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, indices: TensorLike, axis: Double): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, indices: Tensor[Rank]): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, indices: Tensor[Rank], axis: Double): T = js.native
}

