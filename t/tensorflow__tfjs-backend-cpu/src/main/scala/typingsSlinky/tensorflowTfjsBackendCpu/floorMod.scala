package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.unaryTypesMod.SimpleUnaryImpl
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object floorMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Floor", "floor")
  @js.native
  val floor: KernelFunc = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Floor", "floorConfig")
  @js.native
  val floorConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Floor", "floorImpl")
  @js.native
  val floorImpl: SimpleUnaryImpl = js.native
}
