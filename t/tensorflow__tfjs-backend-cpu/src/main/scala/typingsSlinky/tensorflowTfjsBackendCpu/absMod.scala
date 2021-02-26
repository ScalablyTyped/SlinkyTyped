package typingsSlinky.tensorflowTfjsBackendCpu

import typingsSlinky.tensorflowTfjsBackendCpu.anon.Backend
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.KernelConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object absMod {
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Abs", "abs")
  @js.native
  def abs(args: Backend): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Abs", "absConfig")
  @js.native
  val absConfig: KernelConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-cpu/dist/kernels/Abs", "simpleAbsImpl")
  @js.native
  def simpleAbsImpl(vals: TypedArray): js.typedarray.Float32Array = js.native
}
