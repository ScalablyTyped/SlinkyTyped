package typingsSlinky.tensorflowTfjsLayers.trainingMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/engine/training", "isDataArray")
@js.native
object isDataArray extends js.Object {
  
  def apply(x: js.Array[Tensor[Rank]]): Boolean = js.native
  def apply(x: StringDictionary[Tensor[Rank]]): Boolean = js.native
  def apply(x: Tensor[Rank]): Boolean = js.native
}
