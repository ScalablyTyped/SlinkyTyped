package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsLayers.activationConfigMod.ActivationSerialization
import typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsSlinky.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/core_serialization", "coreLayerClassNames")
  @js.native
  val coreLayerClassNames: js.Array[CoreLayerClassName] = js.native
  
  @js.native
  trait ActivationLayerConfig extends LayerConfig {
    
    var activation: ActivationSerialization = js.native
  }
  object ActivationLayerConfig {
    
    @scala.inline
    def apply(activation: ActivationSerialization): ActivationLayerConfig = {
      val __obj = js.Dynamic.literal(activation = activation.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActivationLayerConfig]
    }
    
    @scala.inline
    implicit class ActivationLayerConfigMutableBuilder[Self <: ActivationLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivation(value: ActivationSerialization): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
    }
  }
  
  type ActivationLayerSerialization = BaseLayerSerialization[Activation, ActivationLayerConfig]
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/core_serialization.CoreLayerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense
  */
  trait CoreLayerClassName extends StObject
  object CoreLayerClassName {
    
    @scala.inline
    def Activation: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation = "Activation".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Activation]
    
    @scala.inline
    def Dense: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense = "Dense".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dense]
    
    @scala.inline
    def Dropout: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout = "Dropout".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dropout]
    
    @scala.inline
    def Flatten: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten = "Flatten".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Flatten]
    
    @scala.inline
    def Masking: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking = "Masking".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Masking]
    
    @scala.inline
    def Permute: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute = "Permute".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Permute]
    
    @scala.inline
    def RepeatVector: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector = "RepeatVector".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RepeatVector]
    
    @scala.inline
    def Reshape: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape = "Reshape".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Reshape]
  }
  
  type CoreLayerSerialization = DropoutLayerSerialization | DenseLayerSerialization | FlattenLayerSerialization | ActivationLayerSerialization | RepeatVectorLayerSerialization | ReshapeLayerSerialization | PermuteLayerSerialization | MaskingLayerSerialization
  
  @js.native
  trait DenseLayerConfig extends LayerConfig {
    
    var activation: js.UndefOr[ActivationSerialization] = js.native
    
    var activity_regularizer: js.UndefOr[RegularizerSerialization] = js.native
    
    var bias_constraint: js.UndefOr[ConstraintSerialization] = js.native
    
    var bias_initializer: js.UndefOr[InitializerSerialization] = js.native
    
    var bias_regularizer: js.UndefOr[RegularizerSerialization] = js.native
    
    var input_dim: js.UndefOr[Double] = js.native
    
    var kernel_constraint: js.UndefOr[ConstraintSerialization] = js.native
    
    var kernel_initializer: js.UndefOr[InitializerSerialization] = js.native
    
    var kernel_regularizer: js.UndefOr[RegularizerSerialization] = js.native
    
    var units: Double = js.native
    
    var use_bias: js.UndefOr[Boolean] = js.native
  }
  object DenseLayerConfig {
    
    @scala.inline
    def apply(units: Double): DenseLayerConfig = {
      val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
      __obj.asInstanceOf[DenseLayerConfig]
    }
    
    @scala.inline
    implicit class DenseLayerConfigMutableBuilder[Self <: DenseLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivation(value: ActivationSerialization): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
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
      def setInput_dim(value: Double): Self = StObject.set(x, "input_dim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput_dimUndefined: Self = StObject.set(x, "input_dim", js.undefined)
      
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
      def setUnits(value: Double): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse_bias(value: Boolean): Self = StObject.set(x, "use_bias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUse_biasUndefined: Self = StObject.set(x, "use_bias", js.undefined)
    }
  }
  
  type DenseLayerSerialization = BaseLayerSerialization[Dense, DenseLayerConfig]
  
  @js.native
  trait DropoutLayerConfig extends LayerConfig {
    
    var noise_shape: js.UndefOr[js.Array[Double]] = js.native
    
    var rate: Double = js.native
    
    var seed: js.UndefOr[Double] = js.native
  }
  object DropoutLayerConfig {
    
    @scala.inline
    def apply(rate: Double): DropoutLayerConfig = {
      val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropoutLayerConfig]
    }
    
    @scala.inline
    implicit class DropoutLayerConfigMutableBuilder[Self <: DropoutLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoise_shape(value: js.Array[Double]): Self = StObject.set(x, "noise_shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoise_shapeUndefined: Self = StObject.set(x, "noise_shape", js.undefined)
      
      @scala.inline
      def setNoise_shapeVarargs(value: Double*): Self = StObject.set(x, "noise_shape", js.Array(value :_*))
      
      @scala.inline
      def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
  
  type DropoutLayerSerialization = BaseLayerSerialization[Dropout, DropoutLayerConfig]
  
  type FlattenLayerSerialization = BaseLayerSerialization[Flatten, LayerConfig]
  
  @js.native
  trait MaskingLayerConfig extends LayerConfig {
    
    var maskValue: Double = js.native
  }
  object MaskingLayerConfig {
    
    @scala.inline
    def apply(maskValue: Double): MaskingLayerConfig = {
      val __obj = js.Dynamic.literal(maskValue = maskValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaskingLayerConfig]
    }
    
    @scala.inline
    implicit class MaskingLayerConfigMutableBuilder[Self <: MaskingLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaskValue(value: Double): Self = StObject.set(x, "maskValue", value.asInstanceOf[js.Any])
    }
  }
  
  type MaskingLayerSerialization = BaseLayerSerialization[Masking, MaskingLayerConfig]
  
  @js.native
  trait PermuteLayerConfig extends LayerConfig {
    
    var dims: js.Array[Double] = js.native
  }
  object PermuteLayerConfig {
    
    @scala.inline
    def apply(dims: js.Array[Double]): PermuteLayerConfig = {
      val __obj = js.Dynamic.literal(dims = dims.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermuteLayerConfig]
    }
    
    @scala.inline
    implicit class PermuteLayerConfigMutableBuilder[Self <: PermuteLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDims(value: js.Array[Double]): Self = StObject.set(x, "dims", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimsVarargs(value: Double*): Self = StObject.set(x, "dims", js.Array(value :_*))
    }
  }
  
  type PermuteLayerSerialization = BaseLayerSerialization[Permute, PermuteLayerConfig]
  
  @js.native
  trait RepeatVectorLayerConfig extends LayerConfig {
    
    var n: Double = js.native
  }
  object RepeatVectorLayerConfig {
    
    @scala.inline
    def apply(n: Double): RepeatVectorLayerConfig = {
      val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepeatVectorLayerConfig]
    }
    
    @scala.inline
    implicit class RepeatVectorLayerConfigMutableBuilder[Self <: RepeatVectorLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    }
  }
  
  type RepeatVectorLayerSerialization = BaseLayerSerialization[RepeatVector, RepeatVectorLayerConfig]
  
  @js.native
  trait ReshapeLayerConfig extends LayerConfig {
    
    var target_shape: Shape = js.native
  }
  object ReshapeLayerConfig {
    
    @scala.inline
    def apply(target_shape: Shape): ReshapeLayerConfig = {
      val __obj = js.Dynamic.literal(target_shape = target_shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReshapeLayerConfig]
    }
    
    @scala.inline
    implicit class ReshapeLayerConfigMutableBuilder[Self <: ReshapeLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget_shape(value: Shape): Self = StObject.set(x, "target_shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget_shapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "target_shape", js.Array(value :_*))
    }
  }
  
  type ReshapeLayerSerialization = BaseLayerSerialization[Reshape, ReshapeLayerConfig]
}
