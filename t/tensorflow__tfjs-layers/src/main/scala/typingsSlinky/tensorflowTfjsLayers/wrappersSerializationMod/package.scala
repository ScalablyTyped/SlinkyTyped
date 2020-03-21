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
  type WrapperLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/wrappers_serialization.WrapperLayerSerialization['class_name'] */ js.Any
  type WrapperLayerSerialization = typingsSlinky.tensorflowTfjsLayers.wrappersSerializationMod.TimeDistributedLayerSerialization | typingsSlinky.tensorflowTfjsLayers.wrappersSerializationMod.BidirectionalLayerSerialization
}
