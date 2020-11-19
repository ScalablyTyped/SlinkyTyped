package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R3
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank.R4
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/depthwise_conv2d_native_backprop_input", JSImport.Namespace)
@js.native
object depthwiseConv2dNativeBackpropInputMod extends js.Object {
  
  @js.native
  object depthwiseConv2dNativeBackpropInput extends js.Object {
    
    def apply(
      xShape: js.Tuple3[Double, Double, Double],
      dy: Tensor[R3 | R4],
      filter: Tensor4D,
      convInfo: Conv2DInfo
    ): Tensor[R3] = js.native
    def apply(
      xShape: js.Tuple4[Double, Double, Double, Double],
      dy: Tensor[R3 | R4],
      filter: Tensor4D,
      convInfo: Conv2DInfo
    ): Tensor[R3] = js.native
  }
}
