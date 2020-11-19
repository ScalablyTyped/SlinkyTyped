package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "batchToSpaceND")
@js.native
object batchToSpaceND extends js.Object {
  
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](x: T, blockShape: js.Array[Double], crops: js.Array[js.Array[Double]]): T = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, blockShape: js.Array[Double], crops: js.Array[js.Array[Double]]): T = js.native
}
