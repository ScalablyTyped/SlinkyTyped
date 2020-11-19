package typingsSlinky.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object poolingSerializationMod {
  
  type AveragePooling1DLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling1D, 
    typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.Pooling1DLayerConfig
  ]
  
  type AveragePooling2DLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.AveragePooling2D, 
    typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.Pooling2DLayerConfig
  ]
  
  type GlobalAveragePooling1DLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling1D, 
    typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
  
  type GlobalAveragePooling2DLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalAveragePooling2D, 
    typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.GlobalPooling2DLayerConfig
  ]
  
  type GlobalMaxPooling1DLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling1D, 
    typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
  ]
  
  type GlobalMaxPooling2DLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GlobalMaxPooling2D, 
    typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.GlobalPooling2DLayerConfig
  ]
  
  type MaxPooling1DLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling1D, 
    typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.Pooling1DLayerConfig
  ]
  
  type MaxPooling2DLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxPooling2D, 
    typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.Pooling2DLayerConfig
  ]
  
  type PoolingLayerSerialization = typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.MaxPooling1DLayerSerialization | typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.AveragePooling1DLayerSerialization | typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.MaxPooling2DLayerSerialization | typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.AveragePooling2DLayerSerialization | typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.GlobalAveragePooling1DLayerSerialization | typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.GlobalMaxPooling1DLayerSerialization | typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.GlobalAveragePooling2DLayerSerialization | typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.GlobalMaxPooling2DLayerSerialization
}
