package typingsSlinky.tensorflowTfjsCore.baseMod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import typingsSlinky.tensorflowTfjsCore.scatterNdUtilMod.ScatterShapeInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scatterUtil {
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "scatter_util.calculateShapes")
  @js.native
  def calculateShapes(updates: TensorInfo, indices: TensorInfo, shape: js.Array[Double]): ScatterShapeInfo = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "scatter_util.validateInput")
  @js.native
  def validateInput(
    updates: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    indices: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    shape: js.Array[Double]
  ): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/base", "scatter_util.validateUpdateShape")
  @js.native
  def validateUpdateShape(
    shape: js.Array[Double],
    indices: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    updates: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Unit = js.native
}
