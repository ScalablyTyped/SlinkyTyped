package typingsSlinky.tensorflowTfjs.indexWithPolyfillsMod.backendUtil

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.segmentUtilMod.GatherOpShapeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "backend_util.segment_util")
@js.native
object segmentUtil extends js.Object {
  
  def collectGatherOpShapeInfo(x: Tensor[Rank], indices: Tensor[Rank], axis: Double): GatherOpShapeInfo = js.native
  
  def computeOutShape(aShape: js.Array[Double], axis: Double, numSegments: Double): js.Array[Double] = js.native
  
  def segOpComputeOptimalWindowSize(inSize: Double, numSegments: Double): Double = js.native
}
