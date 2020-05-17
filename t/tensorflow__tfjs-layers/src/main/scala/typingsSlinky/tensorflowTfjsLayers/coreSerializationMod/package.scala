package typingsSlinky.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreSerializationMod {
  type ActivationLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation, 
    typingsSlinky.tensorflowTfjsLayers.coreSerializationMod.ActivationLayerConfig
  ]
  type DenseLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense, 
    typingsSlinky.tensorflowTfjsLayers.coreSerializationMod.DenseLayerConfig
  ]
  type DropoutLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout, 
    typingsSlinky.tensorflowTfjsLayers.coreSerializationMod.DropoutLayerConfig
  ]
  type FlattenLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten, 
    typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
  type MaskingLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking, 
    typingsSlinky.tensorflowTfjsLayers.coreSerializationMod.MaskingLayerConfig
  ]
  type PermuteLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute, 
    typingsSlinky.tensorflowTfjsLayers.coreSerializationMod.PermuteLayerConfig
  ]
  type RepeatVectorLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector, 
    typingsSlinky.tensorflowTfjsLayers.coreSerializationMod.RepeatVectorLayerConfig
  ]
  type ReshapeLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape, 
    typingsSlinky.tensorflowTfjsLayers.coreSerializationMod.ReshapeLayerConfig
  ]
}
