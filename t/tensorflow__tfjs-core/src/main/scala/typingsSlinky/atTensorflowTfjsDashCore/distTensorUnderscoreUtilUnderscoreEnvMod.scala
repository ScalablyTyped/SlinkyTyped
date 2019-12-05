package typingsSlinky.atTensorflowTfjsDashCore

import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.numeric
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.DataType
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/tensor_util_env", JSImport.Namespace)
@js.native
object distTensorUnderscoreUtilUnderscoreEnvMod extends js.Object {
  def convertToTensor[T /* <: Tensor[Rank] */](x: T, argName: String, functionName: String): T = js.native
  def convertToTensor[T /* <: Tensor[Rank] */](x: T, argName: String, functionName: String, parseAsDtype: DataType): T = js.native
  def convertToTensor[T /* <: Tensor[Rank] */](x: TensorLike, argName: String, functionName: String): T = js.native
  def convertToTensor[T /* <: Tensor[Rank] */](x: TensorLike, argName: String, functionName: String, parseAsDtype: DataType): T = js.native
  def convertToTensorArray[T /* <: Tensor[Rank] */](arg: js.Array[T | TensorLike], argName: String, functionName: String): js.Array[T] = js.native
  def convertToTensorArray[T /* <: Tensor[Rank] */](arg: js.Array[T | TensorLike], argName: String, functionName: String, parseAsDtype: DataType): js.Array[T] = js.native
  @JSName("convertToTensorArray")
  def convertToTensorArray_numeric[T /* <: Tensor[Rank] */](arg: js.Array[T | TensorLike], argName: String, functionName: String, parseAsDtype: numeric): js.Array[T] = js.native
  @JSName("convertToTensor")
  def convertToTensor_numeric[T /* <: Tensor[Rank] */](x: T, argName: String, functionName: String, parseAsDtype: numeric): T = js.native
  @JSName("convertToTensor")
  def convertToTensor_numeric[T /* <: Tensor[Rank] */](x: TensorLike, argName: String, functionName: String, parseAsDtype: numeric): T = js.native
  def inferShape(`val`: TensorLike): js.Array[Double] = js.native
  def inferShape(`val`: TensorLike, dtype: DataType): js.Array[Double] = js.native
}

