package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipByValueMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/clip_by_value", "clipByValue")
  @js.native
  def clipByValue[T /* <: Tensor[Rank] */](x: T, clipValueMin: Double, clipValueMax: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/clip_by_value", "clipByValue")
  @js.native
  def clipByValue[T /* <: Tensor[Rank] */](x: TensorLike, clipValueMin: Double, clipValueMax: Double): T = js.native
}
