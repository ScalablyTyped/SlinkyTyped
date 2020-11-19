package typingsSlinky.tensorflowTfjsCore.opsMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "expandDims")
@js.native
object expandDims extends js.Object {
  
  def apply[R2 /* <: Rank */](x: TensorLike): Tensor[R2] = js.native
  def apply[R2 /* <: Rank */](x: TensorLike, axis: Double): Tensor[R2] = js.native
  def apply[R2 /* <: Rank */](x: Tensor[Rank]): Tensor[R2] = js.native
  def apply[R2 /* <: Rank */](x: Tensor[Rank], axis: Double): Tensor[R2] = js.native
}
