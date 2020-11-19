package typingsSlinky.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object recurrentSerializationMod {
  
  type GRUCellSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRUCell, 
    typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.GRUCellConfig
  ]
  
  type GRULayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.GRU, 
    typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.GRULayerConfig
  ]
  
  type LSTMCellSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTMCell, 
    typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.LSTMCellConfig
  ]
  
  type LSTMLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LSTM, 
    typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.LSTMLayerConfig
  ]
  
  type RNNCellSerialization = typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.SimpleRNNCellSerialization | typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.GRUCellSerialization | typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.LSTMCellSerialization | typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.StackedRNNCellsSerialization
  
  type RecurrentLayerSerialization = typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.SimpleRNNLayerSerialization | typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.LSTMLayerSerialization | typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.GRULayerSerialization
  
  type SimpleRNNCellSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNNCell, 
    typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.SimpleRNNCellConfig
  ]
  
  type SimpleRNNLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SimpleRNN, 
    typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.SimpleRNNLayerConfig
  ]
  
  type StackedRNNCellsSerialization = typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.StackedRNNCells, 
    typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.StackedRNNCellsConfig
  ]
}
