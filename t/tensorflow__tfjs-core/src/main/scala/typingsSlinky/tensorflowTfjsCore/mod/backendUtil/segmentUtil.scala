package typingsSlinky.tensorflowTfjsCore.mod.backendUtil

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.segmentUtilMod.GatherOpShapeInfo
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "backend_util.segment_util")
@js.native
object segmentUtil extends js.Object {
  def collectGatherOpShapeInfo(x: Tensor[Rank], indices: Tensor[Rank], axis: Double): GatherOpShapeInfo = js.native
  def computeOutShape(aShape: js.Array[Double], axis: Double, numSegments: Double): js.Array[Double] = js.native
  def segOpComputeOptimalWindowSize(inSize: Double, numSegments: Double): Double = js.native
}

