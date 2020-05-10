package typingsSlinky.tensorflowTfjsCore

import org.scalajs.dom.raw.WebGLUniformLocation
import typingsSlinky.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/onehot_gpu", JSImport.Namespace)
@js.native
object onehotGpuMod extends js.Object {
  @js.native
  class OneHotProgram protected () extends GPGPUProgram {
    def this(numIndices: Double, depth: Double, onValue: Double, offValue: Double) = this()
    var seedLoc: WebGLUniformLocation = js.native
  }
  
}

