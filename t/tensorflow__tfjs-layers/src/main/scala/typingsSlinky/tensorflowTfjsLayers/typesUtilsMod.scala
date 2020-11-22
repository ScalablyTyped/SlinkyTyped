package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/utils/types_utils", JSImport.Namespace)
@js.native
object typesUtilsMod extends js.Object {
  
  def getExactlyOneShape(shapes: js.Array[Shape] | Shape): Shape = js.native
  
  def getExactlyOneTensor(xs: js.Array[Tensor[Rank]]): Tensor[Rank] = js.native
  def getExactlyOneTensor(xs: Tensor[Rank]): Tensor[Rank] = js.native
  
  def isArrayOfShapes(x: js.Array[Shape] | Shape): Boolean = js.native
  
  def normalizeShapeList(x: js.Array[Shape] | Shape): js.Array[Shape] = js.native
}
