package typingsSlinky.tensorflowTfjsLayers.coreSerializationMod

import typingsSlinky.tensorflowTfjsLayers.layerSerializationMod.LayerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsLayers.coreSerializationMod.DropoutLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.coreSerializationMod.DenseLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.coreSerializationMod.FlattenLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.coreSerializationMod.ActivationLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.coreSerializationMod.RepeatVectorLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.coreSerializationMod.ReshapeLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.coreSerializationMod.PermuteLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.coreSerializationMod.MaskingLayerSerialization
*/
trait CoreLayerSerialization extends LayerSerialization

object CoreLayerSerialization {
  @scala.inline
  implicit def apply(
    value: ActivationLayerSerialization | DenseLayerSerialization | DropoutLayerSerialization | FlattenLayerSerialization | MaskingLayerSerialization | PermuteLayerSerialization | RepeatVectorLayerSerialization | ReshapeLayerSerialization
  ): CoreLayerSerialization = value.asInstanceOf[CoreLayerSerialization]
}

