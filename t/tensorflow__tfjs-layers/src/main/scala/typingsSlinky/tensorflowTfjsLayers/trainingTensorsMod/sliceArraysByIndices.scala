package typingsSlinky.tensorflowTfjsLayers.trainingTensorsMod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "sliceArraysByIndices")
@js.native
object sliceArraysByIndices extends js.Object {
  
  def apply(arrays: js.Array[Tensor[Rank]], indices: Tensor1D): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  def apply(arrays: Tensor[Rank], indices: Tensor1D): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
}
