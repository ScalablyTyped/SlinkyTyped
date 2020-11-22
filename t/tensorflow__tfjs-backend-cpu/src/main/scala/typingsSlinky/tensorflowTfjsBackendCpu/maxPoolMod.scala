package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.anon.AttrsMaxPoolAttrs
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/MaxPool", JSImport.Namespace)
@js.native
object maxPoolMod extends js.Object {
  
  def maxPool(args: AttrsMaxPoolAttrs): TensorInfo = js.native
  
  val maxPoolConfig: KernelConfig = js.native
}
