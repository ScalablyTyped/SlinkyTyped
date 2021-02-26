package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxNorm
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MinMaxNorm
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.NonNeg
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm
import typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constraintConfigMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/constraint_config", "constraintClassNames")
  @js.native
  val constraintClassNames: js.Array[ConstraintClassName] = js.native
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/constraint_config.ConstraintSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxNorm
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.NonNeg
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MinMaxNorm
  */
  trait ConstraintClassName extends StObject
  object ConstraintClassName {
    
    @scala.inline
    def MaxNorm: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxNorm = "MaxNorm".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MaxNorm]
    
    @scala.inline
    def MinMaxNorm: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MinMaxNorm = "MinMaxNorm".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.MinMaxNorm]
    
    @scala.inline
    def NonNeg: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.NonNeg = "NonNeg".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.NonNeg]
    
    @scala.inline
    def UnitNorm: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm = "UnitNorm".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm]
  }
  
  type ConstraintSerialization = MaxNormSerialization | NonNegSerialization | UnitNormSerialization | MinMaxNormSerialization
  
  @js.native
  trait MaxNormConfig extends StObject {
    
    var axis: js.UndefOr[Double] = js.native
    
    var max_value: js.UndefOr[Double] = js.native
  }
  object MaxNormConfig {
    
    @scala.inline
    def apply(): MaxNormConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxNormConfig]
    }
    
    @scala.inline
    implicit class MaxNormConfigMutableBuilder[Self <: MaxNormConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setMax_value(value: Double): Self = StObject.set(x, "max_value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_valueUndefined: Self = StObject.set(x, "max_value", js.undefined)
    }
  }
  
  type MaxNormSerialization = BaseSerialization[MaxNorm, MaxNormConfig]
  
  @js.native
  trait MinMaxNormConfig extends StObject {
    
    var axis: js.UndefOr[Double] = js.native
    
    var max_value: js.UndefOr[Double] = js.native
    
    var min_value: js.UndefOr[Double] = js.native
    
    var rate: js.UndefOr[Double] = js.native
  }
  object MinMaxNormConfig {
    
    @scala.inline
    def apply(): MinMaxNormConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinMaxNormConfig]
    }
    
    @scala.inline
    implicit class MinMaxNormConfigMutableBuilder[Self <: MinMaxNormConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setMax_value(value: Double): Self = StObject.set(x, "max_value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_valueUndefined: Self = StObject.set(x, "max_value", js.undefined)
      
      @scala.inline
      def setMin_value(value: Double): Self = StObject.set(x, "min_value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin_valueUndefined: Self = StObject.set(x, "min_value", js.undefined)
      
      @scala.inline
      def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    }
  }
  
  type MinMaxNormSerialization = BaseSerialization[MinMaxNorm, MinMaxNormConfig]
  
  type NonNegSerialization = BaseSerialization[NonNeg, Null]
  
  @js.native
  trait UnitNormConfig extends StObject {
    
    var axis: js.UndefOr[Double] = js.native
  }
  object UnitNormConfig {
    
    @scala.inline
    def apply(): UnitNormConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnitNormConfig]
    }
    
    @scala.inline
    implicit class UnitNormConfigMutableBuilder[Self <: UnitNormConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    }
  }
  
  type UnitNormSerialization = BaseSerialization[UnitNorm, UnitNormConfig]
}
