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
