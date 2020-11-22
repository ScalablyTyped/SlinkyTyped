package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.lossOpsUtilsMod.Reduction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/losses/hinge_loss", JSImport.Namespace)
@js.native
object hingeLossMod extends js.Object {
  
  @js.native
  object hingeLoss extends js.Object {
    
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: js.UndefOr[TensorLike], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: js.UndefOr[TensorLike], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: js.UndefOr[TensorLike], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: js.UndefOr[TensorLike], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike): O = js.native
  }
}
