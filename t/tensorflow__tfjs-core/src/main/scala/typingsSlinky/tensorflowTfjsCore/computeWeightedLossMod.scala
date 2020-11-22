package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.lossOpsUtilsMod.Reduction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/losses/compute_weighted_loss", JSImport.Namespace)
@js.native
object computeWeightedLossMod extends js.Object {
  
  @js.native
  object computeWeightedLoss extends js.Object {
    
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T, weights: js.UndefOr[TensorLike], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: TensorLike): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: TensorLike, weights: js.UndefOr[TensorLike], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: TensorLike, weights: Tensor[Rank]): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: TensorLike, weights: Tensor[Rank], reduction: Reduction): O = js.native
    def apply[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](losses: TensorLike, weights: TensorLike): O = js.native
  }
}
