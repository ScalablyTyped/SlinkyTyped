package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/split_util", JSImport.Namespace)
@js.native
object splitUtilMod extends js.Object {
  
  def prepareSplitSize(x: Tensor[Rank], numOrSizeSplits: js.Array[Double]): js.Array[Double] = js.native
  def prepareSplitSize(x: Tensor[Rank], numOrSizeSplits: js.Array[Double], axis: Double): js.Array[Double] = js.native
  def prepareSplitSize(x: Tensor[Rank], numOrSizeSplits: Double): js.Array[Double] = js.native
  def prepareSplitSize(x: Tensor[Rank], numOrSizeSplits: Double, axis: Double): js.Array[Double] = js.native
  def prepareSplitSize(x: TensorInfo, numOrSizeSplits: js.Array[Double]): js.Array[Double] = js.native
  def prepareSplitSize(x: TensorInfo, numOrSizeSplits: js.Array[Double], axis: Double): js.Array[Double] = js.native
  def prepareSplitSize(x: TensorInfo, numOrSizeSplits: Double): js.Array[Double] = js.native
  def prepareSplitSize(x: TensorInfo, numOrSizeSplits: Double, axis: Double): js.Array[Double] = js.native
}
