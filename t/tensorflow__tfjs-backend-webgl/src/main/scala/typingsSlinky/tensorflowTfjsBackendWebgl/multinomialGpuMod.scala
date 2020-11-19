package typingsSlinky.tensorflowTfjsBackendWebgl

import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext
import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/multinomial_gpu", JSImport.Namespace)
@js.native
object multinomialGpuMod extends js.Object {
  
  @js.native
  class MultinomialProgram protected () extends GPGPUProgram {
    def this(batchSize: Double, numOutcomes: Double, numSamples: Double) = this()
    
    def getCustomSetupFunc(seed: Double): js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit] = js.native
    
    var seedLoc: WebGLUniformLocation = js.native
  }
}
