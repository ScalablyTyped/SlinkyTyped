package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/resize_bilinear_backprop_gpu", JSImport.Namespace)
@js.native
object resizeBilinearBackpropGpuMod extends js.Object {
  @js.native
  class ResizeBilinearBackpropProgram protected () extends GPGPUProgram {
    def this(dy: Tensor4D, x: Tensor4D, alignCorners: Boolean) = this()
  }
  
}

