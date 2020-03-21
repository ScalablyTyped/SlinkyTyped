package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "mod")
@js.native
object mod extends js.Object {
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](a: TensorLike, b: TensorLike): T = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](a: TensorLike, b: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]): T = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](a: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], b: TensorLike): T = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](
    a: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    b: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): T = js.native
}

