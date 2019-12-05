package typingsSlinky.atTensorflowTfjsDashLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatLayersMergeUnderscoreSerializationMod {
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Add
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Average
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Concatenate
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Dot
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Maximum
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Minimum
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Multiply
  import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTopologyUnderscoreConfigMod.BaseLayerSerialization
  import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTopologyUnderscoreConfigMod.LayerConfig

  type AddLayerSerialization = BaseLayerSerialization[Add, LayerConfig]
  type AverageLayerSerialization = BaseLayerSerialization[Average, LayerConfig]
  type ConcatenateLayerSerialization = BaseLayerSerialization[Concatenate, ConcatenateLayerConfig]
  type DotLayerSerialization = BaseLayerSerialization[Dot, DotLayerConfig]
  type MaximumLayerSerialization = BaseLayerSerialization[Maximum, LayerConfig]
  type MergeLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/merge_serialization.MergeLayerSerialization['class_name'] */ js.Any
  type MergeLayerSerialization = AddLayerSerialization | MultiplyLayerSerialization | AverageLayerSerialization | MaximumLayerSerialization | MinimumLayerSerialization | ConcatenateLayerSerialization | DotLayerSerialization
  type MinimumLayerSerialization = BaseLayerSerialization[Minimum, LayerConfig]
  type MultiplyLayerSerialization = BaseLayerSerialization[Multiply, LayerConfig]
}
