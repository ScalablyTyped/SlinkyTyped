package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.anon.A
import typingsSlinky.tensorflowTfjsCore.anon.Activation
import typingsSlinky.tensorflowTfjsCore.anon.Bias
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fusedOpsMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/fused_ops", "conv2d")
  @js.native
  def conv2d[T /* <: Tensor3D | Tensor4D */](
    hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights: Activation[T]
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/fused_ops", "depthwiseConv2d")
  @js.native
  def depthwiseConv2d[T /* <: Tensor3D | Tensor4D */](
    hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights: Bias[T]
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/fused_ops", "matMul")
  @js.native
  def matMul[T /* <: Tensor[Rank] */](hasABTransposeATransposeBBiasActivationPreluActivationWeights: A[T]): T = js.native
}
