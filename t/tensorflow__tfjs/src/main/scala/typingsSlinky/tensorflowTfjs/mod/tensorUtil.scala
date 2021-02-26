package typingsSlinky.tensorflowTfjs.mod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tensorUtil {
  
  @JSImport("@tensorflow/tfjs", "tensor_util.assertTypesMatch")
  @js.native
  def assertTypesMatch(
    a: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    b: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): Unit = js.native
  
  @JSImport("@tensorflow/tfjs", "tensor_util.getTensorsInContainer")
  @js.native
  def getTensorsInContainer(result: TensorContainer): js.Array[Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs", "tensor_util.isTensorInList")
  @js.native
  def isTensorInList(
    tensor: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    tensorList: js.Array[Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]]
  ): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs", "tensor_util.makeTypesMatch")
  @js.native
  def makeTypesMatch[T /* <: Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] */](a: T, b: T): js.Tuple2[T, T] = js.native
}
