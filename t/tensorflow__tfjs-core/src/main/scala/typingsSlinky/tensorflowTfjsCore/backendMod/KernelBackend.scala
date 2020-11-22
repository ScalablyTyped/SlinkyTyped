package typingsSlinky.tensorflowTfjsCore.backendMod

import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv3DInfo
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Backend
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Scalar
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor5D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.fusedTypesMod.FusedBatchMatMulConfig
import typingsSlinky.tensorflowTfjsCore.fusedTypesMod.FusedConv2DConfig
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreNumbers.`16`
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreNumbers.`32`
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bilinear
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.nearest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/backends/backend", "KernelBackend")
@js.native
class KernelBackend ()
  extends TensorStorage
     with Backend
     with BackendTimer {
  
  def LRNGrad(
    dy: Tensor4D,
    inputImage: Tensor4D,
    outputImage: Tensor4D,
    radius: Double,
    bias: Double,
    alpha: Double,
    beta: Double
  ): Tensor4D = js.native
  
  def abs[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def acos[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def acosh[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def add(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  
  def addN[T /* <: Tensor[Rank] */](tensors: js.Array[T]): T = js.native
  
  def all(x: Tensor[Rank], axes: js.Array[Double]): Tensor[Rank] = js.native
  
  def any(x: Tensor[Rank], axes: js.Array[Double]): Tensor[Rank] = js.native
  
  def argMax(x: Tensor[Rank], axis: Double): Tensor[Rank] = js.native
  
  def argMin(x: Tensor[Rank], axis: Double): Tensor[Rank] = js.native
  
  def asin[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def asinh[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def atan[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def atan2[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  
  def atanh[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def avgPool(x: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
  
  def avgPool3d(x: Tensor5D, convInfo: Conv3DInfo): Tensor5D = js.native
  
  def avgPool3dBackprop(dy: Tensor5D, x: Tensor5D, convInfo: Conv3DInfo): Tensor5D = js.native
  
  def avgPoolBackprop(dy: Tensor4D, x: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
  
  def batchMatMul(a: Tensor3D, b: Tensor3D, transposeA: Boolean, transposeB: Boolean): Tensor3D = js.native
  
  def batchNorm(
    x: Tensor4D,
    mean: Tensor4D | Tensor1D,
    variance: Tensor4D | Tensor1D,
    offset: js.UndefOr[Tensor4D | Tensor1D],
    scale: js.UndefOr[Tensor4D | Tensor1D],
    varianceEpsilon: js.UndefOr[Double]
  ): Tensor4D = js.native
  
  def batchToSpaceND[T /* <: Tensor[Rank] */](x: T, blockShape: js.Array[Double], crops: js.Array[js.Array[Double]]): T = js.native
  
  def cast[T /* <: Tensor[Rank] */](x: T, dtype: DataType): T = js.native
  
  def ceil[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def clip[T /* <: Tensor[Rank] */](x: T, min: Double, max: Double): T = js.native
  
  def complex[T /* <: Tensor[Rank] */](real: T, imag: T): T = js.native
  
  def complexAbs[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def concat(tensors: js.Array[Tensor[Rank]], axis: Double): Tensor[Rank] = js.native
  
  def conv2d(x: Tensor4D, filter: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
  
  def conv2dDerFilter(x: Tensor4D, dY: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
  
  def conv2dDerInput(dy: Tensor4D, filter: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
  
  def conv3d(x: Tensor5D, filter: Tensor5D, convInfo: Conv3DInfo): Tensor5D = js.native
  
  def conv3dDerFilter(x: Tensor5D, dY: Tensor5D, convInfo: Conv3DInfo): Tensor5D = js.native
  
  def conv3dDerInput(dy: Tensor5D, filter: Tensor5D, convInfo: Conv3DInfo): Tensor5D = js.native
  
  def cos[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def cosh[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  @JSName("cropAndResize")
  def cropAndResize_bilinear(
    image: Tensor4D,
    boxes: Tensor2D,
    boxIndex: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: bilinear,
    extrapolationValue: Double
  ): Tensor4D = js.native
  @JSName("cropAndResize")
  def cropAndResize_nearest(
    image: Tensor4D,
    boxes: Tensor2D,
    boxIndex: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: nearest,
    extrapolationValue: Double
  ): Tensor4D = js.native
  
  def cumsum(x: Tensor[Rank], axis: Double, exclusive: Boolean, reverse: Boolean): Tensor[Rank] = js.native
  
  def depthToSpace(x: Tensor4D, blockSize: Double, dataFormat: String): Tensor4D = js.native
  
  def depthwiseConv2D(input: Tensor4D, filter: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
  
  def depthwiseConv2DDerFilter(x: Tensor4D, dY: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
  
  def depthwiseConv2DDerInput(dy: Tensor4D, filter: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
  
  def diag(x: Tensor[Rank]): Tensor[Rank] = js.native
  
  def dispose(): Unit = js.native
  
  def elu[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def eluDer[T /* <: Tensor[Rank] */](dy: T, y: T): T = js.native
  
  /** Returns the smallest representable number.  */
  def epsilon(): Double = js.native
  
  def equal(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  
  def erf[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def exp[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def expm1[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def fft(x: Tensor2D): Tensor2D = js.native
  
  def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: String
  ): Tensor[R] = js.native
  def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: String,
    dtype: DataType
  ): Tensor[R] = js.native
  def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: Double
  ): Tensor[R] = js.native
  def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: Double,
    dtype: DataType
  ): Tensor[R] = js.native
  
  /** Returns the highest precision for floats in bits (e.g. 16 or 32) */
  def floatPrecision(): `16` | `32` = js.native
  
  def floor[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def floorDiv(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  
  def fusedBatchMatMul(hasABTransposeATransposeBBiasActivationPreluActivationWeights: FusedBatchMatMulConfig): Tensor3D = js.native
  
  def fusedConv2d(hasInputFilterConvInfoBiasActivationPreluActivationWeights: FusedConv2DConfig): Tensor4D = js.native
  
  def fusedDepthwiseConv2D(hasInputFilterConvInfoBiasActivationPreluActivationWeights: FusedConv2DConfig): Tensor4D = js.native
  
  def gather[T /* <: Tensor[Rank] */](x: T, indices: Tensor1D, axis: Double): T = js.native
  
  def gatherND(x: Tensor[Rank], indices: Tensor[Rank]): Tensor[Rank] = js.native
  
  def greater(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  
  def greaterEqual(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  
  def ifft(x: Tensor2D): Tensor2D = js.native
  
  def imag[T /* <: Tensor[Rank] */](input: T): T = js.native
  
  def int[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def isFinite[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def isInf[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def isNaN[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def less(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  
  def lessEqual(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  
  def linspace(start: Double, stop: Double, num: Double): Tensor1D = js.native
  
  def localResponseNormalization4D(x: Tensor4D, radius: Double, bias: Double, alpha: Double, beta: Double): Tensor4D = js.native
  
  def log[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def log1p[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def logicalAnd(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  
  def logicalNot[T /* <: Tensor[Rank] */](a: T): T = js.native
  
  def logicalOr(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  
  def max(x: Tensor[Rank], axes: js.Array[Double]): Tensor[Rank] = js.native
  
  def maxPool(x: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
  
  def maxPool3d(x: Tensor5D, convInfo: Conv3DInfo): Tensor5D = js.native
  
  def maxPool3dBackprop(dy: Tensor5D, x: Tensor5D, y: Tensor5D, convInfo: Conv3DInfo): Tensor5D = js.native
  
  def maxPoolBackprop(dy: Tensor4D, x: Tensor4D, y: Tensor4D, convInfo: Conv2DInfo): Tensor4D = js.native
  
  def maximum(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  
  def min(x: Tensor[Rank], axes: js.Array[Double]): Tensor[Rank] = js.native
  
  def minimum(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  
  def mod(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  
  def multinomial(logits: Tensor2D, normalized: Boolean, numSamples: Double, seed: Double): Tensor2D = js.native
  
  def multiply(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  
  def neg[T /* <: Tensor[Rank] */](a: T): T = js.native
  
  def nonMaxSuppression(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): Tensor1D = js.native
  def nonMaxSuppression(
    boxes: Tensor2D,
    scores: Tensor1D,
    maxOutputSize: Double,
    iouThreshold: Double,
    scoreThreshold: Double
  ): Tensor1D = js.native
  
  def notEqual(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  
  def oneHot(indices: Tensor1D, depth: Double, onValue: Double, offValue: Double): Tensor2D = js.native
  
  def onesLike[R /* <: Rank */](x: Tensor[R]): Tensor[R] = js.native
  
  def pad[T /* <: Tensor[Rank] */](x: T, paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double): T = js.native
  
  def pow[T /* <: Tensor[Rank] */](a: T, b: Tensor[Rank]): T = js.native
  
  def prelu[T /* <: Tensor[Rank] */](x: T, a: T): T = js.native
  
  def prod(x: Tensor[Rank], axes: js.Array[Double]): Tensor[Rank] = js.native
  
  def real[T /* <: Tensor[Rank] */](input: T): T = js.native
  
  def realDivide(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  
  def reciprocal[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def relu[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def relu6[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def reshape[T /* <: Tensor[Rank] */, R /* <: Rank */](
    x: T,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  
  def resizeBilinear(x: Tensor4D, newHeight: Double, newWidth: Double, alignCorners: Boolean): Tensor4D = js.native
  
  def resizeBilinearBackprop(dy: Tensor4D, x: Tensor4D, alignCorners: Boolean): Tensor4D = js.native
  
  def resizeNearestNeighbor(x: Tensor4D, newHEight: Double, newWidth: Double, alignCorners: Boolean): Tensor4D = js.native
  
  def resizeNearestNeighborBackprop(dy: Tensor4D, x: Tensor4D, alignCorners: Boolean): Tensor4D = js.native
  
  def reverse[T /* <: Tensor[Rank] */](a: T, axis: js.Array[Double]): T = js.native
  
  def round[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def rsqrt[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def scatterND[R /* <: Rank */](
    indices: Tensor[Rank],
    updates: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  
  def select(condition: Tensor[Rank], a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  
  def selu[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def sigmoid[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def sign[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def sin[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def sinh[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def slice[T /* <: Tensor[Rank] */](x: T, begin: js.Array[Double], size: js.Array[Double]): T = js.native
  
  def softmax[T /* <: Tensor[Rank] */](x: T, dim: Double): T = js.native
  
  def softplus[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def spaceToBatchND[T /* <: Tensor[Rank] */](x: T, blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): T = js.native
  
  def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = js.native
  
  def split[T /* <: Tensor[Rank] */](value: T, sizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
  
  def sqrt[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def square[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def squaredDifference(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  
  def step[T /* <: Tensor[Rank] */](x: T, alpha: Double): T = js.native
  
  def stridedSlice[T /* <: Tensor[Rank] */](x: T, begin: js.Array[Double], end: js.Array[Double], strides: js.Array[Double]): T = js.native
  
  def subtract(a: Tensor[Rank], b: Tensor[Rank]): Tensor[Rank] = js.native
  
  def sum(x: Tensor[Rank], axes: js.Array[Double]): Tensor[Rank] = js.native
  
  def tan[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def tanh[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  def tile[T /* <: Tensor[Rank] */](x: T, reps: js.Array[Double]): T = js.native
  
  def topk[T /* <: Tensor[Rank] */](x: T, k: Double, sorted: Boolean): js.Tuple2[T, T] = js.native
  
  def transpose[T /* <: Tensor[Rank] */](x: T, perm: js.Array[Double]): T = js.native
  
  def unsortedSegmentSum[T /* <: Tensor[Rank] */](x: T, segmentIds: Tensor1D, numSegments: Double): Tensor[Rank] = js.native
  
  def unstack(x: Tensor[Rank], axis: Double): js.Array[Tensor[Rank]] = js.native
  
  def where(condition: Tensor[Rank]): Tensor2D = js.native
  
  def zerosLike[R /* <: Rank */](x: Tensor[R]): Tensor[R] = js.native
}
