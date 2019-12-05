package typingsSlinky.atTensorflowTfjsDashCore.distOpsOpsMod

import typingsSlinky.atTensorflowTfjsDashCore.Anon_Indices
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "topk")
@js.native
object topk extends js.Object {
  def apply[T /* <: Tensor[Rank] */](x: T): Anon_Indices[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: T, k: Double): Anon_Indices[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: T, k: Double, sorted: Boolean): Anon_Indices[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike): Anon_Indices[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, k: Double): Anon_Indices[T] = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, k: Double, sorted: Boolean): Anon_Indices[T] = js.native
}

