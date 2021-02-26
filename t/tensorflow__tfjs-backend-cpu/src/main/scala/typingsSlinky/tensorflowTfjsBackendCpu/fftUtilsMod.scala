package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.anon.ImagReal
import typingsSlinky.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fftUtilsMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/fft_utils", "fftBatch")
  @js.native
  def fftBatch(input: TensorInfo, inverse: Boolean, cpuBackend: MathBackendCPU): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/utils/fft_utils", "fftImpl")
  @js.native
  def fftImpl(input: TensorInfo, inverse: Boolean, cpuBackend: MathBackendCPU): ImagReal = js.native
}
