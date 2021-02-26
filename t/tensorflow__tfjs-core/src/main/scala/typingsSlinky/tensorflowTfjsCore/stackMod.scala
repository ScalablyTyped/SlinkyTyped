package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/stack", "stack")
  @js.native
  def stack[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/stack", "stack")
  @js.native
  def stack[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike], axis: Double): Tensor[Rank] = js.native
}
