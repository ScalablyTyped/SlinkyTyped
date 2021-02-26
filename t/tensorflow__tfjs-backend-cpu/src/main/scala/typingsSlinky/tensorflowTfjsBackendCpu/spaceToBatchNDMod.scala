package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.anon.AttrsSpaceToBatchNDAttrs
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spaceToBatchNDMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SpaceToBatchND", "spaceToBatchND")
  @js.native
  def spaceToBatchND(args: AttrsSpaceToBatchNDAttrs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SpaceToBatchND", "spaceToBatchNDConfig")
  @js.native
  val spaceToBatchNDConfig: KernelConfig = js.native
}
