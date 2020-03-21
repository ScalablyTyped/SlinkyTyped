package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import typingsSlinky.tensorflowTfjsCore.scatterNdUtilMod.ScatterShapeInfo
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "scatter_util")
@js.native
object scatterUtil extends js.Object {
  def calculateShapes(updates: TensorInfo, indices: TensorInfo, shape: js.Array[Double]): ScatterShapeInfo = js.native
  def validateInput(
    updates: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    indices: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    shape: js.Array[Double]
  ): Unit = js.native
  def validateUpdateShape(
    shape: js.Array[Double],
    indices: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    updates: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Unit = js.native
}

