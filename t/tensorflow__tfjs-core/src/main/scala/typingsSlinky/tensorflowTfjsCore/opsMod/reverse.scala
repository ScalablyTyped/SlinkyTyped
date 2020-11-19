package typingsSlinky.tensorflowTfjsCore.opsMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "reverse")
@js.native
object reverse extends js.Object {
  
  def apply[T /* <: Tensor[Rank] */](x: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: T, axis: js.Array[Double]): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: T, axis: Double): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
}
