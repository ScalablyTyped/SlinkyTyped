package typingsSlinky.atTensorflowTfjsDashLayers.distEngineExecutorMod

import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank
import typingsSlinky.atTensorflowTfjsDashLayers.distEngineTopologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feed extends js.Object {
  var key: SymbolicTensor
  var value: Tensor[Rank]
}

object Feed {
  @scala.inline
  def apply(key: SymbolicTensor, value: Tensor[Rank]): Feed = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Feed]
  }
}

