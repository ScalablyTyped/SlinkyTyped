package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/concat_gpu", JSImport.Namespace)
@js.native
object concatGpuMod extends js.Object {
  @js.native
  class ConcatProgram protected () extends GPGPUProgram {
    def this(shapes: js.Array[js.Tuple2[Double, Double]]) = this()
  }
  
}

