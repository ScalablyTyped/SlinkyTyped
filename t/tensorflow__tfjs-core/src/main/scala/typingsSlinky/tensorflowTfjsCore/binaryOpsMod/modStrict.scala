package typingsSlinky.tensorflowTfjsCore.binaryOpsMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/binary_ops", "modStrict")
@js.native
object modStrict extends js.Object {
  def apply[T /* <: Tensor[Rank] */](a: T, b: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: T, b: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: T): T = js.native
  def apply[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
}

