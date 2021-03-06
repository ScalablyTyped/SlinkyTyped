package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object powMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/pow", "pow")
  @js.native
  def pow[T /* <: Tensor[Rank] */](base: Tensor[Rank], exp: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/pow", "pow")
  @js.native
  def pow[T /* <: Tensor[Rank] */](base: Tensor[Rank], exp: TensorLike): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/pow", "pow")
  @js.native
  def pow[T /* <: Tensor[Rank] */](base: TensorLike, exp: Tensor[Rank]): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/pow", "pow")
  @js.native
  def pow[T /* <: Tensor[Rank] */](base: TensorLike, exp: TensorLike): T = js.native
}
