package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.NCW
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.NWC
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.same
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.valid
import typingsSlinky.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor2D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs", "conv1d")
@js.native
object conv1d extends js.Object {
  
  def apply[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid | same | Double | ExplicitPadding,
    dataFormat: js.UndefOr[NWC | NCW],
    dilation: js.UndefOr[Double],
    dimRoundingMode: js.UndefOr[
      typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.floor | typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.round | typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.ceil
    ]
  ): T = js.native
}
