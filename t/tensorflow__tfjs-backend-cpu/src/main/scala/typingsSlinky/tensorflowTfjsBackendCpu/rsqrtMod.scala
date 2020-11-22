package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.unaryTypesMod.SimpleUnaryImpl
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Rsqrt", JSImport.Namespace)
@js.native
object rsqrtMod extends js.Object {
  
  val rsqrt: KernelFunc = js.native
  
  val rsqrtConfig: KernelConfig = js.native
  
  val rsqrtImpl: SimpleUnaryImpl = js.native
}
