package typingsSlinky.tensorflowTfjsCore.profilerMod

import typingsSlinky.tensorflowTfjsCore.anon.Error
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/profiler", "Logger")
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
