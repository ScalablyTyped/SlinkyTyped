package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typingsSlinky.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/conv_backprop_gpu_depthwise", JSImport.Namespace)
@js.native
object convBackpropGpuDepthwiseMod extends js.Object {
  @js.native
  class DepthwiseConv2DDerFilterProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
  }
  
  @js.native
  class DepthwiseConv2DDerInputProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
  }
  
}

