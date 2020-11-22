package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.binaryTypesMod.ComplexBinaryKernelImpl
import typingsSlinky.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Add", JSImport.Namespace)
@js.native
object addMod extends js.Object {
  
  val add: KernelFunc = js.native
  
  val addComplexImpl: ComplexBinaryKernelImpl = js.native
  
  val addConfig: KernelConfig = js.native
  
  val addImpl: SimpleBinaryKernelImpl = js.native
}
