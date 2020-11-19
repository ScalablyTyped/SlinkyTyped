package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod

import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.NCDHW
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.NDHWC
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.same
import typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.valid
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor5D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "avgPool3d")
@js.native
object avgPool3d extends js.Object {
  
  def apply[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid | same | Double,
    dimRoundingMode: js.UndefOr[
      typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.floor | typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.round | typingsSlinky.tensorflowTfjs.tensorflowTfjsStrings.ceil
    ],
    dataFormat: js.UndefOr[NDHWC | NCDHW],
    dilations: js.UndefOr[(js.Tuple3[Double, Double, Double]) | Double]
  ): T = js.native
}
