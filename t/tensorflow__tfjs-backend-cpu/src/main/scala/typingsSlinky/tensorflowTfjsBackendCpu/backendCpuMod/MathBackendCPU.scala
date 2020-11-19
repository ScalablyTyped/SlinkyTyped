package typingsSlinky.tensorflowTfjsBackendCpu.backendCpuMod

import typingsSlinky.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.NCHW
import typingsSlinky.tensorflowTfjsBackendCpu.tensorflowTfjsBackendCpuStrings.NHWC
import typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend
import typingsSlinky.tensorflowTfjsCore.distTypesMod.BackendValues
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R4
import typingsSlinky.tensorflowTfjsCore.mod.DataStorage
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor2D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/backend_cpu", "MathBackendCPU")
@js.native
class MathBackendCPU () extends KernelBackend {
  
  var blockSize: Double = js.native
  
  var broadcastedBinaryComplexOp: js.Any = js.native
  
  var broadcastedBinaryOp: js.Any = js.native
  
  var bufferSync: js.Any = js.native
  
  def cropAndResize(
    images: Tensor4D,
    boxes: Tensor2D,
    boxIndex: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: String,
    extrapolationValue: Double
  ): Tensor[R4] = js.native
  
  var data: DataStorage[TensorData[DataType]] = js.native
  
  @JSName("depthToSpace")
  def depthToSpace_NCHW(x: Tensor4D, blockSize: Double, dataFormat: NCHW): Tensor4D = js.native
  @JSName("depthToSpace")
  def depthToSpace_NHWC(x: Tensor4D, blockSize: Double, dataFormat: NHWC): Tensor4D = js.native
  
  def disposeData(dataId: DataId): Unit = js.native
  
  /**
    * Calculate FFT of inner most elements of batch tensor.
    */
  var fftBatch: js.Any = js.native
  
  var fftImpl: js.Any = js.native
  
  var fftRadix2: js.Any = js.native
  
  var firstUse: js.Any = js.native
  
  var fourierTransformByMatmul: js.Any = js.native
  
  var isExponentOf2: js.Any = js.native
  
  def linear[T /* <: Tensor[Rank] */](x: T): T = js.native
  
  var makeOutput: js.Any = js.native
  
  var maxPool3dPositions: js.Any = js.native
  
  def move(dataId: DataId, values: BackendValues, shape: js.Array[Double], dtype: DataType): Unit = js.native
  
  var pool3d: js.Any = js.native
  
  def read(dataId: DataId): js.Promise[BackendValues] = js.native
  
  def readSync(dataId: DataId): BackendValues = js.native
  
  def reshape[R /* <: Rank */](
    x: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  
  var scatter: js.Any = js.native
  
  def step[T /* <: Tensor[Rank] */](x: T): T = js.native
}
