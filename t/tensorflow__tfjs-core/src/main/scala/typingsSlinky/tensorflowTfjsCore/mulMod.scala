package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/mul", JSImport.Namespace)
@js.native
object mulMod extends js.Object {
  
  @js.native
  object mul extends js.Object {
    
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  }
}
