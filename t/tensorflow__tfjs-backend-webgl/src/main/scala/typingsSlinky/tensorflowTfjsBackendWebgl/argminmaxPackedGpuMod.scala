package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.max
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argminmaxPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/argminmax_packed_gpu", "ArgMinMaxPackedProgram")
  @js.native
  class ArgMinMaxPackedProgram protected () extends GPGPUProgram {
    def this(shape: js.Array[Double], windowSize: Double, op: max, firstPass: Boolean) = this()
    def this(shape: js.Array[Double], windowSize: Double, op: min, firstPass: Boolean) = this()
    
    @JSName("packedInputs")
    var packedInputs_ArgMinMaxPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_ArgMinMaxPackedProgram: Boolean = js.native
  }
}
