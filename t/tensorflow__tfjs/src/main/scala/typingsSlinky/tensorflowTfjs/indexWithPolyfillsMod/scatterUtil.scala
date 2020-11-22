package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import typingsSlinky.tensorflowTfjsCore.scatterNdUtilMod.ScatterShapeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "scatter_util")
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
