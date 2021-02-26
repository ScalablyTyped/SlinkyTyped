package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.unaryTypesMod.SimpleUnaryImpl
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ceilMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Ceil", "ceil")
  @js.native
  val ceil: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Ceil", "ceilConfig")
  @js.native
  val ceilConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Ceil", "ceilImpl")
  @js.native
  val ceilImpl: SimpleUnaryImpl = js.native
}
