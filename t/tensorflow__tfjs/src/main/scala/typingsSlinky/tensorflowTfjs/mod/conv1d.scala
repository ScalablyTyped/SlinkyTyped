package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.NCW
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.NWC
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.same
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.valid
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor2D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "conv1d")
@js.native
object conv1d extends js.Object {
  def apply[T /* <: Tensor2D | Tensor3D */](x: T, filter: TensorLike, stride: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: T, filter: TensorLike, stride: Double, pad: same): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: T, filter: TensorLike, stride: Double, pad: valid): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: T, filter: Tensor3D, stride: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: T, filter: Tensor3D, stride: Double, pad: same): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: T, filter: Tensor3D, stride: Double, pad: valid): T = js.native
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
    dimRoundingMode: typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.floor | typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.round | typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.ceil
  ): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: TensorLike, stride: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: TensorLike, stride: Double, pad: same): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: TensorLike, stride: Double, pad: valid): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: Tensor3D, stride: Double, pad: Double): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: Tensor3D, stride: Double, pad: same): T = js.native
  def apply[T /* <: Tensor2D | Tensor3D */](x: TensorLike, filter: Tensor3D, stride: Double, pad: valid): T = js.native
}

