package typingsSlinky.tensorflowTfjsCore.mod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.RecursiveArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object losses {
  
  @JSImport("@tensorflow/tfjs-core", "losses.absoluteDifference")
  @js.native
  def absoluteDifference[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    predictions: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    reduction: js.UndefOr[typingsSlinky.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = js.native
  
  @JSImport("@tensorflow/tfjs-core", "losses.computeWeightedLoss")
  @js.native
  def computeWeightedLoss[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
    losses: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    reduction: js.UndefOr[typingsSlinky.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = js.native
  
  @JSImport("@tensorflow/tfjs-core", "losses.cosineDistance")
  @js.native
  def cosineDistance[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
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
      ]) | js.Array[js.typedarray.Uint8Array] | Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    reduction: js.UndefOr[typingsSlinky.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = js.native
  
  @JSImport("@tensorflow/tfjs-core", "losses.hingeLoss")
  @js.native
  def hingeLoss[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    predictions: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    reduction: js.UndefOr[typingsSlinky.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = js.native
  
  @JSImport("@tensorflow/tfjs-core", "losses.huberLoss")
  @js.native
  def huberLoss[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    predictions: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    delta: js.UndefOr[Double],
    reduction: js.UndefOr[typingsSlinky.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = js.native
  
  @JSImport("@tensorflow/tfjs-core", "losses.logLoss")
  @js.native
  def logLoss[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    predictions: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    epsilon: js.UndefOr[Double],
    reduction: js.UndefOr[typingsSlinky.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = js.native
  
  @JSImport("@tensorflow/tfjs-core", "losses.meanSquaredError")
  @js.native
  def meanSquaredError[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
    labels: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    predictions: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    reduction: js.UndefOr[typingsSlinky.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = js.native
  
  @JSImport("@tensorflow/tfjs-core", "losses.sigmoidCrossEntropy")
  @js.native
  def sigmoidCrossEntropy[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
    multiClassLabels: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    logits: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    labelSmoothing: js.UndefOr[Double],
    reduction: js.UndefOr[typingsSlinky.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = js.native
  
  @JSImport("@tensorflow/tfjs-core", "losses.softmaxCrossEntropy")
  @js.native
  def softmaxCrossEntropy[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, O /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
    onehotLabels: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    logits: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | T,
    weights: js.UndefOr[
      String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
        js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
      ]) | js.Array[js.typedarray.Uint8Array] | Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    labelSmoothing: js.UndefOr[Double],
    reduction: js.UndefOr[typingsSlinky.tensorflowTfjsCore.lossOpsUtilsMod.Reduction]
  ): O = js.native
}
