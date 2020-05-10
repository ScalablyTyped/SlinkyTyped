package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv3DInfo
import typingsSlinky.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/conv_backprop_gpu", JSImport.Namespace)
@js.native
object convBackpropGpuMod extends js.Object {
  @js.native
  class Conv2DDerFilterProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
  }
  
  @js.native
  class Conv2DDerInputProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
  }
  
  @js.native
  class Conv3DDerFilterProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv3DInfo) = this()
  }
  
  @js.native
  class Conv3DDerInputProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv3DInfo) = this()
  }
  
}

