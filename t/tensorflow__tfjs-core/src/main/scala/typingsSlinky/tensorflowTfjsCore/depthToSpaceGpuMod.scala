package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/depth_to_space_gpu", JSImport.Namespace)
@js.native
object depthToSpaceGpuMod extends js.Object {
  @js.native
  class DepthToSpaceProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Array[Double], blockSize: Double, dataFormat: NCHW) = this()
    def this(outputShape: js.Array[Double], blockSize: Double, dataFormat: NHWC) = this()
    var blockSize: Double = js.native
    var dataFormat: String = js.native
    var getDepthCoordString: js.Any = js.native
    var getHeightCoordString: js.Any = js.native
    var getInputSamplingString: js.Any = js.native
    var getOutputDepthSize: js.Any = js.native
    var getWidthCoordString: js.Any = js.native
  }
  
}

