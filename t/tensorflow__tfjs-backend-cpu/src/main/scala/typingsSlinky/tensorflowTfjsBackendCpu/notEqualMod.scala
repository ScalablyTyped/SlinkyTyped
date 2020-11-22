package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/NotEqual", JSImport.Namespace)
@js.native
object notEqualMod extends js.Object {
  
  val notEqual: KernelFunc = js.native
  
  val notEqualConfig: KernelConfig = js.native
  
  val notEqualImpl: SimpleBinaryKernelImpl = js.native
}
