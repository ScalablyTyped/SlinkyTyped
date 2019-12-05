package typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank.R2
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank.R3
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.NCW
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.NWC
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.same
import typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "conv1d")
@js.native
object conv1d extends js.Object {
  def apply(
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2 | R3],
    filter: Tensor3D,
    stride: Double,
    pad: Double
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply(
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2 | R3],
    filter: Tensor3D,
    stride: Double,
    pad: same
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply(
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2 | R3],
    filter: Tensor3D,
    stride: Double,
    pad: valid
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply(
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2 | R3],
    filter: TensorLike,
    stride: Double,
    pad: Double
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply(
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2 | R3],
    filter: TensorLike,
    stride: Double,
    pad: same
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply(
    x: typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2 | R3],
    filter: TensorLike,
    stride: Double,
    pad: valid
  ): typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor[R2] = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid | same | Double,
    dataFormat: NWC | NCW
  ): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid | same | Double,
    dataFormat: NWC | NCW,
    dilation: Double
  ): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid | same | Double,
    dataFormat: NWC | NCW,
    dilation: Double,
    dimRoundingMode: typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.floor | typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.round | typingsSlinky.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.ceil
  ): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: Tensor3D, stride: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: Tensor3D, stride: Double, pad: same): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: Tensor3D, stride: Double, pad: valid): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: TensorLike, stride: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: TensorLike, stride: Double, pad: same): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: TensorLike, stride: Double, pad: valid): T = js.native
}

