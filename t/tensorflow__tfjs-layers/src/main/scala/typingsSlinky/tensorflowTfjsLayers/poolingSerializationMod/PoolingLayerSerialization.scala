package typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod

import typingsSlinky.tensorflowTfjsLayers.layerSerializationMod.LayerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.MaxPooling1DLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.AveragePooling1DLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.MaxPooling2DLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.AveragePooling2DLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.GlobalAveragePooling1DLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.GlobalMaxPooling1DLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.GlobalAveragePooling2DLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.GlobalMaxPooling2DLayerSerialization
*/
trait PoolingLayerSerialization extends LayerSerialization

object PoolingLayerSerialization {
  @scala.inline
  implicit def apply(
    value: AveragePooling1DLayerSerialization | AveragePooling2DLayerSerialization | GlobalAveragePooling1DLayerSerialization | GlobalAveragePooling2DLayerSerialization | GlobalMaxPooling1DLayerSerialization | GlobalMaxPooling2DLayerSerialization | MaxPooling1DLayerSerialization | MaxPooling2DLayerSerialization
  ): PoolingLayerSerialization = value.asInstanceOf[PoolingLayerSerialization]
}

