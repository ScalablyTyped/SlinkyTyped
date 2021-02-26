package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.anon.InputsImagInputs
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Imag", "imag")
  @js.native
  def imag(args: InputsImagInputs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/Imag", "imagConfig")
  @js.native
  val imagConfig: KernelConfig = js.native
}
