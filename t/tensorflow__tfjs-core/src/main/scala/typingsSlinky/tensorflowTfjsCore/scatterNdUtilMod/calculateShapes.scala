package typingsSlinky.tensorflowTfjsCore.scatterNdUtilMod

import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/scatter_nd_util", "calculateShapes")
@js.native
object calculateShapes extends js.Object {
  
  def apply(updates: TensorInfo, indices: TensorInfo, shape: js.Array[Double]): ScatterShapeInfo = js.native
}
