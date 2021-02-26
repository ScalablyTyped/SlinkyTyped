package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.anon.Indices
import typingsSlinky.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typingsSlinky.tensorflowTfjsCore.distTypesMod.BackendValues
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataValues
import typingsSlinky.tensorflowTfjsCore.distTypesMod.NumericDataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R0
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R1
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R2
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R3
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R4
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R5
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R6
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike1D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike3D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike4D
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCW
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NWC
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.avg
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.euclidean
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.fro
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.max
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reflect
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.symmetric
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTensorMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor", "Tensor")
  @js.native
  class Tensor[R /* <: Rank */] protected () extends StObject {
    def this(
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      dtype: DataType,
      dataId: DataId,
      id: Double
    ) = this()
    
    def abs[T /* <: Tensor[Rank] */](): T = js.native
    
    def acos[T /* <: Tensor[Rank] */](): T = js.native
    
    def acosh[T /* <: Tensor[Rank] */](): T = js.native
    
    def add[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def add[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def addStrict[T /* <: Tensor[Rank] */](x: T): T = js.native
    def addStrict[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    
    def all[T /* <: Tensor[Rank] */](): T = js.native
    def all[T /* <: Tensor[Rank] */](axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
    def all[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
    def all[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
    def all[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    def all[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
    
    def any[T /* <: Tensor[Rank] */](): T = js.native
    def any[T /* <: Tensor[Rank] */](axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
    def any[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
    def any[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
    def any[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    def any[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
    
    def argMax[T /* <: Tensor[Rank] */](): T = js.native
    def argMax[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    
    def argMin[T /* <: Tensor[Rank] */](): T = js.native
    def argMin[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    
    /**
      * Returns the tensor data as a nested array. The transfer of data is done
      * asynchronously.
      *
      * @doc {heading: 'Tensors', subheading: 'Classes'}
      */
    def array(): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ArrayMap[R] */ js.Any
      ] = js.native
    
    /**
      * Returns the tensor data as a nested array. The transfer of data is done
      * synchronously.
      *
      * @doc {heading: 'Tensors', subheading: 'Classes'}
      */
    def arraySync(): /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ArrayMap[R] */ js.Any = js.native
    
    def as1D[T /* <: Tensor[Rank] */](): Tensor1D = js.native
    
    def as2D[T /* <: Tensor[Rank] */](rows: Double, columns: Double): Tensor2D = js.native
    
    def as3D[T /* <: Tensor[Rank] */](rows: Double, columns: Double, depth: Double): Tensor3D = js.native
    
    def as4D[T /* <: Tensor[Rank] */](rows: Double, columns: Double, depth: Double, depth2: Double): Tensor4D = js.native
    
    def as5D[T /* <: Tensor[Rank] */](rows: Double, columns: Double, depth: Double, depth2: Double, depth3: Double): Tensor5D = js.native
    
    def asScalar[T /* <: Tensor[Rank] */](): Scalar = js.native
    
    def asType[T /* <: Tensor[Rank] */](dtype: DataType): T = js.native
    
    def asin[T /* <: Tensor[Rank] */](): T = js.native
    
    def asinh[T /* <: Tensor[Rank] */](): T = js.native
    
    def atan[T /* <: Tensor[Rank] */](): T = js.native
    
    def atan2[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def atan2[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def atanh[T /* <: Tensor[Rank] */](): T = js.native
    
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double], pad: Double): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: same_,
      dimRoundingMode: ceil
    ): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: same_,
      dimRoundingMode: floor
    ): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: same_,
      dimRoundingMode: round
    ): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: valid_,
      dimRoundingMode: ceil
    ): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: valid_,
      dimRoundingMode: floor
    ): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: valid_,
      dimRoundingMode: round
    ): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: same_, dimRoundingMode: ceil): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: same_, dimRoundingMode: floor): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: same_, dimRoundingMode: round): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: valid_, dimRoundingMode: ceil): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: valid_, dimRoundingMode: floor): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: valid_, dimRoundingMode: round): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: same_, dimRoundingMode: ceil): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: same_, dimRoundingMode: floor): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: same_, dimRoundingMode: round): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: valid_, dimRoundingMode: ceil): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: valid_, dimRoundingMode: floor): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: valid_, dimRoundingMode: round): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: Double): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: same_, dimRoundingMode: ceil): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: same_, dimRoundingMode: floor): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: same_, dimRoundingMode: round): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: valid_, dimRoundingMode: ceil): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: valid_, dimRoundingMode: floor): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: valid_, dimRoundingMode: round): T = js.native
    @JSName("avgPool")
    def avgPool_ceil[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: Double,
      dimRoundingMode: ceil
    ): T = js.native
    @JSName("avgPool")
    def avgPool_ceil[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double, dimRoundingMode: ceil): T = js.native
    @JSName("avgPool")
    def avgPool_ceil[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double, dimRoundingMode: ceil): T = js.native
    @JSName("avgPool")
    def avgPool_ceil[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: Double, dimRoundingMode: ceil): T = js.native
    @JSName("avgPool")
    def avgPool_floor[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: Double,
      dimRoundingMode: floor
    ): T = js.native
    @JSName("avgPool")
    def avgPool_floor[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double, dimRoundingMode: floor): T = js.native
    @JSName("avgPool")
    def avgPool_floor[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double, dimRoundingMode: floor): T = js.native
    @JSName("avgPool")
    def avgPool_floor[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: Double, dimRoundingMode: floor): T = js.native
    @JSName("avgPool")
    def avgPool_round[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: Double,
      dimRoundingMode: round
    ): T = js.native
    @JSName("avgPool")
    def avgPool_round[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double, dimRoundingMode: round): T = js.native
    @JSName("avgPool")
    def avgPool_round[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double, dimRoundingMode: round): T = js.native
    @JSName("avgPool")
    def avgPool_round[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: Double, dimRoundingMode: round): T = js.native
    @JSName("avgPool")
    def avgPool_same[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double], pad: same_): T = js.native
    @JSName("avgPool")
    def avgPool_same[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: same_): T = js.native
    @JSName("avgPool")
    def avgPool_same[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: same_): T = js.native
    @JSName("avgPool")
    def avgPool_same[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: same_): T = js.native
    @JSName("avgPool")
    def avgPool_valid[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double], pad: valid_): T = js.native
    @JSName("avgPool")
    def avgPool_valid[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: valid_): T = js.native
    @JSName("avgPool")
    def avgPool_valid[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: valid_): T = js.native
    @JSName("avgPool")
    def avgPool_valid[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: valid_): T = js.native
    
    def batchNorm[T /* <: Tensor[Rank] */](
      mean: Tensor[R] | Tensor1D | TensorLike,
      variance: Tensor[R] | Tensor1D | TensorLike,
      offset: js.UndefOr[Tensor[R] | Tensor1D | TensorLike],
      scale: js.UndefOr[Tensor[R] | Tensor1D | TensorLike],
      varianceEpsilon: js.UndefOr[Double]
    ): Tensor[R] = js.native
    
    def batchToSpaceND[R /* <: Rank */](blockShape: js.Array[Double], crops: js.Array[js.Array[Double]]): Tensor[R] = js.native
    
    def broadcastTo[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
    ): Tensor[R] = js.native
    
    /**
      * Returns a promise of `tf.TensorBuffer` that holds the underlying data.
      *
      * @doc {heading: 'Tensors', subheading: 'Classes'}
      */
    def buffer(): js.Promise[TensorBuffer[R, float32]] = js.native
    
    /**
      * Returns a `tf.TensorBuffer` that holds the underlying data.
      * @doc {heading: 'Tensors', subheading: 'Classes'}
      */
    def bufferSync(): TensorBuffer[R, float32] = js.native
    
    /** Returns the underlying bytes of the tensor's data. */
    def bytes(): js.Promise[js.Array[js.typedarray.Uint8Array] | js.typedarray.Uint8Array] = js.native
    
    def cast[T /* <: Tensor[Rank] */](dtype: DataType): T = js.native
    
    def ceil[T /* <: Tensor[Rank] */](): T = js.native
    
    def clipByValue[T /* <: Tensor[Rank] */](min: Double, max: Double): Tensor[Rank] = js.native
    
    def concat[T /* <: Tensor[Rank] */](tensors: T): T = js.native
    def concat[T /* <: Tensor[Rank] */](tensors: T, axis: Double): T = js.native
    def concat[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): T = js.native
    def concat[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike], axis: Double): T = js.native
    
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: Tensor3D | TensorLike3D,
      stride: Double,
      pad: valid_ | same_ | Double | ExplicitPadding,
      dataFormat: js.UndefOr[NWC | NCW],
      dilation: js.UndefOr[Double],
      dimRoundingMode: js.UndefOr[floor | round | ceil]
    ): T = js.native
    
    def conv2d[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor4D | TensorLike4D,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dataFormat: js.UndefOr[NHWC | NCHW],
      dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
      dimRoundingMode: js.UndefOr[floor | round | ceil]
    ): T = js.native
    
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor4D | TensorLike4D,
      outputShape: (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple3[Double, Double, Double]),
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dimRoundingMode: js.UndefOr[floor | round | ceil]
    ): T = js.native
    
    def cos[T /* <: Tensor[Rank] */](): T = js.native
    
    def cosh[T /* <: Tensor[Rank] */](): T = js.native
    
    def cumsum[R /* <: Rank */](): Tensor[R] = js.native
    def cumsum[R /* <: Rank */](axis: js.UndefOr[scala.Nothing], exclusive: js.UndefOr[scala.Nothing], reverse: Boolean): Tensor[R] = js.native
    def cumsum[R /* <: Rank */](axis: js.UndefOr[scala.Nothing], exclusive: Boolean): Tensor[R] = js.native
    def cumsum[R /* <: Rank */](axis: js.UndefOr[scala.Nothing], exclusive: Boolean, reverse: Boolean): Tensor[R] = js.native
    def cumsum[R /* <: Rank */](axis: Double): Tensor[R] = js.native
    def cumsum[R /* <: Rank */](axis: Double, exclusive: js.UndefOr[scala.Nothing], reverse: Boolean): Tensor[R] = js.native
    def cumsum[R /* <: Rank */](axis: Double, exclusive: Boolean): Tensor[R] = js.native
    def cumsum[R /* <: Rank */](axis: Double, exclusive: Boolean, reverse: Boolean): Tensor[R] = js.native
    
    /**
      * Asynchronously downloads the values from the `tf.Tensor`. Returns a
      * promise of `TypedArray` that resolves when the computation has finished.
      *
      * @doc {heading: 'Tensors', subheading: 'Classes'}
      */
    def data(): js.Promise[js.typedarray.Float32Array] = js.native
    
    /**
      * Id of the bucket holding the data for this tensor. Multiple arrays can
      * point to the same bucket (e.g. when calling array.reshape()).
      */
    var dataId: DataId = js.native
    
    def dataSync(): js.typedarray.Int32Array = js.native
    @JSName("dataSync")
    def dataSync_Array(): js.Array[String] = js.native
    /**
      * Synchronously downloads the values from the `tf.Tensor`. This blocks the
      * UI thread until the values are ready, which can cause performance issues.
      *
      * @doc {heading: 'Tensors', subheading: 'Classes'}
      */
    @JSName("dataSync")
    def dataSync_Float32Array(): js.typedarray.Float32Array = js.native
    @JSName("dataSync")
    def dataSync_Uint8Array(): js.typedarray.Uint8Array = js.native
    
    @JSName("depthToSpace")
    def depthToSpace_NCHW[T /* <: Tensor4D */](blockSize: Double, dataFormat: NCHW): T = js.native
    @JSName("depthToSpace")
    def depthToSpace_NHWC[T /* <: Tensor4D */](blockSize: Double, dataFormat: NHWC): T = js.native
    
    def depthwiseConv2D[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor4D | TensorLike4D,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dataFormat: js.UndefOr[NHWC | NCHW],
      dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
      dimRoundingMode: js.UndefOr[floor | round | ceil]
    ): T = js.native
    
    def depthwiseConv2d[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor4D | TensorLike4D,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dataFormat: js.UndefOr[NHWC | NCHW],
      dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
      dimRoundingMode: js.UndefOr[floor | round | ceil]
    ): T = js.native
    
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor3D,
      strides: js.Tuple2[Double, Double],
      pad: same_,
      dilations: js.UndefOr[scala.Nothing],
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor3D,
      strides: js.Tuple2[Double, Double],
      pad: same_,
      dilations: js.Tuple2[Double, Double],
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor3D,
      strides: js.Tuple2[Double, Double],
      pad: same_,
      dilations: Double,
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor3D,
      strides: js.Tuple2[Double, Double],
      pad: valid_,
      dilations: js.UndefOr[scala.Nothing],
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor3D,
      strides: js.Tuple2[Double, Double],
      pad: valid_,
      dilations: js.Tuple2[Double, Double],
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor3D,
      strides: js.Tuple2[Double, Double],
      pad: valid_,
      dilations: Double,
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor3D,
      strides: Double,
      pad: same_,
      dilations: js.UndefOr[scala.Nothing],
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor3D,
      strides: Double,
      pad: same_,
      dilations: js.Tuple2[Double, Double],
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](filter: Tensor3D, strides: Double, pad: same_, dilations: Double, dataFormat: NHWC): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor3D,
      strides: Double,
      pad: valid_,
      dilations: js.UndefOr[scala.Nothing],
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor3D,
      strides: Double,
      pad: valid_,
      dilations: js.Tuple2[Double, Double],
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](filter: Tensor3D, strides: Double, pad: valid_, dilations: Double, dataFormat: NHWC): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike3D,
      strides: js.Tuple2[Double, Double],
      pad: same_,
      dilations: js.UndefOr[scala.Nothing],
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike3D,
      strides: js.Tuple2[Double, Double],
      pad: same_,
      dilations: js.Tuple2[Double, Double],
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike3D,
      strides: js.Tuple2[Double, Double],
      pad: same_,
      dilations: Double,
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike3D,
      strides: js.Tuple2[Double, Double],
      pad: valid_,
      dilations: js.UndefOr[scala.Nothing],
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike3D,
      strides: js.Tuple2[Double, Double],
      pad: valid_,
      dilations: js.Tuple2[Double, Double],
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike3D,
      strides: js.Tuple2[Double, Double],
      pad: valid_,
      dilations: Double,
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike3D,
      strides: Double,
      pad: same_,
      dilations: js.UndefOr[scala.Nothing],
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike3D,
      strides: Double,
      pad: same_,
      dilations: js.Tuple2[Double, Double],
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](filter: TensorLike3D, strides: Double, pad: same_, dilations: Double, dataFormat: NHWC): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike3D,
      strides: Double,
      pad: valid_,
      dilations: js.UndefOr[scala.Nothing],
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike3D,
      strides: Double,
      pad: valid_,
      dilations: js.Tuple2[Double, Double],
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](filter: TensorLike3D, strides: Double, pad: valid_, dilations: Double, dataFormat: NHWC): T = js.native
    @JSName("dilation2d")
    def dilation2d_same[T /* <: Tensor3D | Tensor4D */](filter: Tensor3D, strides: js.Tuple2[Double, Double], pad: same_): T = js.native
    @JSName("dilation2d")
    def dilation2d_same[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor3D,
      strides: js.Tuple2[Double, Double],
      pad: same_,
      dilations: js.Tuple2[Double, Double]
    ): T = js.native
    @JSName("dilation2d")
    def dilation2d_same[T /* <: Tensor3D | Tensor4D */](filter: Tensor3D, strides: js.Tuple2[Double, Double], pad: same_, dilations: Double): T = js.native
    @JSName("dilation2d")
    def dilation2d_same[T /* <: Tensor3D | Tensor4D */](filter: Tensor3D, strides: Double, pad: same_): T = js.native
    @JSName("dilation2d")
    def dilation2d_same[T /* <: Tensor3D | Tensor4D */](filter: Tensor3D, strides: Double, pad: same_, dilations: js.Tuple2[Double, Double]): T = js.native
    @JSName("dilation2d")
    def dilation2d_same[T /* <: Tensor3D | Tensor4D */](filter: Tensor3D, strides: Double, pad: same_, dilations: Double): T = js.native
    @JSName("dilation2d")
    def dilation2d_same[T /* <: Tensor3D | Tensor4D */](filter: TensorLike3D, strides: js.Tuple2[Double, Double], pad: same_): T = js.native
    @JSName("dilation2d")
    def dilation2d_same[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike3D,
      strides: js.Tuple2[Double, Double],
      pad: same_,
      dilations: js.Tuple2[Double, Double]
    ): T = js.native
    @JSName("dilation2d")
    def dilation2d_same[T /* <: Tensor3D | Tensor4D */](filter: TensorLike3D, strides: js.Tuple2[Double, Double], pad: same_, dilations: Double): T = js.native
    @JSName("dilation2d")
    def dilation2d_same[T /* <: Tensor3D | Tensor4D */](filter: TensorLike3D, strides: Double, pad: same_): T = js.native
    @JSName("dilation2d")
    def dilation2d_same[T /* <: Tensor3D | Tensor4D */](filter: TensorLike3D, strides: Double, pad: same_, dilations: js.Tuple2[Double, Double]): T = js.native
    @JSName("dilation2d")
    def dilation2d_same[T /* <: Tensor3D | Tensor4D */](filter: TensorLike3D, strides: Double, pad: same_, dilations: Double): T = js.native
    @JSName("dilation2d")
    def dilation2d_valid[T /* <: Tensor3D | Tensor4D */](filter: Tensor3D, strides: js.Tuple2[Double, Double], pad: valid_): T = js.native
    @JSName("dilation2d")
    def dilation2d_valid[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor3D,
      strides: js.Tuple2[Double, Double],
      pad: valid_,
      dilations: js.Tuple2[Double, Double]
    ): T = js.native
    @JSName("dilation2d")
    def dilation2d_valid[T /* <: Tensor3D | Tensor4D */](filter: Tensor3D, strides: js.Tuple2[Double, Double], pad: valid_, dilations: Double): T = js.native
    @JSName("dilation2d")
    def dilation2d_valid[T /* <: Tensor3D | Tensor4D */](filter: Tensor3D, strides: Double, pad: valid_): T = js.native
    @JSName("dilation2d")
    def dilation2d_valid[T /* <: Tensor3D | Tensor4D */](filter: Tensor3D, strides: Double, pad: valid_, dilations: js.Tuple2[Double, Double]): T = js.native
    @JSName("dilation2d")
    def dilation2d_valid[T /* <: Tensor3D | Tensor4D */](filter: Tensor3D, strides: Double, pad: valid_, dilations: Double): T = js.native
    @JSName("dilation2d")
    def dilation2d_valid[T /* <: Tensor3D | Tensor4D */](filter: TensorLike3D, strides: js.Tuple2[Double, Double], pad: valid_): T = js.native
    @JSName("dilation2d")
    def dilation2d_valid[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike3D,
      strides: js.Tuple2[Double, Double],
      pad: valid_,
      dilations: js.Tuple2[Double, Double]
    ): T = js.native
    @JSName("dilation2d")
    def dilation2d_valid[T /* <: Tensor3D | Tensor4D */](filter: TensorLike3D, strides: js.Tuple2[Double, Double], pad: valid_, dilations: Double): T = js.native
    @JSName("dilation2d")
    def dilation2d_valid[T /* <: Tensor3D | Tensor4D */](filter: TensorLike3D, strides: Double, pad: valid_): T = js.native
    @JSName("dilation2d")
    def dilation2d_valid[T /* <: Tensor3D | Tensor4D */](filter: TensorLike3D, strides: Double, pad: valid_, dilations: js.Tuple2[Double, Double]): T = js.native
    @JSName("dilation2d")
    def dilation2d_valid[T /* <: Tensor3D | Tensor4D */](filter: TensorLike3D, strides: Double, pad: valid_, dilations: Double): T = js.native
    
    /**
      * Disposes `tf.Tensor` from memory.
      *
      * @doc {heading: 'Tensors', subheading: 'Classes'}
      */
    def dispose(): Unit = js.native
    
    def div[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def div[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def divNoNan[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def divNoNan[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def divStrict[T /* <: Tensor[Rank] */](x: T): T = js.native
    def divStrict[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    
    def dot[T /* <: Tensor[Rank] */](b: Tensor[Rank]): Tensor[Rank] = js.native
    def dot[T /* <: Tensor[Rank] */](b: TensorLike): Tensor[Rank] = js.native
    
    /** The data type for the array. */
    val dtype: DataType = js.native
    
    def elu[T /* <: Tensor[Rank] */](): T = js.native
    
    def equal[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def equal[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def equalStrict[T /* <: Tensor[Rank] */](x: T): T = js.native
    def equalStrict[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    
    def erf[T /* <: Tensor[Rank] */](): T = js.native
    
    def exp[T /* <: Tensor[Rank] */](): T = js.native
    
    def expandDims[T /* <: Tensor[Rank] */](): T = js.native
    def expandDims[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    
    def expm1[T /* <: Tensor[Rank] */](): T = js.native
    
    def fft[T /* <: Tensor[Rank] */](): Tensor[Rank] = js.native
    
    def flatten[T /* <: Tensor[Rank] */](): Tensor1D = js.native
    
    def floor[T /* <: Tensor[Rank] */](): T = js.native
    
    def floorDiv[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def floorDiv[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def gather[T /* <: Tensor[Rank] */](indices: Tensor[Rank]): T = js.native
    def gather[T /* <: Tensor[Rank] */](indices: Tensor[Rank], axis: Double): T = js.native
    def gather[T /* <: Tensor[Rank] */](indices: TensorLike): T = js.native
    def gather[T /* <: Tensor[Rank] */](indices: TensorLike, axis: Double): T = js.native
    
    def greater[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def greater[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def greaterEqual[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def greaterEqual[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def greaterEqualStrict[T /* <: Tensor[Rank] */](x: T): T = js.native
    def greaterEqualStrict[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    
    def greaterStrict[T /* <: Tensor[Rank] */](x: T): T = js.native
    def greaterStrict[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    
    /** Unique id of this tensor. */
    val id: Double = js.native
    
    def ifft[T /* <: Tensor[Rank] */](): Tensor[Rank] = js.native
    
    def irfft[T /* <: Tensor[Rank] */](): Tensor[Rank] = js.native
    
    val isDisposed: Boolean = js.native
    
    var isDisposedInternal: Boolean = js.native
    
    def isFinite[T /* <: Tensor[Rank] */](): T = js.native
    
    def isInf[T /* <: Tensor[Rank] */](): T = js.native
    
    def isNaN[T /* <: Tensor[Rank] */](): T = js.native
    
    /** Whether this tensor has been globally kept. */
    var kept: Boolean = js.native
    
    def leakyRelu[T /* <: Tensor[Rank] */](alpha: Double): T = js.native
    
    def less[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def less[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def lessEqual[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def lessEqual[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def lessEqualStrict[T /* <: Tensor[Rank] */](x: T): T = js.native
    def lessEqualStrict[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    
    def lessStrict[T /* <: Tensor[Rank] */](x: T): T = js.native
    def lessStrict[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    
    def localResponseNormalization[T /* <: Tensor[Rank] */](): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](
      depthRadius: js.UndefOr[scala.Nothing],
      bias: js.UndefOr[scala.Nothing],
      alpha: js.UndefOr[scala.Nothing],
      beta: Double
    ): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: js.UndefOr[scala.Nothing], bias: js.UndefOr[scala.Nothing], alpha: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](
      depthRadius: js.UndefOr[scala.Nothing],
      bias: js.UndefOr[scala.Nothing],
      alpha: Double,
      beta: Double
    ): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: js.UndefOr[scala.Nothing], bias: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](
      depthRadius: js.UndefOr[scala.Nothing],
      bias: Double,
      alpha: js.UndefOr[scala.Nothing],
      beta: Double
    ): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: js.UndefOr[scala.Nothing], bias: Double, alpha: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: js.UndefOr[scala.Nothing], bias: Double, alpha: Double, beta: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](
      depthRadius: Double,
      bias: js.UndefOr[scala.Nothing],
      alpha: js.UndefOr[scala.Nothing],
      beta: Double
    ): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Double, bias: js.UndefOr[scala.Nothing], alpha: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Double, bias: js.UndefOr[scala.Nothing], alpha: Double, beta: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Double, bias: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Double, bias: Double, alpha: js.UndefOr[scala.Nothing], beta: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Double, bias: Double, alpha: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Double, bias: Double, alpha: Double, beta: Double): T = js.native
    
    def log[T /* <: Tensor[Rank] */](): T = js.native
    
    def log1p[T /* <: Tensor[Rank] */](): T = js.native
    
    def logSigmoid[T /* <: Tensor[Rank] */](): T = js.native
    
    def logSoftmax[T /* <: Tensor[Rank] */](): T = js.native
    def logSoftmax[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    
    def logSumExp[T /* <: Tensor[Rank] */](): T = js.native
    def logSumExp[T /* <: Tensor[Rank] */](axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
    def logSumExp[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
    def logSumExp[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
    def logSumExp[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    def logSumExp[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
    
    def logicalAnd[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def logicalAnd[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def logicalNot[T /* <: Tensor[Rank] */](): T = js.native
    
    def logicalOr[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def logicalOr[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def logicalXor[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def logicalXor[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def matMul[T /* <: Tensor[Rank] */](b: Tensor[Rank]): Tensor[Rank] = js.native
    def matMul[T /* <: Tensor[Rank] */](b: Tensor[Rank], transposeA: js.UndefOr[scala.Nothing], transposeB: Boolean): Tensor[Rank] = js.native
    def matMul[T /* <: Tensor[Rank] */](b: Tensor[Rank], transposeA: Boolean): Tensor[Rank] = js.native
    def matMul[T /* <: Tensor[Rank] */](b: Tensor[Rank], transposeA: Boolean, transposeB: Boolean): Tensor[Rank] = js.native
    def matMul[T /* <: Tensor[Rank] */](b: TensorLike): Tensor[Rank] = js.native
    def matMul[T /* <: Tensor[Rank] */](b: TensorLike, transposeA: js.UndefOr[scala.Nothing], transposeB: Boolean): Tensor[Rank] = js.native
    def matMul[T /* <: Tensor[Rank] */](b: TensorLike, transposeA: Boolean): Tensor[Rank] = js.native
    def matMul[T /* <: Tensor[Rank] */](b: TensorLike, transposeA: Boolean, transposeB: Boolean): Tensor[Rank] = js.native
    
    def max[T /* <: Tensor[Rank] */](): T = js.native
    def max[T /* <: Tensor[Rank] */](axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
    def max[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
    def max[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
    def max[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    def max[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
    
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double], pad: Double): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: same_,
      dimRoundingMode: ceil
    ): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: same_,
      dimRoundingMode: floor
    ): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: same_,
      dimRoundingMode: round
    ): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: valid_,
      dimRoundingMode: ceil
    ): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: valid_,
      dimRoundingMode: floor
    ): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: valid_,
      dimRoundingMode: round
    ): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: same_, dimRoundingMode: ceil): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: same_, dimRoundingMode: floor): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: same_, dimRoundingMode: round): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: valid_, dimRoundingMode: ceil): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: valid_, dimRoundingMode: floor): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: valid_, dimRoundingMode: round): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: same_, dimRoundingMode: ceil): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: same_, dimRoundingMode: floor): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: same_, dimRoundingMode: round): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: valid_, dimRoundingMode: ceil): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: valid_, dimRoundingMode: floor): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: valid_, dimRoundingMode: round): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: Double): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: same_, dimRoundingMode: ceil): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: same_, dimRoundingMode: floor): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: same_, dimRoundingMode: round): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: valid_, dimRoundingMode: ceil): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: valid_, dimRoundingMode: floor): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: valid_, dimRoundingMode: round): T = js.native
    @JSName("maxPool")
    def maxPool_ceil[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: Double,
      dimRoundingMode: ceil
    ): T = js.native
    @JSName("maxPool")
    def maxPool_ceil[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double, dimRoundingMode: ceil): T = js.native
    @JSName("maxPool")
    def maxPool_ceil[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double, dimRoundingMode: ceil): T = js.native
    @JSName("maxPool")
    def maxPool_ceil[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: Double, dimRoundingMode: ceil): T = js.native
    @JSName("maxPool")
    def maxPool_floor[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: Double,
      dimRoundingMode: floor
    ): T = js.native
    @JSName("maxPool")
    def maxPool_floor[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double, dimRoundingMode: floor): T = js.native
    @JSName("maxPool")
    def maxPool_floor[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double, dimRoundingMode: floor): T = js.native
    @JSName("maxPool")
    def maxPool_floor[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: Double, dimRoundingMode: floor): T = js.native
    @JSName("maxPool")
    def maxPool_round[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: Double,
      dimRoundingMode: round
    ): T = js.native
    @JSName("maxPool")
    def maxPool_round[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double, dimRoundingMode: round): T = js.native
    @JSName("maxPool")
    def maxPool_round[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double, dimRoundingMode: round): T = js.native
    @JSName("maxPool")
    def maxPool_round[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: Double, dimRoundingMode: round): T = js.native
    @JSName("maxPool")
    def maxPool_same[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double], pad: same_): T = js.native
    @JSName("maxPool")
    def maxPool_same[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: same_): T = js.native
    @JSName("maxPool")
    def maxPool_same[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: same_): T = js.native
    @JSName("maxPool")
    def maxPool_same[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: same_): T = js.native
    @JSName("maxPool")
    def maxPool_valid[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double], pad: valid_): T = js.native
    @JSName("maxPool")
    def maxPool_valid[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: valid_): T = js.native
    @JSName("maxPool")
    def maxPool_valid[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: valid_): T = js.native
    @JSName("maxPool")
    def maxPool_valid[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: valid_): T = js.native
    
    def maximum[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def maximum[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def maximumStrict[T /* <: Tensor[Rank] */](x: T): T = js.native
    def maximumStrict[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    
    def mean[T /* <: Tensor[Rank] */](): T = js.native
    def mean[T /* <: Tensor[Rank] */](axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
    def mean[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
    def mean[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
    def mean[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    def mean[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
    
    def min[T /* <: Tensor[Rank] */](): T = js.native
    def min[T /* <: Tensor[Rank] */](axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
    def min[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
    def min[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
    def min[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    def min[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
    
    def minimum[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def minimum[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def minimumStrict[T /* <: Tensor[Rank] */](x: T): T = js.native
    def minimumStrict[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    
    @JSName("mirrorPad")
    def mirrorPad_reflect[T /* <: Tensor[Rank] */](paddings: js.Array[js.Tuple2[Double, Double]], mode: reflect): T = js.native
    @JSName("mirrorPad")
    def mirrorPad_symmetric[T /* <: Tensor[Rank] */](paddings: js.Array[js.Tuple2[Double, Double]], mode: symmetric): T = js.native
    
    def mod[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def mod[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def modStrict[T /* <: Tensor[Rank] */](x: T): T = js.native
    def modStrict[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    
    def mul[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def mul[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def mulStrict[T /* <: Tensor[Rank] */](x: T): T = js.native
    def mulStrict[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    
    def neg[T /* <: Tensor[Rank] */](): T = js.native
    
    def norm[T /* <: Tensor[Rank] */](): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: js.UndefOr[scala.Nothing], axis: js.UndefOr[scala.Nothing], keepDims: Boolean): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: js.UndefOr[scala.Nothing], axis: js.Array[Double]): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: js.UndefOr[scala.Nothing], axis: js.Array[Double], keepDims: Boolean): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: js.UndefOr[scala.Nothing], axis: Double): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: js.UndefOr[scala.Nothing], axis: Double, keepDims: Boolean): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: Double): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: Double, axis: js.UndefOr[scala.Nothing], keepDims: Boolean): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: Double, axis: js.Array[Double]): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: Double, axis: js.Array[Double], keepDims: Boolean): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: Double, axis: Double): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: Double, axis: Double, keepDims: Boolean): Tensor[Rank] = js.native
    @JSName("norm")
    def norm_euclidean[T /* <: Tensor[Rank] */](ord: euclidean): Tensor[Rank] = js.native
    @JSName("norm")
    def norm_euclidean[T /* <: Tensor[Rank] */](ord: euclidean, axis: js.UndefOr[scala.Nothing], keepDims: Boolean): Tensor[Rank] = js.native
    @JSName("norm")
    def norm_euclidean[T /* <: Tensor[Rank] */](ord: euclidean, axis: js.Array[Double]): Tensor[Rank] = js.native
    @JSName("norm")
    def norm_euclidean[T /* <: Tensor[Rank] */](ord: euclidean, axis: js.Array[Double], keepDims: Boolean): Tensor[Rank] = js.native
    @JSName("norm")
    def norm_euclidean[T /* <: Tensor[Rank] */](ord: euclidean, axis: Double): Tensor[Rank] = js.native
    @JSName("norm")
    def norm_euclidean[T /* <: Tensor[Rank] */](ord: euclidean, axis: Double, keepDims: Boolean): Tensor[Rank] = js.native
    @JSName("norm")
    def norm_fro[T /* <: Tensor[Rank] */](ord: fro): Tensor[Rank] = js.native
    @JSName("norm")
    def norm_fro[T /* <: Tensor[Rank] */](ord: fro, axis: js.UndefOr[scala.Nothing], keepDims: Boolean): Tensor[Rank] = js.native
    @JSName("norm")
    def norm_fro[T /* <: Tensor[Rank] */](ord: fro, axis: js.Array[Double]): Tensor[Rank] = js.native
    @JSName("norm")
    def norm_fro[T /* <: Tensor[Rank] */](ord: fro, axis: js.Array[Double], keepDims: Boolean): Tensor[Rank] = js.native
    @JSName("norm")
    def norm_fro[T /* <: Tensor[Rank] */](ord: fro, axis: Double): Tensor[Rank] = js.native
    @JSName("norm")
    def norm_fro[T /* <: Tensor[Rank] */](ord: fro, axis: Double, keepDims: Boolean): Tensor[Rank] = js.native
    
    def notEqual[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def notEqual[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def notEqualStrict[T /* <: Tensor[Rank] */](x: T): T = js.native
    def notEqualStrict[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    
    def oneHot(depth: Double, onValue: Double, offValue: Double): Tensor[Rank] = js.native
    
    def onesLike[T /* <: Tensor[Rank] */](): T = js.native
    
    def pad[T /* <: Tensor[Rank] */](paddings: js.Array[js.Tuple2[Double, Double]]): T = js.native
    def pad[T /* <: Tensor[Rank] */](paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double): T = js.native
    
    def pool[T /* <: Tensor3D | Tensor4D */](
      windowShape: (js.Tuple2[Double, Double]) | Double,
      poolingType: avg | max,
      padding: valid_ | same_ | Double,
      diationRate: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
      strides: js.UndefOr[(js.Tuple2[Double, Double]) | Double]
    ): T = js.native
    
    def pow[T /* <: Tensor[Rank] */](exp: Tensor[Rank]): T = js.native
    def pow[T /* <: Tensor[Rank] */](exp: TensorLike): T = js.native
    
    def powStrict[T /* <: Tensor[Rank] */](exp: Tensor[Rank]): Tensor[Rank] = js.native
    
    def prelu[T /* <: Tensor[Rank] */](alpha: T): T = js.native
    def prelu[T /* <: Tensor[Rank] */](alpha: TensorLike): T = js.native
    
    /**
      * Prints the `tf.Tensor`. See `tf.print` for details.
      *
      * @param verbose Whether to print verbose information about the tensor,
      *    including dtype and size.
      *
      * @doc {heading: 'Tensors', subheading: 'Classes'}
      */
    def print(): Unit = js.native
    def print(verbose: Boolean): Unit = js.native
    
    def prod[T /* <: Tensor[Rank] */](): T = js.native
    def prod[T /* <: Tensor[Rank] */](axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
    def prod[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
    def prod[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
    def prod[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    def prod[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
    
    val rank: Double = js.native
    
    /** The rank type for the array (see `Rank` enum). */
    val rankType: R = js.native
    
    def reciprocal[T /* <: Tensor[Rank] */](): T = js.native
    
    def relu[T /* <: Tensor[Rank] */](): T = js.native
    
    def relu6[T /* <: Tensor[Rank] */](): T = js.native
    
    def reshape[T /* <: Tensor[Rank] */](shape: js.Array[Double]): T = js.native
    
    def reshapeAs[T /* <: Tensor[Rank] */](x: T): T = js.native
    
    def resizeBilinear[T /* <: Tensor3D | Tensor4D */](newShape2D: js.Tuple2[Double, Double]): T = js.native
    def resizeBilinear[T /* <: Tensor3D | Tensor4D */](newShape2D: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    
    def resizeNearestNeighbor[T /* <: Tensor3D | Tensor4D */](newShape2D: js.Tuple2[Double, Double]): T = js.native
    def resizeNearestNeighbor[T /* <: Tensor3D | Tensor4D */](newShape2D: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    
    def reverse[T /* <: Tensor[Rank] */](): T = js.native
    def reverse[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
    def reverse[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    
    def rfft[T /* <: Tensor[Rank] */](): Tensor[Rank] = js.native
    
    def round[T /* <: Tensor[Rank] */](): T = js.native
    
    def rsqrt[T /* <: Tensor[Rank] */](): T = js.native
    
    /** The id of the scope this tensor is being tracked in. */
    var scopeId: Double = js.native
    
    def selu[T /* <: Tensor[Rank] */](): T = js.native
    
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D | TensorLike4D,
      pointwiseFilter: Tensor4D | TensorLike,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_,
      dilation: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
      dataFormat: js.UndefOr[NHWC | NCHW]
    ): T = js.native
    
    /** The shape of the tensor. */
    val shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any = js.native
    
    def sigmoid[T /* <: Tensor[Rank] */](): T = js.native
    
    def sign[T /* <: Tensor[Rank] */](): T = js.native
    
    def sin[T /* <: Tensor[Rank] */](): T = js.native
    
    def sinh[T /* <: Tensor[Rank] */](): T = js.native
    
    /** Number of elements in the tensor. */
    val size: Double = js.native
    
    def slice[T /* <: Tensor[Rank] */](begin: js.Array[Double]): T = js.native
    def slice[T /* <: Tensor[Rank] */](begin: js.Array[Double], size: js.Array[Double]): T = js.native
    def slice[T /* <: Tensor[Rank] */](begin: js.Array[Double], size: Double): T = js.native
    def slice[T /* <: Tensor[Rank] */](begin: Double): T = js.native
    def slice[T /* <: Tensor[Rank] */](begin: Double, size: js.Array[Double]): T = js.native
    def slice[T /* <: Tensor[Rank] */](begin: Double, size: Double): T = js.native
    
    def softmax[T /* <: Tensor[Rank] */](): T = js.native
    def softmax[T /* <: Tensor[Rank] */](dim: Double): T = js.native
    
    def softplus[T /* <: Tensor[Rank] */](): T = js.native
    
    def spaceToBatchND[R /* <: Rank */](blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): Tensor[R] = js.native
    
    def split[T /* <: Tensor[Rank] */](numOrSizeSplits: js.Array[Double]): js.Array[T] = js.native
    def split[T /* <: Tensor[Rank] */](numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
    def split[T /* <: Tensor[Rank] */](numOrSizeSplits: Double): js.Array[T] = js.native
    def split[T /* <: Tensor[Rank] */](numOrSizeSplits: Double, axis: Double): js.Array[T] = js.native
    
    def sqrt[T /* <: Tensor[Rank] */](): T = js.native
    
    def square[T /* <: Tensor[Rank] */](): T = js.native
    
    def squaredDifference[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def squaredDifference[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def squaredDifferenceStrict[T /* <: Tensor[Rank] */](x: T): T = js.native
    def squaredDifferenceStrict[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    
    def squeeze[T /* <: Tensor[Rank] */](): T = js.native
    def squeeze[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
    
    def stack[T /* <: Tensor[Rank] */](x: js.Array[Tensor[Rank]]): T = js.native
    def stack[T /* <: Tensor[Rank] */](x: js.Array[Tensor[Rank]], axis: Double): T = js.native
    def stack[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
    def stack[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
    
    def step[T /* <: Tensor[Rank] */](): T = js.native
    def step[T /* <: Tensor[Rank] */](alpha: Double): T = js.native
    
    def stridedSlice[T /* <: Tensor[Rank] */](begin: js.Array[Double], end: js.Array[Double], strides: js.Array[Double]): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: js.UndefOr[scala.Nothing],
      endMask: js.UndefOr[scala.Nothing],
      ellipsisMask: js.UndefOr[scala.Nothing],
      newAxisMask: js.UndefOr[scala.Nothing],
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: js.UndefOr[scala.Nothing],
      endMask: js.UndefOr[scala.Nothing],
      ellipsisMask: js.UndefOr[scala.Nothing],
      newAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: js.UndefOr[scala.Nothing],
      endMask: js.UndefOr[scala.Nothing],
      ellipsisMask: js.UndefOr[scala.Nothing],
      newAxisMask: Double,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: js.UndefOr[scala.Nothing],
      endMask: js.UndefOr[scala.Nothing],
      ellipsisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: js.UndefOr[scala.Nothing],
      endMask: js.UndefOr[scala.Nothing],
      ellipsisMask: Double,
      newAxisMask: js.UndefOr[scala.Nothing],
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: js.UndefOr[scala.Nothing],
      endMask: js.UndefOr[scala.Nothing],
      ellipsisMask: Double,
      newAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: js.UndefOr[scala.Nothing],
      endMask: js.UndefOr[scala.Nothing],
      ellipsisMask: Double,
      newAxisMask: Double,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: js.UndefOr[scala.Nothing],
      endMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: js.UndefOr[scala.Nothing],
      endMask: Double,
      ellipsisMask: js.UndefOr[scala.Nothing],
      newAxisMask: js.UndefOr[scala.Nothing],
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: js.UndefOr[scala.Nothing],
      endMask: Double,
      ellipsisMask: js.UndefOr[scala.Nothing],
      newAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: js.UndefOr[scala.Nothing],
      endMask: Double,
      ellipsisMask: js.UndefOr[scala.Nothing],
      newAxisMask: Double,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: js.UndefOr[scala.Nothing],
      endMask: Double,
      ellipsisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: js.UndefOr[scala.Nothing],
      endMask: Double,
      ellipsisMask: Double,
      newAxisMask: js.UndefOr[scala.Nothing],
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: js.UndefOr[scala.Nothing],
      endMask: Double,
      ellipsisMask: Double,
      newAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: js.UndefOr[scala.Nothing],
      endMask: Double,
      ellipsisMask: Double,
      newAxisMask: Double,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](begin: js.Array[Double], end: js.Array[Double], strides: js.Array[Double], beginMask: Double): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: js.UndefOr[scala.Nothing],
      ellipsisMask: js.UndefOr[scala.Nothing],
      newAxisMask: js.UndefOr[scala.Nothing],
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: js.UndefOr[scala.Nothing],
      ellipsisMask: js.UndefOr[scala.Nothing],
      newAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: js.UndefOr[scala.Nothing],
      ellipsisMask: js.UndefOr[scala.Nothing],
      newAxisMask: Double,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: js.UndefOr[scala.Nothing],
      ellipsisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: js.UndefOr[scala.Nothing],
      ellipsisMask: Double,
      newAxisMask: js.UndefOr[scala.Nothing],
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: js.UndefOr[scala.Nothing],
      ellipsisMask: Double,
      newAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: js.UndefOr[scala.Nothing],
      ellipsisMask: Double,
      newAxisMask: Double,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Double,
      ellipsisMask: js.UndefOr[scala.Nothing],
      newAxisMask: js.UndefOr[scala.Nothing],
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Double,
      ellipsisMask: js.UndefOr[scala.Nothing],
      newAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Double,
      ellipsisMask: js.UndefOr[scala.Nothing],
      newAxisMask: Double,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Double,
      ellipsisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Double,
      ellipsisMask: Double,
      newAxisMask: js.UndefOr[scala.Nothing],
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Double,
      ellipsisMask: Double,
      newAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Double,
      ellipsisMask: Double,
      newAxisMask: Double,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    
    /**
      * Number of elements to skip in each dimension when indexing. See
      * https://docs.scipy.org/doc/numpy/reference/generated/\
      * numpy.ndarray.strides.html
      */
    val strides: js.Array[Double] = js.native
    
    def sub[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def sub[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def subStrict[T /* <: Tensor[Rank] */](x: T): T = js.native
    def subStrict[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
    
    def sum[T /* <: Tensor[Rank] */](): T = js.native
    def sum[T /* <: Tensor[Rank] */](axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
    def sum[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
    def sum[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
    def sum[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    def sum[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
    
    def tan[T /* <: Tensor[Rank] */](): T = js.native
    
    def tanh[T /* <: Tensor[Rank] */](): T = js.native
    
    def throwIfDisposed(): Unit = js.native
    
    def tile[T /* <: Tensor[Rank] */](b: js.Array[Double]): T = js.native
    
    def toBool[T /* <: Tensor[Rank] */](): T = js.native
    
    def toFloat[T /* <: Tensor[Rank] */](): T = js.native
    
    def toInt[T /* <: Tensor[Rank] */](): T = js.native
    
    def toString(verbose: Boolean): String = js.native
    
    def topk[T /* <: Tensor[Rank] */](): Indices[T] = js.native
    def topk[T /* <: Tensor[Rank] */](k: js.UndefOr[scala.Nothing], sorted: Boolean): Indices[T] = js.native
    def topk[T /* <: Tensor[Rank] */](k: Double): Indices[T] = js.native
    def topk[T /* <: Tensor[Rank] */](k: Double, sorted: Boolean): Indices[T] = js.native
    
    def transpose[T /* <: Tensor[Rank] */](): T = js.native
    def transpose[T /* <: Tensor[Rank] */](perm: js.Array[Double]): T = js.native
    
    def unique[T /* <: Tensor[Rank] */](): Indices[T] = js.native
    def unique[T /* <: Tensor[Rank] */](axis: Double): Indices[T] = js.native
    
    def unsortedSegmentSum[T /* <: Tensor[Rank] */](segmentIds: Tensor1D, numSegments: Double): T = js.native
    def unsortedSegmentSum[T /* <: Tensor[Rank] */](segmentIds: TensorLike1D, numSegments: Double): T = js.native
    
    def unstack[T /* <: Tensor[Rank] */](): js.Array[T] = js.native
    def unstack[T /* <: Tensor[Rank] */](axis: Double): js.Array[T] = js.native
    
    def variable(): Variable[R] = js.native
    def variable(trainable: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], dtype: DataType): Variable[R] = js.native
    def variable(trainable: js.UndefOr[scala.Nothing], name: String): Variable[R] = js.native
    def variable(trainable: js.UndefOr[scala.Nothing], name: String, dtype: DataType): Variable[R] = js.native
    def variable(trainable: Boolean): Variable[R] = js.native
    def variable(trainable: Boolean, name: js.UndefOr[scala.Nothing], dtype: DataType): Variable[R] = js.native
    def variable(trainable: Boolean, name: String): Variable[R] = js.native
    def variable(trainable: Boolean, name: String, dtype: DataType): Variable[R] = js.native
    
    def where[T /* <: Tensor[Rank] */](condition: Tensor[Rank], x: Tensor[Rank]): T = js.native
    def where[T /* <: Tensor[Rank] */](condition: Tensor[Rank], x: TensorLike): T = js.native
    def where[T /* <: Tensor[Rank] */](condition: TensorLike, x: Tensor[Rank]): T = js.native
    def where[T /* <: Tensor[Rank] */](condition: TensorLike, x: TensorLike): T = js.native
    
    def zerosLike[T /* <: Tensor[Rank] */](): T = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor", "TensorBuffer")
  @js.native
  class TensorBuffer[R /* <: Rank */, D /* <: DataType */] protected () extends StObject {
    def this(
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      dtype: D
    ) = this()
    def this(
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      dtype: D,
      values: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any
    ) = this()
    
    var dtype: D = js.native
    
    /**
      * Returns the value in the buffer at the provided location.
      *
      * @param locs The location indices.
      *
      * @doc {heading: 'Tensors', subheading: 'Creation'}
      */
    def get(locs: Double*): /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.SingleValueMap[D] */ js.Any = js.native
    
    def indexToLoc(index: Double): js.Array[Double] = js.native
    
    def locToIndex(locs: js.Array[Double]): Double = js.native
    
    val rank: Double = js.native
    
    /**
      * Sets a value in the buffer at a given location.
      *
      * @param value The value to set.
      * @param locs  The location indices.
      *
      * @doc {heading: 'Tensors', subheading: 'Creation'}
      */
    def set(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.SingleValueMap[D] */ js.Any,
      locs: Double*
    ): Unit = js.native
    
    var shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any = js.native
    
    var size: Double = js.native
    
    var strides: js.Array[Double] = js.native
    
    /**
      * Creates an immutable `tf.Tensor` object from the buffer.
      *
      * @doc {heading: 'Tensors', subheading: 'Creation'}
      */
    def toTensor(): Tensor[R] = js.native
    
    var values: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor", "Variable")
  @js.native
  class Variable[R /* <: Rank */] protected () extends Tensor[R] {
    def this(initialValue: Tensor[R], trainable: Boolean, name: String, tensorId: Double) = this()
    
    /**
      * Assign a new `tf.Tensor` to this variable. The new `tf.Tensor` must have
      * the same shape and dtype as the old `tf.Tensor`.
      *
      * @param newValue New tensor to be assigned to this variable.
      *
      * @doc {heading: 'Tensors', subheading: 'Classes'}
      */
    def assign(newValue: Tensor[R]): Unit = js.native
    
    var name: String = js.native
    
    var trainable: Boolean = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor", "setDeprecationWarningFn")
  @js.native
  def setDeprecationWarningFn(fn: js.Function1[/* msg */ String, Unit]): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor", "setOpHandler")
  @js.native
  def setOpHandler(handler: OpHandler): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor", "setTensorTracker")
  @js.native
  def setTensorTracker(fn: js.Function0[TensorTracker]): Unit = js.native
  
  @js.native
  trait Backend extends StObject
  
  type DataId = js.Object
  
  @js.native
  trait NumericTensor[R /* <: Rank */] extends Tensor[R] {
    
    @JSName("dtype")
    var dtype_NumericTensor: NumericDataType = js.native
  }
  
  @js.native
  trait OpHandler extends StObject {
    
    @JSName("buffer")
    def buffer_bool[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      dtype: bool
    ): TensorBuffer[R, bool] = js.native
    @JSName("buffer")
    def buffer_bool[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      dtype: bool,
      values: js.typedarray.Uint8Array
    ): TensorBuffer[R, bool] = js.native
    @JSName("buffer")
    def buffer_complex64[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      dtype: complex64
    ): TensorBuffer[R, complex64] = js.native
    @JSName("buffer")
    def buffer_complex64[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      dtype: complex64,
      values: js.typedarray.Float32Array
    ): TensorBuffer[R, complex64] = js.native
    @JSName("buffer")
    def buffer_float32[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      dtype: float32
    ): TensorBuffer[R, float32] = js.native
    @JSName("buffer")
    def buffer_float32[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      dtype: float32,
      values: js.typedarray.Float32Array
    ): TensorBuffer[R, float32] = js.native
    @JSName("buffer")
    def buffer_int32[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      dtype: int32
    ): TensorBuffer[R, int32] = js.native
    @JSName("buffer")
    def buffer_int32[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      dtype: int32,
      values: js.typedarray.Int32Array
    ): TensorBuffer[R, int32] = js.native
    @JSName("buffer")
    def buffer_string[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      dtype: string
    ): TensorBuffer[R, string] = js.native
    @JSName("buffer")
    def buffer_string[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      dtype: string,
      values: js.Array[String]
    ): TensorBuffer[R, string] = js.native
    
    def cast[T /* <: Tensor[Rank] */](x: T, dtype: DataType): T = js.native
    
    def clone[T /* <: Tensor[Rank] */](x: T): T = js.native
    
    def print[T /* <: Tensor[Rank] */](x: T, verbose: Boolean): Unit = js.native
  }
  
  type Scalar = Tensor[R0]
  
  @js.native
  trait StringTensor[R /* <: Rank */] extends Tensor[R] {
    
    @JSName("dtype")
    var dtype_StringTensor: string = js.native
  }
  
  type Tensor1D = Tensor[R1]
  
  type Tensor2D = Tensor[R2]
  
  type Tensor3D = Tensor[R3]
  
  type Tensor4D = Tensor[R4]
  
  type Tensor5D = Tensor[R5]
  
  type Tensor6D = Tensor[R6]
  
  @js.native
  trait TensorData[D /* <: DataType */] extends StObject {
    
    var dataId: js.UndefOr[DataId] = js.native
    
    var values: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any
      ] = js.native
  }
  object TensorData {
    
    @scala.inline
    def apply[D /* <: DataType */](): TensorData[D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TensorData[D]]
    }
    
    @scala.inline
    implicit class TensorDataMutableBuilder[Self <: TensorData[_], D /* <: DataType */] (val x: Self with TensorData[D]) extends AnyVal {
      
      @scala.inline
      def setDataId(value: DataId): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataIdUndefined: Self = StObject.set(x, "dataId", js.undefined)
      
      @scala.inline
      def setValues(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any
      ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  @js.native
  trait TensorTracker extends StObject {
    
    def disposeTensor(t: Tensor[Rank]): Unit = js.native
    
    def disposeVariable(v: Variable[Rank]): Unit = js.native
    
    def incRef(a: Tensor[Rank], backend: Backend): Unit = js.native
    
    def makeTensor(values: DataValues, shape: js.Array[Double], dtype: DataType): Tensor[Rank] = js.native
    def makeTensor(values: DataValues, shape: js.Array[Double], dtype: DataType, backend: Backend): Tensor[Rank] = js.native
    
    def makeVariable(initialValue: Tensor[Rank]): Variable[Rank] = js.native
    def makeVariable(
      initialValue: Tensor[Rank],
      trainable: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      dtype: DataType
    ): Variable[Rank] = js.native
    def makeVariable(initialValue: Tensor[Rank], trainable: js.UndefOr[scala.Nothing], name: String): Variable[Rank] = js.native
    def makeVariable(initialValue: Tensor[Rank], trainable: js.UndefOr[scala.Nothing], name: String, dtype: DataType): Variable[Rank] = js.native
    def makeVariable(initialValue: Tensor[Rank], trainable: Boolean): Variable[Rank] = js.native
    def makeVariable(initialValue: Tensor[Rank], trainable: Boolean, name: js.UndefOr[scala.Nothing], dtype: DataType): Variable[Rank] = js.native
    def makeVariable(initialValue: Tensor[Rank], trainable: Boolean, name: String): Variable[Rank] = js.native
    def makeVariable(initialValue: Tensor[Rank], trainable: Boolean, name: String, dtype: DataType): Variable[Rank] = js.native
    
    def read(dataId: DataId): js.Promise[BackendValues] = js.native
    
    def readSync(dataId: DataId): BackendValues = js.native
  }
}
