package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.anon.Bias
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor4D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fusedDepthwiseConv2dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/fused/depthwise_conv2d", "depthwiseConv2d")
  @js.native
  def depthwiseConv2d[T /* <: Tensor3D | Tensor4D */](
    hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights: Bias[T]
  ): T = js.native
}
