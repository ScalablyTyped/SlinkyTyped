package typingsSlinky.tensorflowTfjsBackendWebgl

import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext
import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/fill_gpu", JSImport.Namespace)
@js.native
object fillGpuMod extends js.Object {
  
  @js.native
  class FillProgram protected () extends GPGPUProgram {
    def this(shape: js.Array[Double], value: Double) = this()
    
    def getCustomSetupFunc(value: Double): js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit] = js.native
    
    var valueLoc: WebGLUniformLocation = js.native
  }
}
