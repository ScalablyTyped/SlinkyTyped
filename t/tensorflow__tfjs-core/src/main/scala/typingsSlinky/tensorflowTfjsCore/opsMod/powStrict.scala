package typingsSlinky.tensorflowTfjsCore.opsMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "powStrict")
@js.native
object powStrict extends js.Object {
  def apply[T /* <: Tensor[Rank] */](base: T, exp: Tensor[Rank]): T = js.native
}

