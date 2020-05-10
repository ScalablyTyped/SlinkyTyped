package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/unpack_gpu", JSImport.Namespace)
@js.native
object unpackGpuMod extends js.Object {
  @js.native
  class UnpackProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Array[Double]) = this()
    @JSName("packedInputs")
    var packedInputs_UnpackProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_UnpackProgram: Boolean = js.native
  }
  
}

