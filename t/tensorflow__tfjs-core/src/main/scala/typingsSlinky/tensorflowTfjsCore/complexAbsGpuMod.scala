package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/complex_abs_gpu", JSImport.Namespace)
@js.native
object complexAbsGpuMod extends js.Object {
  @js.native
  class ComplexAbsProgram protected () extends GPGPUProgram {
    def this(shape: js.Array[Double]) = this()
  }
  
}

