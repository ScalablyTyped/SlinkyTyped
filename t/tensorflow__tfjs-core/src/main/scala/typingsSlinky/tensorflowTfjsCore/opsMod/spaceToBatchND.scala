package typingsSlinky.tensorflowTfjsCore.opsMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "spaceToBatchND")
@js.native
object spaceToBatchND extends js.Object {
  
  def apply[T /* <: Tensor[Rank] */](x: T, blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): T = js.native
}
