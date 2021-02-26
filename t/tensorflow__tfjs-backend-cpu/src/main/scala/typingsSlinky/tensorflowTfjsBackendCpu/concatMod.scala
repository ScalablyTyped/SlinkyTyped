package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.anon.AttrsConcatAttrs
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Concat", "concat")
  @js.native
  def concat(args: AttrsConcatAttrs): TensorInfo = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Concat", "concatConfig")
  @js.native
  val concatConfig: KernelConfig = js.native
}
