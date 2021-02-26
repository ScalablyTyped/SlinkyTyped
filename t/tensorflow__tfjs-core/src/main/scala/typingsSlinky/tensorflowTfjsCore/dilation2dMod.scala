package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dilation2dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/dilation2d", "dilation2d")
  @js.native
  def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_,
    dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    dataFormat: js.UndefOr[NHWC]
  ): T = js.native
}
