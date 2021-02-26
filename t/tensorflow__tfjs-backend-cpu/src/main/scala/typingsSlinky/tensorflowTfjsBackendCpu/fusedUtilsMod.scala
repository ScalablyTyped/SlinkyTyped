package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typingsSlinky.tensorflowTfjsCore.fusedTypesMod.Activation
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fusedUtilsMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/fused_utils", "applyActivation")
  @js.native
  def applyActivation(backend: MathBackendCPU, x: TensorInfo, activation: Activation): TensorInfo = js.native
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/fused_utils", "applyActivation")
  @js.native
  def applyActivation(backend: MathBackendCPU, x: TensorInfo, activation: Activation, preluActivationWeights: TensorInfo): TensorInfo = js.native
}
