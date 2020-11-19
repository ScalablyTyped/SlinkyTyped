package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/resize_nearest_neighbor_backprop_gpu", JSImport.Namespace)
@js.native
object resizeNearestNeighborBackpropGpuMod extends js.Object {
  
  @js.native
  class ResizeNearestNeigborBackpropProgram protected () extends GPGPUProgram {
    def this(dy: Tensor4D, x: Tensor4D, alignCorners: Boolean) = this()
  }
}
