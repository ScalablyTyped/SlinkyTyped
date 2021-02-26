package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lrnPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/lrn_packed_gpu", "LRNPackedProgram")
  @js.native
  class LRNPackedProgram protected () extends GPGPUProgram {
    def this(xShape: js.Array[Double], radius: Double, bias: Double, alpha: Double, beta: Double) = this()
    
    @JSName("packedInputs")
    var packedInputs_LRNPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_LRNPackedProgram: Boolean = js.native
  }
}
