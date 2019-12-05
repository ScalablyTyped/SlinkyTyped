package typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor5D
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.NCDHW
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.NDHWC
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.same
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "avgPool3d")
@js.native
object avgPool3d extends js.Object {
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same | Double
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.floor | typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.round | typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.ceil
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.floor | typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.round | typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.ceil,
    dataFormat: NDHWC | NCDHW
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.floor | typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.round | typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.ceil,
    dataFormat: NDHWC | NCDHW,
    dilations: (js.Tuple3[Double, Double, Double]) | Double
  ): T = js.native
}

