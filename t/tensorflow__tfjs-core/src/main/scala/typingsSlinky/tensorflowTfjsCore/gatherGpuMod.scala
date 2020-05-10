package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/gather_gpu", JSImport.Namespace)
@js.native
object gatherGpuMod extends js.Object {
  @js.native
  class GatherProgram protected () extends GPGPUProgram {
    def this(aShape: js.Array[Double], indicesLength: Double, axis: Double) = this()
    var rank: Double = js.native
  }
  
}

