package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.anon.Error
import typingsSlinky.tensorflowTfjsCore.backendMod.BackendTimer
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/profiler", JSImport.Namespace)
@js.native
object profilerMod extends js.Object {
  
  @JSName("checkComputationForErrors")
  def checkComputationForErrors_bool(vals: js.typedarray.Uint8Array, dtype: bool, kernelName: String): Boolean = js.native
  @JSName("checkComputationForErrors")
  def checkComputationForErrors_complex64(vals: js.typedarray.Float32Array, dtype: complex64, kernelName: String): Boolean = js.native
  @JSName("checkComputationForErrors")
  def checkComputationForErrors_float32(vals: js.typedarray.Float32Array, dtype: float32, kernelName: String): Boolean = js.native
  @JSName("checkComputationForErrors")
  def checkComputationForErrors_int32(vals: js.typedarray.Int32Array, dtype: int32, kernelName: String): Boolean = js.native
  @JSName("checkComputationForErrors")
  def checkComputationForErrors_string(vals: js.Array[String], dtype: string, kernelName: String): Boolean = js.native
  
  @js.native
  class Logger () extends js.Object {
    
    def logKernelProfile(name: String, result: Tensor[Rank], vals: TypedArray, timeMs: Double, inputs: NamedTensorMap): Unit = js.native
    def logKernelProfile(
      name: String,
      result: Tensor[Rank],
      vals: TypedArray,
      timeMs: Double,
      inputs: NamedTensorMap,
      extraInfo: String
    ): Unit = js.native
    def logKernelProfile(name: String, result: Tensor[Rank], vals: TypedArray, timeMs: Error, inputs: NamedTensorMap): Unit = js.native
    def logKernelProfile(
      name: String,
      result: Tensor[Rank],
      vals: TypedArray,
      timeMs: Error,
      inputs: NamedTensorMap,
      extraInfo: String
    ): Unit = js.native
  }
  
  @js.native
  class Profiler protected () extends js.Object {
    def this(backendTimer: BackendTimer) = this()
    def this(backendTimer: BackendTimer, logger: Logger) = this()
    
    var backendTimer: js.Any = js.native
    
    var logger: js.Any = js.native
    
    def profileKernel(kernelName: String, inputs: NamedTensorMap, f: js.Function0[js.Array[Tensor[Rank]]]): js.Array[Tensor[Rank]] = js.native
  }
}
