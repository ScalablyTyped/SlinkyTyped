package typingsSlinky.tensorflowTfjsCore.mod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core", "inTopKAsync")
@js.native
object inTopKAsync extends js.Object {
  
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: T, targets: U): js.Promise[U] = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: T, targets: U, k: Double): js.Promise[U] = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: T, targets: TensorLike): js.Promise[U] = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: T, targets: TensorLike, k: Double): js.Promise[U] = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: TensorLike, targets: U): js.Promise[U] = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: TensorLike, targets: U, k: Double): js.Promise[U] = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: TensorLike, targets: TensorLike): js.Promise[U] = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */, U /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](predictions: TensorLike, targets: TensorLike, k: Double): js.Promise[U] = js.native
}
