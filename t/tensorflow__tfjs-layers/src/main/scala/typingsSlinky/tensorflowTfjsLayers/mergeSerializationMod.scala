package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.BaseLayerSerialization
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeSerializationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/layers/merge_serialization", "mergeLayerClassNames")
  @js.native
  val mergeLayerClassNames: js.Array[MergeLayerClassName] = js.native
  
  type AddLayerSerialization = BaseLayerSerialization[Add, LayerConfig]
  
  type AverageLayerSerialization = BaseLayerSerialization[Average, LayerConfig]
  
  @js.native
  trait ConcatenateLayerConfig extends LayerConfig {
    
    var axis: js.UndefOr[Double] = js.native
  }
  object ConcatenateLayerConfig {
    
    @scala.inline
    def apply(): ConcatenateLayerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConcatenateLayerConfig]
    }
    
    @scala.inline
    implicit class ConcatenateLayerConfigMutableBuilder[Self <: ConcatenateLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    }
  }
  
  type ConcatenateLayerSerialization = BaseLayerSerialization[Concatenate, ConcatenateLayerConfig]
  
  @js.native
  trait DotLayerConfig extends LayerConfig {
    
    var axes: Double | (js.Tuple2[Double, Double]) = js.native
    
    var normalize: js.UndefOr[Boolean] = js.native
  }
  object DotLayerConfig {
    
    @scala.inline
    def apply(axes: Double | (js.Tuple2[Double, Double])): DotLayerConfig = {
      val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DotLayerConfig]
    }
    
    @scala.inline
    implicit class DotLayerConfigMutableBuilder[Self <: DotLayerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxes(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    }
  }
  
  type DotLayerSerialization = BaseLayerSerialization[Dot, DotLayerConfig]
  
  type MaximumLayerSerialization = BaseLayerSerialization[Maximum, LayerConfig]
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/layers/merge_serialization.MergeLayerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average
  */
  trait MergeLayerClassName extends StObject
  object MergeLayerClassName {
    
    @scala.inline
    def Add: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add = "Add".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Add]
    
    @scala.inline
    def Average: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average = "Average".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Average]
    
    @scala.inline
    def Concatenate: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate = "Concatenate".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Concatenate]
    
    @scala.inline
    def Dot: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot = "Dot".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Dot]
    
    @scala.inline
    def Maximum: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum = "Maximum".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Maximum]
    
    @scala.inline
    def Minimum: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum = "Minimum".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Minimum]
    
    @scala.inline
    def Multiply: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply = "Multiply".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Multiply]
  }
  
  type MergeLayerSerialization = AddLayerSerialization | MultiplyLayerSerialization | AverageLayerSerialization | MaximumLayerSerialization | MinimumLayerSerialization | ConcatenateLayerSerialization | DotLayerSerialization
  
  type MinimumLayerSerialization = BaseLayerSerialization[Minimum, LayerConfig]
  
  type MultiplyLayerSerialization = BaseLayerSerialization[Multiply, LayerConfig]
}
