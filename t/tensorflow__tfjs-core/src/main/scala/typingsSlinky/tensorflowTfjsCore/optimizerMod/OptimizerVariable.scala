package typingsSlinky.tensorflowTfjsCore.optimizerMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimizerVariable extends js.Object {
  var originalName: String
  var variable: Variable[Rank]
}

object OptimizerVariable {
  @scala.inline
  def apply(originalName: String, variable: Variable[Rank]): OptimizerVariable = {
    val __obj = js.Dynamic.literal(originalName = originalName.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OptimizerVariable]
  }
}

