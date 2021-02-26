package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.anon.InputsIFFTInputs
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ifftMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/IFFT", "ifft")
  @js.native
  def ifft(args: InputsIFFTInputs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/IFFT", "ifftConfig")
  @js.native
  val ifftConfig: KernelConfig = js.native
}
