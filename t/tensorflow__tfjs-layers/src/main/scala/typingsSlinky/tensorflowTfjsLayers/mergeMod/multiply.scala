package typingsSlinky.tensorflowTfjsLayers.mergeMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.Tensor_
import typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "multiply")
@js.native
object multiply extends js.Object {
  def apply(): Layer | SymbolicTensor | Tensor_[Rank] = js.native
  def apply(config: js.Array[SymbolicTensor | Tensor_[Rank]]): Layer | SymbolicTensor | Tensor_[Rank] = js.native
  def apply(config: LayerArgs): Layer | SymbolicTensor | Tensor_[Rank] = js.native
}

