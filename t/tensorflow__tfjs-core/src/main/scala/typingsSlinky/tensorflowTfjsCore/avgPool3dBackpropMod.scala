package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor5D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avgPool3dBackpropMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/avg_pool_3d_backprop", "avgPool3dBackprop")
  @js.native
  def avgPool3dBackprop[T /* <: Tensor4D | Tensor5D */](
    dy: T | TensorLike,
    input: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    dilations: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = js.native
}
