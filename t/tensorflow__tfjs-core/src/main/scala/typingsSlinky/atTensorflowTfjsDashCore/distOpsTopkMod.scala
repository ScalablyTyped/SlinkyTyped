package typingsSlinky.atTensorflowTfjsDashCore

import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/topk", JSImport.Namespace)
@js.native
object distOpsTopkMod extends js.Object {
  @js.native
  object topk extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T): Anon_Indices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, k: Double): Anon_Indices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, k: Double, sorted: Boolean): Anon_Indices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike): Anon_Indices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, k: Double): Anon_Indices[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, k: Double, sorted: Boolean): Anon_Indices[T] = js.native
  }
  
}

