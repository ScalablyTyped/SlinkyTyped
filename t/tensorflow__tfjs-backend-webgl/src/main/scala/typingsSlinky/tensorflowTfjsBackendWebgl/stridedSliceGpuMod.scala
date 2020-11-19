package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/strided_slice_gpu", JSImport.Namespace)
@js.native
object stridedSliceGpuMod extends js.Object {
  
  @js.native
  class StridedSliceProgram protected () extends GPGPUProgram {
    def this(begin: js.Array[Double], strides: js.Array[Double], size: js.Array[Double]) = this()
  }
}
