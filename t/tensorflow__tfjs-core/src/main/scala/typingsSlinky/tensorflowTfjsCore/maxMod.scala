package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/max", JSImport.Namespace)
@js.native
object maxMod extends js.Object {
  
  @js.native
  object max extends js.Object {
    
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
    def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = js.native
  }
}
