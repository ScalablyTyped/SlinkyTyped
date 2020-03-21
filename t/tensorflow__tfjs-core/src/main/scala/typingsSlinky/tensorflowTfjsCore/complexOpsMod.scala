package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/complex_ops", JSImport.Namespace)
@js.native
object complexOpsMod extends js.Object {
  @js.native
  object complex extends js.Object {
    def apply[T /* <: Tensor[Rank] */](real: T, imag: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](real: T, imag: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](real: TensorLike, imag: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](real: TensorLike, imag: TensorLike): T = js.native
  }
  
  @js.native
  object imag extends js.Object {
    def apply[T /* <: Tensor[Rank] */](input: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](input: TensorLike): T = js.native
  }
  
  @js.native
  object real extends js.Object {
    def apply[T /* <: Tensor[Rank] */](input: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](input: TensorLike): T = js.native
  }
  
}

