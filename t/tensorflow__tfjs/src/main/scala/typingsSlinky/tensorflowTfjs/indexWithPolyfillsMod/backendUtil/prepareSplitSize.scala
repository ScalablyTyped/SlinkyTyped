package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod.backendUtil

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "backend_util.prepareSplitSize")
@js.native
object prepareSplitSize extends js.Object {
  
  def apply(x: Tensor[Rank], numOrSizeSplits: js.Array[Double]): js.Array[Double] = js.native
  def apply(x: Tensor[Rank], numOrSizeSplits: js.Array[Double], axis: Double): js.Array[Double] = js.native
  def apply(x: Tensor[Rank], numOrSizeSplits: Double): js.Array[Double] = js.native
  def apply(x: Tensor[Rank], numOrSizeSplits: Double, axis: Double): js.Array[Double] = js.native
  def apply(x: TensorInfo, numOrSizeSplits: js.Array[Double]): js.Array[Double] = js.native
  def apply(x: TensorInfo, numOrSizeSplits: js.Array[Double], axis: Double): js.Array[Double] = js.native
  def apply(x: TensorInfo, numOrSizeSplits: Double): js.Array[Double] = js.native
  def apply(x: TensorInfo, numOrSizeSplits: Double, axis: Double): js.Array[Double] = js.native
}
