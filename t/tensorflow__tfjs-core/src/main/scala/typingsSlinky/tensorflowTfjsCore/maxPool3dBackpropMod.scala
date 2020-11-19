package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor5D
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/max_pool_3d_backprop", JSImport.Namespace)
@js.native
object maxPool3dBackpropMod extends js.Object {
  
  @js.native
  object maxPool3dBackprop extends js.Object {
    
    def apply[T /* <: Tensor4D | Tensor5D */](
      dy: T | TensorLike,
      input: T | TensorLike,
      output: T | TensorLike,
      filterSize: (js.Tuple3[Double, Double, Double]) | Double,
      strides: (js.Tuple3[Double, Double, Double]) | Double,
      dilations: (js.Tuple3[Double, Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dimRoundingMode: js.UndefOr[floor | round | ceil]
    ): T = js.native
  }
}
