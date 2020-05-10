package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv3DInfo
import typingsSlinky.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/conv_gpu", JSImport.Namespace)
@js.native
object convGpuMod extends js.Object {
  @js.native
  class Conv2DProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv2DInfo) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean, activation: String) = this()
    def this(convInfo: Conv2DInfo, addBias: Boolean, activation: String, hasPreluActivationWeights: Boolean) = this()
  }
  
  @js.native
  class Conv3DProgram protected () extends GPGPUProgram {
    def this(convInfo: Conv3DInfo) = this()
  }
  
}

