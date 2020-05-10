package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/resize_nearest_neighbor_gpu", JSImport.Namespace)
@js.native
object resizeNearestNeighborGpuMod extends js.Object {
  @js.native
  class ResizeNearestNeighborProgram protected () extends GPGPUProgram {
    def this(
      inputShape: js.Tuple4[Double, Double, Double, Double],
      newHeight: Double,
      newWidth: Double,
      alignCorners: Boolean
    ) = this()
  }
  
}

