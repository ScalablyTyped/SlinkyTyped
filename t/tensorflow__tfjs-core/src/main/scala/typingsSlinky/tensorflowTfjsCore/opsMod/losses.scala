package typingsSlinky.tensorflowTfjsCore.opsMod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typingsSlinky.tensorflowTfjsCore.lossOpsUtilsMod.Reduction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "losses")
@js.native
object losses extends js.Object {
  
  def absoluteDifference[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    predictions: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | Tensor[Rank]
    ],
    reduction: js.UndefOr[Reduction]
  ): O = js.native
  
  def computeWeightedLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    losses: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | Tensor[Rank]
    ],
    reduction: js.UndefOr[Reduction]
  ): O = js.native
  
  def cosineDistance[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    predictions: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    axis: Double,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | Tensor[Rank]
    ],
    reduction: js.UndefOr[Reduction]
  ): O = js.native
  
  def hingeLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    predictions: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | Tensor[Rank]
    ],
    reduction: js.UndefOr[Reduction]
  ): O = js.native
  
  def huberLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    predictions: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | Tensor[Rank]
    ],
    delta: js.UndefOr[Double],
    reduction: js.UndefOr[Reduction]
  ): O = js.native
  
  def logLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    predictions: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | Tensor[Rank]
    ],
    epsilon: js.UndefOr[Double],
    reduction: js.UndefOr[Reduction]
  ): O = js.native
  
  def meanSquaredError[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    labels: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    predictions: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | Tensor[Rank]
    ],
    reduction: js.UndefOr[Reduction]
  ): O = js.native
  
  def sigmoidCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    multiClassLabels: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    logits: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | Tensor[Rank]
    ],
    labelSmoothing: js.UndefOr[Double],
    reduction: js.UndefOr[Reduction]
  ): O = js.native
  
  def softmaxCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
    onehotLabels: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    logits: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | Tensor[Rank]
    ],
    labelSmoothing: js.UndefOr[Double],
    reduction: js.UndefOr[Reduction]
  ): O = js.native
}
