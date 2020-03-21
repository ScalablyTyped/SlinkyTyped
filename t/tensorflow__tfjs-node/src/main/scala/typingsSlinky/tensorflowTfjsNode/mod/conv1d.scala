package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R2
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R3
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor2D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.NCW
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.NWC
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.same
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "conv1d")
@js.native
object conv1d extends js.Object {
  def apply(x: Tensor[R2 | R3], filter: TensorLike, stride: Double, pad: Double): Tensor[R2] = js.native
  def apply(x: Tensor[R2 | R3], filter: TensorLike, stride: Double, pad: same): Tensor[R2] = js.native
  def apply(x: Tensor[R2 | R3], filter: TensorLike, stride: Double, pad: valid): Tensor[R2] = js.native
  def apply(x: Tensor[R2 | R3], filter: Tensor3D, stride: Double, pad: Double): Tensor[R2] = js.native
  def apply(x: Tensor[R2 | R3], filter: Tensor3D, stride: Double, pad: same): Tensor[R2] = js.native
  def apply(x: Tensor[R2 | R3], filter: Tensor3D, stride: Double, pad: valid): Tensor[R2] = js.native
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
    dimRoundingMode: typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.floor | typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.round | typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.ceil
  ): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: TensorLike, stride: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: TensorLike, stride: Double, pad: same): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: TensorLike, stride: Double, pad: valid): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: Tensor3D, stride: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: Tensor3D, stride: Double, pad: same): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: Tensor3D, stride: Double, pad: valid): T = js.native
}

