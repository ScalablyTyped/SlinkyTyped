package typingsSlinky.tensorflowTfjsBackendWebgl

import typingsSlinky.tensorflowTfjsBackendWebgl.anon.AttrsMaxPoolAttrs
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maxPoolMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/MaxPool", "maxPool")
  @js.native
  def maxPool(args: AttrsMaxPoolAttrs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/MaxPool", "maxPoolConfig")
  @js.native
  val maxPoolConfig: KernelConfig = js.native
}
