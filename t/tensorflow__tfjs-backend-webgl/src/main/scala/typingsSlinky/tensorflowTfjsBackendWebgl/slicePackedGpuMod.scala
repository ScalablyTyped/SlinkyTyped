package typingsSlinky.tensorflowTfjsBackendWebgl

import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext
import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/slice_packed_gpu", JSImport.Namespace)
@js.native
object slicePackedGpuMod extends js.Object {
  
  @js.native
  class SlicePackedProgram protected () extends GPGPUProgram {
    def this(destSize: js.Array[Double]) = this()
    
    def getCustomSetupFunc(start: js.Array[Double]): js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit] = js.native
    
    @JSName("packedInputs")
    var packedInputs_SlicePackedProgram: Boolean = js.native
    
    @JSName("packedOutput")
    var packedOutput_SlicePackedProgram: Boolean = js.native
    
    var rank: Double = js.native
    
    var startLoc: WebGLUniformLocation = js.native
  }
}
