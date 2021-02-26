package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormatSerialization
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typingsSlinky.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv1D
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2D
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2DTranspose
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Cropping2D
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SeparableConv2D
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UpSampling2D
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convolutionalSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/convolutional_serialization", "convolutionalLayerClassNames")
  @js.native
  val convolutionalLayerClassNames: js.Array[ConvolutionalLayerClassName] = js.native
  
  @js.native
  trait BaseConvLayerConfig extends LayerConfig {
    
    var activation: js.UndefOr[String] = js.native
    
    var activity_regularizer: js.UndefOr[RegularizerSerialization] = js.native
    
    var bias_constraint: js.UndefOr[ConstraintSerialization] = js.native
    
    var bias_initializer: js.UndefOr[InitializerSerialization] = js.native
    
    var bias_regularizer: js.UndefOr[RegularizerSerialization] = js.native
    
    var data_format: js.UndefOr[DataFormatSerialization] = js.native
    
    var dilation_rate: js.UndefOr[Double | js.Array[Double] | (js.Tuple2[Double, Double])] = js.native
    
    var kernel_constraint: js.UndefOr[ConstraintSerialization] = js.native
    
    var kernel_initializer: js.UndefOr[InitializerSerialization] = js.native
    
    var kernel_regularizer: js.UndefOr[RegularizerSerialization] = js.native
    
    var kernel_size: Double | js.Array[Double] = js.native
    
    var padding: js.UndefOr[PaddingMode] = js.native
    
    var strides: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var use_bias: js.UndefOr[Boolean] = js.native
  }
  object BaseConvLayerConfig {
    
    @scala.inline
    def apply(kernel_size: Double | js.Array[Double]): BaseConvLayerConfig = {
      val __obj = js.Dynamic.literal(kernel_size = kernel_size.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseConvLayerConfig]
    }
    
    @scala.inline
    implicit class BaseConvLayerConfigMutableBuilder[Self <: BaseConvLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivation(value: String): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      @scala.inline
      def setActivity_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "activity_regularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivity_regularizerUndefined: Self = StObject.set(x, "activity_regularizer", js.undefined)
      
      @scala.inline
      def setBias_constraint(value: ConstraintSerialization): Self = StObject.set(x, "bias_constraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBias_constraintUndefined: Self = StObject.set(x, "bias_constraint", js.undefined)
      
      @scala.inline
      def setBias_initializer(value: InitializerSerialization): Self = StObject.set(x, "bias_initializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBias_initializerUndefined: Self = StObject.set(x, "bias_initializer", js.undefined)
      
      @scala.inline
      def setBias_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "bias_regularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBias_regularizerUndefined: Self = StObject.set(x, "bias_regularizer", js.undefined)
      
      @scala.inline
      def setData_format(value: DataFormatSerialization): Self = StObject.set(x, "data_format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_formatUndefined: Self = StObject.set(x, "data_format", js.undefined)
      
      @scala.inline
      def setDilation_rate(value: Double | js.Array[Double] | (js.Tuple2[Double, Double])): Self = StObject.set(x, "dilation_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDilation_rateUndefined: Self = StObject.set(x, "dilation_rate", js.undefined)
      
      @scala.inline
      def setDilation_rateVarargs(value: Double*): Self = StObject.set(x, "dilation_rate", js.Array(value :_*))
      
      @scala.inline
      def setKernel_constraint(value: ConstraintSerialization): Self = StObject.set(x, "kernel_constraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernel_constraintUndefined: Self = StObject.set(x, "kernel_constraint", js.undefined)
      
      @scala.inline
      def setKernel_initializer(value: InitializerSerialization): Self = StObject.set(x, "kernel_initializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernel_initializerUndefined: Self = StObject.set(x, "kernel_initializer", js.undefined)
      
      @scala.inline
      def setKernel_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "kernel_regularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernel_regularizerUndefined: Self = StObject.set(x, "kernel_regularizer", js.undefined)
      
      @scala.inline
      def setKernel_size(value: Double | js.Array[Double]): Self = StObject.set(x, "kernel_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernel_sizeVarargs(value: Double*): Self = StObject.set(x, "kernel_size", js.Array(value :_*))
      
      @scala.inline
      def setPadding(value: PaddingMode): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setStrides(value: Double | js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
      
      @scala.inline
      def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value :_*))
      
      @scala.inline
      def setUse_bias(value: Boolean): Self = StObject.set(x, "use_bias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse_biasUndefined: Self = StObject.set(x, "use_bias", js.undefined)
    }
  }
  
  type Conv1DLayerSerialization = BaseLayerSerialization[Conv1D, ConvLayerConfig]
  
  type Conv2DLayerSerialization = BaseLayerSerialization[Conv2D, ConvLayerConfig]
  
  type Conv2DTransposeLayerSerialization = BaseLayerSerialization[Conv2DTranspose, ConvLayerConfig]
  
  @js.native
  trait ConvLayerConfig extends BaseConvLayerConfig {
    
    var filters: Double = js.native
  }
  object ConvLayerConfig {
    
    @scala.inline
    def apply(filters: Double, kernel_size: Double | js.Array[Double]): ConvLayerConfig = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernel_size = kernel_size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvLayerConfig]
    }
    
    @scala.inline
    implicit class ConvLayerConfigMutableBuilder[Self <: ConvLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: Double): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/convolutional_serialization.ConvolutionalLayerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2DTranspose
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2D
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv1D
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UpSampling2D
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Cropping2D
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SeparableConv2D
  */
  trait ConvolutionalLayerClassName extends StObject
  object ConvolutionalLayerClassName {
    
    @scala.inline
    def Conv1D: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv1D = "Conv1D".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv1D]
    
    @scala.inline
    def Conv2D: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2D = "Conv2D".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2D]
    
    @scala.inline
    def Conv2DTranspose: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2DTranspose = "Conv2DTranspose".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Conv2DTranspose]
    
    @scala.inline
    def Cropping2D: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Cropping2D = "Cropping2D".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Cropping2D]
    
    @scala.inline
    def SeparableConv2D: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SeparableConv2D = "SeparableConv2D".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.SeparableConv2D]
    
    @scala.inline
    def UpSampling2D: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UpSampling2D = "UpSampling2D".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UpSampling2D]
  }
  
  type ConvolutionalLayerSerialization = Conv1DLayerSerialization | Conv2DLayerSerialization | Conv2DTransposeLayerSerialization | SeparableConv2DLayerSerialization | Cropping2DLayerSerialization | UpSampling2DLayerSerialization
  
  @js.native
  trait Cropping2DLayerConfig extends LayerConfig {
    
    var cropping: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])]) = js.native
    
    var data_format: js.UndefOr[DataFormatSerialization] = js.native
  }
  object Cropping2DLayerConfig {
    
    @scala.inline
    def apply(
      cropping: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
    ): Cropping2DLayerConfig = {
      val __obj = js.Dynamic.literal(cropping = cropping.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cropping2DLayerConfig]
    }
    
    @scala.inline
    implicit class Cropping2DLayerConfigMutableBuilder[Self <: Cropping2DLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCropping(
        value: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
      ): Self = StObject.set(x, "cropping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_format(value: DataFormatSerialization): Self = StObject.set(x, "data_format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_formatUndefined: Self = StObject.set(x, "data_format", js.undefined)
    }
  }
  
  type Cropping2DLayerSerialization = BaseLayerSerialization[Cropping2D, Cropping2DLayerConfig]
  
  type SeparableConv2DLayerSerialization = BaseLayerSerialization[SeparableConv2D, ConvLayerConfig]
  
  @js.native
  trait SeparableConvLayerConfig extends ConvLayerConfig {
    
    var depth_multiplier: js.UndefOr[Double] = js.native
    
    var depthwise_constraint: js.UndefOr[ConstraintSerialization] = js.native
    
    var depthwise_initializer: js.UndefOr[InitializerSerialization] = js.native
    
    var depthwise_regularizer: js.UndefOr[RegularizerSerialization] = js.native
    
    var pointwise_constraint: js.UndefOr[ConstraintSerialization] = js.native
    
    var pointwise_initializer: js.UndefOr[InitializerSerialization] = js.native
    
    var pointwise_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  }
  object SeparableConvLayerConfig {
    
    @scala.inline
    def apply(filters: Double, kernel_size: Double | js.Array[Double]): SeparableConvLayerConfig = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernel_size = kernel_size.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeparableConvLayerConfig]
    }
    
    @scala.inline
    implicit class SeparableConvLayerConfigMutableBuilder[Self <: SeparableConvLayerConfig] (val x: Self) extends AnyVal {
      
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
      def setPointwise_constraint(value: ConstraintSerialization): Self = StObject.set(x, "pointwise_constraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointwise_constraintUndefined: Self = StObject.set(x, "pointwise_constraint", js.undefined)
      
      @scala.inline
      def setPointwise_initializer(value: InitializerSerialization): Self = StObject.set(x, "pointwise_initializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointwise_initializerUndefined: Self = StObject.set(x, "pointwise_initializer", js.undefined)
      
      @scala.inline
      def setPointwise_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "pointwise_regularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointwise_regularizerUndefined: Self = StObject.set(x, "pointwise_regularizer", js.undefined)
    }
  }
  
  @js.native
  trait UpSampling2DLayerConfig extends LayerConfig {
    
    var data_format: js.UndefOr[DataFormatSerialization] = js.native
    
    var size: js.UndefOr[js.Array[Double]] = js.native
  }
  object UpSampling2DLayerConfig {
    
    @scala.inline
    def apply(): UpSampling2DLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpSampling2DLayerConfig]
    }
    
    @scala.inline
    implicit class UpSampling2DLayerConfigMutableBuilder[Self <: UpSampling2DLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData_format(value: DataFormatSerialization): Self = StObject.set(x, "data_format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_formatUndefined: Self = StObject.set(x, "data_format", js.undefined)
      
      @scala.inline
      def setSize(value: js.Array[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value :_*))
    }
  }
  
  type UpSampling2DLayerSerialization = BaseLayerSerialization[UpSampling2D, UpSampling2DLayerConfig]
}
