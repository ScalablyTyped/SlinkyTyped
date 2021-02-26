package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjsCore.anon.A
import typingsSlinky.tensorflowTfjsCore.anon.Activation
import typingsSlinky.tensorflowTfjsCore.anon.Bias
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor4D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fused {
  
  @JSImport("@tensorflow/tfjs", "fused.conv2d")
  @js.native
  def conv2d[T /* <: Tensor3D | Tensor4D */](
    hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights: Activation[T]
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs", "fused.depthwiseConv2d")
  @js.native
  def depthwiseConv2d[T /* <: Tensor3D | Tensor4D */](
    hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights: Bias[T]
  ): T = js.native
  
  @JSImport("@tensorflow/tfjs", "fused.matMul")
  @js.native
  def matMul[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](hasABTransposeATransposeBBiasActivationPreluActivationWeights: A[T]): T = js.native
}
