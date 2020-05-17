package typingsSlinky.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mergeSerializationMod {
  type AddLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add, 
    typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
  type AverageLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average, 
    typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
  type ConcatenateLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate, 
    typingsSlinky.tensorflowTfjsLayers.mergeSerializationMod.ConcatenateLayerConfig
  ]
  type DotLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot, 
    typingsSlinky.tensorflowTfjsLayers.mergeSerializationMod.DotLayerConfig
  ]
  type MaximumLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum, 
    typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
  type MinimumLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum, 
    typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
  type MultiplyLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply, 
    typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
}
