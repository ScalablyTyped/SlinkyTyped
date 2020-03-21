package typingsSlinky.tensorflowTfjsCore.opsMod

import typingsSlinky.tensorflowTfjsCore.AnonA
import typingsSlinky.tensorflowTfjsCore.AnonActivation
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "fused")
@js.native
object fused extends js.Object {
  @js.native
  object conv2d extends js.Object {
    def apply[T /* <: Tensor3D | Tensor4D */](
      hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights: AnonActivation[T]
    ): T = js.native
  }
  
  @js.native
  object depthwiseConv2d extends js.Object {
    def apply[T /* <: Tensor3D | Tensor4D */](
      hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights: AnonActivation[T]
    ): T = js.native
  }
  
  @js.native
  object matMul extends js.Object {
    def apply[T /* <: Tensor[Rank] */](hasABTransposeATransposeBBiasActivationPreluActivationWeights: AnonA[T]): T = js.native
  }
  
}

