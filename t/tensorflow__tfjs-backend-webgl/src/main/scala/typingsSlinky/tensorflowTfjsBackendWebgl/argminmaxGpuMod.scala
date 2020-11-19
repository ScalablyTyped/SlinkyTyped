package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.max
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.min
import typingsSlinky.tensorflowTfjsCore.reduceUtilMod.ReduceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/argminmax_gpu", JSImport.Namespace)
@js.native
object argminmaxGpuMod extends js.Object {
  
  @js.native
  class ArgMinMaxProgram protected () extends GPGPUProgram {
    def this(reduceInfo: ReduceInfo, op: max, firstPass: Boolean) = this()
    def this(reduceInfo: ReduceInfo, op: min, firstPass: Boolean) = this()
  }
}
