package typingsSlinky.atTensorflowTfjs.atTensorflowTfjsMod

import typingsSlinky.atTensorflowTfjs.atTensorflowTfjsStrings.NCHW
import typingsSlinky.atTensorflowTfjs.atTensorflowTfjsStrings.NHWC
import typingsSlinky.atTensorflowTfjs.atTensorflowTfjsStrings.same
import typingsSlinky.atTensorflowTfjs.atTensorflowTfjsStrings.valid
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "conv2d")
@js.native
object conv2d extends js.Object {
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same | Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same | Double,
    dataFormat: NHWC | NCHW
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same | Double,
    dataFormat: NHWC | NCHW,
    dilations: (js.Tuple2[Double, Double]) | Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same | Double,
    dataFormat: NHWC | NCHW,
    dilations: (js.Tuple2[Double, Double]) | Double,
    dimRoundingMode: typingsSlinky.atTensorflowTfjs.atTensorflowTfjsStrings.floor | typingsSlinky.atTensorflowTfjs.atTensorflowTfjsStrings.round | typingsSlinky.atTensorflowTfjs.atTensorflowTfjsStrings.ceil
  ): T = js.native
}

