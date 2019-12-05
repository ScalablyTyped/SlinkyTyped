package typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor5D
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank.R4
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank.R5
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.NCDHW
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.NDHWC
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.same
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "conv3d")
@js.native
object conv3d extends js.Object {
  def apply(
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: Double,
    pad: same
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4 | R5],
    filter: Tensor5D,
    strides: Double,
    pad: valid
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: valid
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: Double,
    pad: same
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4] = js.native
  def apply(
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4 | R5],
    filter: TensorLike,
    strides: Double,
    pad: valid
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R4] = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D | TensorLike,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same,
    dataFormat: NDHWC | NCDHW
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D | TensorLike,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same,
    dataFormat: NDHWC | NCDHW,
    dilations: (js.Tuple3[Double, Double, Double]) | Double
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: Tensor5D, strides: js.Tuple3[Double, Double, Double], pad: same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: Tensor5D, strides: js.Tuple3[Double, Double, Double], pad: valid): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: Tensor5D, strides: Double, pad: same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: Tensor5D, strides: Double, pad: valid): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: TensorLike, strides: js.Tuple3[Double, Double, Double], pad: same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: TensorLike, strides: js.Tuple3[Double, Double, Double], pad: valid): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: TensorLike, strides: Double, pad: same): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](x: TensorLike, filter: TensorLike, strides: Double, pad: valid): T = js.native
}

