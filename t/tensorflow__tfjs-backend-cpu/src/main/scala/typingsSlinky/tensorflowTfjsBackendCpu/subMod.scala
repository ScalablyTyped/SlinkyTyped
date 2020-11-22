package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.binaryTypesMod.ComplexBinaryKernelImpl
import typingsSlinky.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Sub", JSImport.Namespace)
@js.native
object subMod extends js.Object {
  
  val sub: KernelFunc = js.native
  
  val subComplexImpl: ComplexBinaryKernelImpl = js.native
  
  val subConfig: KernelConfig = js.native
  
  val subImpl: SimpleBinaryKernelImpl = js.native
}
