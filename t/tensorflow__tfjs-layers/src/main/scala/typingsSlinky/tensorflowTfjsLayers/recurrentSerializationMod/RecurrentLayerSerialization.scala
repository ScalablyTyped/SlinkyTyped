package typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod

import typingsSlinky.tensorflowTfjsLayers.layerSerializationMod.LayerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.SimpleRNNLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.LSTMLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.GRULayerSerialization
*/
trait RecurrentLayerSerialization extends LayerSerialization

object RecurrentLayerSerialization {
  @scala.inline
  implicit def apply(value: GRULayerSerialization | LSTMLayerSerialization | SimpleRNNLayerSerialization): RecurrentLayerSerialization = value.asInstanceOf[RecurrentLayerSerialization]
}

