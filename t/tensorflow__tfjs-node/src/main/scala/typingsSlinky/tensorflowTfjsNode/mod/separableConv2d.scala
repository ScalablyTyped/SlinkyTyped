package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.NCHW
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.NHWC
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.same
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "separableConv2d")
@js.native
object separableConv2d extends js.Object {
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    depthwiseFilter: Tensor4D | TensorLike,
    pointwiseFilter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    depthwiseFilter: Tensor4D | TensorLike,
    pointwiseFilter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same,
    dilation: (js.Tuple2[Double, Double]) | Double
  ): T = js.native
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    depthwiseFilter: Tensor4D | TensorLike,
    pointwiseFilter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same,
    dilation: (js.Tuple2[Double, Double]) | Double,
    dataFormat: NHWC | NCHW
  ): T = js.native
}

