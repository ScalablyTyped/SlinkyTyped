package typingsSlinky.tensorflowTfjsCore.backendCpuMod

import typingsSlinky.tensorflowTfjsCore.backendMod.DataStorage
import typingsSlinky.tensorflowTfjsCore.backendMod.KernelBackend
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R4
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor2D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/cpu/backend_cpu", "MathBackendCPU")
@js.native
class MathBackendCPU () extends KernelBackend {
  var blockSize: Double = js.native
  var broadcastedBinaryComplexOp: js.Any = js.native
  var broadcastedBinaryOp: js.Any = js.native
  var bufferSync: js.Any = js.native
  var data: DataStorage[TensorData[DataType]] = js.native
  /**
    * Calculate FFT of inner most elements of batch tensor.
    */
  var fftBatch: js.Any = js.native
  var fftImpl: js.Any = js.native
  var fftRadix2: js.Any = js.native
  var firstUse: js.Any = js.native
  var fourierTransformByMatmul: js.Any = js.native
  var isExponentOf2: js.Any = js.native
  var makeOutput: js.Any = js.native
  var maxPool3dPositions: js.Any = js.native
  var pool3d: js.Any = js.native
  var scatter: js.Any = js.native
  def cropAndResize(
    images: Tensor4D,
    boxes: Tensor2D,
    boxIndex: Tensor1D,
    cropSize: js.Tuple2[Double, Double],
    method: String,
    extrapolationValue: Double
  ): Tensor[R4] = js.native
  @JSName("depthToSpace")
  def depthToSpace_NCHW(x: Tensor4D, blockSize: Double, dataFormat: NCHW): Tensor4D = js.native
  @JSName("depthToSpace")
  def depthToSpace_NHWC(x: Tensor4D, blockSize: Double, dataFormat: NHWC): Tensor4D = js.native
  def linear[T /* <: Tensor[Rank] */](x: T): T = js.native
  def reshape[R /* <: Rank */](
    x: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = js.native
  def step[T /* <: Tensor[Rank] */](x: T): T = js.native
}

