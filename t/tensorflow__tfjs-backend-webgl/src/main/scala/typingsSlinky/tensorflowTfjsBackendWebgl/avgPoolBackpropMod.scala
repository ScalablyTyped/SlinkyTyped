package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.anon.Backend
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avgPoolBackpropMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/AvgPoolBackprop", "avgPoolBackprop")
  @js.native
  def avgPoolBackprop(args: Backend): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/AvgPoolBackprop", "avgPoolBackpropConfig")
  @js.native
  val avgPoolBackpropConfig: KernelConfig = js.native
}
