package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.anon.BackendMathBackendWebGL
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fftMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/FFT", "fft")
  @js.native
  def fft(args: BackendMathBackendWebGL): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/FFT", "fftConfig")
  @js.native
  val fftConfig: KernelConfig = js.native
}
