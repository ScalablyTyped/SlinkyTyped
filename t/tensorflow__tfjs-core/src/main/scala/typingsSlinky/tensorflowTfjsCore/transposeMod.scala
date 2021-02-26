package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transposeMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/transpose", "transpose")
  @js.native
  def transpose[T /* <: Tensor[Rank] */](x: T): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/transpose", "transpose")
  @js.native
  def transpose[T /* <: Tensor[Rank] */](x: T, perm: js.Array[Double]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/transpose", "transpose")
  @js.native
  def transpose[T /* <: Tensor[Rank] */](x: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/transpose", "transpose")
  @js.native
  def transpose[T /* <: Tensor[Rank] */](x: TensorLike, perm: js.Array[Double]): T = js.native
}
