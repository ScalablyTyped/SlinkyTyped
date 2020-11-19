package typingsSlinky.tensorflowTfjsCore.tensorMod

import typingsSlinky.tensorflowTfjsCore.anon.Indices
import typingsSlinky.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R3
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike1D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike3D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike4D
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCW
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NWC
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.avg
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.euclidean
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.fro
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.max
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/tensor", "Tensor")
@js.native
class Tensor[R /* <: Rank */] protected () extends js.Object {
  def this(
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType,
    dataId: DataId,
    id: Double
  ) = this()
  
  def abs[T /* <: Tensor[Rank] */](): T = js.native
  
  def acos[T /* <: Tensor[Rank] */](): T = js.native
  
  def acosh[T /* <: Tensor[Rank] */](): T = js.native
  
  def add[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def add[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
  
  /**
    * @deprecated strict variants of ops have been deprecated
    */
  def addStrict[T /* <: this.type */](x: T): T = js.native
  def addStrict[T /* <: this.type */](x: TensorLike): T = js.native
  
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
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def array(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ArrayMap[R] */ js.Any
  ] = js.native
  
  /**
    * Returns the tensor data as a nested array. The transfer of data is done
    * synchronously.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def arraySync(): /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ArrayMap[R] */ js.Any = js.native
  
  /** Converts a `tf.Tensor` to a `tf.Tensor1D`. */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def as1D(): Tensor1D = js.native
  
  /**
    * Converts a `tf.Tensor` to a `tf.Tensor2D`.
    *
    * @param rows Number of rows in `tf.Tensor2D`.
    * @param columns Number of columns in `tf.Tensor2D`.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def as2D(rows: Double, columns: Double): Tensor2D = js.native
  
  /**
    * Converts a `tf.Tensor` to a `tf.Tensor3D`.
    *
    * @param rows Number of rows in `tf.Tensor3D`.
    * @param columns Number of columns in `tf.Tensor3D`.
    * @param depth Depth of `tf.Tensor3D`.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def as3D(rows: Double, columns: Double, depth: Double): Tensor3D = js.native
  
  /**
    * Converts a `tf.Tensor` to a `tf.Tensor4D`.
    *
    * @param rows Number of rows in `tf.Tensor4D`.
    * @param columns Number of columns in `tf.Tensor4D`.
    * @param depth Depth of `tf.Tensor4D`.
    * @param depth2 4th dimension of `tf.Tensor4D`.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def as4D(rows: Double, columns: Double, depth: Double, depth2: Double): Tensor4D = js.native
  
  /**
    * Converts a `tf.Tensor` to a `tf.Tensor5D`.
    *
    * @param rows Number of rows in `tf.Tensor5D`.
    * @param columns Number of columns in `tf.Tensor5D`.
    * @param depth Depth of `tf.Tensor5D`.
    * @param depth2 4th dimension of `tf.Tensor5D`.
    * @param depth3 5th dimension of 'tf.Tensor5D'
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def as5D(rows: Double, columns: Double, depth: Double, depth2: Double, depth3: Double): Tensor5D = js.native
  
  /** Converts a size-1 `tf.Tensor` to a `tf.Scalar`. */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def asScalar(): Scalar = js.native
  
  /**
    * Casts a `tf.Tensor` to a specified dtype.
    *
    * @param dtype Data-type to cast the tensor to.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def asType[T /* <: this.type */](dtype: DataType): T = js.native
  
  def asin[T /* <: Tensor[Rank] */](): T = js.native
  
  def asinh[T /* <: Tensor[Rank] */](): T = js.native
  
  def atan[T /* <: Tensor[Rank] */](): T = js.native
  
  def atan2[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def atan2[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
  
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
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def buffer(): js.Promise[TensorBuffer[R, float32]] = js.native
  
  /** Returns a `tf.TensorBuffer` that holds the underlying data. */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def bufferSync(): TensorBuffer[R, float32] = js.native
  
  /** Returns the underlying bytes of the tensor's data. */
  def bytes(): js.Promise[js.Array[js.typedarray.Uint8Array] | js.typedarray.Uint8Array] = js.native
  
  def cast[T /* <: this.type */](dtype: DataType): T = js.native
  
  def ceil[T /* <: Tensor[Rank] */](): T = js.native
  
  def clipByValue(min: Double, max: Double): Tensor[R] = js.native
  
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
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
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
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
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
  
  /**
    * Disposes `tf.Tensor` from memory.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def dispose(): Unit = js.native
  
  def div[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def div[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
  
  def divNoNan[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def divNoNan[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
  
  /**
    * @deprecated strict variants of ops have been deprecated
    */
  def divStrict[T /* <: this.type */](x: T): T = js.native
  def divStrict[T /* <: this.type */](x: TensorLike): T = js.native
  
  def dot[T /* <: Tensor[Rank] */](b: TensorLike): Tensor[Rank] = js.native
  def dot[T /* <: Tensor[Rank] */](b: Tensor[Rank]): Tensor[Rank] = js.native
  
  /** The data type for the array. */
  val dtype: DataType = js.native
  
  def elu[T /* <: Tensor[Rank] */](): T = js.native
  
  def equal[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def equal[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
  
  /**
    * @deprecated strict variants of ops have been deprecated
    */
  def equalStrict[T /* <: this.type */](x: T): T = js.native
  def equalStrict[T /* <: this.type */](x: TensorLike): T = js.native
  
  def erf[T /* <: Tensor[Rank] */](): T = js.native
  
  def exp[T /* <: Tensor[Rank] */](): T = js.native
  
  /**
    * Returns a `tf.Tensor` that has expanded rank, by inserting a dimension
    * into the tensor's shape. See `tf.expandDims` for details.
    *
    * @param axis The dimension index at which to insert shape of 1. Defaults to
    *     0 (the first dimension).
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def expandDims[R2 /* <: Rank */](): Tensor[R2] = js.native
  def expandDims[R2 /* <: Rank */](axis: Double): Tensor[R2] = js.native
  
  def expm1[T /* <: Tensor[Rank] */](): T = js.native
  
  def fft(): Tensor[Rank] = js.native
  
  /** Flatten a Tensor to a 1D array. */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def flatten(): Tensor1D = js.native
  
  def floor[T /* <: Tensor[Rank] */](): T = js.native
  
  def floorDiv[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def floorDiv[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
  
  def gather[T /* <: this.type */](indices: TensorLike): T = js.native
  def gather[T /* <: this.type */](indices: TensorLike, axis: Double): T = js.native
  def gather[T /* <: this.type */](indices: Tensor[Rank]): T = js.native
  def gather[T /* <: this.type */](indices: Tensor[Rank], axis: Double): T = js.native
  
  def greater[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def greater[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
  
  def greaterEqual[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def greaterEqual[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
  
  /**
    * @deprecated strict variants of ops have been deprecated
    */
  def greaterEqualStrict[T /* <: this.type */](x: T): T = js.native
  def greaterEqualStrict[T /* <: this.type */](x: TensorLike): T = js.native
  
  /**
    * @deprecated strict variants of ops have been deprecated
    */
  def greaterStrict[T /* <: this.type */](x: T): T = js.native
  def greaterStrict[T /* <: this.type */](x: TensorLike): T = js.native
  
  /** Unique id of this tensor. */
  val id: Double = js.native
  
  def ifft(): Tensor[Rank] = js.native
  
  def irfft(): Tensor[Rank] = js.native
  
  val isDisposed: Boolean = js.native
  
  var isDisposedInternal: Boolean = js.native
  
  def isFinite[T /* <: Tensor[Rank] */](): T = js.native
  
  def isInf[T /* <: Tensor[Rank] */](): T = js.native
  
  def isNaN[T /* <: Tensor[Rank] */](): T = js.native
  
  /** Whether this tensor has been globally kept. */
  var kept: Boolean = js.native
  
  def leakyRelu[T /* <: Tensor[Rank] */](alpha: Double): T = js.native
  
  def less[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def less[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
  
  def lessEqual[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def lessEqual[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
  
  /**
    * @deprecated strict variants of ops have been deprecated
    */
  def lessEqualStrict[T /* <: this.type */](x: T): T = js.native
  def lessEqualStrict[T /* <: this.type */](x: TensorLike): T = js.native
  
  /**
    * @deprecated strict variants of ops have been deprecated
    */
  def lessStrict[T /* <: this.type */](x: T): T = js.native
  def lessStrict[T /* <: this.type */](x: TensorLike): T = js.native
  
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
  
  def logSoftmax[T /* <: this.type */](): T = js.native
  def logSoftmax[T /* <: this.type */](axis: Double): T = js.native
  
  def logSumExp[T /* <: Tensor[Rank] */](): T = js.native
  def logSumExp[T /* <: Tensor[Rank] */](axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
  def logSumExp[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
  def logSumExp[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
  def logSumExp[T /* <: Tensor[Rank] */](axis: Double): T = js.native
  def logSumExp[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
  
  def logicalAnd(x: TensorLike): Tensor[Rank] = js.native
  def logicalAnd(x: Tensor[Rank]): Tensor[Rank] = js.native
  
  def logicalNot[T /* <: Tensor[Rank] */](): T = js.native
  
  def logicalOr(x: TensorLike): Tensor[Rank] = js.native
  def logicalOr(x: Tensor[Rank]): Tensor[Rank] = js.native
  
  def logicalXor(x: TensorLike): Tensor[Rank] = js.native
  def logicalXor(x: Tensor[Rank]): Tensor[Rank] = js.native
  
  def matMul[T /* <: Tensor[Rank] */](b: T): T = js.native
  def matMul[T /* <: Tensor[Rank] */](b: T, transposeA: js.UndefOr[scala.Nothing], transposeB: Boolean): T = js.native
  def matMul[T /* <: Tensor[Rank] */](b: T, transposeA: Boolean): T = js.native
  def matMul[T /* <: Tensor[Rank] */](b: T, transposeA: Boolean, transposeB: Boolean): T = js.native
  def matMul[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def matMul[T /* <: Tensor[Rank] */](b: TensorLike, transposeA: js.UndefOr[scala.Nothing], transposeB: Boolean): T = js.native
  def matMul[T /* <: Tensor[Rank] */](b: TensorLike, transposeA: Boolean): T = js.native
  def matMul[T /* <: Tensor[Rank] */](b: TensorLike, transposeA: Boolean, transposeB: Boolean): T = js.native
  
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
  
  def maximum[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def maximum[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
  
  /**
    * @deprecated strict variants of ops have been deprecated
    */
  def maximumStrict[T /* <: this.type */](x: T): T = js.native
  def maximumStrict[T /* <: this.type */](x: TensorLike): T = js.native
  
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
  
  def minimum[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def minimum[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
  
  /**
    * @deprecated strict variants of ops have been deprecated
    */
  def minimumStrict[T /* <: this.type */](x: T): T = js.native
  def minimumStrict[T /* <: this.type */](x: TensorLike): T = js.native
  
  def mod[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def mod[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
  
  /**
    * @deprecated strict variants of ops have been deprecated
    */
  def modStrict[T /* <: this.type */](x: T): T = js.native
  def modStrict[T /* <: this.type */](x: TensorLike): T = js.native
  
  def mul[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def mul[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
  
  /**
    * @deprecated strict variants of ops have been deprecated
    */
  def mulStrict[T /* <: this.type */](x: T): T = js.native
  def mulStrict[T /* <: this.type */](x: TensorLike): T = js.native
  
  def neg[T /* <: Tensor[Rank] */](): T = js.native
  
  def norm(): Tensor[Rank] = js.native
  def norm(ord: js.UndefOr[scala.Nothing], axis: js.UndefOr[scala.Nothing], keepDims: Boolean): Tensor[Rank] = js.native
  def norm(ord: js.UndefOr[scala.Nothing], axis: js.Array[Double]): Tensor[Rank] = js.native
  def norm(ord: js.UndefOr[scala.Nothing], axis: js.Array[Double], keepDims: Boolean): Tensor[Rank] = js.native
  def norm(ord: js.UndefOr[scala.Nothing], axis: Double): Tensor[Rank] = js.native
  def norm(ord: js.UndefOr[scala.Nothing], axis: Double, keepDims: Boolean): Tensor[Rank] = js.native
  def norm(ord: Double): Tensor[Rank] = js.native
  def norm(ord: Double, axis: js.UndefOr[scala.Nothing], keepDims: Boolean): Tensor[Rank] = js.native
  def norm(ord: Double, axis: js.Array[Double]): Tensor[Rank] = js.native
  def norm(ord: Double, axis: js.Array[Double], keepDims: Boolean): Tensor[Rank] = js.native
  def norm(ord: Double, axis: Double): Tensor[Rank] = js.native
  def norm(ord: Double, axis: Double, keepDims: Boolean): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_euclidean(ord: euclidean): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_euclidean(ord: euclidean, axis: js.UndefOr[scala.Nothing], keepDims: Boolean): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_euclidean(ord: euclidean, axis: js.Array[Double]): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_euclidean(ord: euclidean, axis: js.Array[Double], keepDims: Boolean): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_euclidean(ord: euclidean, axis: Double): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_euclidean(ord: euclidean, axis: Double, keepDims: Boolean): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_fro(ord: fro): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_fro(ord: fro, axis: js.UndefOr[scala.Nothing], keepDims: Boolean): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_fro(ord: fro, axis: js.Array[Double]): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_fro(ord: fro, axis: js.Array[Double], keepDims: Boolean): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_fro(ord: fro, axis: Double): Tensor[Rank] = js.native
  @JSName("norm")
  def norm_fro(ord: fro, axis: Double, keepDims: Boolean): Tensor[Rank] = js.native
  
  def notEqual[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def notEqual[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
  
  /**
    * @deprecated strict variants of ops have been deprecated
    */
  def notEqualStrict[T /* <: this.type */](x: T): T = js.native
  def notEqualStrict[T /* <: this.type */](x: TensorLike): T = js.native
  
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
  
  def pow[T /* <: Tensor[Rank] */](exp: TensorLike): T = js.native
  def pow[T /* <: Tensor[Rank] */](exp: Tensor[Rank]): T = js.native
  
  def powStrict(exp: TensorLike): Tensor[R] = js.native
  /**
    * @deprecated strict variants of ops have been deprecated
    */
  def powStrict(exp: Tensor[Rank]): Tensor[R] = js.native
  
  def prelu[T /* <: Tensor[Rank] */](alpha: T): T = js.native
  def prelu[T /* <: Tensor[Rank] */](alpha: TensorLike): T = js.native
  
  /**
    * Prints the `tf.Tensor`. See `tf.print` for details.
    *
    * @param verbose Whether to print verbose information about the tensor,
    *    including dtype and size.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
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
  
  /**
    * Reshapes the tensor into the provided shape.
    * See `tf.reshape` for more details.
    *
    * @param newShape An array of integers defining the output tensor shape.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def reshape[R2 /* <: Rank */](
    newShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R2] */ js.Any
  ): Tensor[R2] = js.native
  
  /**
    * Reshapes the tensor into the shape of the provided tensor.
    *
    * @param x The tensor of required shape.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def reshapeAs[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def resizeBilinear(newShape2D: js.Tuple2[Double, Double]): Tensor[R3] = js.native
  def resizeBilinear(newShape2D: js.Tuple2[Double, Double], alignCorners: Boolean): Tensor[R3] = js.native
  
  def resizeNearestNeighbor(newShape2D: js.Tuple2[Double, Double]): Tensor[R3] = js.native
  def resizeNearestNeighbor(newShape2D: js.Tuple2[Double, Double], alignCorners: Boolean): Tensor[R3] = js.native
  
  def reverse[T /* <: Tensor[Rank] */](): T = js.native
  def reverse[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
  def reverse[T /* <: Tensor[Rank] */](axis: Double): T = js.native
  
  def rfft(): Tensor[Rank] = js.native
  
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
  
  def slice[T /* <: Tensor[R] */](begin: js.Array[Double]): T = js.native
  def slice[T /* <: Tensor[R] */](begin: js.Array[Double], size: js.Array[Double]): T = js.native
  def slice[T /* <: Tensor[R] */](begin: js.Array[Double], size: Double): T = js.native
  def slice[T /* <: Tensor[R] */](begin: Double): T = js.native
  def slice[T /* <: Tensor[R] */](begin: Double, size: js.Array[Double]): T = js.native
  def slice[T /* <: Tensor[R] */](begin: Double, size: Double): T = js.native
  
  def softmax[T /* <: this.type */](): T = js.native
  def softmax[T /* <: this.type */](dim: Double): T = js.native
  
  def softplus[T /* <: Tensor[Rank] */](): T = js.native
  
  def spaceToBatchND[R /* <: Rank */](blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): Tensor[R] = js.native
  
  def split[T /* <: Tensor[Rank] */](numOrSizeSplits: js.Array[Double]): js.Array[T] = js.native
  def split[T /* <: Tensor[Rank] */](numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
  def split[T /* <: Tensor[Rank] */](numOrSizeSplits: Double): js.Array[T] = js.native
  def split[T /* <: Tensor[Rank] */](numOrSizeSplits: Double, axis: Double): js.Array[T] = js.native
  
  def sqrt[T /* <: Tensor[Rank] */](): T = js.native
  
  def square[T /* <: Tensor[Rank] */](): T = js.native
  
  def squaredDifference[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def squaredDifference[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
  
  /**
    * @deprecated strict variants of ops have been deprecated
    */
  def squaredDifferenceStrict[T /* <: this.type */](x: T): T = js.native
  def squaredDifferenceStrict[T /* <: this.type */](x: TensorLike): T = js.native
  
  /**
    * Returns a `tf.Tensor` with dimensions of size 1 removed from the shape.
    * See `tf.squeeze` for more details.
    *
    * @param axis A list of numbers. If specified, only squeezes the
    *    dimensions listed. The dimension index starts at 0. It is an error to
    *    squeeze a dimension that is not 1.
    */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def squeeze[T /* <: Tensor[Rank] */](): T = js.native
  def squeeze[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
  
  def stack(x: Tensor[Rank]): Tensor[Rank] = js.native
  def stack(x: Tensor[Rank], axis: Double): Tensor[Rank] = js.native
  
  def step[T /* <: Tensor[Rank] */](): T = js.native
  def step[T /* <: Tensor[Rank] */](alpha: Double): T = js.native
  
  def stridedSlice(begin: js.Array[Double], end: js.Array[Double], strides: js.Array[Double]): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: js.UndefOr[scala.Nothing],
    endMask: js.UndefOr[scala.Nothing],
    ellipsisMask: js.UndefOr[scala.Nothing],
    newAxisMask: js.UndefOr[scala.Nothing],
    shrinkAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: js.UndefOr[scala.Nothing],
    endMask: js.UndefOr[scala.Nothing],
    ellipsisMask: js.UndefOr[scala.Nothing],
    newAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: js.UndefOr[scala.Nothing],
    endMask: js.UndefOr[scala.Nothing],
    ellipsisMask: js.UndefOr[scala.Nothing],
    newAxisMask: Double,
    shrinkAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: js.UndefOr[scala.Nothing],
    endMask: js.UndefOr[scala.Nothing],
    ellipsisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: js.UndefOr[scala.Nothing],
    endMask: js.UndefOr[scala.Nothing],
    ellipsisMask: Double,
    newAxisMask: js.UndefOr[scala.Nothing],
    shrinkAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: js.UndefOr[scala.Nothing],
    endMask: js.UndefOr[scala.Nothing],
    ellipsisMask: Double,
    newAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: js.UndefOr[scala.Nothing],
    endMask: js.UndefOr[scala.Nothing],
    ellipsisMask: Double,
    newAxisMask: Double,
    shrinkAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: js.UndefOr[scala.Nothing],
    endMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: js.UndefOr[scala.Nothing],
    endMask: Double,
    ellipsisMask: js.UndefOr[scala.Nothing],
    newAxisMask: js.UndefOr[scala.Nothing],
    shrinkAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: js.UndefOr[scala.Nothing],
    endMask: Double,
    ellipsisMask: js.UndefOr[scala.Nothing],
    newAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: js.UndefOr[scala.Nothing],
    endMask: Double,
    ellipsisMask: js.UndefOr[scala.Nothing],
    newAxisMask: Double,
    shrinkAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: js.UndefOr[scala.Nothing],
    endMask: Double,
    ellipsisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: js.UndefOr[scala.Nothing],
    endMask: Double,
    ellipsisMask: Double,
    newAxisMask: js.UndefOr[scala.Nothing],
    shrinkAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: js.UndefOr[scala.Nothing],
    endMask: Double,
    ellipsisMask: Double,
    newAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: js.UndefOr[scala.Nothing],
    endMask: Double,
    ellipsisMask: Double,
    newAxisMask: Double,
    shrinkAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(begin: js.Array[Double], end: js.Array[Double], strides: js.Array[Double], beginMask: Double): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: Double,
    endMask: js.UndefOr[scala.Nothing],
    ellipsisMask: js.UndefOr[scala.Nothing],
    newAxisMask: js.UndefOr[scala.Nothing],
    shrinkAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: Double,
    endMask: js.UndefOr[scala.Nothing],
    ellipsisMask: js.UndefOr[scala.Nothing],
    newAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: Double,
    endMask: js.UndefOr[scala.Nothing],
    ellipsisMask: js.UndefOr[scala.Nothing],
    newAxisMask: Double,
    shrinkAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: Double,
    endMask: js.UndefOr[scala.Nothing],
    ellipsisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: Double,
    endMask: js.UndefOr[scala.Nothing],
    ellipsisMask: Double,
    newAxisMask: js.UndefOr[scala.Nothing],
    shrinkAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: Double,
    endMask: js.UndefOr[scala.Nothing],
    ellipsisMask: Double,
    newAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: Double,
    endMask: js.UndefOr[scala.Nothing],
    ellipsisMask: Double,
    newAxisMask: Double,
    shrinkAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: Double,
    endMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: Double,
    endMask: Double,
    ellipsisMask: js.UndefOr[scala.Nothing],
    newAxisMask: js.UndefOr[scala.Nothing],
    shrinkAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: Double,
    endMask: Double,
    ellipsisMask: js.UndefOr[scala.Nothing],
    newAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: Double,
    endMask: Double,
    ellipsisMask: js.UndefOr[scala.Nothing],
    newAxisMask: Double,
    shrinkAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: Double,
    endMask: Double,
    ellipsisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: Double,
    endMask: Double,
    ellipsisMask: Double,
    newAxisMask: js.UndefOr[scala.Nothing],
    shrinkAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.Array[Double],
    beginMask: Double,
    endMask: Double,
    ellipsisMask: Double,
    newAxisMask: Double
  ): Tensor[Rank] = js.native
  def stridedSlice(
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
  
  def sub[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
  def sub[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
  
  /**
    * @deprecated strict variants of ops have been deprecated
    */
  def subStrict[T /* <: this.type */](x: T): T = js.native
  def subStrict[T /* <: this.type */](x: TensorLike): T = js.native
  
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
  
  /** Casts the array to type `bool` */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def toBool(): this.type = js.native
  
  /** Casts the array to type `float32` */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def toFloat[T /* <: this.type */](): T = js.native
  
  /** Casts the array to type `int32` */
  /** @doc {heading: 'Tensors', subheading: 'Classes'} */
  def toInt(): this.type = js.native
  
  def toString(verbose: Boolean): String = js.native
  
  def topk[T /* <: Tensor[Rank] */](): Indices[T] = js.native
  def topk[T /* <: Tensor[Rank] */](k: js.UndefOr[scala.Nothing], sorted: Boolean): Indices[T] = js.native
  def topk[T /* <: Tensor[Rank] */](k: Double): Indices[T] = js.native
  def topk[T /* <: Tensor[Rank] */](k: Double, sorted: Boolean): Indices[T] = js.native
  
  def transpose[T /* <: Tensor[Rank] */](): T = js.native
  def transpose[T /* <: Tensor[Rank] */](perm: js.Array[Double]): T = js.native
  
  def unsortedSegmentSum[T /* <: Tensor[Rank] */](segmentIds: TensorLike1D, numSegments: Double): T = js.native
  def unsortedSegmentSum[T /* <: Tensor[Rank] */](segmentIds: Tensor1D, numSegments: Double): T = js.native
  
  def unstack(): js.Array[Tensor[Rank]] = js.native
  def unstack(axis: Double): js.Array[Tensor[Rank]] = js.native
  
  def variable(): Variable[R] = js.native
  def variable(trainable: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], dtype: DataType): Variable[R] = js.native
  def variable(trainable: js.UndefOr[scala.Nothing], name: String): Variable[R] = js.native
  def variable(trainable: js.UndefOr[scala.Nothing], name: String, dtype: DataType): Variable[R] = js.native
  def variable(trainable: Boolean): Variable[R] = js.native
  def variable(trainable: Boolean, name: js.UndefOr[scala.Nothing], dtype: DataType): Variable[R] = js.native
  def variable(trainable: Boolean, name: String): Variable[R] = js.native
  def variable(trainable: Boolean, name: String, dtype: DataType): Variable[R] = js.native
  
  def where(condition: TensorLike, x: TensorLike): Tensor[Rank] = js.native
  def where(condition: TensorLike, x: Tensor[Rank]): Tensor[Rank] = js.native
  def where(condition: Tensor[Rank], x: TensorLike): Tensor[Rank] = js.native
  def where(condition: Tensor[Rank], x: Tensor[Rank]): Tensor[Rank] = js.native
  
  def zerosLike[T /* <: Tensor[Rank] */](): T = js.native
}
