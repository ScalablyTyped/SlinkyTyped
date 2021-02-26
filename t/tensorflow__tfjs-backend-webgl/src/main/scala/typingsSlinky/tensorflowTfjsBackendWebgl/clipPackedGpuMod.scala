package typingsSlinky.tensorflowTfjsBackendWebgl

import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext
import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipPackedGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/clip_packed_gpu", "ClipPackedProgram")
  @js.native
  class ClipPackedProgram protected () extends GPGPUProgram {
    def this(aShape: js.Array[Double]) = this()
    
    def getCustomSetupFunc(min: Double, max: Double): js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit] = js.native
    
    var maxLoc: WebGLUniformLocation = js.native
    
    var minLoc: WebGLUniformLocation = js.native
    
    @JSName("packedInputs")
    var packedInputs_ClipPackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_ClipPackedProgram: Boolean = js.native
  }
}
