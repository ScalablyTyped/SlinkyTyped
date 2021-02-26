package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.NCDHW
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.NCHW
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.NDHWC
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.NHWC
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.channelsFirst
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.channelsLast
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.same
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.valid
import typingsSlinky.tensorflowTfjsCore.anon.Begin
import typingsSlinky.tensorflowTfjsCore.anon.Imag
import typingsSlinky.tensorflowTfjsCore.anon.Real
import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv3DInfo
import typingsSlinky.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R1
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import typingsSlinky.tensorflowTfjsCore.fusedTypesMod.Activation
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import typingsSlinky.tensorflowTfjsCore.scatterNdUtilMod.ScatterShapeInfo
import typingsSlinky.tensorflowTfjsCore.segmentUtilMod.GatherOpShapeInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backendUtil {
  
  @JSImport("@tensorflow/tfjs", "backend_util.ERF_A1")
  @js.native
  val ERF_A1: /* 0.254829592 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.ERF_A2")
  @js.native
  val ERF_A2: /* -0.284496736 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.ERF_A3")
  @js.native
  val ERF_A3: /* 1.421413741 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.ERF_A4")
  @js.native
  val ERF_A4: /* -1.453152027 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.ERF_A5")
  @js.native
  val ERF_A5: /* 1.061405429 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.ERF_P")
  @js.native
  val ERF_P: /* 0.3275911 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.PARALLELIZE_THRESHOLD")
  @js.native
  val PARALLELIZE_THRESHOLD: /* 30 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.SELU_SCALE")
  @js.native
  val SELU_SCALE: /* 1.0507009873554805 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.SELU_SCALEALPHA")
  @js.native
  val SELU_SCALEALPHA: /* 1.7580993408473768 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.applyActivation")
  @js.native
  def applyActivation(x: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], activation: Activation): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.applyActivation")
  @js.native
  def applyActivation(
    x: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    activation: Activation,
    preluActivationWeights: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.assertAndGetBroadcastShape")
  @js.native
  def assertAndGetBroadcastShape(shapeA: js.Array[Double], shapeB: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.assertAxesAreInnerMostDims")
  @js.native
  def assertAxesAreInnerMostDims(msg: String, axes: js.Array[Double], rank: Double): Unit = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.assertParamsConsistent")
  @js.native
  def assertParamsConsistent(shapes: js.Array[js.Array[Double]], axis: Double): Unit = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.assignToTypedArray")
  @js.native
  def assignToTypedArray(data: TypedArray, real: Double, imag: Double, index: Double): Unit = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.axesAreInnerMostDims")
  @js.native
  def axesAreInnerMostDims(axes: js.Array[Double], rank: Double): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.calculateShapes")
  @js.native
  def calculateShapes(updates: TensorInfo, indices: TensorInfo, shape: js.Array[Double]): ScatterShapeInfo = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.castTensor")
  @js.native
  def castTensor[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](x: T, dtype: DataType, backend: typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend): T = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.combineLocations")
  @js.native
  def combineLocations(outputLoc: js.Array[Double], reduceLoc: js.Array[Double], axes: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.complexWithEvenIndex")
  @js.native
  def complexWithEvenIndex(complex: js.typedarray.Float32Array): Imag = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.complexWithOddIndex")
  @js.native
  def complexWithOddIndex(complex: js.typedarray.Float32Array): Imag = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.computeConv2DInfo")
  @js.native
  def computeConv2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same | valid | Double | ExplicitPadding,
    roundingMode: js.UndefOr[
      typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.floor | typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.round | typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.ceil
    ],
    depthwise: js.UndefOr[Boolean],
    dataFormat: js.UndefOr[channelsFirst | channelsLast]
  ): Conv2DInfo = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.computeConv3DInfo")
  @js.native
  def computeConv3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same | valid | Double,
    depthwise: js.UndefOr[Boolean],
    dataFormat: js.UndefOr[channelsFirst | channelsLast],
    roundingMode: js.UndefOr[
      typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.floor | typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.round | typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.ceil
    ]
  ): Conv3DInfo = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.computeDefaultPad")
  @js.native
  def computeDefaultPad(inputShape: js.Tuple2[Double, Double], fieldSize: Double, stride: Double): Double = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.computeDefaultPad")
  @js.native
  def computeDefaultPad(inputShape: js.Tuple2[Double, Double], fieldSize: Double, stride: Double, dilation: Double): Double = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.computeDefaultPad")
  @js.native
  def computeDefaultPad(inputShape: js.Tuple4[Double, Double, Double, Double], fieldSize: Double, stride: Double): Double = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.computeDefaultPad")
  @js.native
  def computeDefaultPad(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    fieldSize: Double,
    stride: Double,
    dilation: Double
  ): Double = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: same,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: same,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: valid,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: valid,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo_NHWC(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo_NHWC(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo_NHWC(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: Double,
    dataFormat: NHWC,
    dilations: js.Tuple2[Double, Double]
  ): Conv2DInfo = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.computeDilation2DInfo")
  @js.native
  def computeDilation2DInfo_NHWC(
    inputShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple3[Double, Double, Double],
    strides: Double,
    pad: Double,
    dataFormat: NHWC,
    dilations: Double
  ): Conv2DInfo = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.computeOptimalWindowSize")
  @js.native
  def computeOptimalWindowSize(inSize: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.computeOutAndReduceShapes")
  @js.native
  def computeOutAndReduceShapes(aShape: js.Array[Double], axes: js.Array[Double]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.computeOutShape")
  @js.native
  def computeOutShape(shapes: js.Array[js.Array[Double]], axis: Double): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.computePool2DInfo")
  @js.native
  def computePool2DInfo(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same | valid | Double,
    roundingMode: js.UndefOr[
      typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.floor | typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.round | typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.ceil
    ],
    dataFormat: js.UndefOr[channelsFirst | channelsLast]
  ): Conv2DInfo = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.computePool3DInfo")
  @js.native
  def computePool3DInfo(
    inShape: js.Tuple5[Double, Double, Double, Double, Double],
    filterSize: Double | (js.Tuple3[Double, Double, Double]),
    strides: Double | (js.Tuple3[Double, Double, Double]),
    dilations: Double | (js.Tuple3[Double, Double, Double]),
    pad: same | valid | Double,
    roundingMode: js.UndefOr[
      typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.floor | typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.round | typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.ceil
    ],
    dataFormat: js.UndefOr[NDHWC | NCDHW]
  ): Conv3DInfo = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.convertConv2DDataFormat")
  @js.native
  def convertConv2DDataFormat_NCHW(dataFormat: NCHW): channelsLast | channelsFirst = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.convertConv2DDataFormat")
  @js.native
  def convertConv2DDataFormat_NHWC(dataFormat: NHWC): channelsLast | channelsFirst = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.eitherStridesOrDilationsAreOne")
  @js.native
  def eitherStridesOrDilationsAreOne(strides: js.Array[Double], dilations: js.Array[Double]): Boolean = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.eitherStridesOrDilationsAreOne")
  @js.native
  def eitherStridesOrDilationsAreOne(strides: js.Array[Double], dilations: Double): Boolean = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.eitherStridesOrDilationsAreOne")
  @js.native
  def eitherStridesOrDilationsAreOne(strides: Double, dilations: js.Array[Double]): Boolean = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.eitherStridesOrDilationsAreOne")
  @js.native
  def eitherStridesOrDilationsAreOne(strides: Double, dilations: Double): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.expandShapeToKeepDim")
  @js.native
  def expandShapeToKeepDim(shape: js.Array[Double], axes: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.exponent")
  @js.native
  def exponent(k: Double, n: Double, inverse: Boolean): Real = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.exponents")
  @js.native
  def exponents(n: Double, inverse: Boolean): Imag = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.getAxesPermutation")
  @js.native
  def getAxesPermutation(axes: js.Array[Double], rank: Double): js.Array[Double] | Null = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.getBroadcastDims")
  @js.native
  def getBroadcastDims(inShape: js.Array[Double], outShape: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.getComplexWithIndex")
  @js.native
  def getComplexWithIndex(complex: js.typedarray.Float32Array, index: Double): Real = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.getFusedBiasGradient")
  @js.native
  def getFusedBiasGradient(
    bias: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    dyActivation: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.getFusedDyActivation")
  @js.native
  def getFusedDyActivation(
    dy: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    y: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    activation: Activation
  ): Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.getImageCenter")
  @js.native
  def getImageCenter(center: js.Tuple2[Double, Double], imageHeight: Double, imageWidth: Double): js.Tuple2[Double, Double] = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.getImageCenter")
  @js.native
  def getImageCenter(center: Double, imageHeight: Double, imageWidth: Double): js.Tuple2[Double, Double] = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.getInnerMostAxes")
  @js.native
  def getInnerMostAxes(numAxes: Double, rank: Double): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.getPermuted")
  @js.native
  def getPermuted(reshapedRank: Double, blockShapeRank: Double): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.getPermuted")
  @js.native
  def getPermuted(reshapedRank: Double, blockShapeRank: Double, batchToSpace: Boolean): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.getReductionAxes")
  @js.native
  def getReductionAxes(inShape: js.Array[Double], outShape: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.getReshaped")
  @js.native
  def getReshaped(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.getReshaped")
  @js.native
  def getReshaped(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double, batchToSpace: Boolean): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.getReshapedPermuted")
  @js.native
  def getReshapedPermuted(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.getReshapedPermuted")
  @js.native
  def getReshapedPermuted(inputShape: js.Array[Double], blockShape: js.Array[Double], prod: Double, batchToSpace: Boolean): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.getSliceBeginCoords")
  @js.native
  def getSliceBeginCoords(crops: js.Array[js.Array[Double]], blockShape: Double): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.getSliceSize")
  @js.native
  def getSliceSize(uncroppedShape: js.Array[Double], crops: js.Array[js.Array[Double]], blockShape: Double): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.getUndoAxesPermutation")
  @js.native
  def getUndoAxesPermutation(axes: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.linspaceImpl")
  @js.native
  def linspaceImpl(start: Double, stop: Double, num: Double): Tensor[R1] = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.log")
  @js.native
  def log(msg: js.Object*): Unit = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.mergeRealAndImagArrays")
  @js.native
  def mergeRealAndImagArrays(real: js.typedarray.Float32Array, imag: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.prepareAndValidate")
  @js.native
  def prepareAndValidate(
    tensor: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    indices: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): js.Tuple4[js.Array[Double], Double, Double, js.Array[Double]] = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.prepareSplitSize")
  @js.native
  def prepareSplitSize(x: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], numOrSizeSplits: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.prepareSplitSize")
  @js.native
  def prepareSplitSize(
    x: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    numOrSizeSplits: js.Array[Double],
    axis: Double
  ): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.prepareSplitSize")
  @js.native
  def prepareSplitSize(x: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], numOrSizeSplits: Double): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.prepareSplitSize")
  @js.native
  def prepareSplitSize(
    x: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    numOrSizeSplits: Double,
    axis: Double
  ): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.prepareSplitSize")
  @js.native
  def prepareSplitSize(x: TensorInfo, numOrSizeSplits: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.prepareSplitSize")
  @js.native
  def prepareSplitSize(x: TensorInfo, numOrSizeSplits: js.Array[Double], axis: Double): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.prepareSplitSize")
  @js.native
  def prepareSplitSize(x: TensorInfo, numOrSizeSplits: Double): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.prepareSplitSize")
  @js.native
  def prepareSplitSize(x: TensorInfo, numOrSizeSplits: Double, axis: Double): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.reshapeTensor")
  @js.native
  def reshapeTensor[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, R /* <: typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank */](
    x: T,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  
  object segmentUtil {
    
    @JSImport("@tensorflow/tfjs", "backend_util.segment_util.collectGatherOpShapeInfo")
    @js.native
    def collectGatherOpShapeInfo(
      x: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      indices: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
      axis: Double
    ): GatherOpShapeInfo = js.native
    
    @JSImport("@tensorflow/tfjs", "backend_util.segment_util.computeOutShape")
    @js.native
    def computeOutShape(aShape: js.Array[Double], axis: Double, numSegments: Double): js.Array[Double] = js.native
    
    @JSImport("@tensorflow/tfjs", "backend_util.segment_util.segOpComputeOptimalWindowSize")
    @js.native
    def segOpComputeOptimalWindowSize(inSize: Double, numSegments: Double): Double = js.native
  }
  
  @JSImport("@tensorflow/tfjs", "backend_util.shouldFuse")
  @js.native
  def shouldFuse(gradientDepth: Double, activation: Activation): Boolean = js.native
  
  object sliceUtil {
    
    @JSImport("@tensorflow/tfjs", "backend_util.slice_util.assertParamsValid")
    @js.native
    def assertParamsValid(input: TensorInfo, begin: js.Array[Double], size: js.Array[Double]): Unit = js.native
    
    @JSImport("@tensorflow/tfjs", "backend_util.slice_util.computeFlatOffset")
    @js.native
    def computeFlatOffset(begin: js.Array[Double], strides: js.Array[Double]): Double = js.native
    
    @JSImport("@tensorflow/tfjs", "backend_util.slice_util.computeOutShape")
    @js.native
    def computeOutShape(begin: js.Array[Double], end: js.Array[Double], strides: js.Array[Double]): js.Array[Double] = js.native
    
    @JSImport("@tensorflow/tfjs", "backend_util.slice_util.getNormalizedAxes")
    @js.native
    def getNormalizedAxes(
      inputShape: js.Array[Double],
      ellipsisAxes: js.Array[Double],
      numInterpolatedAxes: Double,
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Double,
      ellipsisMask: Double
    ): Begin = js.native
    
    @JSImport("@tensorflow/tfjs", "backend_util.slice_util.isSliceContinous")
    @js.native
    def isSliceContinous(shape: js.Array[Double], begin: js.Array[Double], size: js.Array[Double]): Boolean = js.native
    
    @JSImport("@tensorflow/tfjs", "backend_util.slice_util.maskToAxes")
    @js.native
    def maskToAxes(mask: Double): js.Array[Double] = js.native
    
    @JSImport("@tensorflow/tfjs", "backend_util.slice_util.parseSliceParams")
    @js.native
    def parseSliceParams(x: TensorInfo, begin: js.Array[Double]): js.Array[js.Array[Double]] = js.native
    @JSImport("@tensorflow/tfjs", "backend_util.slice_util.parseSliceParams")
    @js.native
    def parseSliceParams(x: TensorInfo, begin: js.Array[Double], size: js.Array[Double]): js.Array[js.Array[Double]] = js.native
    @JSImport("@tensorflow/tfjs", "backend_util.slice_util.parseSliceParams")
    @js.native
    def parseSliceParams(x: TensorInfo, begin: js.Array[Double], size: Double): js.Array[js.Array[Double]] = js.native
    @JSImport("@tensorflow/tfjs", "backend_util.slice_util.parseSliceParams")
    @js.native
    def parseSliceParams(x: TensorInfo, begin: Double): js.Array[js.Array[Double]] = js.native
    @JSImport("@tensorflow/tfjs", "backend_util.slice_util.parseSliceParams")
    @js.native
    def parseSliceParams(x: TensorInfo, begin: Double, size: js.Array[Double]): js.Array[js.Array[Double]] = js.native
    @JSImport("@tensorflow/tfjs", "backend_util.slice_util.parseSliceParams")
    @js.native
    def parseSliceParams(x: TensorInfo, begin: Double, size: Double): js.Array[js.Array[Double]] = js.native
    
    @JSImport("@tensorflow/tfjs", "backend_util.slice_util.startForAxis")
    @js.native
    def startForAxis(
      beginMask: Double,
      startIndices: js.Array[Double],
      strides: js.Array[Double],
      inputShape: js.Array[Double],
      axis: Double,
      ellipsisMask: Double
    ): Double = js.native
    
    @JSImport("@tensorflow/tfjs", "backend_util.slice_util.startIndicesWithElidedDims")
    @js.native
    def startIndicesWithElidedDims(
      beginMask: Double,
      ellipsisInsertionIndex: Double,
      numElidedAxes: Double,
      originalBegin: js.Array[Double],
      inputShape: js.Array[Double]
    ): js.Array[Double] = js.native
    
    @JSImport("@tensorflow/tfjs", "backend_util.slice_util.stopForAxis")
    @js.native
    def stopForAxis(
      endMask: Double,
      stopIndices: js.Array[Double],
      strides: js.Array[Double],
      inputShape: js.Array[Double],
      axis: Double,
      ellipsisMask: Double
    ): Double = js.native
    
    @JSImport("@tensorflow/tfjs", "backend_util.slice_util.stopIndicesWithElidedDims")
    @js.native
    def stopIndicesWithElidedDims(
      endMask: Double,
      ellipsisInsertionIndex: Double,
      numElidedAxes: Double,
      originalEnd: js.Array[Double],
      inputShape: js.Array[Double]
    ): js.Array[Double] = js.native
    
    @JSImport("@tensorflow/tfjs", "backend_util.slice_util.stridesForAxis")
    @js.native
    def stridesForAxis(strides: js.Array[Double], axis: Double, ellipsisMask: Double): Double = js.native
    
    @JSImport("@tensorflow/tfjs", "backend_util.slice_util.stridesWithElidedDims")
    @js.native
    def stridesWithElidedDims(
      strides: js.Array[Double],
      ellipsisInsertionIndex: Double,
      numElidedAxes: Double,
      inputShape: js.Array[Double]
    ): js.Array[Double] = js.native
  }
  
  @JSImport("@tensorflow/tfjs", "backend_util.splitRealAndImagArrays")
  @js.native
  def splitRealAndImagArrays(complex: js.typedarray.Float32Array): Imag = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.tupleValuesAreOne")
  @js.native
  def tupleValuesAreOne(param: js.Array[Double]): Boolean = js.native
  @JSImport("@tensorflow/tfjs", "backend_util.tupleValuesAreOne")
  @js.native
  def tupleValuesAreOne(param: Double): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.upcastType")
  @js.native
  def upcastType(typeA: DataType, typeB: DataType): DataType = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.validateInput")
  @js.native
  def validateInput(
    updates: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    indices: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    shape: js.Array[Double]
  ): Unit = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.validateUpdateShape")
  @js.native
  def validateUpdateShape(
    shape: js.Array[Double],
    indices: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    updates: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Unit = js.native
  
  @JSImport("@tensorflow/tfjs", "backend_util.warn")
  @js.native
  def warn(msg: js.Object*): Unit = js.native
}
