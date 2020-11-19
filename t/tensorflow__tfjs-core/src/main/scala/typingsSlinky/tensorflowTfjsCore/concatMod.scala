package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/concat", JSImport.Namespace)
@js.native
object concatMod extends js.Object {
  
  @js.native
  object concat extends js.Object {
    
    def apply[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): T = js.native
    def apply[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike], axis: Double): T = js.native
  }
}
