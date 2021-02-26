package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.anon.AttrsFusedMatMulAttrs
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fusedMatMulMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/_FusedMatMul", "_fusedMatMul")
  @js.native
  def fusedMatMul(args: AttrsFusedMatMulAttrs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/_FusedMatMul", "_fusedMatMulConfig")
  @js.native
  val fusedMatMulConfig: KernelConfig = js.native
}
