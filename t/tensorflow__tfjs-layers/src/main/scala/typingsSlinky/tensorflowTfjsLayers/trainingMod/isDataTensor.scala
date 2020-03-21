package typingsSlinky.tensorflowTfjsLayers.trainingMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training", "isDataTensor")
@js.native
object isDataTensor extends js.Object {
  def apply(x: js.Array[Tensor_[Rank]]): Boolean = js.native
  def apply(x: StringDictionary[js.Array[Tensor_[Rank]] | Tensor_[Rank]]): Boolean = js.native
  def apply(x: Tensor_[Rank]): Boolean = js.native
}

