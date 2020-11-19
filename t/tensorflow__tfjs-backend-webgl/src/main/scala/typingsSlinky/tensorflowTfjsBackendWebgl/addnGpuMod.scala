package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/addn_gpu", JSImport.Namespace)
@js.native
object addnGpuMod extends js.Object {
  
  @js.native
  class AddNProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Array[Double], shapes: js.Array[js.Array[Double]]) = this()
  }
}
