package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object castMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/cast", "cast")
  @js.native
  def cast[T /* <: Tensor[Rank] */](x: T, dtype: DataType): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/cast", "cast")
  @js.native
  def cast[T /* <: Tensor[Rank] */](x: TensorLike, dtype: DataType): T = js.native
}
