package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.reflect
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.symmetric
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "mirrorPad")
@js.native
object mirrorPad extends js.Object {
  
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](x: T, paddings: js.Array[js.Tuple2[Double, Double]], mode: reflect): T = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](x: T, paddings: js.Array[js.Tuple2[Double, Double]], mode: symmetric): T = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], mode: reflect): T = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], mode: symmetric): T = js.native
}
