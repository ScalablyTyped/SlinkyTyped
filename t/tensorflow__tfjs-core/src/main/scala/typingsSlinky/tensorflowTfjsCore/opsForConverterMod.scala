package typingsSlinky.tensorflowTfjsCore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsCore.anon.A
import typingsSlinky.tensorflowTfjsCore.anon.Activation
import typingsSlinky.tensorflowTfjsCore.anon.Bias
import typingsSlinky.tensorflowTfjsCore.anon.Indices
import typingsSlinky.tensorflowTfjsCore.anon.Mean
import typingsSlinky.tensorflowTfjsCore.anon.Values
import typingsSlinky.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Scalar
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor5D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor6D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.TensorBuffer
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Variable
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R1
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R2
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R3
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R4
import typingsSlinky.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typingsSlinky.tensorflowTfjsCore.distTypesMod.ScalarLike
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike1D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike2D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike3D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike4D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike5D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike6D
import typingsSlinky.tensorflowTfjsCore.lossOpsUtilsMod.Reduction
import typingsSlinky.tensorflowTfjsCore.multiRnnCellMod.LSTMCellFunc
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCDHW
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCW
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NDHWC
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NWC
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.avg
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bilinear
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.euclidean
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.fro
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.max
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.nearest
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

object opsForConverterMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "OP_SCOPE_SUFFIX")
  @js.native
  val OP_SCOPE_SUFFIX: /* "__op" */ String = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "abs")
  @js.native
  def abs[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "abs")
  @js.native
  def abs[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "acos")
  @js.native
  def acos[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "acos")
  @js.native
  def acos[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "acosh")
  @js.native
  def acosh[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "acosh")
  @js.native
  def acosh[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "add")
  @js.native
  def add[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "add")
  @js.native
  def add[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "add")
  @js.native
  def add[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "add")
  @js.native
  def add[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "addN")
  @js.native
  def addN[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "addStrict")
  @js.native
  def addStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "addStrict")
  @js.native
  def addStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "addStrict")
  @js.native
  def addStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "addStrict")
  @js.native
  def addStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "all")
  @js.native
  def all[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "all")
  @js.native
  def all[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "all")
  @js.native
  def all[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "all")
  @js.native
  def all[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "all")
  @js.native
  def all[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "all")
  @js.native
  def all[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "all")
  @js.native
  def all[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "all")
  @js.native
  def all[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "all")
  @js.native
  def all[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "all")
  @js.native
  def all[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "all")
  @js.native
  def all[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "all")
  @js.native
  def all[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "any")
  @js.native
  def any[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "any")
  @js.native
  def any[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "any")
  @js.native
  def any[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "any")
  @js.native
  def any[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "any")
  @js.native
  def any[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "any")
  @js.native
  def any[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "any")
  @js.native
  def any[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "any")
  @js.native
  def any[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "any")
  @js.native
  def any[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "any")
  @js.native
  def any[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "any")
  @js.native
  def any[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "any")
  @js.native
  def any[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "argMax")
  @js.native
  def argMax[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "argMax")
  @js.native
  def argMax[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "argMax")
  @js.native
  def argMax[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "argMax")
  @js.native
  def argMax[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "argMin")
  @js.native
  def argMin[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "argMin")
  @js.native
  def argMin[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "argMin")
  @js.native
  def argMin[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "argMin")
  @js.native
  def argMin[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "asin")
  @js.native
  def asin[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "asin")
  @js.native
  def asin[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "asinh")
  @js.native
  def asinh[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "asinh")
  @js.native
  def asinh[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "atan")
  @js.native
  def atan[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "atan")
  @js.native
  def atan[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "atan2")
  @js.native
  def atan2[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "atan2")
  @js.native
  def atan2[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "atan2")
  @js.native
  def atan2[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "atan2")
  @js.native
  def atan2[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "atanh")
  @js.native
  def atanh[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "atanh")
  @js.native
  def atanh[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "avgPool")
  @js.native
  def avgPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "avgPool3d")
  @js.native
  def avgPool3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dimRoundingMode: js.UndefOr[floor | round | ceil],
    dataFormat: js.UndefOr[NDHWC | NCDHW],
    dilations: js.UndefOr[(js.Tuple3[Double, Double, Double]) | Double]
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "basicLSTMCell")
  @js.native
  val basicLSTMCell: js.Function6[
    /* forgetBias */ Scalar | TensorLike, 
    /* lstmKernel */ Tensor2D | TensorLike, 
    /* lstmBias */ Tensor1D | TensorLike, 
    /* data */ Tensor2D | TensorLike, 
    /* c */ Tensor2D | TensorLike, 
    /* h */ Tensor2D | TensorLike, 
    js.Tuple2[Tensor2D, Tensor2D]
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "batchNorm")
  @js.native
  def batchNorm[R /* <: Rank */](
    x: Tensor[R] | TensorLike,
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    offset: js.UndefOr[Tensor[R] | Tensor1D | TensorLike],
    scale: js.UndefOr[Tensor[R] | Tensor1D | TensorLike],
    varianceEpsilon: js.UndefOr[Double]
  ): Tensor[R] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "batchNorm2d")
  @js.native
  val batchNorm2d: js.Function6[
    /* x */ Tensor2D | TensorLike, 
    /* mean */ Tensor2D | Tensor1D | TensorLike, 
    /* variance */ Tensor2D | Tensor1D | TensorLike, 
    /* offset */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
    /* scale */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
    /* varianceEpsilon */ js.UndefOr[Double], 
    Tensor2D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "batchNorm3d")
  @js.native
  val batchNorm3d: js.Function6[
    /* x */ Tensor3D | TensorLike, 
    /* mean */ Tensor3D | Tensor1D | TensorLike, 
    /* variance */ Tensor3D | Tensor1D | TensorLike, 
    /* offset */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
    /* scale */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
    /* varianceEpsilon */ js.UndefOr[Double], 
    Tensor3D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "batchNorm4d")
  @js.native
  val batchNorm4d: js.Function6[
    /* x */ Tensor4D | TensorLike, 
    /* mean */ Tensor4D | Tensor1D | TensorLike, 
    /* variance */ Tensor4D | Tensor1D | TensorLike, 
    /* offset */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
    /* scale */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
    /* varianceEpsilon */ js.UndefOr[Double], 
    Tensor4D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "batchToSpaceND")
  @js.native
  def batchToSpaceND[T /* <: Tensor[Rank] */](x: T, blockShape: js.Array[Double], crops: js.Array[js.Array[Double]]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "batchToSpaceND")
  @js.native
  def batchToSpaceND[T /* <: Tensor[Rank] */](x: TensorLike, blockShape: js.Array[Double], crops: js.Array[js.Array[Double]]): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "booleanMaskAsync")
  @js.native
  val booleanMaskAsync: js.Function3[
    /* tensor */ Tensor[Rank] | TensorLike, 
    /* mask */ Tensor[Rank] | TensorLike, 
    /* axis */ js.UndefOr[Double], 
    js.Promise[Tensor[Rank]]
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "broadcastTo")
  @js.native
  def broadcastTo[R /* <: Rank */](
    x: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "broadcastTo")
  @js.native
  def broadcastTo[R /* <: Rank */](
    x: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "buffer")
  @js.native
  def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): TensorBuffer[R, float32] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "buffer")
  @js.native
  def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: js.UndefOr[scala.Nothing],
    values: js.Array[String]
  ): TensorBuffer[R, string] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "buffer")
  @js.native
  def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: js.UndefOr[scala.Nothing],
    values: js.typedarray.Float32Array
  ): TensorBuffer[R, float32] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "buffer")
  @js.native
  def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: js.UndefOr[scala.Nothing],
    values: js.typedarray.Int32Array
  ): TensorBuffer[R, int32] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "buffer")
  @js.native
  def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: js.UndefOr[scala.Nothing],
    values: js.typedarray.Uint8Array
  ): TensorBuffer[R, bool] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "buffer")
  @js.native
  def buffer_bool[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool
  ): TensorBuffer[R, bool] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "buffer")
  @js.native
  def buffer_bool[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool,
    values: js.typedarray.Uint8Array
  ): TensorBuffer[R, bool] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "buffer")
  @js.native
  def buffer_complex64[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64
  ): TensorBuffer[R, complex64] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "buffer")
  @js.native
  def buffer_complex64[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64,
    values: js.typedarray.Float32Array
  ): TensorBuffer[R, complex64] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "buffer")
  @js.native
  def buffer_float32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: float32
  ): TensorBuffer[R, float32] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "buffer")
  @js.native
  def buffer_float32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: float32,
    values: js.typedarray.Float32Array
  ): TensorBuffer[R, float32] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "buffer")
  @js.native
  def buffer_int32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32
  ): TensorBuffer[R, int32] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "buffer")
  @js.native
  def buffer_int32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32,
    values: js.typedarray.Int32Array
  ): TensorBuffer[R, int32] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "buffer")
  @js.native
  def buffer_string[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: string
  ): TensorBuffer[R, string] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "buffer")
  @js.native
  def buffer_string[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: string,
    values: js.Array[String]
  ): TensorBuffer[R, string] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cast")
  @js.native
  def cast[T /* <: Tensor[Rank] */](x: T, dtype: DataType): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cast")
  @js.native
  def cast[T /* <: Tensor[Rank] */](x: TensorLike, dtype: DataType): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "ceil")
  @js.native
  def ceil[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "ceil")
  @js.native
  def ceil[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "clipByValue")
  @js.native
  def clipByValue[T /* <: Tensor[Rank] */](x: T, clipValueMin: Double, clipValueMax: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "clipByValue")
  @js.native
  def clipByValue[T /* <: Tensor[Rank] */](x: TensorLike, clipValueMin: Double, clipValueMax: Double): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "clone")
  @js.native
  def clone_[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "clone")
  @js.native
  def clone_[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "complex")
  @js.native
  def complex[T /* <: Tensor[Rank] */](real: T, imag: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "complex")
  @js.native
  def complex[T /* <: Tensor[Rank] */](real: T, imag: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "complex")
  @js.native
  def complex[T /* <: Tensor[Rank] */](real: TensorLike, imag: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "complex")
  @js.native
  def complex[T /* <: Tensor[Rank] */](real: TensorLike, imag: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "concat")
  @js.native
  def concat[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "concat")
  @js.native
  def concat[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike], axis: Double): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "concat1d")
  @js.native
  val concat1d: js.Function1[/* tensors */ js.Array[Tensor1D | TensorLike], Tensor1D] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "concat2d")
  @js.native
  val concat2d: js.Function2[/* tensors */ js.Array[Tensor2D | TensorLike], /* axis */ Double, Tensor2D] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "concat3d")
  @js.native
  val concat3d: js.Function2[/* tensors */ js.Array[Tensor3D | TensorLike], /* axis */ Double, Tensor3D] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "concat4d")
  @js.native
  val concat4d: js.Function2[/* tensors */ js.Array[Tensor4D | TensorLike], /* axis */ Double, Tensor4D] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv1d")
  @js.native
  def conv1d[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid_ | same_ | Double | ExplicitPadding,
    dataFormat: js.UndefOr[NWC | NCW],
    dilation: js.UndefOr[Double],
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv2d")
  @js.native
  def conv2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double | ExplicitPadding,
    dataFormat: js.UndefOr[NHWC | NCHW],
    dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv2dTranspose")
  @js.native
  def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    outputShape: (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple3[Double, Double, Double]),
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3d")
  @js.native
  def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D | TensorLike,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_,
    dataFormat: js.UndefOr[NDHWC | NCDHW],
    dilations: js.UndefOr[(js.Tuple3[Double, Double, Double]) | Double]
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: valid_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: same_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: valid_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: valid_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: same_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: valid_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: valid_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: same_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: valid_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: valid_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: same_
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "conv3dTranspose")
  @js.native
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: valid_
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cos")
  @js.native
  def cos[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cos")
  @js.native
  def cos[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cosh")
  @js.native
  def cosh[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cosh")
  @js.native
  def cosh[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cosineWindow")
  @js.native
  def cosineWindow(windowLength: Double, a: Double, b: Double): Tensor1D = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cumsum")
  @js.native
  def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cumsum")
  @js.native
  def cumsum[T /* <: Tensor[Rank] */](
    x: Tensor[Rank],
    axis: js.UndefOr[scala.Nothing],
    exclusive: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cumsum")
  @js.native
  def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.UndefOr[scala.Nothing], exclusive: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cumsum")
  @js.native
  def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.UndefOr[scala.Nothing], exclusive: Boolean, reverse: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cumsum")
  @js.native
  def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cumsum")
  @js.native
  def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: js.UndefOr[scala.Nothing], reverse: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cumsum")
  @js.native
  def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cumsum")
  @js.native
  def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Boolean, reverse: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cumsum")
  @js.native
  def cumsum[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cumsum")
  @js.native
  def cumsum[T /* <: Tensor[Rank] */](
    x: TensorLike,
    axis: js.UndefOr[scala.Nothing],
    exclusive: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cumsum")
  @js.native
  def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.UndefOr[scala.Nothing], exclusive: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cumsum")
  @js.native
  def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.UndefOr[scala.Nothing], exclusive: Boolean, reverse: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cumsum")
  @js.native
  def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cumsum")
  @js.native
  def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: js.UndefOr[scala.Nothing], reverse: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cumsum")
  @js.native
  def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "cumsum")
  @js.native
  def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Boolean, reverse: Boolean): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "depthToSpace")
  @js.native
  val depthToSpace: js.Function3[
    /* x */ Tensor4D | TensorLike4D, 
    /* blockSize */ Double, 
    /* dataFormat */ js.UndefOr[NHWC | NCHW], 
    Tensor4D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "depthwiseConv2d")
  @js.native
  def depthwiseConv2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dataFormat: js.UndefOr[NHWC | NCHW],
    dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "diag")
  @js.native
  val diag: js.Function1[/* x */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "dilation2d")
  @js.native
  def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_,
    dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    dataFormat: js.UndefOr[NHWC]
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "div")
  @js.native
  def div[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "div")
  @js.native
  def div[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "div")
  @js.native
  def div[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "div")
  @js.native
  def div[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "divNoNan")
  @js.native
  def divNoNan[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "divNoNan")
  @js.native
  def divNoNan[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "divNoNan")
  @js.native
  def divNoNan[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "divNoNan")
  @js.native
  def divNoNan[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "divStrict")
  @js.native
  def divStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "divStrict")
  @js.native
  def divStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "divStrict")
  @js.native
  def divStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "divStrict")
  @js.native
  def divStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "dot")
  @js.native
  val dot: js.Function2[/* t1 */ Tensor[Rank] | TensorLike, /* t2 */ Tensor[Rank] | TensorLike, Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "dropout")
  @js.native
  val dropout: js.Function4[
    /* x */ Tensor[Rank] | TensorLike, 
    /* rate */ Double, 
    /* noiseShape */ js.UndefOr[js.Array[Double]], 
    /* seed */ js.UndefOr[Double | String], 
    Tensor[Rank]
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "elu")
  @js.native
  def elu[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "elu")
  @js.native
  def elu[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "enclosingPowerOfTwo")
  @js.native
  def enclosingPowerOfTwo(value: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "equal")
  @js.native
  def equal[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "equal")
  @js.native
  def equal[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "equal")
  @js.native
  def equal[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "equal")
  @js.native
  def equal[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "equalStrict")
  @js.native
  def equalStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "equalStrict")
  @js.native
  def equalStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "equalStrict")
  @js.native
  def equalStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "equalStrict")
  @js.native
  def equalStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "erf")
  @js.native
  def erf[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "erf")
  @js.native
  def erf[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "exp")
  @js.native
  def exp[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "exp")
  @js.native
  def exp[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "expandDims")
  @js.native
  def expandDims[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "expandDims")
  @js.native
  def expandDims[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "expandDims")
  @js.native
  def expandDims[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "expandDims")
  @js.native
  def expandDims[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "expm1")
  @js.native
  def expm1[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "expm1")
  @js.native
  def expm1[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "eye")
  @js.native
  val eye: js.Function4[
    /* numRows */ Double, 
    /* numColumns */ js.UndefOr[Double], 
    /* batchShape */ js.UndefOr[
      js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
    ], 
    /* dtype */ js.UndefOr[DataType], 
    Tensor2D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "fft")
  @js.native
  val fft: js.Function1[/* input */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "fill")
  @js.native
  def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: String
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "fill")
  @js.native
  def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: String,
    dtype: DataType
  ): Tensor[R] = js.native
  /**
    * Creates a `tf.Tensor` filled with a scalar value.
    *
    * ```js
    * tf.fill([2, 2], 4).print();
    * ```
    *
    * @param shape An array of integers defining the output tensor shape.
    * @param value The scalar value to fill the tensor with.
    * @param dtype The type of an element in the resulting tensor. Defaults to
    * 'float'.
    *
    * @doc {heading: 'Tensors', subheading: 'Creation'}
    */
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "fill")
  @js.native
  def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "fill")
  @js.native
  def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: Double,
    dtype: DataType
  ): Tensor[R] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "floor")
  @js.native
  def floor[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "floor")
  @js.native
  def floor[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "floorDiv")
  @js.native
  def floorDiv[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "floorDiv")
  @js.native
  def floorDiv[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "floorDiv")
  @js.native
  def floorDiv[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "floorDiv")
  @js.native
  def floorDiv[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  object fused {
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "fused.conv2d")
    @js.native
    def conv2d[T /* <: Tensor3D | Tensor4D */](
      hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights: Activation[T]
    ): T = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "fused.depthwiseConv2d")
    @js.native
    def depthwiseConv2d[T /* <: Tensor3D | Tensor4D */](
      hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights: Bias[T]
    ): T = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "fused.matMul")
    @js.native
    def matMul[T /* <: Tensor[Rank] */](hasABTransposeATransposeBBiasActivationPreluActivationWeights: A[T]): T = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "gather")
  @js.native
  def gather[T /* <: Tensor[Rank] */](x: T, indices: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "gather")
  @js.native
  def gather[T /* <: Tensor[Rank] */](x: T, indices: Tensor[Rank], axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "gather")
  @js.native
  def gather[T /* <: Tensor[Rank] */](x: T, indices: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "gather")
  @js.native
  def gather[T /* <: Tensor[Rank] */](x: T, indices: TensorLike, axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "gather")
  @js.native
  def gather[T /* <: Tensor[Rank] */](x: TensorLike, indices: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "gather")
  @js.native
  def gather[T /* <: Tensor[Rank] */](x: TensorLike, indices: Tensor[Rank], axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "gather")
  @js.native
  def gather[T /* <: Tensor[Rank] */](x: TensorLike, indices: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "gather")
  @js.native
  def gather[T /* <: Tensor[Rank] */](x: TensorLike, indices: TensorLike, axis: Double): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "gatherND")
  @js.native
  val gatherND: js.Function2[
    /* x */ Tensor[Rank] | TensorLike, 
    /* indices */ Tensor[Rank] | TensorLike, 
    Tensor[Rank]
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "greater")
  @js.native
  def greater[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "greater")
  @js.native
  def greater[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "greater")
  @js.native
  def greater[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "greater")
  @js.native
  def greater[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "greaterEqual")
  @js.native
  def greaterEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "greaterEqual")
  @js.native
  def greaterEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "greaterEqual")
  @js.native
  def greaterEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "greaterEqual")
  @js.native
  def greaterEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "greaterEqualStrict")
  @js.native
  def greaterEqualStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "greaterEqualStrict")
  @js.native
  def greaterEqualStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "greaterEqualStrict")
  @js.native
  def greaterEqualStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "greaterEqualStrict")
  @js.native
  def greaterEqualStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "greaterStrict")
  @js.native
  def greaterStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "greaterStrict")
  @js.native
  def greaterStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "greaterStrict")
  @js.native
  def greaterStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "greaterStrict")
  @js.native
  def greaterStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "ifft")
  @js.native
  val ifft: js.Function1[/* input */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "imag")
  @js.native
  def imag[T /* <: Tensor[Rank] */](input: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "imag")
  @js.native
  def imag[T /* <: Tensor[Rank] */](input: TensorLike): T = js.native
  
  object image {
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.cropAndResize")
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
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.flipLeftRight")
    @js.native
    def flipLeftRight(image: String): Tensor[R4] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.flipLeftRight")
    @js.native
    def flipLeftRight(image: js.Array[js.typedarray.Uint8Array]): Tensor[R4] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.flipLeftRight")
    @js.native
    def flipLeftRight(image: js.typedarray.Float32Array): Tensor[R4] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.flipLeftRight")
    @js.native
    def flipLeftRight(image: js.typedarray.Int32Array): Tensor[R4] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.flipLeftRight")
    @js.native
    def flipLeftRight(image: js.typedarray.Uint8Array): Tensor[R4] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.flipLeftRight")
    @js.native
    def flipLeftRight(image: Boolean): Tensor[R4] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.flipLeftRight")
    @js.native
    def flipLeftRight(image: Double): Tensor[R4] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.flipLeftRight")
    @js.native
    def flipLeftRight(image: Tensor[R4]): Tensor[R4] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.flipLeftRight")
    @js.native
    def flipLeftRight(
      image: RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ]
    ): Tensor[R4] = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.nonMaxSuppression")
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
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.nonMaxSuppressionAsync")
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
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.nonMaxSuppressionPadded")
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
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.nonMaxSuppressionPaddedAsync")
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
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.nonMaxSuppressionWithScore")
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
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.nonMaxSuppressionWithScoreAsync")
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
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeBilinear")
    @js.native
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: T, size: js.Tuple2[Double, Double]): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeBilinear")
    @js.native
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: T, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeBilinear")
    @js.native
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double]): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeBilinear")
    @js.native
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeBilinear")
    @js.native
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.Array[js.typedarray.Uint8Array], size: js.Tuple2[Double, Double]): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeBilinear")
    @js.native
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.Array[js.typedarray.Uint8Array], size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeBilinear")
    @js.native
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Float32Array, size: js.Tuple2[Double, Double]): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeBilinear")
    @js.native
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Float32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeBilinear")
    @js.native
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Int32Array, size: js.Tuple2[Double, Double]): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeBilinear")
    @js.native
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Int32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeBilinear")
    @js.native
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Uint8Array, size: js.Tuple2[Double, Double]): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeBilinear")
    @js.native
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Uint8Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeBilinear")
    @js.native
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double]): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeBilinear")
    @js.native
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeBilinear")
    @js.native
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double]): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeBilinear")
    @js.native
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeBilinear")
    @js.native
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](
      images: RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ],
      size: js.Tuple2[Double, Double]
    ): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeBilinear")
    @js.native
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](
      images: RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ],
      size: js.Tuple2[Double, Double],
      alignCorners: Boolean
    ): T = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeNearestNeighbor")
    @js.native
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: T, size: js.Tuple2[Double, Double]): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeNearestNeighbor")
    @js.native
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: T, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeNearestNeighbor")
    @js.native
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double]): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeNearestNeighbor")
    @js.native
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeNearestNeighbor")
    @js.native
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.Array[js.typedarray.Uint8Array], size: js.Tuple2[Double, Double]): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeNearestNeighbor")
    @js.native
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.Array[js.typedarray.Uint8Array], size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeNearestNeighbor")
    @js.native
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Float32Array, size: js.Tuple2[Double, Double]): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeNearestNeighbor")
    @js.native
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Float32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeNearestNeighbor")
    @js.native
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Int32Array, size: js.Tuple2[Double, Double]): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeNearestNeighbor")
    @js.native
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Int32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeNearestNeighbor")
    @js.native
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Uint8Array, size: js.Tuple2[Double, Double]): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeNearestNeighbor")
    @js.native
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.typedarray.Uint8Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeNearestNeighbor")
    @js.native
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double]): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeNearestNeighbor")
    @js.native
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeNearestNeighbor")
    @js.native
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double]): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeNearestNeighbor")
    @js.native
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeNearestNeighbor")
    @js.native
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](
      images: RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ],
      size: js.Tuple2[Double, Double]
    ): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.resizeNearestNeighbor")
    @js.native
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](
      images: RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ],
      size: js.Tuple2[Double, Double],
      alignCorners: Boolean
    ): T = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image.rotateWithOffset")
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
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "inTopKAsync")
  @js.native
  def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T, targets: U): js.Promise[U] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "inTopKAsync")
  @js.native
  def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T, targets: U, k: Double): js.Promise[U] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "inTopKAsync")
  @js.native
  def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T, targets: TensorLike): js.Promise[U] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "inTopKAsync")
  @js.native
  def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T, targets: TensorLike, k: Double): js.Promise[U] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "inTopKAsync")
  @js.native
  def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: TensorLike, targets: U): js.Promise[U] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "inTopKAsync")
  @js.native
  def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: TensorLike, targets: U, k: Double): js.Promise[U] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "inTopKAsync")
  @js.native
  def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: TensorLike, targets: TensorLike): js.Promise[U] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "inTopKAsync")
  @js.native
  def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: TensorLike, targets: TensorLike, k: Double): js.Promise[U] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "irfft")
  @js.native
  val irfft: js.Function1[/* input */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "isFinite")
  @js.native
  def isFinite[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "isFinite")
  @js.native
  def isFinite[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "isInf")
  @js.native
  def isInf[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "isInf")
  @js.native
  def isInf[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "isNaN")
  @js.native
  def isNaN[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "isNaN")
  @js.native
  def isNaN[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "leakyRelu")
  @js.native
  def leakyRelu[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "leakyRelu")
  @js.native
  def leakyRelu[T /* <: Tensor[Rank] */](x: T, alpha: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "leakyRelu")
  @js.native
  def leakyRelu[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "leakyRelu")
  @js.native
  def leakyRelu[T /* <: Tensor[Rank] */](x: TensorLike, alpha: Double): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "less")
  @js.native
  def less[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "less")
  @js.native
  def less[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "less")
  @js.native
  def less[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "less")
  @js.native
  def less[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "lessEqual")
  @js.native
  def lessEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "lessEqual")
  @js.native
  def lessEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "lessEqual")
  @js.native
  def lessEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "lessEqual")
  @js.native
  def lessEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "lessEqualStrict")
  @js.native
  def lessEqualStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "lessEqualStrict")
  @js.native
  def lessEqualStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "lessEqualStrict")
  @js.native
  def lessEqualStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "lessEqualStrict")
  @js.native
  def lessEqualStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "lessStrict")
  @js.native
  def lessStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "lessStrict")
  @js.native
  def lessStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "lessStrict")
  @js.native
  def lessStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "lessStrict")
  @js.native
  def lessStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  object linalg {
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "linalg.bandPart")
    @js.native
    def bandPart[T /* <: Tensor[Rank] */](a: T, numLower: Double, numUpper: Double): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "linalg.bandPart")
    @js.native
    def bandPart[T /* <: Tensor[Rank] */](a: String, numLower: Double, numUpper: Double): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "linalg.bandPart")
    @js.native
    def bandPart[T /* <: Tensor[Rank] */](a: js.Array[js.typedarray.Uint8Array], numLower: Double, numUpper: Double): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "linalg.bandPart")
    @js.native
    def bandPart[T /* <: Tensor[Rank] */](a: js.typedarray.Float32Array, numLower: Double, numUpper: Double): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "linalg.bandPart")
    @js.native
    def bandPart[T /* <: Tensor[Rank] */](a: js.typedarray.Int32Array, numLower: Double, numUpper: Double): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "linalg.bandPart")
    @js.native
    def bandPart[T /* <: Tensor[Rank] */](a: js.typedarray.Uint8Array, numLower: Double, numUpper: Double): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "linalg.bandPart")
    @js.native
    def bandPart[T /* <: Tensor[Rank] */](a: Boolean, numLower: Double, numUpper: Double): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "linalg.bandPart")
    @js.native
    def bandPart[T /* <: Tensor[Rank] */](a: Double, numLower: Double, numUpper: Double): T = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "linalg.bandPart")
    @js.native
    def bandPart[T /* <: Tensor[Rank] */](
      a: RecursiveArray[
          js.Array[Double] | Boolean | Double | js.typedarray.Float32Array | js.typedarray.Int32Array | String | js.typedarray.Uint8Array
        ],
      numLower: Double,
      numUpper: Double
    ): T = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "linalg.gramSchmidt")
    @js.native
    def gramSchmidt(xs: js.Array[Tensor[R1]]): Tensor[R2] | js.Array[Tensor[R1]] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "linalg.gramSchmidt")
    @js.native
    def gramSchmidt(xs: Tensor[R2]): Tensor[R2] | js.Array[Tensor[R1]] = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "linalg.qr")
    @js.native
    def qr(x: Tensor[Rank]): js.Tuple2[Tensor[Rank], Tensor[Rank]] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "linalg.qr")
    @js.native
    def qr(x: Tensor[Rank], fullMatrices: Boolean): js.Tuple2[Tensor[Rank], Tensor[Rank]] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "linspace")
  @js.native
  def linspace(start: Double, stop: Double, num: Double): Tensor1D = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](
    x: T,
    depthRadius: js.UndefOr[scala.Nothing],
    bias: js.UndefOr[scala.Nothing],
    alpha: js.UndefOr[scala.Nothing],
    beta: Double
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T, depthRadius: js.UndefOr[scala.Nothing], bias: js.UndefOr[scala.Nothing], alpha: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](
    x: T,
    depthRadius: js.UndefOr[scala.Nothing],
    bias: js.UndefOr[scala.Nothing],
    alpha: Double,
    beta: Double
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T, depthRadius: js.UndefOr[scala.Nothing], bias: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](
    x: T,
    depthRadius: js.UndefOr[scala.Nothing],
    bias: Double,
    alpha: js.UndefOr[scala.Nothing],
    beta: Double
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T, depthRadius: js.UndefOr[scala.Nothing], bias: Double, alpha: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T, depthRadius: js.UndefOr[scala.Nothing], bias: Double, alpha: Double, beta: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T, depthRadius: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](
    x: T,
    depthRadius: Double,
    bias: js.UndefOr[scala.Nothing],
    alpha: js.UndefOr[scala.Nothing],
    beta: Double
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T, depthRadius: Double, bias: js.UndefOr[scala.Nothing], alpha: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T, depthRadius: Double, bias: js.UndefOr[scala.Nothing], alpha: Double, beta: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T, depthRadius: Double, bias: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T, depthRadius: Double, bias: Double, alpha: js.UndefOr[scala.Nothing], beta: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T, depthRadius: Double, bias: Double, alpha: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T, depthRadius: Double, bias: Double, alpha: Double, beta: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    depthRadius: js.UndefOr[scala.Nothing],
    bias: js.UndefOr[scala.Nothing],
    alpha: js.UndefOr[scala.Nothing],
    beta: Double
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    depthRadius: js.UndefOr[scala.Nothing],
    bias: js.UndefOr[scala.Nothing],
    alpha: Double
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    depthRadius: js.UndefOr[scala.Nothing],
    bias: js.UndefOr[scala.Nothing],
    alpha: Double,
    beta: Double
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: js.UndefOr[scala.Nothing], bias: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    depthRadius: js.UndefOr[scala.Nothing],
    bias: Double,
    alpha: js.UndefOr[scala.Nothing],
    beta: Double
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: js.UndefOr[scala.Nothing], bias: Double, alpha: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: js.UndefOr[scala.Nothing], bias: Double, alpha: Double, beta: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](
    x: TensorLike,
    depthRadius: Double,
    bias: js.UndefOr[scala.Nothing],
    alpha: js.UndefOr[scala.Nothing],
    beta: Double
  ): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double, bias: js.UndefOr[scala.Nothing], alpha: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double, bias: js.UndefOr[scala.Nothing], alpha: Double, beta: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double, bias: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double, bias: Double, alpha: js.UndefOr[scala.Nothing], beta: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double, bias: Double, alpha: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "localResponseNormalization")
  @js.native
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: TensorLike, depthRadius: Double, bias: Double, alpha: Double, beta: Double): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "log")
  @js.native
  def log[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "log")
  @js.native
  def log[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "log1p")
  @js.native
  def log1p[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "log1p")
  @js.native
  def log1p[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logSigmoid")
  @js.native
  def logSigmoid[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logSigmoid")
  @js.native
  def logSigmoid[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logSoftmax")
  @js.native
  def logSoftmax[T /* <: Tensor[Rank] */](logits: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logSoftmax")
  @js.native
  def logSoftmax[T /* <: Tensor[Rank] */](logits: T, axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logSoftmax")
  @js.native
  def logSoftmax[T /* <: Tensor[Rank] */](logits: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logSoftmax")
  @js.native
  def logSoftmax[T /* <: Tensor[Rank] */](logits: TensorLike, axis: Double): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logSumExp")
  @js.native
  def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logSumExp")
  @js.native
  def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logSumExp")
  @js.native
  def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logSumExp")
  @js.native
  def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logSumExp")
  @js.native
  def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logSumExp")
  @js.native
  def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logSumExp")
  @js.native
  def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logSumExp")
  @js.native
  def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logSumExp")
  @js.native
  def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logSumExp")
  @js.native
  def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logSumExp")
  @js.native
  def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logSumExp")
  @js.native
  def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logicalAnd")
  @js.native
  def logicalAnd[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logicalAnd")
  @js.native
  def logicalAnd[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logicalAnd")
  @js.native
  def logicalAnd[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logicalAnd")
  @js.native
  def logicalAnd[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logicalNot")
  @js.native
  def logicalNot[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logicalNot")
  @js.native
  def logicalNot[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logicalOr")
  @js.native
  def logicalOr[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logicalOr")
  @js.native
  def logicalOr[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logicalOr")
  @js.native
  def logicalOr[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logicalOr")
  @js.native
  def logicalOr[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logicalXor")
  @js.native
  def logicalXor[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logicalXor")
  @js.native
  def logicalXor[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logicalXor")
  @js.native
  def logicalXor[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "logicalXor")
  @js.native
  def logicalXor[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  object losses {
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "losses.absoluteDifference")
    @js.native
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
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "losses.computeWeightedLoss")
    @js.native
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
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "losses.cosineDistance")
    @js.native
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
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "losses.hingeLoss")
    @js.native
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
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "losses.huberLoss")
    @js.native
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
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "losses.logLoss")
    @js.native
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
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "losses.meanSquaredError")
    @js.native
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
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "losses.sigmoidCrossEntropy")
    @js.native
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
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "losses.softmaxCrossEntropy")
    @js.native
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
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "matMul")
  @js.native
  def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "matMul")
  @js.native
  def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank], transposeA: js.UndefOr[scala.Nothing], transposeB: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "matMul")
  @js.native
  def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank], transposeA: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "matMul")
  @js.native
  def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank], transposeA: Boolean, transposeB: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "matMul")
  @js.native
  def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "matMul")
  @js.native
  def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike, transposeA: js.UndefOr[scala.Nothing], transposeB: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "matMul")
  @js.native
  def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike, transposeA: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "matMul")
  @js.native
  def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike, transposeA: Boolean, transposeB: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "matMul")
  @js.native
  def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "matMul")
  @js.native
  def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank], transposeA: js.UndefOr[scala.Nothing], transposeB: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "matMul")
  @js.native
  def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank], transposeA: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "matMul")
  @js.native
  def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank], transposeA: Boolean, transposeB: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "matMul")
  @js.native
  def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "matMul")
  @js.native
  def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike, transposeA: js.UndefOr[scala.Nothing], transposeB: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "matMul")
  @js.native
  def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike, transposeA: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "matMul")
  @js.native
  def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike, transposeA: Boolean, transposeB: Boolean): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "max")
  @js.native
  def max[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "max")
  @js.native
  def max[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "max")
  @js.native
  def max[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "max")
  @js.native
  def max[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "max")
  @js.native
  def max[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "max")
  @js.native
  def max[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "max")
  @js.native
  def max[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "max")
  @js.native
  def max[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "max")
  @js.native
  def max[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "max")
  @js.native
  def max[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "max")
  @js.native
  def max[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "max")
  @js.native
  def max[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPool")
  @js.native
  def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPool3d")
  @js.native
  def maxPool3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dimRoundingMode: js.UndefOr[floor | round | ceil],
    dataFormat: js.UndefOr[NDHWC | NCDHW],
    dilations: js.UndefOr[(js.Tuple3[Double, Double, Double]) | Double]
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T, filterSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double], pad: Double): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T, filterSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double], pad: same_): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T, filterSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double], pad: valid_): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T, filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: Double,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T, filterSize: js.Tuple2[Double, Double], strides: Double, pad: same_): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: same_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T, filterSize: js.Tuple2[Double, Double], strides: Double, pad: valid_): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: valid_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T, filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: Double,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T, filterSize: Double, strides: js.Tuple2[Double, Double], pad: same_): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: same_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T, filterSize: Double, strides: js.Tuple2[Double, Double], pad: valid_): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: valid_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T, filterSize: Double, strides: Double, pad: Double): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T, filterSize: Double, strides: Double, pad: Double, includeBatchInIndex: Boolean): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T, filterSize: Double, strides: Double, pad: same_): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T, filterSize: Double, strides: Double, pad: same_, includeBatchInIndex: Boolean): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T, filterSize: Double, strides: Double, pad: valid_): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T, filterSize: Double, strides: Double, pad: valid_, includeBatchInIndex: Boolean): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_
  ): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid_
  ): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: Double,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: same_): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: same_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: valid_): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: valid_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: Double,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: same_): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: same_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: valid_): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: valid_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: TensorLike, filterSize: Double, strides: Double, pad: Double): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: TensorLike, filterSize: Double, strides: Double, pad: Double, includeBatchInIndex: Boolean): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: TensorLike, filterSize: Double, strides: Double, pad: same_): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: TensorLike, filterSize: Double, strides: Double, pad: same_, includeBatchInIndex: Boolean): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: TensorLike, filterSize: Double, strides: Double, pad: valid_): NamedTensorMap = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maxPoolWithArgmax")
  @js.native
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: TensorLike, filterSize: Double, strides: Double, pad: valid_, includeBatchInIndex: Boolean): NamedTensorMap = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maximum")
  @js.native
  def maximum[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maximum")
  @js.native
  def maximum[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maximum")
  @js.native
  def maximum[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maximum")
  @js.native
  def maximum[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maximumStrict")
  @js.native
  def maximumStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maximumStrict")
  @js.native
  def maximumStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maximumStrict")
  @js.native
  def maximumStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "maximumStrict")
  @js.native
  def maximumStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mean")
  @js.native
  def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mean")
  @js.native
  def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mean")
  @js.native
  def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mean")
  @js.native
  def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mean")
  @js.native
  def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mean")
  @js.native
  def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mean")
  @js.native
  def mean[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mean")
  @js.native
  def mean[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mean")
  @js.native
  def mean[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mean")
  @js.native
  def mean[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mean")
  @js.native
  def mean[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mean")
  @js.native
  def mean[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "min")
  @js.native
  def min[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "min")
  @js.native
  def min[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "min")
  @js.native
  def min[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "min")
  @js.native
  def min[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "min")
  @js.native
  def min[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "min")
  @js.native
  def min[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "min")
  @js.native
  def min[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "min")
  @js.native
  def min[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "min")
  @js.native
  def min[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "min")
  @js.native
  def min[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "min")
  @js.native
  def min[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "min")
  @js.native
  def min[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "minimum")
  @js.native
  def minimum[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "minimum")
  @js.native
  def minimum[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "minimum")
  @js.native
  def minimum[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "minimum")
  @js.native
  def minimum[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "minimumStrict")
  @js.native
  def minimumStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "minimumStrict")
  @js.native
  def minimumStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "minimumStrict")
  @js.native
  def minimumStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "minimumStrict")
  @js.native
  def minimumStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mirrorPad")
  @js.native
  def mirrorPad[T /* <: Tensor[Rank] */](x: T, paddings: js.Array[js.Tuple2[Double, Double]], mode: reflect): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mirrorPad")
  @js.native
  def mirrorPad[T /* <: Tensor[Rank] */](x: T, paddings: js.Array[js.Tuple2[Double, Double]], mode: symmetric): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mirrorPad")
  @js.native
  def mirrorPad[T /* <: Tensor[Rank] */](x: TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], mode: reflect): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mirrorPad")
  @js.native
  def mirrorPad[T /* <: Tensor[Rank] */](x: TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], mode: symmetric): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mod")
  @js.native
  def mod[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mod")
  @js.native
  def mod[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mod")
  @js.native
  def mod[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mod")
  @js.native
  def mod[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "modStrict")
  @js.native
  def modStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "modStrict")
  @js.native
  def modStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "modStrict")
  @js.native
  def modStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "modStrict")
  @js.native
  def modStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "moments")
  @js.native
  val moments: js.Function3[
    /* x */ Tensor[Rank] | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    /* keepDims */ js.UndefOr[Boolean], 
    Mean
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: T, decay: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: T, decay: Double, step: js.UndefOr[scala.Nothing], zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: T, decay: Double, step: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: T, decay: Double, step: Double, zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: T, decay: Double, step: Scalar): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: T, decay: Double, step: Scalar, zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: T, decay: Scalar): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: T, decay: Scalar, step: js.UndefOr[scala.Nothing], zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: T, decay: Scalar, step: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: T, decay: Scalar, step: Double, zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: T, decay: Scalar, step: Scalar): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: T, decay: Scalar, step: Scalar, zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: TensorLike, decay: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: TensorLike, decay: Double, step: js.UndefOr[scala.Nothing], zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: TensorLike, decay: Double, step: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: TensorLike, decay: Double, step: Double, zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: TensorLike, decay: Double, step: Scalar): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: TensorLike, decay: Double, step: Scalar, zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: TensorLike, decay: Scalar): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: TensorLike, decay: Scalar, step: js.UndefOr[scala.Nothing], zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: TensorLike, decay: Scalar, step: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: TensorLike, decay: Scalar, step: Double, zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: TensorLike, decay: Scalar, step: Scalar): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: T, x: TensorLike, decay: Scalar, step: Scalar, zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: T, decay: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: T, decay: Double, step: js.UndefOr[scala.Nothing], zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: T, decay: Double, step: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: T, decay: Double, step: Double, zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: T, decay: Double, step: Scalar): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: T, decay: Double, step: Scalar, zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: T, decay: Scalar): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: T, decay: Scalar, step: js.UndefOr[scala.Nothing], zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: T, decay: Scalar, step: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: T, decay: Scalar, step: Double, zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: T, decay: Scalar, step: Scalar): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: T, decay: Scalar, step: Scalar, zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: TensorLike, decay: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: TensorLike, decay: Double, step: js.UndefOr[scala.Nothing], zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: TensorLike, decay: Double, step: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: TensorLike, decay: Double, step: Double, zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: TensorLike, decay: Double, step: Scalar): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: TensorLike, decay: Double, step: Scalar, zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: TensorLike, decay: Scalar): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: TensorLike, decay: Scalar, step: js.UndefOr[scala.Nothing], zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: TensorLike, decay: Scalar, step: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: TensorLike, decay: Scalar, step: Double, zeroDebias: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: TensorLike, decay: Scalar, step: Scalar): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "movingAverage")
  @js.native
  def movingAverage[T /* <: Tensor[Rank] */](v: TensorLike, x: TensorLike, decay: Scalar, step: Scalar, zeroDebias: Boolean): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mul")
  @js.native
  def mul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mul")
  @js.native
  def mul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mul")
  @js.native
  def mul[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mul")
  @js.native
  def mul[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mulStrict")
  @js.native
  def mulStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mulStrict")
  @js.native
  def mulStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mulStrict")
  @js.native
  def mulStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "mulStrict")
  @js.native
  def mulStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "multiRNNCell")
  @js.native
  val multiRNNCell: js.Function4[
    /* lstmCells */ js.Array[LSTMCellFunc], 
    /* data */ Tensor2D | TensorLike, 
    /* c */ js.Array[Tensor2D | TensorLike], 
    /* h */ js.Array[Tensor2D | TensorLike], 
    js.Tuple2[js.Array[Tensor2D], js.Array[Tensor2D]]
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "multinomial")
  @js.native
  val multinomial: js.Function4[
    /* logits */ Tensor1D | Tensor2D | TensorLike, 
    /* numSamples */ Double, 
    /* seed */ js.UndefOr[Double], 
    /* normalized */ js.UndefOr[Boolean], 
    Tensor1D | Tensor2D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "neg")
  @js.native
  def neg[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "neg")
  @js.native
  def neg[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "norm")
  @js.native
  val norm: js.Function4[
    /* x */ Tensor[Rank] | TensorLike, 
    /* ord */ js.UndefOr[Double | euclidean | fro], 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    /* keepDims */ js.UndefOr[Boolean], 
    Tensor[Rank]
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "notEqual")
  @js.native
  def notEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "notEqual")
  @js.native
  def notEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "notEqual")
  @js.native
  def notEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "notEqual")
  @js.native
  def notEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "notEqualStrict")
  @js.native
  def notEqualStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "notEqualStrict")
  @js.native
  def notEqualStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "notEqualStrict")
  @js.native
  def notEqualStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "notEqualStrict")
  @js.native
  def notEqualStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "oneHot")
  @js.native
  val oneHot: js.Function4[
    /* indices */ Tensor[Rank] | TensorLike, 
    /* depth */ Double, 
    /* onValue */ js.UndefOr[Double], 
    /* offValue */ js.UndefOr[Double], 
    Tensor[Rank]
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "ones")
  @js.native
  def ones[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "ones")
  @js.native
  def ones[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): Tensor[R] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "onesLike")
  @js.native
  def onesLike[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "onesLike")
  @js.native
  def onesLike[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "op")
  @js.native
  def op[T /* <: js.Function */](f: StringDictionary[T]): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "outerProduct")
  @js.native
  val outerProduct: js.Function2[/* v1 */ Tensor1D | TensorLike, /* v2 */ Tensor1D | TensorLike, Tensor2D] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "pad")
  @js.native
  def pad[T /* <: Tensor[Rank] */](x: T, paddings: js.Array[js.Tuple2[Double, Double]]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "pad")
  @js.native
  def pad[T /* <: Tensor[Rank] */](x: T, paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "pad")
  @js.native
  def pad[T /* <: Tensor[Rank] */](x: TensorLike, paddings: js.Array[js.Tuple2[Double, Double]]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "pad")
  @js.native
  def pad[T /* <: Tensor[Rank] */](x: TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "pad1d")
  @js.native
  val pad1d: js.Function3[
    /* x */ Tensor1D | TensorLike, 
    /* paddings */ js.Tuple2[Double, Double], 
    /* constantValue */ js.UndefOr[Double], 
    Tensor1D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "pad2d")
  @js.native
  val pad2d: js.Function3[
    /* x */ Tensor2D | TensorLike, 
    /* paddings */ js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
    /* constantValue */ js.UndefOr[Double], 
    Tensor2D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "pad3d")
  @js.native
  val pad3d: js.Function3[
    /* x */ Tensor3D | TensorLike, 
    /* paddings */ js.Tuple3[js.Tuple2[Double, Double], js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
    /* constantValue */ js.UndefOr[Double], 
    Tensor3D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "pad4d")
  @js.native
  val pad4d: js.Function3[
    /* x */ Tensor4D | TensorLike, 
    /* paddings */ js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ], 
    /* constantValue */ js.UndefOr[Double], 
    Tensor4D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "pool")
  @js.native
  def pool[T /* <: Tensor3D | Tensor4D */](
    input: T | TensorLike,
    windowShape: (js.Tuple2[Double, Double]) | Double,
    poolingType: avg | max,
    pad: valid_ | same_ | Double,
    dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    strides: js.UndefOr[(js.Tuple2[Double, Double]) | Double]
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "pow")
  @js.native
  def pow[T /* <: Tensor[Rank] */](base: Tensor[Rank], exp: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "pow")
  @js.native
  def pow[T /* <: Tensor[Rank] */](base: Tensor[Rank], exp: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "pow")
  @js.native
  def pow[T /* <: Tensor[Rank] */](base: TensorLike, exp: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "pow")
  @js.native
  def pow[T /* <: Tensor[Rank] */](base: TensorLike, exp: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "powStrict")
  @js.native
  def powStrict[T /* <: Tensor[Rank] */](base: T, exp: Tensor[Rank]): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "prelu")
  @js.native
  def prelu[T /* <: Tensor[Rank] */](x: T, alpha: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "prelu")
  @js.native
  def prelu[T /* <: Tensor[Rank] */](x: T, alpha: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "prelu")
  @js.native
  def prelu[T /* <: Tensor[Rank] */](x: TensorLike, alpha: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "prelu")
  @js.native
  def prelu[T /* <: Tensor[Rank] */](x: TensorLike, alpha: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "print")
  @js.native
  def print[T /* <: Tensor[Rank] */](x: T): Unit = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "print")
  @js.native
  def print[T /* <: Tensor[Rank] */](x: T, verbose: Boolean): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "prod")
  @js.native
  def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "prod")
  @js.native
  def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "prod")
  @js.native
  def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "prod")
  @js.native
  def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "prod")
  @js.native
  def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "prod")
  @js.native
  def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "prod")
  @js.native
  def prod[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "prod")
  @js.native
  def prod[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "prod")
  @js.native
  def prod[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "prod")
  @js.native
  def prod[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "prod")
  @js.native
  def prod[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "prod")
  @js.native
  def prod[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "rand")
  @js.native
  def rand[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    randFunction: js.Function0[Double]
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "rand")
  @js.native
  def rand[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    randFunction: js.Function0[Double],
    dtype: DataType
  ): Tensor[R] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomGamma")
  @js.native
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomGamma")
  @js.native
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomGamma")
  @js.native
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: js.UndefOr[scala.Nothing],
    dtype: float32
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomGamma")
  @js.native
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: js.UndefOr[scala.Nothing],
    dtype: float32,
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomGamma")
  @js.native
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: js.UndefOr[scala.Nothing],
    dtype: int32
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomGamma")
  @js.native
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: js.UndefOr[scala.Nothing],
    dtype: int32,
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomGamma")
  @js.native
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomGamma")
  @js.native
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomGamma")
  @js.native
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Double,
    dtype: float32
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomGamma")
  @js.native
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Double,
    dtype: float32,
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomGamma")
  @js.native
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Double,
    dtype: int32
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomGamma")
  @js.native
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Double,
    dtype: int32,
    seed: Double
  ): Tensor[R] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: js.UndefOr[scala.Nothing],
    dtype: float32
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: js.UndefOr[scala.Nothing],
    dtype: float32,
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: js.UndefOr[scala.Nothing],
    dtype: int32
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: js.UndefOr[scala.Nothing],
    dtype: int32,
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: Double,
    dtype: float32
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: Double,
    dtype: float32,
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: Double,
    dtype: int32
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: Double,
    dtype: int32,
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: js.UndefOr[scala.Nothing],
    dtype: float32
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: js.UndefOr[scala.Nothing],
    dtype: float32,
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: js.UndefOr[scala.Nothing],
    dtype: int32
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: js.UndefOr[scala.Nothing],
    dtype: int32,
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: float32
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: float32,
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: int32
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomNormal")
  @js.native
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: int32,
    seed: Double
  ): Tensor[R] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: js.UndefOr[scala.Nothing],
    maxval: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: String
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: js.UndefOr[scala.Nothing],
    maxval: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: js.UndefOr[scala.Nothing],
    maxval: js.UndefOr[scala.Nothing],
    dtype: DataType
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: js.UndefOr[scala.Nothing],
    maxval: js.UndefOr[scala.Nothing],
    dtype: DataType,
    seed: String
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: js.UndefOr[scala.Nothing],
    maxval: js.UndefOr[scala.Nothing],
    dtype: DataType,
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: js.UndefOr[scala.Nothing],
    maxval: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: js.UndefOr[scala.Nothing],
    maxval: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: String
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: js.UndefOr[scala.Nothing],
    maxval: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: js.UndefOr[scala.Nothing],
    maxval: Double,
    dtype: DataType
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: js.UndefOr[scala.Nothing],
    maxval: Double,
    dtype: DataType,
    seed: String
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: js.UndefOr[scala.Nothing],
    maxval: Double,
    dtype: DataType,
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: String
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: js.UndefOr[scala.Nothing],
    dtype: DataType
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: js.UndefOr[scala.Nothing],
    dtype: DataType,
    seed: String
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: js.UndefOr[scala.Nothing],
    dtype: DataType,
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: String
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    dtype: DataType
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    dtype: DataType,
    seed: String
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "randomUniform")
  @js.native
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    dtype: DataType,
    seed: Double
  ): Tensor[R] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "range")
  @js.native
  def range(start: Double, stop: Double): Tensor1D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "range")
  @js.native
  def range(start: Double, stop: Double, step: Double): Tensor1D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "range")
  @js.native
  def range_float32(start: Double, stop: Double, step: js.UndefOr[scala.Nothing], dtype: float32): Tensor1D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "range")
  @js.native
  def range_float32(start: Double, stop: Double, step: Double, dtype: float32): Tensor1D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "range")
  @js.native
  def range_int32(start: Double, stop: Double, step: js.UndefOr[scala.Nothing], dtype: int32): Tensor1D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "range")
  @js.native
  def range_int32(start: Double, stop: Double, step: Double, dtype: int32): Tensor1D = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "real")
  @js.native
  def real[T /* <: Tensor[Rank] */](input: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "real")
  @js.native
  def real[T /* <: Tensor[Rank] */](input: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "reciprocal")
  @js.native
  def reciprocal[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "reciprocal")
  @js.native
  def reciprocal[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "relu")
  @js.native
  def relu[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "relu")
  @js.native
  def relu[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "relu6")
  @js.native
  def relu6[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "relu6")
  @js.native
  def relu6[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "reshape")
  @js.native
  def reshape[R /* <: Rank */](
    x: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "reshape")
  @js.native
  def reshape[R /* <: Rank */](
    x: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "reverse")
  @js.native
  def reverse[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "reverse")
  @js.native
  def reverse[T /* <: Tensor[Rank] */](x: T, axis: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "reverse")
  @js.native
  def reverse[T /* <: Tensor[Rank] */](x: T, axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "reverse")
  @js.native
  def reverse[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "reverse")
  @js.native
  def reverse[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "reverse")
  @js.native
  def reverse[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "reverse1d")
  @js.native
  val reverse1d: js.Function1[/* x */ Tensor1D | TensorLike, Tensor1D] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "reverse2d")
  @js.native
  val reverse2d: js.Function2[
    /* x */ Tensor2D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor2D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "reverse3d")
  @js.native
  val reverse3d: js.Function2[
    /* x */ Tensor3D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor3D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "reverse4d")
  @js.native
  val reverse4d: js.Function2[
    /* x */ Tensor4D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor4D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "rfft")
  @js.native
  val rfft: js.Function2[/* input */ Tensor[Rank], /* fftLength */ js.UndefOr[Double], Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "round")
  @js.native
  def round[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "round")
  @js.native
  def round[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "rsqrt")
  @js.native
  def rsqrt[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "rsqrt")
  @js.native
  def rsqrt[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "scalar")
  @js.native
  def scalar(value: String): Scalar = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "scalar")
  @js.native
  def scalar(value: String, dtype: DataType): Scalar = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "scalar")
  @js.native
  def scalar(value: js.typedarray.Uint8Array): Scalar = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "scalar")
  @js.native
  def scalar(value: js.typedarray.Uint8Array, dtype: DataType): Scalar = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "scalar")
  @js.native
  def scalar(value: Boolean): Scalar = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "scalar")
  @js.native
  def scalar(value: Boolean, dtype: DataType): Scalar = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "scalar")
  @js.native
  def scalar(value: Double): Scalar = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "scalar")
  @js.native
  def scalar(value: Double, dtype: DataType): Scalar = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "scatterND")
  @js.native
  def scatterND[R /* <: Rank */](
    indices: Tensor[Rank],
    updates: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "scatterND")
  @js.native
  def scatterND[R /* <: Rank */](
    indices: Tensor[Rank],
    updates: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "scatterND")
  @js.native
  def scatterND[R /* <: Rank */](
    indices: TensorLike,
    updates: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "scatterND")
  @js.native
  def scatterND[R /* <: Rank */](
    indices: TensorLike,
    updates: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "selu")
  @js.native
  def selu[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "selu")
  @js.native
  def selu[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "separableConv2d")
  @js.native
  def separableConv2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    depthwiseFilter: Tensor4D | TensorLike,
    pointwiseFilter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_,
    dilation: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    dataFormat: js.UndefOr[NHWC | NCHW]
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "setdiff1dAsync")
  @js.native
  val setdiff1dAsync: js.Function2[
    /* x */ Tensor[Rank] | TensorLike, 
    /* y */ Tensor[Rank] | TensorLike, 
    js.Promise[js.Tuple2[Tensor[Rank], Tensor[Rank]]]
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sigmoid")
  @js.native
  def sigmoid[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sigmoid")
  @js.native
  def sigmoid[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sign")
  @js.native
  def sign[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sign")
  @js.native
  def sign[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  object signal {
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "signal.frame")
    @js.native
    def frame(signal: Tensor[R1], frameLength: Double, frameStep: Double): Tensor[Rank] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "signal.frame")
    @js.native
    def frame(
      signal: Tensor[R1],
      frameLength: Double,
      frameStep: Double,
      padEnd: js.UndefOr[scala.Nothing],
      padValue: Double
    ): Tensor[Rank] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "signal.frame")
    @js.native
    def frame(signal: Tensor[R1], frameLength: Double, frameStep: Double, padEnd: Boolean): Tensor[Rank] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "signal.frame")
    @js.native
    def frame(signal: Tensor[R1], frameLength: Double, frameStep: Double, padEnd: Boolean, padValue: Double): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "signal.hammingWindow")
    @js.native
    def hammingWindow(windowLength: Double): Tensor[R1] = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "signal.hannWindow")
    @js.native
    def hannWindow(windowLength: Double): Tensor[R1] = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "signal.stft")
    @js.native
    def stft(signal: Tensor[R1], frameLength: Double, frameStep: Double): Tensor[Rank] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "signal.stft")
    @js.native
    def stft(
      signal: Tensor[R1],
      frameLength: Double,
      frameStep: Double,
      fftLength: js.UndefOr[scala.Nothing],
      windowFn: js.Function1[/* length */ Double, Tensor[R1]]
    ): Tensor[Rank] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "signal.stft")
    @js.native
    def stft(signal: Tensor[R1], frameLength: Double, frameStep: Double, fftLength: Double): Tensor[Rank] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "signal.stft")
    @js.native
    def stft(
      signal: Tensor[R1],
      frameLength: Double,
      frameStep: Double,
      fftLength: Double,
      windowFn: js.Function1[/* length */ Double, Tensor[R1]]
    ): Tensor[Rank] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sin")
  @js.native
  def sin[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sin")
  @js.native
  def sin[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sinh")
  @js.native
  def sinh[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sinh")
  @js.native
  def sinh[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice")
  @js.native
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice")
  @js.native
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: js.Array[Double], size: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice")
  @js.native
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: js.Array[Double], size: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice")
  @js.native
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice")
  @js.native
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: Double, size: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice")
  @js.native
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T, begin: Double, size: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice")
  @js.native
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice")
  @js.native
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: js.Array[Double], size: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice")
  @js.native
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: js.Array[Double], size: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice")
  @js.native
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice")
  @js.native
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: Double, size: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice")
  @js.native
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: TensorLike, begin: Double, size: Double): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice1d")
  @js.native
  val slice1d: js.Function3[/* x */ Tensor1D | TensorLike, /* begin */ Double, /* size */ Double, Tensor1D] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice2d")
  @js.native
  val slice2d: js.Function3[
    /* x */ Tensor2D | TensorLike, 
    /* begin */ js.Tuple2[Double, Double], 
    /* size */ js.Tuple2[Double, Double], 
    Tensor2D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice3d")
  @js.native
  val slice3d: js.Function3[
    /* x */ Tensor3D | TensorLike, 
    /* begin */ js.Tuple3[Double, Double, Double], 
    /* size */ js.Tuple3[Double, Double, Double], 
    Tensor3D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice4d")
  @js.native
  val slice4d: js.Function3[
    /* x */ Tensor4D | TensorLike, 
    /* begin */ js.Tuple4[Double, Double, Double, Double], 
    /* size */ js.Tuple4[Double, Double, Double, Double], 
    Tensor4D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "softmax")
  @js.native
  def softmax[T /* <: Tensor[Rank] */](logits: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "softmax")
  @js.native
  def softmax[T /* <: Tensor[Rank] */](logits: T, dim: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "softmax")
  @js.native
  def softmax[T /* <: Tensor[Rank] */](logits: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "softmax")
  @js.native
  def softmax[T /* <: Tensor[Rank] */](logits: TensorLike, dim: Double): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "softplus")
  @js.native
  def softplus[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "softplus")
  @js.native
  def softplus[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "spaceToBatchND")
  @js.native
  def spaceToBatchND[T /* <: Tensor[Rank] */](x: T, blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "spaceToBatchND")
  @js.native
  def spaceToBatchND[T /* <: Tensor[Rank] */](x: TensorLike, blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sparseToDense")
  @js.native
  def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sparseToDense")
  @js.native
  def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sparseToDense")
  @js.native
  def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sparseToDense")
  @js.native
  def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sparseToDense")
  @js.native
  def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sparseToDense")
  @js.native
  def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sparseToDense")
  @js.native
  def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sparseToDense")
  @js.native
  def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sparseToDense")
  @js.native
  def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sparseToDense")
  @js.native
  def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sparseToDense")
  @js.native
  def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sparseToDense")
  @js.native
  def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = js.native
  
  object spectral {
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "spectral.fft")
    @js.native
    def fft(input: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "spectral.ifft")
    @js.native
    def ifft(input: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "spectral.irfft")
    @js.native
    def irfft(input: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "spectral.rfft")
    @js.native
    def rfft(input: Tensor[Rank]): Tensor[Rank] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "spectral.rfft")
    @js.native
    def rfft(input: Tensor[Rank], fftLength: Double): Tensor[Rank] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "split")
  @js.native
  def split[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: js.Array[Double]): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "split")
  @js.native
  def split[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "split")
  @js.native
  def split[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: Double): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "split")
  @js.native
  def split[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: Double, axis: Double): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "split")
  @js.native
  def split[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: js.Array[Double]): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "split")
  @js.native
  def split[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "split")
  @js.native
  def split[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: Double): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "split")
  @js.native
  def split[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: Double, axis: Double): js.Array[T] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sqrt")
  @js.native
  def sqrt[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sqrt")
  @js.native
  def sqrt[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "square")
  @js.native
  def square[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "square")
  @js.native
  def square[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "squaredDifference")
  @js.native
  def squaredDifference[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "squaredDifference")
  @js.native
  def squaredDifference[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "squaredDifference")
  @js.native
  def squaredDifference[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "squaredDifference")
  @js.native
  def squaredDifference[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "squaredDifferenceStrict")
  @js.native
  def squaredDifferenceStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "squaredDifferenceStrict")
  @js.native
  def squaredDifferenceStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "squaredDifferenceStrict")
  @js.native
  def squaredDifferenceStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "squaredDifferenceStrict")
  @js.native
  def squaredDifferenceStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "squeeze")
  @js.native
  def squeeze[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "squeeze")
  @js.native
  def squeeze[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "squeeze")
  @js.native
  def squeeze[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "squeeze")
  @js.native
  def squeeze[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "stack")
  @js.native
  def stack[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "stack")
  @js.native
  def stack[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike], axis: Double): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "step")
  @js.native
  def step[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "step")
  @js.native
  def step[T /* <: Tensor[Rank] */](x: T, alpha: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "step")
  @js.native
  def step[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "step")
  @js.native
  def step[T /* <: Tensor[Rank] */](x: TensorLike, alpha: Double): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "stridedSlice")
  @js.native
  val stridedSlice: js.Function9[
    /* x */ Tensor[Rank] | TensorLike, 
    /* begin */ js.Array[Double], 
    /* end */ js.Array[Double], 
    /* strides */ js.UndefOr[js.Array[Double]], 
    /* beginMask */ js.UndefOr[Double], 
    /* endMask */ js.UndefOr[Double], 
    /* ellipsisMask */ js.UndefOr[Double], 
    /* newAxisMask */ js.UndefOr[Double], 
    /* shrinkAxisMask */ js.UndefOr[Double], 
    Tensor[Rank]
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sub")
  @js.native
  def sub[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sub")
  @js.native
  def sub[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sub")
  @js.native
  def sub[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sub")
  @js.native
  def sub[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "subStrict")
  @js.native
  def subStrict[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "subStrict")
  @js.native
  def subStrict[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "subStrict")
  @js.native
  def subStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "subStrict")
  @js.native
  def subStrict[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sum")
  @js.native
  def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sum")
  @js.native
  def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sum")
  @js.native
  def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sum")
  @js.native
  def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sum")
  @js.native
  def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sum")
  @js.native
  def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sum")
  @js.native
  def sum[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sum")
  @js.native
  def sum[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.UndefOr[scala.Nothing], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sum")
  @js.native
  def sum[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sum")
  @js.native
  def sum[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sum")
  @js.native
  def sum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "sum")
  @js.native
  def sum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tan")
  @js.native
  def tan[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tan")
  @js.native
  def tan[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tanh")
  @js.native
  def tanh[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tanh")
  @js.native
  def tanh[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor")
  @js.native
  def tensor[R /* <: Rank */](values: TensorLike): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor")
  @js.native
  def tensor[R /* <: Rank */](values: TensorLike, shape: js.UndefOr[scala.Nothing], dtype: DataType): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor")
  @js.native
  def tensor[R /* <: Rank */](
    values: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor")
  @js.native
  def tensor[R /* <: Rank */](
    values: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): Tensor[R] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor1d")
  @js.native
  def tensor1d(values: TensorLike1D): Tensor1D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor1d")
  @js.native
  def tensor1d(values: TensorLike1D, dtype: DataType): Tensor1D = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor2d")
  @js.native
  def tensor2d(values: TensorLike2D): Tensor2D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor2d")
  @js.native
  def tensor2d(values: TensorLike2D, shape: js.UndefOr[scala.Nothing], dtype: DataType): Tensor2D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor2d")
  @js.native
  def tensor2d(values: TensorLike2D, shape: js.Tuple2[Double, Double]): Tensor2D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor2d")
  @js.native
  def tensor2d(values: TensorLike2D, shape: js.Tuple2[Double, Double], dtype: DataType): Tensor2D = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor3d")
  @js.native
  def tensor3d(values: TensorLike3D): Tensor3D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor3d")
  @js.native
  def tensor3d(values: TensorLike3D, shape: js.UndefOr[scala.Nothing], dtype: DataType): Tensor3D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor3d")
  @js.native
  def tensor3d(values: TensorLike3D, shape: js.Tuple3[Double, Double, Double]): Tensor3D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor3d")
  @js.native
  def tensor3d(values: TensorLike3D, shape: js.Tuple3[Double, Double, Double], dtype: DataType): Tensor3D = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor4d")
  @js.native
  def tensor4d(values: TensorLike4D): Tensor4D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor4d")
  @js.native
  def tensor4d(values: TensorLike4D, shape: js.UndefOr[scala.Nothing], dtype: DataType): Tensor4D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor4d")
  @js.native
  def tensor4d(values: TensorLike4D, shape: js.Tuple4[Double, Double, Double, Double]): Tensor4D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor4d")
  @js.native
  def tensor4d(values: TensorLike4D, shape: js.Tuple4[Double, Double, Double, Double], dtype: DataType): Tensor4D = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor5d")
  @js.native
  def tensor5d(values: TensorLike5D): Tensor5D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor5d")
  @js.native
  def tensor5d(values: TensorLike5D, shape: js.UndefOr[scala.Nothing], dtype: DataType): Tensor5D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor5d")
  @js.native
  def tensor5d(values: TensorLike5D, shape: js.Tuple5[Double, Double, Double, Double, Double]): Tensor5D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor5d")
  @js.native
  def tensor5d(values: TensorLike5D, shape: js.Tuple5[Double, Double, Double, Double, Double], dtype: DataType): Tensor5D = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor6d")
  @js.native
  def tensor6d(values: TensorLike6D): Tensor6D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor6d")
  @js.native
  def tensor6d(values: TensorLike6D, shape: js.UndefOr[scala.Nothing], dtype: DataType): Tensor6D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor6d")
  @js.native
  def tensor6d(values: TensorLike6D, shape: js.Tuple6[Double, Double, Double, Double, Double, Double]): Tensor6D = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tensor6d")
  @js.native
  def tensor6d(
    values: TensorLike6D,
    shape: js.Tuple6[Double, Double, Double, Double, Double, Double],
    dtype: DataType
  ): Tensor6D = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tile")
  @js.native
  def tile[T /* <: Tensor[Rank] */](x: T, reps: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "tile")
  @js.native
  def tile[T /* <: Tensor[Rank] */](x: TensorLike, reps: js.Array[Double]): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "topk")
  @js.native
  def topk[T /* <: Tensor[Rank] */](x: T): Indices[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "topk")
  @js.native
  def topk[T /* <: Tensor[Rank] */](x: T, k: js.UndefOr[scala.Nothing], sorted: Boolean): Indices[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "topk")
  @js.native
  def topk[T /* <: Tensor[Rank] */](x: T, k: Double): Indices[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "topk")
  @js.native
  def topk[T /* <: Tensor[Rank] */](x: T, k: Double, sorted: Boolean): Indices[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "topk")
  @js.native
  def topk[T /* <: Tensor[Rank] */](x: TensorLike): Indices[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "topk")
  @js.native
  def topk[T /* <: Tensor[Rank] */](x: TensorLike, k: js.UndefOr[scala.Nothing], sorted: Boolean): Indices[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "topk")
  @js.native
  def topk[T /* <: Tensor[Rank] */](x: TensorLike, k: Double): Indices[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "topk")
  @js.native
  def topk[T /* <: Tensor[Rank] */](x: TensorLike, k: Double, sorted: Boolean): Indices[T] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "transpose")
  @js.native
  def transpose[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "transpose")
  @js.native
  def transpose[T /* <: Tensor[Rank] */](x: T, perm: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "transpose")
  @js.native
  def transpose[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "transpose")
  @js.native
  def transpose[T /* <: Tensor[Rank] */](x: TensorLike, perm: js.Array[Double]): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: js.UndefOr[scala.Nothing],
    dtype: float32
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: js.UndefOr[scala.Nothing],
    dtype: float32,
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: js.UndefOr[scala.Nothing],
    dtype: int32
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: js.UndefOr[scala.Nothing],
    dtype: int32,
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: Double,
    dtype: float32
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: Double,
    dtype: float32,
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: Double,
    dtype: int32
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: js.UndefOr[scala.Nothing],
    stdDev: Double,
    dtype: int32,
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: js.UndefOr[scala.Nothing],
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: js.UndefOr[scala.Nothing],
    dtype: float32
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: js.UndefOr[scala.Nothing],
    dtype: float32,
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: js.UndefOr[scala.Nothing],
    dtype: int32
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: js.UndefOr[scala.Nothing],
    dtype: int32,
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: js.UndefOr[scala.Nothing],
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: float32
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: float32,
    seed: Double
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: int32
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "truncatedNormal")
  @js.native
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: int32,
    seed: Double
  ): Tensor[R] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "unique")
  @js.native
  def unique[T /* <: Tensor[Rank] */](x: T): Values[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "unique")
  @js.native
  def unique[T /* <: Tensor[Rank] */](x: T, axis: Double): Values[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "unique")
  @js.native
  def unique[T /* <: Tensor[Rank] */](x: TensorLike): Values[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "unique")
  @js.native
  def unique[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): Values[T] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "unsortedSegmentSum")
  @js.native
  def unsortedSegmentSum[T /* <: Tensor[Rank] */](x: T, segmentIds: Tensor1D, numSegments: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "unsortedSegmentSum")
  @js.native
  def unsortedSegmentSum[T /* <: Tensor[Rank] */](x: T, segmentIds: TensorLike, numSegments: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "unsortedSegmentSum")
  @js.native
  def unsortedSegmentSum[T /* <: Tensor[Rank] */](x: TensorLike, segmentIds: Tensor1D, numSegments: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "unsortedSegmentSum")
  @js.native
  def unsortedSegmentSum[T /* <: Tensor[Rank] */](x: TensorLike, segmentIds: TensorLike, numSegments: Double): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "unstack")
  @js.native
  val unstack: js.Function2[
    /* x */ Tensor[Rank] | TensorLike, 
    /* axis */ js.UndefOr[Double], 
    js.Array[Tensor[Rank]]
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "variable")
  @js.native
  def variable[R /* <: Rank */](initialValue: Tensor[R]): Variable[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "variable")
  @js.native
  def variable[R /* <: Rank */](
    initialValue: Tensor[R],
    trainable: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    dtype: DataType
  ): Variable[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "variable")
  @js.native
  def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: js.UndefOr[scala.Nothing], name: String): Variable[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "variable")
  @js.native
  def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: js.UndefOr[scala.Nothing], name: String, dtype: DataType): Variable[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "variable")
  @js.native
  def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean): Variable[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "variable")
  @js.native
  def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean, name: js.UndefOr[scala.Nothing], dtype: DataType): Variable[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "variable")
  @js.native
  def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean, name: String): Variable[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "variable")
  @js.native
  def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean, name: String, dtype: DataType): Variable[R] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "where")
  @js.native
  def where[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: T, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "where")
  @js.native
  def where[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: T, b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "where")
  @js.native
  def where[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: TensorLike, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "where")
  @js.native
  def where[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: TensorLike, b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "where")
  @js.native
  def where[T /* <: Tensor[Rank] */](condition: TensorLike, a: T, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "where")
  @js.native
  def where[T /* <: Tensor[Rank] */](condition: TensorLike, a: T, b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "where")
  @js.native
  def where[T /* <: Tensor[Rank] */](condition: TensorLike, a: TensorLike, b: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "where")
  @js.native
  def where[T /* <: Tensor[Rank] */](condition: TensorLike, a: TensorLike, b: TensorLike): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "whereAsync")
  @js.native
  val whereAsync: js.Function1[/* condition */ Tensor[Rank] | TensorLike, js.Promise[Tensor2D]] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "zeros")
  @js.native
  def zeros[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "zeros")
  @js.native
  def zeros[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): Tensor[R] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "zerosLike")
  @js.native
  def zerosLike[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "zerosLike")
  @js.native
  def zerosLike[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
}
