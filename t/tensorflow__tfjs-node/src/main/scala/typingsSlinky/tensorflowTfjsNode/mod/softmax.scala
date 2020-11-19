package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "softmax")
@js.native
object softmax extends js.Object {
  
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](logits: T): T = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](logits: T, dim: Double): T = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](logits: TensorLike): T = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](logits: TensorLike, dim: Double): T = js.native
}
