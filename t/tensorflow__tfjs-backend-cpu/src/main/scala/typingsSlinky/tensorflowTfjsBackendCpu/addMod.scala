package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.binaryTypesMod.ComplexBinaryKernelImpl
import typingsSlinky.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Add", "add")
  @js.native
  val add: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Add", "addComplexImpl")
  @js.native
  val addComplexImpl: ComplexBinaryKernelImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Add", "addConfig")
  @js.native
  val addConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Add", "addImpl")
  @js.native
  val addImpl: SimpleBinaryKernelImpl = js.native
}
