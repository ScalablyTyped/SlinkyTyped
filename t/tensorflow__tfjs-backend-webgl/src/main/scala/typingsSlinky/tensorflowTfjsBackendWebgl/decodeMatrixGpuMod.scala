package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typingsSlinky.tensorflowTfjsBackendWebgl.texUtilMod.PackingScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/decode_matrix_gpu", JSImport.Namespace)
@js.native
object decodeMatrixGpuMod extends js.Object {
  
  @js.native
  class DecodeMatrixProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Tuple3[Double, Double, Double]) = this()
    
    @JSName("outPackingScheme")
    var outPackingScheme_DecodeMatrixProgram: PackingScheme = js.native
    
    @JSName("outputShape")
    var outputShape_DecodeMatrixProgram: js.Tuple3[Double, Double, Double] = js.native
    
    @JSName("packedInputs")
    var packedInputs_DecodeMatrixProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_DecodeMatrixProgram: Boolean = js.native
  }
}
