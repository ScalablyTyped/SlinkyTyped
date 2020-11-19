package typingsSlinky.tensorflowTfjsLayers.trainingTensorsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "fitTensors")
@js.native
object fitTensors extends js.Object {
  
  def apply(model: js.Any, x: js.Array[Tensor[Rank]], y: js.Array[Tensor[Rank]]): js.Promise[History] = js.native
  def apply(model: js.Any, x: js.Array[Tensor[Rank]], y: js.Array[Tensor[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
  def apply(model: js.Any, x: js.Array[Tensor[Rank]], y: StringDictionary[Tensor[Rank]]): js.Promise[History] = js.native
  def apply(model: js.Any, x: js.Array[Tensor[Rank]], y: StringDictionary[Tensor[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
  def apply(model: js.Any, x: js.Array[Tensor[Rank]], y: Tensor[Rank]): js.Promise[History] = js.native
  def apply(model: js.Any, x: js.Array[Tensor[Rank]], y: Tensor[Rank], args: ModelFitArgs): js.Promise[History] = js.native
  def apply(model: js.Any, x: StringDictionary[Tensor[Rank]], y: js.Array[Tensor[Rank]]): js.Promise[History] = js.native
  def apply(model: js.Any, x: StringDictionary[Tensor[Rank]], y: js.Array[Tensor[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
  def apply(model: js.Any, x: StringDictionary[Tensor[Rank]], y: StringDictionary[Tensor[Rank]]): js.Promise[History] = js.native
  def apply(
    model: js.Any,
    x: StringDictionary[Tensor[Rank]],
    y: StringDictionary[Tensor[Rank]],
    args: ModelFitArgs
  ): js.Promise[History] = js.native
  def apply(model: js.Any, x: StringDictionary[Tensor[Rank]], y: Tensor[Rank]): js.Promise[History] = js.native
  def apply(model: js.Any, x: StringDictionary[Tensor[Rank]], y: Tensor[Rank], args: ModelFitArgs): js.Promise[History] = js.native
  def apply(model: js.Any, x: Tensor[Rank], y: js.Array[Tensor[Rank]]): js.Promise[History] = js.native
  def apply(model: js.Any, x: Tensor[Rank], y: js.Array[Tensor[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
  def apply(model: js.Any, x: Tensor[Rank], y: StringDictionary[Tensor[Rank]]): js.Promise[History] = js.native
  def apply(model: js.Any, x: Tensor[Rank], y: StringDictionary[Tensor[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
  def apply(model: js.Any, x: Tensor[Rank], y: Tensor[Rank]): js.Promise[History] = js.native
  def apply(model: js.Any, x: Tensor[Rank], y: Tensor[Rank], args: ModelFitArgs): js.Promise[History] = js.native
}
