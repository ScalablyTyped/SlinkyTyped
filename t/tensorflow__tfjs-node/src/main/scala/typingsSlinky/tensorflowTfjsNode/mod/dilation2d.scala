package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.NHWC
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.same
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "dilation2d")
@js.native
object dilation2d extends js.Object {
  
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same,
    dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    dataFormat: js.UndefOr[NHWC]
  ): T = js.native
}
