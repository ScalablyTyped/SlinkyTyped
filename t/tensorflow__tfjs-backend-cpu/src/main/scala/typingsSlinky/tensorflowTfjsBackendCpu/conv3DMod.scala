package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.anon.AttrsConv3DAttrs
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Conv3D", JSImport.Namespace)
@js.native
object conv3DMod extends js.Object {
  
  def conv3D(args: AttrsConv3DAttrs): TensorInfo = js.native
  
  val conv3DConfig: KernelConfig = js.native
}
