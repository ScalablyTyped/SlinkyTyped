package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "logSoftmax")
@js.native
object logSoftmax extends js.Object {
  
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](logits: T): T = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](logits: T, axis: Double): T = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](logits: TensorLike): T = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](logits: TensorLike, axis: Double): T = js.native
}
