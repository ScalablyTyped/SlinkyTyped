package typingsSlinky.atTensorflowTfjsDashCore.distOpsOpsMod

import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "softmax")
@js.native
object softmax extends js.Object {
  def apply[T /* <: Tensor[Rank] */](logits: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](logits: T, dim: Double): T = js.native
  def apply[T /* <: Tensor[Rank] */](logits: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](logits: TensorLike, dim: Double): T = js.native
}

