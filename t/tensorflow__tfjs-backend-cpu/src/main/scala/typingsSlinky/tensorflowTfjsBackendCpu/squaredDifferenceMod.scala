package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/SquaredDifference", JSImport.Namespace)
@js.native
object squaredDifferenceMod extends js.Object {
  
  val squaredDifference: KernelFunc = js.native
  
  val squaredDifferenceConfig: KernelConfig = js.native
  
  val squaredDifferenceImpl: SimpleBinaryKernelImpl = js.native
}
