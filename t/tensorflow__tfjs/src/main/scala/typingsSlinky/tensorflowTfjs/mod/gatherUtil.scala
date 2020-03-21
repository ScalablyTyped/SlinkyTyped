package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "gather_util")
@js.native
object gatherUtil extends js.Object {
  def prepareAndValidate(
    tensor: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    indices: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): js.Tuple4[js.Array[Double], Double, Double, js.Array[Double]] = js.native
}

