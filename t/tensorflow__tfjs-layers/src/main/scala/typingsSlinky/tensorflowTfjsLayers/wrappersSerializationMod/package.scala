package typingsSlinky.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wrappersSerializationMod {
  type BidirectionalLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Bidirectional, 
    typingsSlinky.tensorflowTfjsLayers.wrappersSerializationMod.BidirectionalLayerConfig
  ]
  type TimeDistributedLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TimeDistributed, 
    typingsSlinky.tensorflowTfjsLayers.wrappersSerializationMod.TimeDistributedLayerConfig
  ]
  type WrapperLayerSerialization = typingsSlinky.tensorflowTfjsLayers.wrappersSerializationMod.TimeDistributedLayerSerialization | typingsSlinky.tensorflowTfjsLayers.wrappersSerializationMod.BidirectionalLayerSerialization
}
