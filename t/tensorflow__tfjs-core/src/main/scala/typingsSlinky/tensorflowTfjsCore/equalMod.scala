package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object equalMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/equal", "equal")
  @js.native
  def equal[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/equal", "equal")
  @js.native
  def equal[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/equal", "equal")
  @js.native
  def equal[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/equal", "equal")
  @js.native
  def equal[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = js.native
}
