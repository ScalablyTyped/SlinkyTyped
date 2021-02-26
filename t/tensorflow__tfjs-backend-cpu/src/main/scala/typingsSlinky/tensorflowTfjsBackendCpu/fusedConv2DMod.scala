package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.anon.AttrsFusedConv2DAttrs
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fusedConv2DMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/FusedConv2D", "fusedConv2D")
  @js.native
  def fusedConv2D(args: AttrsFusedConv2DAttrs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/FusedConv2D", "fusedConv2DConfig")
  @js.native
  val fusedConv2DConfig: KernelConfig = js.native
}
