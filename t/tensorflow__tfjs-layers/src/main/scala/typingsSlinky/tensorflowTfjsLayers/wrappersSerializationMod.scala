package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.BidirectionalMergeMode
import typingsSlinky.tensorflowTfjsLayers.layerSerializationMod.LayerSerialization
import typingsSlinky.tensorflowTfjsLayers.recurrentSerializationMod.RecurrentLayerSerialization
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Bidirectional
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TimeDistributed
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrappersSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/wrappers_serialization", "wrapperLayerClassNames")
  @js.native
  val wrapperLayerClassNames: js.Array[WrapperLayerClassName] = js.native
  
  @js.native
  trait BidirectionalLayerConfig extends LayerConfig {
    
    var layer: RecurrentLayerSerialization = js.native
    
    var merge_mode: js.UndefOr[BidirectionalMergeMode] = js.native
  }
  object BidirectionalLayerConfig {
    
    @scala.inline
    def apply(layer: RecurrentLayerSerialization): BidirectionalLayerConfig = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[BidirectionalLayerConfig]
    }
    
    @scala.inline
    implicit class BidirectionalLayerConfigMutableBuilder[Self <: BidirectionalLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLayer(value: RecurrentLayerSerialization): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMerge_mode(value: BidirectionalMergeMode): Self = StObject.set(x, "merge_mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMerge_modeUndefined: Self = StObject.set(x, "merge_mode", js.undefined)
    }
  }
  
  type BidirectionalLayerSerialization = BaseLayerSerialization[Bidirectional, BidirectionalLayerConfig]
  
  @js.native
  trait TimeDistributedLayerConfig extends LayerConfig {
    
    var layer: LayerSerialization = js.native
  }
  object TimeDistributedLayerConfig {
    
    @scala.inline
    def apply(layer: LayerSerialization): TimeDistributedLayerConfig = {
      val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeDistributedLayerConfig]
    }
    
    @scala.inline
    implicit class TimeDistributedLayerConfigMutableBuilder[Self <: TimeDistributedLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLayer(value: LayerSerialization): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    }
  }
  
  type TimeDistributedLayerSerialization = BaseLayerSerialization[TimeDistributed, TimeDistributedLayerConfig]
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/wrappers_serialization.WrapperLayerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TimeDistributed
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Bidirectional
  */
  trait WrapperLayerClassName extends StObject
  object WrapperLayerClassName {
    
    @scala.inline
    def Bidirectional: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Bidirectional = "Bidirectional".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Bidirectional]
    
    @scala.inline
    def TimeDistributed: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TimeDistributed = "TimeDistributed".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TimeDistributed]
  }
  
  type WrapperLayerSerialization = TimeDistributedLayerSerialization | BidirectionalLayerSerialization
}
