package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typingsSlinky.tensorflowTfjsBackendWebgl.texUtilMod.TextureUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodeFloatGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/encode_float_gpu", "EncodeFloatProgram")
  @js.native
  class EncodeFloatProgram protected () extends GPGPUProgram {
    def this(outputShape: js.Array[Double]) = this()
    
    @JSName("outTexUsage")
    var outTexUsage_EncodeFloatProgram: TextureUsage = js.native
  }
}
