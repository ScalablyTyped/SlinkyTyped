package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/cumsum_gpu", JSImport.Namespace)
@js.native
object cumsumGpuMod extends js.Object {
  @js.native
  class CumSumProgram protected () extends GPGPUProgram {
    def this(shape: js.Array[Double], exclusive: Boolean, reverse: Boolean) = this()
  }
  
}

