package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.anon.AttrsSpaceToBatchNDAttrs
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SpaceToBatchND", JSImport.Namespace)
@js.native
object spaceToBatchNDMod extends js.Object {
  
  def spaceToBatchND(args: AttrsSpaceToBatchNDAttrs): TensorInfo = js.native
  
  val spaceToBatchNDConfig: KernelConfig = js.native
}
