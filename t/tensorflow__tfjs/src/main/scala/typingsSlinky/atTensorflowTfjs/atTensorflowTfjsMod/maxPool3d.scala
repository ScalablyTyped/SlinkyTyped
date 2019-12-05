package typingsSlinky.atTensorflowTfjs.atTensorflowTfjsMod

import typingsSlinky.atTensorflowTfjs.atTensorflowTfjsStrings.NCDHW
import typingsSlinky.atTensorflowTfjs.atTensorflowTfjsStrings.NDHWC
import typingsSlinky.atTensorflowTfjs.atTensorflowTfjsStrings.same
import typingsSlinky.atTensorflowTfjs.atTensorflowTfjsStrings.valid
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor5D
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "maxPool3d")
@js.native
object maxPool3d extends js.Object {
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
    dimRoundingMode: typingsSlinky.atTensorflowTfjs.atTensorflowTfjsStrings.floor | typingsSlinky.atTensorflowTfjs.atTensorflowTfjsStrings.round | typingsSlinky.atTensorflowTfjs.atTensorflowTfjsStrings.ceil
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: typingsSlinky.atTensorflowTfjs.atTensorflowTfjsStrings.floor | typingsSlinky.atTensorflowTfjs.atTensorflowTfjsStrings.round | typingsSlinky.atTensorflowTfjs.atTensorflowTfjsStrings.ceil,
    dataFormat: NDHWC | NCDHW
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: typingsSlinky.atTensorflowTfjs.atTensorflowTfjsStrings.floor | typingsSlinky.atTensorflowTfjs.atTensorflowTfjsStrings.round | typingsSlinky.atTensorflowTfjs.atTensorflowTfjsStrings.ceil,
    dataFormat: NDHWC | NCDHW,
    dilations: (js.Tuple3[Double, Double, Double]) | Double
  ): T = js.native
}

