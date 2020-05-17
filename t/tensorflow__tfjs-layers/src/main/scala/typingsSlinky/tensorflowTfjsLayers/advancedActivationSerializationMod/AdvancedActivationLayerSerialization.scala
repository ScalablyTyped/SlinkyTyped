package typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod

import typingsSlinky.tensorflowTfjsLayers.layerSerializationMod.LayerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod.ReLULayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod.LeakyReLULayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod.PReLULayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod.ELULayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod.ThresholdedReLULayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod.SoftmaxLayerSerialization
*/
trait AdvancedActivationLayerSerialization extends LayerSerialization

object AdvancedActivationLayerSerialization {
  @scala.inline
  implicit def apply(
    value: ELULayerSerialization | LeakyReLULayerSerialization | PReLULayerSerialization | ReLULayerSerialization | SoftmaxLayerSerialization | ThresholdedReLULayerSerialization
  ): AdvancedActivationLayerSerialization = value.asInstanceOf[AdvancedActivationLayerSerialization]
}

