package typingsSlinky.atTensorflowTfjsDashCore.distTensorMod

import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.NumericDataType
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumericTensor[R /* <: Rank */] extends Tensor[R] {
  @JSName("dtype")
  var dtype_NumericTensor: NumericDataType = js.native
}

