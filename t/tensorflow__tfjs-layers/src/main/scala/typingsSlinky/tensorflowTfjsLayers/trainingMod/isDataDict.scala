package typingsSlinky.tensorflowTfjsLayers.trainingMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training", "isDataDict")
@js.native
object isDataDict extends js.Object {
  def apply(x: js.Array[Tensor[Rank]]): Boolean = js.native
  def apply(x: StringDictionary[Tensor[Rank]]): Boolean = js.native
  def apply(x: Tensor[Rank]): Boolean = js.native
}

