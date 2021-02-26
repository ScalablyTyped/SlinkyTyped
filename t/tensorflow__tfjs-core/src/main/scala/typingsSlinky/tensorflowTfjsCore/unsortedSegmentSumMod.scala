package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor1D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unsortedSegmentSumMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/unsorted_segment_sum", "unsortedSegmentSum")
  @js.native
  def unsortedSegmentSum[T /* <: Tensor[Rank] */](x: T, segmentIds: Tensor1D, numSegments: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/unsorted_segment_sum", "unsortedSegmentSum")
  @js.native
  def unsortedSegmentSum[T /* <: Tensor[Rank] */](x: T, segmentIds: TensorLike, numSegments: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/unsorted_segment_sum", "unsortedSegmentSum")
  @js.native
  def unsortedSegmentSum[T /* <: Tensor[Rank] */](x: TensorLike, segmentIds: Tensor1D, numSegments: Double): T = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/unsorted_segment_sum", "unsortedSegmentSum")
  @js.native
  def unsortedSegmentSum[T /* <: Tensor[Rank] */](x: TensorLike, segmentIds: TensorLike, numSegments: Double): T = js.native
}
