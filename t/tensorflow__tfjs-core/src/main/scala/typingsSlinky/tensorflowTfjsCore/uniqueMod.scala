package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.anon.Values
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uniqueMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/unique", "unique")
  @js.native
  def unique[T /* <: Tensor[Rank] */](x: T): Values[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/unique", "unique")
  @js.native
  def unique[T /* <: Tensor[Rank] */](x: T, axis: Double): Values[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/unique", "unique")
  @js.native
  def unique[T /* <: Tensor[Rank] */](x: TensorLike): Values[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/unique", "unique")
  @js.native
  def unique[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): Values[T] = js.native
}
