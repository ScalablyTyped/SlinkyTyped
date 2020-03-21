package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "losses")
@js.native
object losses extends js.Object {
  @js.native
  object Reduction extends js.Object {
    /* 1 */ val MEAN: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction.MEAN with Double = js.native
    /* 0 */ val NONE: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction.NONE with Double = js.native
    /* 2 */ val SUM: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction.SUM with Double = js.native
    /* 3 */ val SUM_BY_NONZERO_WEIGHTS: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction.SUM_BY_NONZERO_WEIGHTS with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction with Double] = js.native
  }
  
  @js.native
  object absoluteDifference extends js.Object {
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: TensorLike,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: T, weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: TensorLike,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: T): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: TensorLike,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: TensorLike,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
  }
  
  @js.native
  object computeWeightedLoss extends js.Object {
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](losses: T): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](losses: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](losses: T, weights: TensorLike, reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](losses: T, weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      losses: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](losses: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](losses: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      losses: TensorLike,
      weights: TensorLike,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](losses: TensorLike, weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      losses: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
  }
  
  @js.native
  object cosineDistance extends js.Object {
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: T, axis: Double): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: T, axis: Double, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      axis: Double,
      weights: TensorLike,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      axis: Double,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      axis: Double,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: TensorLike, axis: Double): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: TensorLike, axis: Double, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: TensorLike,
      axis: Double,
      weights: TensorLike,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: TensorLike,
      axis: Double,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: TensorLike,
      axis: Double,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: T, axis: Double): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: T, axis: Double, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: T,
      axis: Double,
      weights: TensorLike,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: T,
      axis: Double,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: T,
      axis: Double,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: TensorLike, axis: Double): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: TensorLike, axis: Double, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      axis: Double,
      weights: TensorLike,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      axis: Double,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      axis: Double,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
  }
  
  @js.native
  object hingeLoss extends js.Object {
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: TensorLike,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: T, weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: TensorLike,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: T): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: TensorLike,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: TensorLike,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
  }
  
  @js.native
  object huberLoss extends js.Object {
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: T, weights: TensorLike, delta: Double): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: TensorLike,
      delta: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: T, weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      delta: Double
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      delta: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: TensorLike, weights: TensorLike, delta: Double): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: TensorLike,
      delta: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      delta: Double
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      delta: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: T): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: T, weights: TensorLike, delta: Double): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: TensorLike,
      delta: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      delta: Double
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      delta: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike, delta: Double): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: TensorLike,
      delta: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      delta: Double
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      delta: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
  }
  
  @js.native
  object logLoss extends js.Object {
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: T, weights: TensorLike, epsilon: Double): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: TensorLike,
      epsilon: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: T, weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      epsilon: Double
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      epsilon: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: TensorLike, weights: TensorLike, epsilon: Double): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: TensorLike,
      epsilon: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      epsilon: Double
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      epsilon: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: T): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: T, weights: TensorLike, epsilon: Double): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: TensorLike,
      epsilon: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      epsilon: Double
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      epsilon: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike, epsilon: Double): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: TensorLike,
      epsilon: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      epsilon: Double
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      epsilon: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
  }
  
  @js.native
  object meanSquaredError extends js.Object {
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: T): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: TensorLike,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: T, weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: T, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: TensorLike,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: T,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: T): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: TensorLike,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](labels: TensorLike, predictions: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: TensorLike,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      labels: TensorLike,
      predictions: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
  }
  
  @js.native
  object sigmoidCrossEntropy extends js.Object {
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](multiClassLabels: T, logits: T): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](multiClassLabels: T, logits: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](multiClassLabels: T, logits: T, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      multiClassLabels: T,
      logits: T,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      multiClassLabels: T,
      logits: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      multiClassLabels: T,
      logits: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      labelSmoothing: Double
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      multiClassLabels: T,
      logits: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      labelSmoothing: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](multiClassLabels: T, logits: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](multiClassLabels: T, logits: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](multiClassLabels: T, logits: TensorLike, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      multiClassLabels: T,
      logits: TensorLike,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      multiClassLabels: T,
      logits: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      multiClassLabels: T,
      logits: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      labelSmoothing: Double
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      multiClassLabels: T,
      logits: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      labelSmoothing: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](multiClassLabels: TensorLike, logits: T): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](multiClassLabels: TensorLike, logits: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](multiClassLabels: TensorLike, logits: T, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      multiClassLabels: TensorLike,
      logits: T,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      multiClassLabels: TensorLike,
      logits: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      multiClassLabels: TensorLike,
      logits: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      labelSmoothing: Double
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      multiClassLabels: TensorLike,
      logits: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      labelSmoothing: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](multiClassLabels: TensorLike, logits: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](multiClassLabels: TensorLike, logits: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](multiClassLabels: TensorLike, logits: TensorLike, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      multiClassLabels: TensorLike,
      logits: TensorLike,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      multiClassLabels: TensorLike,
      logits: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      multiClassLabels: TensorLike,
      logits: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      labelSmoothing: Double
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      multiClassLabels: TensorLike,
      logits: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      labelSmoothing: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
  }
  
  @js.native
  object softmaxCrossEntropy extends js.Object {
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](onehotLabels: T, logits: T): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](onehotLabels: T, logits: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](onehotLabels: T, logits: T, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      onehotLabels: T,
      logits: T,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](onehotLabels: T, logits: T, weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      onehotLabels: T,
      logits: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      labelSmoothing: Double
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      onehotLabels: T,
      logits: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      labelSmoothing: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](onehotLabels: T, logits: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](onehotLabels: T, logits: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](onehotLabels: T, logits: TensorLike, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      onehotLabels: T,
      logits: TensorLike,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      onehotLabels: T,
      logits: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      onehotLabels: T,
      logits: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      labelSmoothing: Double
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      onehotLabels: T,
      logits: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      labelSmoothing: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](onehotLabels: TensorLike, logits: T): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](onehotLabels: TensorLike, logits: T, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](onehotLabels: TensorLike, logits: T, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      onehotLabels: TensorLike,
      logits: T,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      onehotLabels: TensorLike,
      logits: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      onehotLabels: TensorLike,
      logits: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      labelSmoothing: Double
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      onehotLabels: TensorLike,
      logits: T,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      labelSmoothing: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](onehotLabels: TensorLike, logits: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](onehotLabels: TensorLike, logits: TensorLike, weights: TensorLike): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](onehotLabels: TensorLike, logits: TensorLike, weights: TensorLike, labelSmoothing: Double): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      onehotLabels: TensorLike,
      logits: TensorLike,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      onehotLabels: TensorLike,
      logits: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      onehotLabels: TensorLike,
      logits: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      labelSmoothing: Double
    ): O = js.native
    def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
      onehotLabels: TensorLike,
      logits: TensorLike,
      weights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      labelSmoothing: Double,
      reduction: typingsSlinky.tensorflowTfjsCore.lossOpsMod.Reduction
    ): O = js.native
  }
  
}

