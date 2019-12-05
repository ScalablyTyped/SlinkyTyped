package typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.same
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "avgPool")
@js.native
object avgPool extends js.Object {
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same | Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.floor | typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.round | typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.ceil
  ): T = js.native
}

