package typingsSlinky.tensorflowTfjsNode.mod.layers

import typingsSlinky.tensorflowTfjsCore.mod.serialization.Serializable
import typingsSlinky.tensorflowTfjsCore.serializationMod.ConfigDict
import typingsSlinky.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typingsSlinky.tensorflowTfjsLayers.recurrentMod.RNNLayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "layers.RNN")
@js.native
class RNN_ protected ()
  extends typingsSlinky.tensorflowTfjs.mod.layers.RNN_ {
  def this(args: RNNLayerArgs) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-node", "layers.RNN")
@js.native
object RNN_ extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
}

