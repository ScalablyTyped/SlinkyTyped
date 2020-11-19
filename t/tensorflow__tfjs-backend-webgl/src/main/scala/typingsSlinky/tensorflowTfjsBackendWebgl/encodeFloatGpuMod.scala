package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typingsSlinky.tensorflowTfjsBackendWebgl.texUtilMod.TextureUsage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/encode_float_gpu", JSImport.Namespace)
@js.native
object encodeFloatGpuMod extends js.Object {
  
  @js.native
  class EncodeFloatProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Array[Double]) = this()
    
    @JSName("outTexUsage")
    var outTexUsage_EncodeFloatProgram: TextureUsage = js.native
  }
}
