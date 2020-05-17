package typingsSlinky.tensorflowTfjsLayers.mergeSerializationMod

import typingsSlinky.tensorflowTfjsLayers.layerSerializationMod.LayerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsLayers.mergeSerializationMod.AddLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.mergeSerializationMod.MultiplyLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.mergeSerializationMod.AverageLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.mergeSerializationMod.MaximumLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.mergeSerializationMod.MinimumLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.mergeSerializationMod.ConcatenateLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.mergeSerializationMod.DotLayerSerialization
*/
trait MergeLayerSerialization extends LayerSerialization

object MergeLayerSerialization {
  @scala.inline
  implicit def apply(
    value: AddLayerSerialization | AverageLayerSerialization | ConcatenateLayerSerialization | DotLayerSerialization | MaximumLayerSerialization | MinimumLayerSerialization | MultiplyLayerSerialization
  ): MergeLayerSerialization = value.asInstanceOf[MergeLayerSerialization]
}

