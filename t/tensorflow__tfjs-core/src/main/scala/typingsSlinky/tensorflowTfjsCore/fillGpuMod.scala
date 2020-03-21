package typingsSlinky.tensorflowTfjsCore

import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsSlinky.tensorflowTfjsCore.gpgpuContextMod.GPGPUContext
import typingsSlinky.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/fill_gpu", JSImport.Namespace)
@js.native
object fillGpuMod extends js.Object {
  @js.native
  class FillProgram protected () extends GPGPUProgram {
    def this(shape: js.Array[Double], value: Double) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    var valueLoc: WebGLUniformLocation = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
    def getCustomSetupFunc(value: Double): js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit] = js.native
  }
  
}

