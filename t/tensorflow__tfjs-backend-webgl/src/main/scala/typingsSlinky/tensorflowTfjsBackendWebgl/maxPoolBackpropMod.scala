package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.anon.AttrsMaxPoolBackpropAttrs
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maxPoolBackpropMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/MaxPoolBackprop", "maxPoolBackprop")
  @js.native
  def maxPoolBackprop(args: AttrsMaxPoolBackpropAttrs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/MaxPoolBackprop", "maxPoolBackpropConfig")
  @js.native
  val maxPoolBackpropConfig: KernelConfig = js.native
}
