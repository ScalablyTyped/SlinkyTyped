package typingsSlinky.atTensorflowTfjsDashLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatLayersCoreUnderscoreSerializationMod {
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Activation
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Dense
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Dropout
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Flatten
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Masking
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Permute
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.RepeatVector
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Reshape
  import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTopologyUnderscoreConfigMod.BaseLayerSerialization
  import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTopologyUnderscoreConfigMod.LayerConfig

  type ActivationLayerSerialization = BaseLayerSerialization[Activation, ActivationLayerConfig]
  type CoreLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/core_serialization.CoreLayerSerialization['class_name'] */ js.Any
  type CoreLayerSerialization = DropoutLayerSerialization | DenseLayerSerialization | FlattenLayerSerialization | ActivationLayerSerialization | RepeatVectorLayerSerialization | ReshapeLayerSerialization | PermuteLayerSerialization | MaskingLayerSerialization
  type DenseLayerSerialization = BaseLayerSerialization[Dense, DenseLayerConfig]
  type DropoutLayerSerialization = BaseLayerSerialization[Dropout, DropoutLayerConfig]
  type FlattenLayerSerialization = BaseLayerSerialization[Flatten, LayerConfig]
  type MaskingLayerSerialization = BaseLayerSerialization[Masking, MaskingLayerConfig]
  type PermuteLayerSerialization = BaseLayerSerialization[Permute, PermuteLayerConfig]
  type RepeatVectorLayerSerialization = BaseLayerSerialization[RepeatVector, RepeatVectorLayerConfig]
  type ReshapeLayerSerialization = BaseLayerSerialization[Reshape, ReshapeLayerConfig]
}
