package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typingsSlinky.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object advancedActivationSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/advanced_activation_serialization", "advancedActivationLayerClassNames")
  @js.native
  val advancedActivationLayerClassNames: js.Array[AdvancedActivationLayerClassName] = js.native
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/advanced_activation_serialization.AdvancedActivationLayerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU
  */
  trait AdvancedActivationLayerClassName extends StObject
  object AdvancedActivationLayerClassName {
    
    @scala.inline
    def ELU: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU = "ELU".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ELU]
    
    @scala.inline
    def LeakyReLU: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU = "LeakyReLU".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.LeakyReLU]
    
    @scala.inline
    def PReLU: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU = "PReLU".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.PReLU]
    
    @scala.inline
    def ReLU: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU = "ReLU".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ReLU]
    
    @scala.inline
    def Softmax: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax = "Softmax".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Softmax]
    
    @scala.inline
    def ThresholdedReLU: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU = "ThresholdedReLU".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ThresholdedReLU]
  }
  
  type AdvancedActivationLayerSerialization = ReLULayerSerialization | LeakyReLULayerSerialization | PReLULayerSerialization | ELULayerSerialization | ThresholdedReLULayerSerialization | SoftmaxLayerSerialization
  
  @js.native
  trait ELULayerConfig extends LayerConfig {
    
    var alpha: js.UndefOr[Double] = js.native
  }
  object ELULayerConfig {
    
    @scala.inline
    def apply(): ELULayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ELULayerConfig]
    }
    
    @scala.inline
    implicit class ELULayerConfigMutableBuilder[Self <: ELULayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    }
  }
  
  type ELULayerSerialization = BaseLayerSerialization[ELU, ELULayerConfig]
  
  @js.native
  trait LeakyReLULayerConfig extends LayerConfig {
    
    var alpha: js.UndefOr[Double] = js.native
  }
  object LeakyReLULayerConfig {
    
    @scala.inline
    def apply(): LeakyReLULayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LeakyReLULayerConfig]
    }
    
    @scala.inline
    implicit class LeakyReLULayerConfigMutableBuilder[Self <: LeakyReLULayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    }
  }
  
  type LeakyReLULayerSerialization = BaseLayerSerialization[LeakyReLU, LeakyReLULayerConfig]
  
  @js.native
  trait PReLULayerConfig extends LayerConfig {
    
    var alpha_constraint: js.UndefOr[ConstraintSerialization] = js.native
    
    var alpha_initializer: js.UndefOr[InitializerSerialization] = js.native
    
    var alpha_regularizer: js.UndefOr[RegularizerSerialization] = js.native
    
    var shared_axes: js.UndefOr[Double | js.Array[Double]] = js.native
  }
  object PReLULayerConfig {
    
    @scala.inline
    def apply(): PReLULayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PReLULayerConfig]
    }
    
    @scala.inline
    implicit class PReLULayerConfigMutableBuilder[Self <: PReLULayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha_constraint(value: ConstraintSerialization): Self = StObject.set(x, "alpha_constraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlpha_constraintUndefined: Self = StObject.set(x, "alpha_constraint", js.undefined)
      
      @scala.inline
      def setAlpha_initializer(value: InitializerSerialization): Self = StObject.set(x, "alpha_initializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlpha_initializerUndefined: Self = StObject.set(x, "alpha_initializer", js.undefined)
      
      @scala.inline
      def setAlpha_regularizer(value: RegularizerSerialization): Self = StObject.set(x, "alpha_regularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlpha_regularizerUndefined: Self = StObject.set(x, "alpha_regularizer", js.undefined)
      
      @scala.inline
      def setShared_axes(value: Double | js.Array[Double]): Self = StObject.set(x, "shared_axes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShared_axesUndefined: Self = StObject.set(x, "shared_axes", js.undefined)
      
      @scala.inline
      def setShared_axesVarargs(value: Double*): Self = StObject.set(x, "shared_axes", js.Array(value :_*))
    }
  }
  
  type PReLULayerSerialization = BaseLayerSerialization[PReLU, PReLULayerConfig]
  
  @js.native
  trait ReLULayerConfig extends LayerConfig {
    
    var max_value: js.UndefOr[Double] = js.native
  }
  object ReLULayerConfig {
    
    @scala.inline
    def apply(): ReLULayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReLULayerConfig]
    }
    
    @scala.inline
    implicit class ReLULayerConfigMutableBuilder[Self <: ReLULayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax_value(value: Double): Self = StObject.set(x, "max_value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_valueUndefined: Self = StObject.set(x, "max_value", js.undefined)
    }
  }
  
  type ReLULayerSerialization = BaseLayerSerialization[ReLU, ReLULayerConfig]
  
  @js.native
  trait SoftmaxLayerConfig extends LayerConfig {
    
    var axis: js.UndefOr[Double] = js.native
  }
  object SoftmaxLayerConfig {
    
    @scala.inline
    def apply(): SoftmaxLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SoftmaxLayerConfig]
    }
    
    @scala.inline
    implicit class SoftmaxLayerConfigMutableBuilder[Self <: SoftmaxLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    }
  }
  
  type SoftmaxLayerSerialization = BaseLayerSerialization[Softmax, SoftmaxLayerConfig]
  
  @js.native
  trait ThresholdedReLULayerConfig extends LayerConfig {
    
    var theta: js.UndefOr[Double] = js.native
  }
  object ThresholdedReLULayerConfig {
    
    @scala.inline
    def apply(): ThresholdedReLULayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThresholdedReLULayerConfig]
    }
    
    @scala.inline
    implicit class ThresholdedReLULayerConfigMutableBuilder[Self <: ThresholdedReLULayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTheta(value: Double): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
    }
  }
  
  type ThresholdedReLULayerSerialization = BaseLayerSerialization[ThresholdedReLU, ThresholdedReLULayerConfig]
}
