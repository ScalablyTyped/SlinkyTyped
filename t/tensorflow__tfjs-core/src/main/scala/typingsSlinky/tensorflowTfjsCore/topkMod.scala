package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.anon.Indices
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topkMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/topk", "topk")
  @js.native
  def topk[T /* <: Tensor[Rank] */](x: T): Indices[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/topk", "topk")
  @js.native
  def topk[T /* <: Tensor[Rank] */](x: T, k: js.UndefOr[scala.Nothing], sorted: Boolean): Indices[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/topk", "topk")
  @js.native
  def topk[T /* <: Tensor[Rank] */](x: T, k: Double): Indices[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/topk", "topk")
  @js.native
  def topk[T /* <: Tensor[Rank] */](x: T, k: Double, sorted: Boolean): Indices[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/topk", "topk")
  @js.native
  def topk[T /* <: Tensor[Rank] */](x: TensorLike): Indices[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/topk", "topk")
  @js.native
  def topk[T /* <: Tensor[Rank] */](x: TensorLike, k: js.UndefOr[scala.Nothing], sorted: Boolean): Indices[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/topk", "topk")
  @js.native
  def topk[T /* <: Tensor[Rank] */](x: TensorLike, k: Double): Indices[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/topk", "topk")
  @js.native
  def topk[T /* <: Tensor[Rank] */](x: TensorLike, k: Double, sorted: Boolean): Indices[T] = js.native
}
