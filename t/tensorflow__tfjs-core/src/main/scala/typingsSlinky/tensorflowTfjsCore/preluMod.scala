package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/prelu", JSImport.Namespace)
@js.native
object preluMod extends js.Object {
  @js.native
  object prelu extends js.Object {
    def apply[T /* <: Tensor[Rank] */](x: T, alpha: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: T, alpha: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, alpha: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, alpha: TensorLike): T = js.native
  }
  
}

