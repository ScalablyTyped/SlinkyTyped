package typingsSlinky.tensorflowTfjsCore.mod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.avg
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core", "pool")
@js.native
object pool extends js.Object {
  
  def apply[T /* <: Tensor3D | Tensor4D */](
    input: T | TensorLike,
    windowShape: (js.Tuple2[Double, Double]) | Double,
    poolingType: avg | typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.max,
    pad: valid_ | same_ | Double,
    dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    strides: js.UndefOr[(js.Tuple2[Double, Double]) | Double]
  ): T = js.native
}
