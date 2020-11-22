package typingsSlinky.tensorflowTfjsCore.opsMod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "cumsum")
@js.native
object cumsum extends js.Object {
  
  def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
  def apply[T /* <: Tensor[Rank] */](
    x: Tensor[Rank],
    axis: js.UndefOr[scala.Nothing],
    exclusive: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.UndefOr[scala.Nothing], exclusive: Boolean): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.UndefOr[scala.Nothing], exclusive: Boolean, reverse: Boolean): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: js.UndefOr[scala.Nothing], reverse: Boolean): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Boolean): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Boolean, reverse: Boolean): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  def apply[T /* <: Tensor[Rank] */](
    x: TensorLike,
    axis: js.UndefOr[scala.Nothing],
    exclusive: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.UndefOr[scala.Nothing], exclusive: Boolean): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.UndefOr[scala.Nothing], exclusive: Boolean, reverse: Boolean): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: js.UndefOr[scala.Nothing], reverse: Boolean): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Boolean): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Boolean, reverse: Boolean): T = js.native
}
