package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/in_top_k", JSImport.Namespace)
@js.native
object inTopKMod extends js.Object {
  @js.native
  object inTopKAsync extends js.Object {
    def apply[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T, targets: U): js.Promise[U] = js.native
    def apply[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T, targets: U, k: Double): js.Promise[U] = js.native
    def apply[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T, targets: TensorLike): js.Promise[U] = js.native
    def apply[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T, targets: TensorLike, k: Double): js.Promise[U] = js.native
    def apply[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: TensorLike, targets: U): js.Promise[U] = js.native
    def apply[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: TensorLike, targets: U, k: Double): js.Promise[U] = js.native
    def apply[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: TensorLike, targets: TensorLike): js.Promise[U] = js.native
    def apply[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: TensorLike, targets: TensorLike, k: Double): js.Promise[U] = js.native
  }
  
}

