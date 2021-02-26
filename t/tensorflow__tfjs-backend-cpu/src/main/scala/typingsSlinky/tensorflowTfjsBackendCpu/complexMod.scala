package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.anon.BackendMathBackendCPU
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object complexMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Complex", "complex")
  @js.native
  def complex(args: BackendMathBackendCPU): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Complex", "complexConfig")
  @js.native
  val complexConfig: KernelConfig = js.native
}
