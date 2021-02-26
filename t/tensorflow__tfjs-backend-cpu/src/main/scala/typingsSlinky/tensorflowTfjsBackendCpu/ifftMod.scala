package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.anon.InputsIFFTInputs
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ifftMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/IFFT", "ifft")
  @js.native
  def ifft(args: InputsIFFTInputs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/IFFT", "ifftConfig")
  @js.native
  val ifftConfig: KernelConfig = js.native
}
