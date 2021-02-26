package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.anon.AttrsConv2DAttrs
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conv2DMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Conv2D", "conv2D")
  @js.native
  def conv2D(args: AttrsConv2DAttrs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Conv2D", "conv2DConfig")
  @js.native
  val conv2DConfig: KernelConfig = js.native
}
