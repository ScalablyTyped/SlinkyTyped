package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R3
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R4
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/depthwise_conv2d_native_backprop_filter", JSImport.Namespace)
@js.native
object depthwiseConv2dNativeBackpropFilterMod extends js.Object {
  
  @js.native
  object depthwiseConv2dNativeBackpropFilter extends js.Object {
    
    def apply(
      x: Tensor[R3 | R4],
      dy: Tensor[R3 | R4],
      filterShape: js.Tuple4[Double, Double, Double, Double],
      strides: Double | (js.Tuple2[Double, Double]),
      pad: Double | same_ | valid_,
      dilations: js.UndefOr[Double | (js.Tuple2[Double, Double])],
      dimRoundingMode: js.UndefOr[ceil | floor | round]
    ): Tensor4D = js.native
  }
}
