package typingsSlinky.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object convolutionalSerializationMod {
  type Conv1DLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv1D, 
    typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.ConvLayerConfig
  ]
  type Conv2DLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2D, 
    typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.ConvLayerConfig
  ]
  type Conv2DTransposeLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2DTranspose, 
    typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.ConvLayerConfig
  ]
  type ConvolutionalLayerClassName = /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/convolutional_serialization.ConvolutionalLayerSerialization['class_name'] */ js.Any
  type ConvolutionalLayerSerialization = typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.Conv1DLayerSerialization | typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.Conv2DLayerSerialization | typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.Conv2DTransposeLayerSerialization | typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.SeparableConv2DLayerSerialization | typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.Cropping2DLayerSerialization | typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.UpSampling2DLayerSerialization
  type Cropping2DLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Cropping2D, 
    typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.Cropping2DLayerConfig
  ]
  type SeparableConv2DLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SeparableConv2D, 
    typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.ConvLayerConfig
  ]
  type UpSampling2DLayerSerialization = typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization[
    typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UpSampling2D, 
    typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.UpSampling2DLayerConfig
  ]
}
