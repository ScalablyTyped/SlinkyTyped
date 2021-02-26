package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.anon.AttrsReshapeAttrs
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reshapeMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Reshape", "reshape")
  @js.native
  def reshape(args: AttrsReshapeAttrs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Reshape", "reshapeConfig")
  @js.native
  val reshapeConfig: KernelConfig = js.native
}
