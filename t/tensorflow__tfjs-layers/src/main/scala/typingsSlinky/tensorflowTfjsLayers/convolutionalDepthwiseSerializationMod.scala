package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typingsSlinky.tensorflowTfjsLayers.convolutionalSerializationMod.BaseConvLayerConfig
import typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typingsSlinky.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.DepthwiseConv2D
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convolutionalDepthwiseSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/convolutional_depthwise_serialization", "convolutionalDepthwiseLayerClassNames")
  @js.native
  val convolutionalDepthwiseLayerClassNames: js.Array[ConvolutionalDepthwiseLayerClassName] = js.native
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/convolutional_depthwise_serialization.ConvolutionalDepthwiseLayerSerialization['class_name'] */
  type ConvolutionalDepthwiseLayerClassName = DepthwiseConv2D
  
  type ConvolutionalDepthwiseLayerSerialization = DepthwiseConv2DLayerSerialization
  
  @js.native
  trait DepthwiseConv2DLayerConfig extends BaseConvLayerConfig {
    
    var depth_multiplier: js.UndefOr[Double] = js.native
    
    var depthwise_constraint: js.UndefOr[ConstraintSerialization] = js.native
    
    var depthwise_initializer: js.UndefOr[InitializerSerialization] = js.native
    
    var depthwise_regularizer: js.UndefOr[RegularizerSerialization] = js.native
    
    @JSName("kernel_size")
    var kernel_size_DepthwiseConv2DLayerConfig: Double | (js.Tuple2[Double, Double]) = js.native
  }
  object DepthwiseConv2DLayerConfig {
    
    @scala.inline
    def apply(kernel_size: Double | (js.Tuple2[Double, Double])): DepthwiseConv2DLayerConfig = {
      val __obj = js.Dynamic.literal(kernel_size = kernel_size.asInstanceOf[js.Any])
      __obj.asInstanceOf[DepthwiseConv2DLayerConfig]
    }
    
    @scala.inline
    implicit class DepthwiseConv2DLayerConfigMutableBuilder[Self <: DepthwiseConv2DLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepth_multiplier(value: Double): Self = StObject.set(x, "depth_multiplier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepth_multiplierUndefined: Self = StObject.set(x, "depth_multiplier", js.undefined)
      
      @scala.inline
      def setDepthwise_constraint(value: ConstraintSerialization): Self = StObject.set(x, "depthwise_constraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthwise_constraintUndefined: Self = StObject.set(x, "depthwise_constraint", js.undefined)
      
      @scala.inline
      def setDepthwise_initializer(value: InitializerSerialization): Self = StObject.set(x, "depthwise_initializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthwise_initializerUndefined: Self = StObject.set(x, "depthwise_initializer", js.undefined)
      
      @scala.inline
      def setDepthwise_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "depthwise_regularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthwise_regularizerUndefined: Self = StObject.set(x, "depthwise_regularizer", js.undefined)
      
      @scala.inline
      def setKernel_size(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "kernel_size", value.asInstanceOf[js.Any])
    }
  }
  
  type DepthwiseConv2DLayerSerialization = BaseLayerSerialization[DepthwiseConv2D, DepthwiseConv2DLayerConfig]
}
