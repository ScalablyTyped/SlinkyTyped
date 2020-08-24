package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/max_pool_backprop", JSImport.Namespace)
@js.native
object maxPoolBackpropMod extends js.Object {
  val maxPoolBackprop: js.Function7[
    /* dy */ Tensor4D | TensorLike, 
    /* input */ Tensor4D | TensorLike, 
    /* output */ Tensor4D | TensorLike, 
    /* filterSize */ (js.Tuple2[Double, Double]) | Double, 
    /* strides */ (js.Tuple2[Double, Double]) | Double, 
    /* pad */ valid_ | same_ | Double, 
    /* dimRoundingMode */ js.UndefOr[floor | round | ceil], 
    Tensor4D
  ] = js.native
}

