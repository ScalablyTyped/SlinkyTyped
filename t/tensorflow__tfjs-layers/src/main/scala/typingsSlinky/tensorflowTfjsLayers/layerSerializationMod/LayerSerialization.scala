package typingsSlinky.tensorflowTfjsLayers.layerSerializationMod

import typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod.AdvancedActivationLayerSerialization
import typingsSlinky.tensorflowTfjsLayers.convolutionalDepthwiseSerializationMod.ConvolutionalDepthwiseLayerSerialization
import typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.ConvolutionalLayerSerialization
import typingsSlinky.tensorflowTfjsLayers.coreSerializationMod.CoreLayerSerialization
import typingsSlinky.tensorflowTfjsLayers.embeddingsSerializationMod.EmbeddingLayerSerialization
import typingsSlinky.tensorflowTfjsLayers.inputConfigMod.InputLayerSerialization
import typingsSlinky.tensorflowTfjsLayers.kerasClassNamesMod.KerasSerialization
import typingsSlinky.tensorflowTfjsLayers.mergeSerializationMod.MergeLayerSerialization
import typingsSlinky.tensorflowTfjsLayers.normalizationSerializationMod.NormalizationLayerSerialization
import typingsSlinky.tensorflowTfjsLayers.paddingSerializationMod.PaddingLayerSerialization
import typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.PoolingLayerSerialization
import typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.RecurrentLayerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsLayers.advancedActivationSerializationMod.AdvancedActivationLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.convolutionalDepthwiseSerializationMod.ConvolutionalDepthwiseLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.ConvolutionalLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.coreSerializationMod.CoreLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.embeddingsSerializationMod.EmbeddingLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.mergeSerializationMod.MergeLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.normalizationSerializationMod.NormalizationLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.paddingSerializationMod.PaddingLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.poolingSerializationMod.PoolingLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.RecurrentLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.inputConfigMod.InputLayerSerialization
*/
trait LayerSerialization extends KerasSerialization

object LayerSerialization {
  @scala.inline
  implicit def apply(
    value: ConvolutionalDepthwiseLayerSerialization | EmbeddingLayerSerialization | InputLayerSerialization | NormalizationLayerSerialization | PaddingLayerSerialization
  ): LayerSerialization = value.asInstanceOf[LayerSerialization]
  @scala.inline
  implicit def apply(value: AdvancedActivationLayerSerialization): LayerSerialization = value.asInstanceOf[LayerSerialization]
  @scala.inline
  implicit def apply(value: ConvolutionalLayerSerialization): LayerSerialization = value.asInstanceOf[LayerSerialization]
  @scala.inline
  implicit def apply(value: CoreLayerSerialization): LayerSerialization = value.asInstanceOf[LayerSerialization]
  @scala.inline
  implicit def apply(value: MergeLayerSerialization): LayerSerialization = value.asInstanceOf[LayerSerialization]
  @scala.inline
  implicit def apply(value: PoolingLayerSerialization): LayerSerialization = value.asInstanceOf[LayerSerialization]
  @scala.inline
  implicit def apply(value: RecurrentLayerSerialization): LayerSerialization = value.asInstanceOf[LayerSerialization]
}

