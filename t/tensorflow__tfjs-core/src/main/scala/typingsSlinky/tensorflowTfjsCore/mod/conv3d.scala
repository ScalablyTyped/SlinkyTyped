package typingsSlinky.tensorflowTfjsCore.mod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor5D
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCDHW
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NDHWC
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "conv3d")
@js.native
object conv3d extends js.Object {
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D | TensorLike,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D | TensorLike,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_,
    dataFormat: NDHWC | NCDHW
  ): T = js.native
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D | TensorLike,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_,
    dataFormat: NDHWC | NCDHW,
    dilations: (js.Tuple3[Double, Double, Double]) | Double
  ): T = js.native
}

