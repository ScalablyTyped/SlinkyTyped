package typingsSlinky.tensorflowTfjsCore

import org.scalajs.dom.raw.WebGLProgram
import org.scalajs.dom.raw.WebGLUniformLocation
import typingsSlinky.tensorflowTfjsCore.gpgpuContextMod.GPGPUContext
import typingsSlinky.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/slice_packed_gpu", JSImport.Namespace)
@js.native
object slicePackedGpuMod extends js.Object {
  @js.native
  class SlicePackedProgram protected () extends GPGPUProgram {
    def this(destSize: js.Array[Double]) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    @JSName("packedInputs")
    var packedInputs_SlicePackedProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_SlicePackedProgram: Boolean = js.native
    var rank: Double = js.native
    var startLoc: WebGLUniformLocation = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
    def getCustomSetupFunc(start: js.Array[Double]): js.Function2[/* gpgpu */ GPGPUContext, /* webGLProgram */ WebGLProgram, Unit] = js.native
  }
  
}

