package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/scatter_gpu", JSImport.Namespace)
@js.native
object scatterGpuMod extends js.Object {
  
  @js.native
  class ScatterProgram protected () extends GPGPUProgram {
    def this(
      updateSize: Double,
      sliceDim: Double,
      indicesRank: Double,
      updatesRank: Double,
      strides: js.Array[Double],
      shape: js.Array[Double]
    ) = this()
    def this(
      updateSize: Double,
      sliceDim: Double,
      indicesRank: Double,
      updatesRank: Double,
      strides: js.Array[Double],
      shape: js.Array[Double],
      summingDupeIndex: Boolean
    ) = this()
  }
}
