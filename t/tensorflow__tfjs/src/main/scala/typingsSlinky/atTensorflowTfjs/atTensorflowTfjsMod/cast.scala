package typingsSlinky.atTensorflowTfjs.atTensorflowTfjsMod

import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.DataType
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "cast")
@js.native
object cast extends js.Object {
  def apply[T /* <: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank] */](x: T, dtype: DataType): T = js.native
  def apply[T /* <: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank] */](x: TensorLike, dtype: DataType): T = js.native
}

