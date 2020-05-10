package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/reverse_gpu", JSImport.Namespace)
@js.native
object reverseGpuMod extends js.Object {
  @js.native
  class ReverseProgram protected () extends GPGPUProgram {
    def this(xShape: js.Array[Double], axis: js.Array[Double]) = this()
  }
  
}

