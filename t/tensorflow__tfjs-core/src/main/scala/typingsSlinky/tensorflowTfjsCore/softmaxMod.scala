package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/softmax", JSImport.Namespace)
@js.native
object softmaxMod extends js.Object {
  
  @js.native
  object softmax extends js.Object {
    
    def apply[T /* <: Tensor[Rank] */](logits: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](logits: T, dim: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](logits: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](logits: TensorLike, dim: Double): T = js.native
  }
}
