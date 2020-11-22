package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.imag
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.real
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-webgl/dist/fft_gpu", JSImport.Namespace)
@js.native
object fftGpuMod extends js.Object {
  
  @js.native
  class FFTProgram protected () extends GPGPUProgram {
    def this(component: imag, inputShape: js.Tuple2[Double, Double], inverse: Boolean) = this()
    def this(component: real, inputShape: js.Tuple2[Double, Double], inverse: Boolean) = this()
  }
}
