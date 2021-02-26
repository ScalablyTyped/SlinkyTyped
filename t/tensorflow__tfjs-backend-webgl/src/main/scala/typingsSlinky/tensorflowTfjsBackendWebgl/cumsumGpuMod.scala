package typingsSlinky.tensorflowTfjsBackendWebgl

import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext
import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cumsumGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/cumsum_gpu", "CumSumProgram")
  @js.native
  class CumSumProgram protected () extends GPGPUProgram {
    def this(shape: js.Array[Double], exclusive: Boolean, reverse: Boolean) = this()
    
    def getCustomSetupFunc(index: Double): js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit] = js.native
    
    var index: WebGLUniformLocation = js.native
  }
}
