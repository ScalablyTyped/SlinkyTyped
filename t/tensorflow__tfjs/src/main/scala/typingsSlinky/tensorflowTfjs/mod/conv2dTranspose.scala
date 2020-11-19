package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.same
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.valid
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "conv2dTranspose")
@js.native
object conv2dTranspose extends js.Object {
  
  def apply[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    outputShape: (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple3[Double, Double, Double]),
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: js.UndefOr[
      typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.floor | typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.round | typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.ceil
    ]
  ): T = js.native
}
