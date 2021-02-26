package typingsSlinky.tensorflowTfjsBackendWebgl

import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuContextMod.GPGPUContext
import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliceGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/slice_gpu", "SliceProgram")
  @js.native
  class SliceProgram protected () extends GPGPUProgram {
    def this(destSize: js.Array[Double]) = this()
    
    def getCustomSetupFunc(start: js.Array[Double]): js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit] = js.native
    
    var rank: Double = js.native
    
    var startLoc: WebGLUniformLocation = js.native
  }
}
