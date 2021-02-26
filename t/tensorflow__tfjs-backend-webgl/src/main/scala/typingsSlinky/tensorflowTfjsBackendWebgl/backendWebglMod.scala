package typingsSlinky.tensorflowTfjsBackendWebgl

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLTexture
import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext
import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUBinary
import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.NCHW
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.NHWC
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.bilinear
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.nearest
import typingsSlinky.tensorflowTfjsBackendWebgl.texUtilMod.TextureData
import typingsSlinky.tensorflowTfjsBackendWebgl.textureManagerMod.TextureManager
import typingsSlinky.tensorflowTfjsCore.anon.Error
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.BackendValues
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typingsSlinky.tensorflowTfjsCore.engineMod.MemoryInfo
import typingsSlinky.tensorflowTfjsCore.engineMod.TimingInfo
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.DataId
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import typingsSlinky.tensorflowTfjsCore.mod.DataStorage
import typingsSlinky.tensorflowTfjsCore.mod.KernelBackend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backendWebglMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/backend_webgl", "EPSILON_FLOAT16")
  @js.native
  val EPSILON_FLOAT16: /* 0.0001 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/backend_webgl", "EPSILON_FLOAT32")
  @js.native
  val EPSILON_FLOAT32: /* 1e-7 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/backend_webgl", "MATMUL_SHARED_DIM_THRESHOLD")
  @js.native
  val MATMUL_SHARED_DIM_THRESHOLD: /* 1000 */ Double = js.native
  
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
    
    /** Decrease refCount of a `TextureData`. */
    def decRef(dataId: DataId): Unit = js.native
    
    var decode: js.Any = js.native
    
    @JSName("depthToSpace")
    def depthToSpace_NCHW(x: Tensor4D, blockSize: Double, dataFormat: NCHW): Tensor4D = js.native
    @JSName("depthToSpace")
    def depthToSpace_NHWC(x: Tensor4D, blockSize: Double, dataFormat: NHWC): Tensor4D = js.native
    
    def disposeIntermediateTensorInfo(tensorInfo: TensorInfo): Unit = js.native
    
    var disposed: js.Any = js.native
    
    var downloadWaitMs: js.Any = js.native
    
    var endTimer: js.Any = js.native
    
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
    
    /** Increase refCount of a `TextureData`. */
    def incRef(dataId: DataId): Unit = js.native
    
    var makeComplexComponentTensorInfo: js.Any = js.native
    
    var makeOutput: js.Any = js.native
    
    def makeTensorInfo(shape: js.Array[Double], dtype: DataType): TensorInfo = js.native
    def makeTensorInfo(shape: js.Array[Double], dtype: DataType, values: BackendValues): TensorInfo = js.native
    
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
    
    var tryRunOnCpuOrThrow: js.Any = js.native
    
    var unpackTensor: js.Any = js.native
    
    var uploadToGPU: js.Any = js.native
    
    var uploadWaitMs: js.Any = js.native
    
    var warnedAboutCPUBackend: js.Any = js.native
    
    var warnedAboutMemory: js.Any = js.native
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/backend_webgl", "getBinaryCache")
  @js.native
  def getBinaryCache(webGLVersion: Double): StringDictionary[GPGPUBinary] = js.native
  
  @js.native
  trait CPUTimerQuery extends StObject {
    
    var endMs: js.UndefOr[Double] = js.native
    
    var startMs: Double = js.native
  }
  object CPUTimerQuery {
    
    @scala.inline
    def apply(startMs: Double): CPUTimerQuery = {
      val __obj = js.Dynamic.literal(startMs = startMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[CPUTimerQuery]
    }
    
    @scala.inline
    implicit class CPUTimerQueryMutableBuilder[Self <: CPUTimerQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndMs(value: Double): Self = StObject.set(x, "endMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndMsUndefined: Self = StObject.set(x, "endMs", js.undefined)
      
      @scala.inline
      def setStartMs(value: Double): Self = StObject.set(x, "startMs", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KernelInfo extends StObject {
    
    var name: String = js.native
    
    var query: js.Promise[Double] = js.native
  }
  object KernelInfo {
    
    @scala.inline
    def apply(name: String, query: js.Promise[Double]): KernelInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[KernelInfo]
    }
    
    @scala.inline
    implicit class KernelInfoMutableBuilder[Self <: KernelInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: js.Promise[Double]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  type TimerNode = RecursiveArray[KernelInfo] | KernelInfo
  
  @js.native
  trait WebGLMemoryInfo extends MemoryInfo {
    
    var numBytesInGPU: Double = js.native
    
    var numBytesInGPUAllocated: Double = js.native
    
    var numBytesInGPUFree: Double = js.native
    
    @JSName("unreliable")
    var unreliable_WebGLMemoryInfo: Boolean = js.native
  }
  object WebGLMemoryInfo {
    
    @scala.inline
    def apply(
      numBytes: Double,
      numBytesInGPU: Double,
      numBytesInGPUAllocated: Double,
      numBytesInGPUFree: Double,
      numDataBuffers: Double,
      numTensors: Double,
      reasons: js.Array[String],
      unreliable: Boolean
    ): WebGLMemoryInfo = {
      val __obj = js.Dynamic.literal(numBytes = numBytes.asInstanceOf[js.Any], numBytesInGPU = numBytesInGPU.asInstanceOf[js.Any], numBytesInGPUAllocated = numBytesInGPUAllocated.asInstanceOf[js.Any], numBytesInGPUFree = numBytesInGPUFree.asInstanceOf[js.Any], numDataBuffers = numDataBuffers.asInstanceOf[js.Any], numTensors = numTensors.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any], unreliable = unreliable.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGLMemoryInfo]
    }
    
    @scala.inline
    implicit class WebGLMemoryInfoMutableBuilder[Self <: WebGLMemoryInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNumBytesInGPU(value: Double): Self = StObject.set(x, "numBytesInGPU", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumBytesInGPUAllocated(value: Double): Self = StObject.set(x, "numBytesInGPUAllocated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumBytesInGPUFree(value: Double): Self = StObject.set(x, "numBytesInGPUFree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnreliable(value: Boolean): Self = StObject.set(x, "unreliable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebGLTimingInfo extends TimingInfo {
    
    var downloadWaitMs: Double = js.native
    
    var uploadWaitMs: Double = js.native
  }
  object WebGLTimingInfo {
    
    @scala.inline
    def apply(downloadWaitMs: Double, kernelMs: Double | Error, uploadWaitMs: Double, wallMs: Double): WebGLTimingInfo = {
      val __obj = js.Dynamic.literal(downloadWaitMs = downloadWaitMs.asInstanceOf[js.Any], kernelMs = kernelMs.asInstanceOf[js.Any], uploadWaitMs = uploadWaitMs.asInstanceOf[js.Any], wallMs = wallMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebGLTimingInfo]
    }
    
    @scala.inline
    implicit class WebGLTimingInfoMutableBuilder[Self <: WebGLTimingInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownloadWaitMs(value: Double): Self = StObject.set(x, "downloadWaitMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadWaitMs(value: Double): Self = StObject.set(x, "uploadWaitMs", value.asInstanceOf[js.Any])
    }
  }
}
