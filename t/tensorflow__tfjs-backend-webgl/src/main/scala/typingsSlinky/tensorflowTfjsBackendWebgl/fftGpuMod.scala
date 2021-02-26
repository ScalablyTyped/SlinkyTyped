package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.gpgpuMathMod.GPGPUProgram
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.imag
import typingsSlinky.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.real
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fftGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/fft_gpu", "FFTProgram")
  @js.native
  class FFTProgram protected () extends GPGPUProgram {
    def this(component: imag, inputShape: js.Tuple2[Double, Double], inverse: Boolean) = this()
    def this(component: real, inputShape: js.Tuple2[Double, Double], inverse: Boolean) = this()
  }
}
