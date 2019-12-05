package typingsSlinky.atTensorflowTfjsDashLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKerasUnderscoreFormatLayersConvolutionalUnderscoreSerializationMod {
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Conv1D
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Conv2D
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Conv2DTranspose
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.Cropping2D
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.SeparableConv2D
  import typingsSlinky.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.UpSampling2D
  import typingsSlinky.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTopologyUnderscoreConfigMod.BaseLayerSerialization

  type Conv1DLayerSerialization = BaseLayerSerialization[Conv1D, ConvLayerConfig]
  type Conv2DLayerSerialization = BaseLayerSerialization[Conv2D, ConvLayerConfig]
  type Conv2DTransposeLayerSerialization = BaseLayerSerialization[Conv2DTranspose, ConvLayerConfig]
  type ConvolutionalLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/convolutional_serialization.ConvolutionalLayerSerialization['class_name'] */ js.Any
  type ConvolutionalLayerSerialization = Conv1DLayerSerialization | Conv2DLayerSerialization | Conv2DTransposeLayerSerialization | SeparableConv2DLayerSerialization | Cropping2DLayerSerialization | UpSampling2DLayerSerialization
  type Cropping2DLayerSerialization = BaseLayerSerialization[Cropping2D, Cropping2DLayerConfig]
  type SeparableConv2DLayerSerialization = BaseLayerSerialization[SeparableConv2D, ConvLayerConfig]
  type UpSampling2DLayerSerialization = BaseLayerSerialization[UpSampling2D, UpSampling2DLayerConfig]
}
