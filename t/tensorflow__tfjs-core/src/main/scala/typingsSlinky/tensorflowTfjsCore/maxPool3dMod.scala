package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor5D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCDHW
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NDHWC
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/max_pool_3d", JSImport.Namespace)
@js.native
object maxPool3dMod extends js.Object {
  
  @js.native
  object maxPool3d extends js.Object {
    
    def apply[T /* <: Tensor4D | Tensor5D */](
      x: T | TensorLike,
      filterSize: (js.Tuple3[Double, Double, Double]) | Double,
      strides: (js.Tuple3[Double, Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dimRoundingMode: js.UndefOr[floor | round | ceil],
      dataFormat: js.UndefOr[NDHWC | NCDHW],
      dilations: js.UndefOr[(js.Tuple3[Double, Double, Double]) | Double]
    ): T = js.native
  }
}
