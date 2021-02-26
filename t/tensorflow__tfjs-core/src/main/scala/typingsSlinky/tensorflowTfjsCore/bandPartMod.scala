package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bandPartMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/linalg/band_part", "bandPart")
  @js.native
  def bandPart[T /* <: Tensor[Rank] */](a: T, numLower: Double, numUpper: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/linalg/band_part", "bandPart")
  @js.native
  def bandPart[T /* <: Tensor[Rank] */](a: TensorLike, numLower: Double, numUpper: Double): T = js.native
}
