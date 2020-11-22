package typingsSlinky.tensorflowTfjsCore.opsForConverterMod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "split")
@js.native
object split extends js.Object {
  
  def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: js.Array[Double]): js.Array[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: Double): js.Array[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: Double, axis: Double): js.Array[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: js.Array[Double]): js.Array[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: Double): js.Array[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: Double, axis: Double): js.Array[T] = js.native
}
