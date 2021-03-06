package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.bilinear
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.nearest
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R1
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R2
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R3
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R4
import typingsSlinky.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object image {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.cropAndResize")
  @js.native
  def cropAndResize(
    image: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R4],
    boxes: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R2],
    boxInd: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R1],
    cropSize: js.Tuple2[Double, Double],
    method: js.UndefOr[nearest | bilinear],
    extrapolationValue: js.UndefOr[Double]
  ): Tensor[R4] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.flipLeftRight")
  @js.native
  def flipLeftRight(image: String): Tensor[R4] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.flipLeftRight")
  @js.native
  def flipLeftRight(image: js.Array[js.typedarray.Uint8Array]): Tensor[R4] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.flipLeftRight")
  @js.native
  def flipLeftRight(image: js.typedarray.Float32Array): Tensor[R4] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.flipLeftRight")
  @js.native
  def flipLeftRight(image: js.typedarray.Int32Array): Tensor[R4] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.flipLeftRight")
  @js.native
  def flipLeftRight(image: js.typedarray.Uint8Array): Tensor[R4] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.flipLeftRight")
  @js.native
  def flipLeftRight(image: Boolean): Tensor[R4] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.flipLeftRight")
  @js.native
  def flipLeftRight(image: Double): Tensor[R4] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.flipLeftRight")
  @js.native
  def flipLeftRight(image: Tensor[R4]): Tensor[R4] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.flipLeftRight")
  @js.native
  def flipLeftRight(
    image: RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]
  ): Tensor[R4] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.nonMaxSuppression")
  @js.native
  def nonMaxSuppression(
    boxes: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R2],
    scores: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double]
  ): Tensor[R1] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.nonMaxSuppressionAsync")
  @js.native
  def nonMaxSuppressionAsync(
    boxes: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R2],
    scores: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double]
  ): js.Promise[Tensor[R1]] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.nonMaxSuppressionPadded")
  @js.native
  def nonMaxSuppressionPadded(
    boxes: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R2],
    scores: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double],
    padToMaxOutputSize: js.UndefOr[Boolean]
  ): NamedTensorMap = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.nonMaxSuppressionPaddedAsync")
  @js.native
  def nonMaxSuppressionPaddedAsync(
    boxes: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R2],
    scores: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double],
    padToMaxOutputSize: js.UndefOr[Boolean]
  ): js.Promise[NamedTensorMap] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.nonMaxSuppressionWithScore")
  @js.native
  def nonMaxSuppressionWithScore(
    boxes: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R2],
    scores: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double],
    softNmsSigma: js.UndefOr[Double]
  ): NamedTensorMap = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.nonMaxSuppressionWithScoreAsync")
  @js.native
  def nonMaxSuppressionWithScoreAsync(
    boxes: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R2],
    scores: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R1],
    maxOutputSize: Double,
    iouThreshold: js.UndefOr[Double],
    scoreThreshold: js.UndefOr[Double],
    softNmsSigma: js.UndefOr[Double]
  ): js.Promise[NamedTensorMap] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeBilinear")
  @js.native
  def resizeBilinear(images: Tensor[R3 | R4], size: js.Tuple2[Double, Double]): Tensor[R3] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeBilinear")
  @js.native
  def resizeBilinear(images: Tensor[R3 | R4], size: js.Tuple2[Double, Double], alignCorners: Boolean): Tensor[R3] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.Array[js.typedarray.Uint8Array], size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.Array[js.typedarray.Uint8Array], size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Float32Array, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Float32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Int32Array, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Int32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Uint8Array, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Uint8Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ],
    size: js.Tuple2[Double, Double]
  ): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeBilinear")
  @js.native
  def resizeBilinear[T /* <: Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ],
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor(images: Tensor[R3 | R4], size: js.Tuple2[Double, Double]): Tensor[R3] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor(images: Tensor[R3 | R4], size: js.Tuple2[Double, Double], alignCorners: Boolean): Tensor[R3] = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.Array[js.typedarray.Uint8Array], size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.Array[js.typedarray.Uint8Array], size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Float32Array, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Float32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Int32Array, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Int32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Uint8Array, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Uint8Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double]): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ],
    size: js.Tuple2[Double, Double]
  ): T = js.native
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.resizeNearestNeighbor")
  @js.native
  def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](
    images: RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ],
    size: js.Tuple2[Double, Double],
    alignCorners: Boolean
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "image.rotateWithOffset")
  @js.native
  def rotateWithOffset(
    image: String | Double | Boolean | js.typedarray.Uint8Array | js.typedarray.Int32Array | js.typedarray.Float32Array | (RecursiveArray[
      js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
    ]) | js.Array[js.typedarray.Uint8Array] | Tensor[R4],
    radians: Double,
    fillValue: js.UndefOr[Double | (js.Tuple3[Double, Double, Double])],
    center: js.UndefOr[Double | (js.Tuple2[Double, Double])]
  ): Tensor[R4] = js.native
}
