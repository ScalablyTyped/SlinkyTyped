package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormatSerialization
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ZeroPadding2D
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paddingSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/padding_serialization", "paddingLayerClassNames")
  @js.native
  val paddingLayerClassNames: js.Array[PaddingLayerClassName] = js.native
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/padding_serialization.PaddingLayerSerialization['class_name'] */
  type PaddingLayerClassName = ZeroPadding2D
  
  type PaddingLayerSerialization = ZeroPadding2DLayerSerialization
  
  @js.native
  trait ZeroPadding2DLayerConfig extends LayerConfig {
    
    var data_format: js.UndefOr[DataFormatSerialization] = js.native
    
    var padding: js.UndefOr[
        Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
      ] = js.native
  }
  object ZeroPadding2DLayerConfig {
    
    @scala.inline
    def apply(): ZeroPadding2DLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZeroPadding2DLayerConfig]
    }
    
    @scala.inline
    implicit class ZeroPadding2DLayerConfigMutableBuilder[Self <: ZeroPadding2DLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData_format(value: DataFormatSerialization): Self = StObject.set(x, "data_format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_formatUndefined: Self = StObject.set(x, "data_format", js.undefined)
      
      @scala.inline
      def setPadding(
        value: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
      ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  type ZeroPadding2DLayerSerialization = BaseLayerSerialization[ZeroPadding2D, ZeroPadding2DLayerConfig]
}
