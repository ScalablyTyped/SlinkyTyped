package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/lrn_gpu", JSImport.Namespace)
@js.native
object lrnGpuMod extends js.Object {
  @js.native
  class LRNProgram protected () extends GPGPUProgram {
    def this(xShape: js.Array[Double], radius: Double, bias: Double, alpha: Double, beta: Double) = this()
  }
  
}

