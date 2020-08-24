package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-backend-webgl/dist/concat_gpu", JSImport.Namespace)
@js.native
object concatGpuMod extends js.Object {
  @js.native
  class ConcatProgram protected () extends GPGPUProgram {
    def this(shapes: js.Array[js.Tuple2[Double, Double]]) = this()
  }
  
}

