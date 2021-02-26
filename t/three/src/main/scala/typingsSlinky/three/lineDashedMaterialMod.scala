package typingsSlinky.three

import typingsSlinky.three.lineBasicMaterialMod.LineBasicMaterial
import typingsSlinky.three.lineBasicMaterialMod.LineBasicMaterialParameters
import typingsSlinky.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineDashedMaterialMod {
  
  @JSImport("three/src/materials/LineDashedMaterial", "LineDashedMaterial")
  @js.native
  class LineDashedMaterial () extends LineBasicMaterial {
    def this(parameters: LineDashedMaterialParameters) = this()
    
    /**
    	 * @default 1
    	 */
    var dashSize: Double = js.native
    
    /**
    	 * @default 1
    	 */
    var gapSize: Double = js.native
    
    val isLineDashedMaterial: `true` = js.native
    
    /**
    	 * @default 1
    	 */
    var scale: Double = js.native
    
    def setValues(parameters: LineDashedMaterialParameters): Unit = js.native
  }
  
  @js.native
  trait LineDashedMaterialParameters extends LineBasicMaterialParameters {
    
    var dashSize: js.UndefOr[Double] = js.native
    
    var gapSize: js.UndefOr[Double] = js.native
    
    var scale: js.UndefOr[Double] = js.native
  }
  object LineDashedMaterialParameters {
    
    @scala.inline
    def apply(): LineDashedMaterialParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineDashedMaterialParameters]
    }
    
    @scala.inline
    implicit class LineDashedMaterialParametersMutableBuilder[Self <: LineDashedMaterialParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDashSize(value: Double): Self = StObject.set(x, "dashSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashSizeUndefined: Self = StObject.set(x, "dashSize", js.undefined)
      
      @scala.inline
      def setGapSize(value: Double): Self = StObject.set(x, "gapSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapSizeUndefined: Self = StObject.set(x, "gapSize", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
}
