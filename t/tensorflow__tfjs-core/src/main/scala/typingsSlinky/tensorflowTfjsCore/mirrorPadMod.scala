package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reflect
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.symmetric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mirrorPadMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/mirror_pad", "mirrorPad")
  @js.native
  def mirrorPad[T /* <: Tensor[Rank] */](x: T, paddings: js.Array[js.Tuple2[Double, Double]], mode: reflect): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/mirror_pad", "mirrorPad")
  @js.native
  def mirrorPad[T /* <: Tensor[Rank] */](x: T, paddings: js.Array[js.Tuple2[Double, Double]], mode: symmetric): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/mirror_pad", "mirrorPad")
  @js.native
  def mirrorPad[T /* <: Tensor[Rank] */](x: TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], mode: reflect): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/mirror_pad", "mirrorPad")
  @js.native
  def mirrorPad[T /* <: Tensor[Rank] */](x: TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], mode: symmetric): T = js.native
}
