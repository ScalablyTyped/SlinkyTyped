package typingsSlinky.tensorflowTfjsCore

import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsSlinky.tensorflowTfjsCore.gpgpuContextMod.GPGPUContext
import typingsSlinky.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/multinomial_gpu", JSImport.Namespace)
@js.native
object multinomialGpuMod extends js.Object {
  @js.native
  class MultinomialProgram protected () extends GPGPUProgram {
    def this(batchSize: Double, numOutcomes: Double, numSamples: Double) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    var seedLoc: WebGLUniformLocation = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
    def getCustomSetupFunc(seed: Double): js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit] = js.native
  }
  
}

