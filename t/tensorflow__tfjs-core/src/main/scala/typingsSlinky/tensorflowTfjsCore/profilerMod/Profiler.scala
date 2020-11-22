package typingsSlinky.tensorflowTfjsCore.profilerMod

import typingsSlinky.tensorflowTfjsCore.backendMod.BackendTimer
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/profiler", "Profiler")
@js.native
class Profiler protected () extends js.Object {
  def this(backendTimer: BackendTimer) = this()
  def this(backendTimer: BackendTimer, logger: Logger) = this()
  
  var backendTimer: js.Any = js.native
  
  def logKernelProfile(kernelProfile: KernelProfile): Unit = js.native
  
  var logger: js.Any = js.native
  
  def profileKernel(kernelName: String, inputs: NamedTensorMap, f: js.Function0[js.Array[Tensor[Rank]]]): KernelProfile = js.native
}
