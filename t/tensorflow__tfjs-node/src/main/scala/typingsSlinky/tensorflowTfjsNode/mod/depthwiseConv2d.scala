package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.NCHW
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.NHWC
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.same
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "depthwiseConv2d")
@js.native
object depthwiseConv2d extends js.Object {
  
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same | Double,
    dataFormat: js.UndefOr[NHWC | NCHW],
    dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    dimRoundingMode: js.UndefOr[
      typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.floor | typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.round | typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.ceil
    ]
  ): T = js.native
}
