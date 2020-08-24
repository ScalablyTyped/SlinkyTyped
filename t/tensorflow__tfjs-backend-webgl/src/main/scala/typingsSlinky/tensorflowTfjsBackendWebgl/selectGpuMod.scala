package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/select_gpu", JSImport.Namespace)
@js.native
object selectGpuMod extends js.Object {
  @js.native
  class SelectProgram protected () extends GPGPUProgram {
    def this(cRank: Double, shape: js.Array[Double], rank: Double) = this()
  }
  
}

