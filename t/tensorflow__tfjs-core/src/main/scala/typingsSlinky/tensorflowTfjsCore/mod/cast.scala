package typingsSlinky.tensorflowTfjsCore.mod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core", "cast")
@js.native
object cast extends js.Object {
  
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](x: T, dtype: DataType): T = js.native
  def apply[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, dtype: DataType): T = js.native
}
