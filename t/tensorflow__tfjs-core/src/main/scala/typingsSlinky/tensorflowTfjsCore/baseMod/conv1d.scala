package typingsSlinky.tensorflowTfjsCore.baseMod

import typingsSlinky.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor2D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCW
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NWC
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/base", "conv1d")
@js.native
object conv1d extends js.Object {
  
  def apply[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid_ | same_ | Double | ExplicitPadding,
    dataFormat: js.UndefOr[NWC | NCW],
    dilation: js.UndefOr[Double],
    dimRoundingMode: js.UndefOr[
      typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor | typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round | typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
    ]
  ): T = js.native
}
