package typingsSlinky.tensorflowTfjsBackendWebgl.backendWebglMod

import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLTexture
import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext
import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.NCHW
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.NHWC
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.bilinear
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.nearest
import typingsSlinky.tensorflowTfjsBackendWebgl.texUtilMod.TextureData
import typingsSlinky.tensorflowTfjsBackendWebgl.textureManagerMod.TextureManager
import typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.DataId
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import typingsSlinky.tensorflowTfjsCore.mod.DataStorage
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor2D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/backend_webgl", "MathBackendWebGL")
@js.native
class MathBackendWebGL () extends KernelBackend {
  def this(gpgpu: GPGPUContext) = this()
  
  var acquireTexture: js.Any = js.native
  
  var activeTimers: js.Any = js.native
  
  var argMinMaxReduce: js.Any = js.native
  
  var argReduce: js.Any = js.native
  
  var argReducePacked: js.Any = js.native
  
  var binaryCache: js.Any = js.native
  
  var canvas: js.Any = js.native
  
  var checkNumericalProblems: js.Any = js.native
  
  def compileAndRun[K /* <: TensorInfo */](program: GPGPUProgram, inputs: js.Array[TensorInfo]): K = js.native
  def compileAndRun[K /* <: TensorInfo */](
    program: GPGPUProgram,
    inputs: js.Array[TensorInfo],
    outputDtype: js.UndefOr[scala.Nothing],
    customSetup: js.UndefOr[scala.Nothing],
    preventEagerUnpackingOfOutput: Boolean
  ): K = js.native
  def compileAndRun[K /* <: TensorInfo */](
    program: GPGPUProgram,
    inputs: js.Array[TensorInfo],
    outputDtype: js.UndefOr[scala.Nothing],
    customSetup: js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit]
  ): K = js.native
  def compileAndRun[K /* <: TensorInfo */](
    program: GPGPUProgram,
    inputs: js.Array[TensorInfo],
    outputDtype: js.UndefOr[scala.Nothing],
    customSetup: js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit],
    preventEagerUnpackingOfOutput: Boolean
  ): K = js.native
  def compileAndRun[K /* <: TensorInfo */](program: GPGPUProgram, inputs: js.Array[TensorInfo], outputDtype: DataType): K = js.native
  def compileAndRun[K /* <: TensorInfo */](
    program: GPGPUProgram,
    inputs: js.Array[TensorInfo],
    outputDtype: DataType,
    customSetup: js.UndefOr[scala.Nothing],
    preventEagerUnpackingOfOutput: Boolean
  ): K = js.native
  def compileAndRun[K /* <: TensorInfo */](
    program: GPGPUProgram,
    inputs: js.Array[TensorInfo],
    outputDtype: DataType,
    customSetup: js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit]
  ): K = js.native
  def compileAndRun[K /* <: TensorInfo */](
    program: GPGPUProgram,
    inputs: js.Array[TensorInfo],
    outputDtype: DataType,
    customSetup: js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit],
    preventEagerUnpackingOfOutput: Boolean
  ): K = js.native
  
  /**
    * Computes a complex binary operation that can be decomposed into a simple
    * binary operation on both the real and imagary parts.
    */
  var complexSeparableBinaryOp: js.Any = js.native
  
  var computeBytes: js.Any = js.native
  
  var conv2dByMatMul: js.Any = js.native
  
  var conv2dWithIm2Row: js.Any = js.native
  
  var convertAndCacheOnCPU: js.Any = js.native
  
  var cpuBackend: js.Any = js.native
  
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
  
  var dataRefCount: js.Any = js.native
  
  var decode: js.Any = js.native
  
  @JSName("depthToSpace")
  def depthToSpace_NCHW(x: Tensor4D, blockSize: Double, dataFormat: NCHW): Tensor4D = js.native
  @JSName("depthToSpace")
  def depthToSpace_NHWC(x: Tensor4D, blockSize: Double, dataFormat: NHWC): Tensor4D = js.native
  
  var disposed: js.Any = js.native
  
  var downloadWaitMs: js.Any = js.native
  
  var endTimer: js.Any = js.native
  
  var fftImpl: js.Any = js.native
  
  var floatPrecisionValue: js.Any = js.native
  
  var getAndSaveBinary: js.Any = js.native
  
  var getCPUBackend: js.Any = js.native
  
  /**
    * Returns internal information for the specific data bucket. Used in unit
    * tests.
    */
  def getDataInfo(dataId: DataId): TextureData = js.native
  
  def getGPGPUContext(): GPGPUContext = js.native
  
  var getQueryTime: js.Any = js.native
  
  def getTexture(dataId: DataId): WebGLTexture = js.native
  
  def getTextureManager(): TextureManager = js.native
  
  var getValuesFromTexture: js.Any = js.native
  
  var gpgpu: GPGPUContext = js.native
  
  var gpgpuCreatedLocally: js.Any = js.native
  
  var makeComplexComponentTensorInfo: js.Any = js.native
  
  var makeOutput: js.Any = js.native
  
  def makeTensorInfo(shape: js.Array[Double], dtype: DataType): TensorInfo = js.native
  
  var numBytesInGPU: js.Any = js.native
  
  var numMBBeforeWarning: js.Any = js.native
  
  var packTensor: js.Any = js.native
  
  var packedBinaryOp: js.Any = js.native
  
  var packedReshape: js.Any = js.native
  
  var packedUnaryOp: js.Any = js.native
  
  var pendingDeletes: js.Any = js.native
  
  var pendingDisposal: js.Any = js.native
  
  var pendingRead: js.Any = js.native
  
  var programTimersStack: js.Any = js.native
  
  var reduce: js.Any = js.native
  
  var releaseGPUData: js.Any = js.native
  
  def reshape[R /* <: Rank */](
    x: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  
  def runWebGLProgram(program: GPGPUProgram, inputs: js.Array[TensorInfo], outputDtype: DataType): TensorInfo = js.native
  def runWebGLProgram(
    program: GPGPUProgram,
    inputs: js.Array[TensorInfo],
    outputDtype: DataType,
    customSetup: js.UndefOr[scala.Nothing],
    preventEagerUnpackingOfOutput: Boolean
  ): TensorInfo = js.native
  def runWebGLProgram(
    program: GPGPUProgram,
    inputs: js.Array[TensorInfo],
    outputDtype: DataType,
    customSetup: js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit]
  ): TensorInfo = js.native
  def runWebGLProgram(
    program: GPGPUProgram,
    inputs: js.Array[TensorInfo],
    outputDtype: DataType,
    customSetup: js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit],
    preventEagerUnpackingOfOutput: Boolean
  ): TensorInfo = js.native
  
  var segOpCompute: js.Any = js.native
  
  var shallowSlice: js.Any = js.native
  
  def shouldExecuteOnCPU(inputs: js.Array[TensorInfo]): Boolean = js.native
  def shouldExecuteOnCPU(inputs: js.Array[TensorInfo], sizeThreshold: Double): Boolean = js.native
  
  var startTimer: js.Any = js.native
  
  var texData: DataStorage[TextureData] = js.native
  
  var textureManager: js.Any = js.native
  
  var unpackTensor: js.Any = js.native
  
  var uploadToGPU: js.Any = js.native
  
  var uploadWaitMs: js.Any = js.native
  
  var warnedAboutMemory: js.Any = js.native
}
