package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.NCDHW
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.NDHWC
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.same
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.valid
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor5D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "conv3d")
@js.native
object conv3d extends js.Object {
  
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D | TensorLike,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same,
    dataFormat: js.UndefOr[NDHWC | NCDHW],
    dilations: js.UndefOr[(js.Tuple3[Double, Double, Double]) | Double]
  ): T = js.native
}
