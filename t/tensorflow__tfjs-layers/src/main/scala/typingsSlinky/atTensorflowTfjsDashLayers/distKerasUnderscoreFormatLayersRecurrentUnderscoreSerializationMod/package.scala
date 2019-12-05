package typingsSlinky.atTensorflowTfjsDashLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatLayersRecurrentUnderscoreSerializationMod {
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.GRU
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.GRUCell
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.LSTM
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.LSTMCell
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.SimpleRNN
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.SimpleRNNCell
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.StackedRNNCells
  import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTopologyUnderscoreConfigMod.BaseLayerSerialization
  import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTypesMod.BaseSerialization

  type GRUCellSerialization = BaseSerialization[GRUCell, GRUCellConfig]
  type GRULayerSerialization = BaseLayerSerialization[GRU, GRULayerConfig]
  type LSTMCellSerialization = BaseSerialization[LSTMCell, LSTMCellConfig]
  type LSTMLayerSerialization = BaseLayerSerialization[LSTM, LSTMLayerConfig]
  type RNNCellSerialization = SimpleRNNCellSerialization | GRUCellSerialization | LSTMCellSerialization | StackedRNNCellsSerialization
  type RecurrentLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/recurrent_serialization.RecurrentLayerSerialization['class_name'] */ js.Any
  type RecurrentLayerSerialization = SimpleRNNLayerSerialization | LSTMLayerSerialization | GRULayerSerialization
  type SimpleRNNCellSerialization = BaseSerialization[SimpleRNNCell, SimpleRNNCellConfig]
  type SimpleRNNLayerSerialization = BaseLayerSerialization[SimpleRNN, SimpleRNNLayerConfig]
  type StackedRNNCellsSerialization = BaseSerialization[StackedRNNCells, StackedRNNCellsConfig]
}
