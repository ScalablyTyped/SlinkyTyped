package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.binaryTypesMod.ComplexBinaryKernelImpl
import typingsSlinky.tensorflowTfjsBackendCpu.binaryTypesMod.SimpleBinaryKernelImpl
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiplyMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Multiply", "multiply")
  @js.native
  val multiply: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Multiply", "multiplyComplexImpl")
  @js.native
  val multiplyComplexImpl: ComplexBinaryKernelImpl = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Multiply", "multiplyConfig")
  @js.native
  val multiplyConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Multiply", "multiplyImpl")
  @js.native
  val multiplyImpl: SimpleBinaryKernelImpl = js.native
}
