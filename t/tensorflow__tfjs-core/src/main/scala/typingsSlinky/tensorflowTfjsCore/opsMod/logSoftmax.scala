package typingsSlinky.tensorflowTfjsCore.opsMod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "logSoftmax")
@js.native
object logSoftmax extends js.Object {
  
  def apply[T /* <: Tensor[Rank] */](logits: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](logits: T, axis: Double): T = js.native
  def apply[T /* <: Tensor[Rank] */](logits: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](logits: TensorLike, axis: Double): T = js.native
}
