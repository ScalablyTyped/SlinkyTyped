package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R3
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R4
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/conv2d_backprop_input", JSImport.Namespace)
@js.native
object conv2dBackpropInputMod extends js.Object {
  
  @js.native
  object conv2DBackpropInput extends js.Object {
    
    def apply(
      xShape: (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double]),
      dy: Tensor[R3 | R4],
      filter: Tensor4D,
      strides: Double | (js.Tuple2[Double, Double]),
      pad: Double | ExplicitPadding | same_ | valid_,
      dataFormat: js.UndefOr[NCHW | NHWC],
      dimRoundingMode: js.UndefOr[ceil | floor | round]
    ): Tensor[R3] = js.native
  }
}
