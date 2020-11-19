package typingsSlinky.tensorflowTfjsCore.opsMod

import typingsSlinky.tensorflowTfjsCore.anon.Indices
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "topk")
@js.native
object topk extends js.Object {
  
  def apply[T /* <: Tensor[Rank] */](x: T): Indices[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: T, k: js.UndefOr[scala.Nothing], sorted: Boolean): Indices[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: T, k: Double): Indices[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: T, k: Double, sorted: Boolean): Indices[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike): Indices[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, k: js.UndefOr[scala.Nothing], sorted: Boolean): Indices[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, k: Double): Indices[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, k: Double, sorted: Boolean): Indices[T] = js.native
}
