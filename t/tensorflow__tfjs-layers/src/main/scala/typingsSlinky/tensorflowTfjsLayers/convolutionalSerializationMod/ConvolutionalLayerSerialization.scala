package typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod

import typingsSlinky.tensorflowTfjsLayers.layerSerializationMod.LayerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.Conv1DLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.Conv2DLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.Conv2DTransposeLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.SeparableConv2DLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.Cropping2DLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.UpSampling2DLayerSerialization
*/
trait ConvolutionalLayerSerialization extends LayerSerialization

object ConvolutionalLayerSerialization {
  @scala.inline
  implicit def apply(
    value: Conv1DLayerSerialization | Conv2DLayerSerialization | Conv2DTransposeLayerSerialization | Cropping2DLayerSerialization | SeparableConv2DLayerSerialization | UpSampling2DLayerSerialization
  ): ConvolutionalLayerSerialization = value.asInstanceOf[ConvolutionalLayerSerialization]
}

