package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "prelu")
@js.native
object prelu extends js.Object {
  
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](x: T, alpha: T): T = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](x: T, alpha: TensorLike): T = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, alpha: T): T = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, alpha: TensorLike): T = js.native
}
