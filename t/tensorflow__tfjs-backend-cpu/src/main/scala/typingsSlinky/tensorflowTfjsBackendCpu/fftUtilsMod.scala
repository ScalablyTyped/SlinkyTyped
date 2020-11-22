package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.anon.ImagReal
import typingsSlinky.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/fft_utils", JSImport.Namespace)
@js.native
object fftUtilsMod extends js.Object {
  
  def fftBatch(input: TensorInfo, inverse: Boolean, cpuBackend: MathBackendCPU): TensorInfo = js.native
  
  def fftImpl(input: TensorInfo, inverse: Boolean, cpuBackend: MathBackendCPU): ImagReal = js.native
}
