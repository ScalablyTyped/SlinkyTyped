package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/logical_and", JSImport.Namespace)
@js.native
object logicalAndMod extends js.Object {
  
  @js.native
  object logicalAnd extends js.Object {
    
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  }
}
