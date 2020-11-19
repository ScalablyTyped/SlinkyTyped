package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/gather_nd_gpu", JSImport.Namespace)
@js.native
object gatherNdGpuMod extends js.Object {
  
  @js.native
  class GatherNDProgram protected () extends GPGPUProgram {
    def this(sliceDim: Double, strides: js.Array[Double], shape: js.Array[Double]) = this()
    
    var sliceDim: js.Any = js.native
    
    var strides: js.Any = js.native
  }
}
