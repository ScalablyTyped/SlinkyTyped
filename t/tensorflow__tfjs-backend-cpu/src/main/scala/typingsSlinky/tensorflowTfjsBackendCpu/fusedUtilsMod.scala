package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typingsSlinky.tensorflowTfjsCore.fusedTypesMod.Activation
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/fused_utils", JSImport.Namespace)
@js.native
object fusedUtilsMod extends js.Object {
  
  def applyActivation(backend: MathBackendCPU, x: TensorInfo, activation: Activation): TensorInfo = js.native
  def applyActivation(backend: MathBackendCPU, x: TensorInfo, activation: Activation, preluActivationWeights: TensorInfo): TensorInfo = js.native
}
