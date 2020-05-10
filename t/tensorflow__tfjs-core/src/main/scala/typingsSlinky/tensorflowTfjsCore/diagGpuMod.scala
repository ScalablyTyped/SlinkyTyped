package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/diag_gpu", JSImport.Namespace)
@js.native
object diagGpuMod extends js.Object {
  @js.native
  class DiagProgram protected () extends GPGPUProgram {
    def this(size: Double) = this()
  }
  
}

