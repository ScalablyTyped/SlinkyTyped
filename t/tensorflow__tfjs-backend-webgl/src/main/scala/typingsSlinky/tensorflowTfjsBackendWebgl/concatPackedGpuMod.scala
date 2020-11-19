package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/concat_packed_gpu", JSImport.Namespace)
@js.native
object concatPackedGpuMod extends js.Object {
  
  @js.native
  class ConcatPackedProgram protected () extends GPGPUProgram {
    def this(shapes: js.Array[js.Array[Double]], axis: Double) = this()
    
    @JSName("packedInputs")
    var packedInputs_ConcatPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_ConcatPackedProgram: Boolean = js.native
  }
}
