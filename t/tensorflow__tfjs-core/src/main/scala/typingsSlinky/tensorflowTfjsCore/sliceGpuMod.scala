package typingsSlinky.tensorflowTfjsCore

import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsSlinky.tensorflowTfjsCore.gpgpuContextMod.GPGPUContext
import typingsSlinky.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/slice_gpu", JSImport.Namespace)
@js.native
object sliceGpuMod extends js.Object {
  @js.native
  class SliceProgram protected () extends GPGPUProgram {
    def this(destSize: js.Array[Double]) = this()
    var rank: Double = js.native
    var startLoc: WebGLUniformLocation = js.native
    def getCustomSetupFunc(start: js.Array[Double]): js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit] = js.native
  }
  
}

