package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/split", JSImport.Namespace)
@js.native
object splitMod extends js.Object {
  
  @js.native
  object split extends js.Object {
    
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: js.Array[Double]): js.Array[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: Double): js.Array[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: Double, axis: Double): js.Array[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: js.Array[Double]): js.Array[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: Double): js.Array[T] = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: Double, axis: Double): js.Array[T] = js.native
  }
}
