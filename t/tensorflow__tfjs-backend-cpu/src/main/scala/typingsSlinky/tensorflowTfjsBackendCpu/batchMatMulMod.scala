package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.anon.AttrsBackend
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchMatMulMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/BatchMatMul", "batchMatMul")
  @js.native
  def batchMatMul(args: AttrsBackend): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/BatchMatMul", "batchMatMulConfig")
  @js.native
  val batchMatMulConfig: KernelConfig = js.native
}
