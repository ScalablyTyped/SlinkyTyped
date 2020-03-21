package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.Tensor_
import typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConstants extends js.Object {
  var constants: js.Array[SymbolicTensor | Tensor_[Rank]]
  var initialState: js.Array[SymbolicTensor | Tensor_[Rank]]
  var inputs: Tensor_[Rank] | SymbolicTensor
}

object AnonConstants {
  @scala.inline
  def apply(
    constants: js.Array[SymbolicTensor | Tensor_[Rank]],
    initialState: js.Array[SymbolicTensor | Tensor_[Rank]],
    inputs: Tensor_[Rank] | SymbolicTensor
  ): AnonConstants = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConstants]
  }
}

