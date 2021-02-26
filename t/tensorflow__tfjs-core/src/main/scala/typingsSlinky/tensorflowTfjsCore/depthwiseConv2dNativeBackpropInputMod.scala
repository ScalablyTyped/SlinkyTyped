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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object depthwiseConv2dNativeBackpropInputMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/depthwise_conv2d_native_backprop_input", "depthwiseConv2dNativeBackpropInput")
  @js.native
  def depthwiseConv2dNativeBackpropInput(
    xShape: js.Tuple4[Double, Double, Double, Double],
    dy: Tensor[R3 | R4],
    filter: Tensor4D,
    strides: Double | (js.Tuple2[Double, Double]),
    pad: Double | same_ | valid_,
    dilations: js.UndefOr[Double | (js.Tuple2[Double, Double])],
    dimRoundingMode: js.UndefOr[ceil | floor | round]
  ): Tensor[R3] = js.native
}
