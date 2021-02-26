package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.L1L2
import typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regularizerConfigMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/regularizer_config", "regularizerClassNames")
  @js.native
  val regularizerClassNames: js.Array[RegularizerClassName] = js.native
  
  @js.native
  trait L1L2Config extends StObject {
    
    var l1: js.UndefOr[Double] = js.native
    
    var l2: js.UndefOr[Double] = js.native
  }
  object L1L2Config {
    
    @scala.inline
    def apply(): L1L2Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[L1L2Config]
    }
    
    @scala.inline
    implicit class L1L2ConfigMutableBuilder[Self <: L1L2Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setL1(value: Double): Self = StObject.set(x, "l1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL1Undefined: Self = StObject.set(x, "l1", js.undefined)
      
      @scala.inline
      def setL2(value: Double): Self = StObject.set(x, "l2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL2Undefined: Self = StObject.set(x, "l2", js.undefined)
    }
  }
  
  type L1L2Serialization = BaseSerialization[L1L2, L1L2Config]
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/regularizer_config.RegularizerSerialization['class_name'] */
  type RegularizerClassName = L1L2
  
  type RegularizerSerialization = L1L2Serialization
}
