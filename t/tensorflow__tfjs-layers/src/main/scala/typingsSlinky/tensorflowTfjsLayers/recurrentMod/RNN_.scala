package typingsSlinky.tensorflowTfjsLayers.recurrentMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.serialization.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsLayers.topologyMod.InputSpec
import typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "RNN")
@js.native
class RNN_ protected () extends Layer {
  def this(args: RNNLayerArgs) = this()
  
  val cell: RNNCell = js.native
  
  def getInitialState(inputs: Tensor[Rank]): js.Array[Tensor[Rank]] = js.native
  
  def getStates(): js.Array[Tensor[Rank]] = js.native
  
  val goBackwards: Boolean = js.native
  
  var keptStates: js.Any = js.native
  
  var numConstants: js.Any = js.native
  
  def resetStates(states: js.UndefOr[scala.Nothing], training: Boolean): Unit = js.native
  def resetStates(states: js.Array[Tensor[Rank]]): Unit = js.native
  def resetStates(states: js.Array[Tensor[Rank]], training: Boolean): Unit = js.native
  def resetStates(states: Tensor[Rank]): Unit = js.native
  def resetStates(states: Tensor[Rank], training: Boolean): Unit = js.native
  
  val returnSequences: Boolean = js.native
  
  val returnState: Boolean = js.native
  
  def setStates(states: js.Array[Tensor[Rank]]): Unit = js.native
  
  var stateSpec: js.Array[InputSpec] = js.native
  
  /**
    * Get the current state tensors of the RNN.
    *
    * If the state hasn't been set, return an array of `null`s of the correct
    * length.
    */
  var states: js.Array[Tensor[Rank]] = js.native
  
  var states_ : js.Any = js.native
  
  val unroll: Boolean = js.native
}
/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "RNN")
@js.native
object RNN_ extends js.Object {
  
  /** @nocollapse */
  var className: String = js.native
  
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
}
