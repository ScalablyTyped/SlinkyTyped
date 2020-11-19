package typingsSlinky.tensorflowTfjsCore.opsMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "real")
@js.native
object real extends js.Object {
  
  def apply[T /* <: Tensor[Rank] */](input: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](input: TensorLike): T = js.native
}
