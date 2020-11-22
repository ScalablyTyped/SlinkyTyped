package typingsSlinky.tensorflowTfjsCore.opsForConverterMod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Variable
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "variable")
@js.native
object variable extends js.Object {
  
  def apply[R /* <: Rank */](initialValue: Tensor[R]): Variable[R] = js.native
  def apply[R /* <: Rank */](
    initialValue: Tensor[R],
    trainable: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    dtype: DataType
  ): Variable[R] = js.native
  def apply[R /* <: Rank */](initialValue: Tensor[R], trainable: js.UndefOr[scala.Nothing], name: String): Variable[R] = js.native
  def apply[R /* <: Rank */](initialValue: Tensor[R], trainable: js.UndefOr[scala.Nothing], name: String, dtype: DataType): Variable[R] = js.native
  def apply[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean): Variable[R] = js.native
  def apply[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean, name: js.UndefOr[scala.Nothing], dtype: DataType): Variable[R] = js.native
  def apply[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean, name: String): Variable[R] = js.native
  def apply[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean, name: String, dtype: DataType): Variable[R] = js.native
}
