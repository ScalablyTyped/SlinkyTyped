package typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.SimpleRNNCellSerialization
  - typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.GRUCellSerialization
  - typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.LSTMCellSerialization
  - typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.StackedRNNCellsSerialization
*/
trait RNNCellSerialization extends js.Object

object RNNCellSerialization {
  @scala.inline
  implicit def apply(
    value: GRUCellSerialization | LSTMCellSerialization | SimpleRNNCellSerialization | StackedRNNCellsSerialization
  ): RNNCellSerialization = value.asInstanceOf[RNNCellSerialization]
}

