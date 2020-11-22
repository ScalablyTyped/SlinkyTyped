package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.anon.AttrsFusedConv2DAttrs
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/FusedConv2D", JSImport.Namespace)
@js.native
object fusedConv2DMod extends js.Object {
  
  def fusedConv2D(args: AttrsFusedConv2DAttrs): TensorInfo = js.native
  
  val fusedConv2DConfig: KernelConfig = js.native
}
