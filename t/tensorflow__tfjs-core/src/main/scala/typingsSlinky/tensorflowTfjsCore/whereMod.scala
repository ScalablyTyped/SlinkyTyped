package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/where", JSImport.Namespace)
@js.native
object whereMod extends js.Object {
  
  @js.native
  object where extends js.Object {
    
    def apply[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: T, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: T, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: TensorLike, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: TensorLike, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](condition: TensorLike, a: T, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](condition: TensorLike, a: T, b: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](condition: TensorLike, a: TensorLike, b: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](condition: TensorLike, a: TensorLike, b: TensorLike): T = js.native
  }
}
