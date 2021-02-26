package typingsSlinky.shevyjs

import typingsSlinky.shevyjs.shevyjsStrings.augmentedFourth
import typingsSlinky.shevyjs.shevyjsStrings.majorSecond
import typingsSlinky.shevyjs.shevyjsStrings.majorThird
import typingsSlinky.shevyjs.shevyjsStrings.minorThird
import typingsSlinky.shevyjs.shevyjsStrings.perfectFourth
import typingsSlinky.shevyjs.typesMod.Factor
import typingsSlinky.shevyjs.typesMod.Scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<shevyjs.shevyjs/types.Options> */
  @js.native
  trait PartialOptions extends StObject {
    
    var addMarginBottom: js.UndefOr[Boolean] = js.native
    
    var baseFontScale: js.UndefOr[Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth] = js.native
    
    var baseFontSize: js.UndefOr[String] = js.native
    
    var baseLineHeight: js.UndefOr[Double] = js.native
    
    var proximity: js.UndefOr[Boolean] = js.native
    
    var proximityFactor: js.UndefOr[Factor] = js.native
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddMarginBottom(value: Boolean): Self = StObject.set(x, "addMarginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddMarginBottomUndefined: Self = StObject.set(x, "addMarginBottom", js.undefined)
      
      @scala.inline
      def setBaseFontScale(value: Scale | majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth): Self = StObject.set(x, "baseFontScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseFontScaleUndefined: Self = StObject.set(x, "baseFontScale", js.undefined)
      
      @scala.inline
      def setBaseFontScaleVarargs(value: Factor*): Self = StObject.set(x, "baseFontScale", js.Array(value :_*))
      
      @scala.inline
      def setBaseFontSize(value: String): Self = StObject.set(x, "baseFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseFontSizeUndefined: Self = StObject.set(x, "baseFontSize", js.undefined)
      
      @scala.inline
      def setBaseLineHeight(value: Double): Self = StObject.set(x, "baseLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseLineHeightUndefined: Self = StObject.set(x, "baseLineHeight", js.undefined)
      
      @scala.inline
      def setProximity(value: Boolean): Self = StObject.set(x, "proximity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProximityFactor(value: Factor): Self = StObject.set(x, "proximityFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProximityFactorUndefined: Self = StObject.set(x, "proximityFactor", js.undefined)
      
      @scala.inline
      def setProximityUndefined: Self = StObject.set(x, "proximity", js.undefined)
    }
  }
  
  /* Inlined std.Pick<shevyjs.shevyjs/types.RhythmProperties, std.Exclude<keyof shevyjs.shevyjs/types.RhythmProperties, 'marginBottom'>> */
  @js.native
  trait PickRhythmPropertiesExclu extends StObject {
    
    var fontSize: String = js.native
    
    var lineHeight: Double = js.native
  }
  object PickRhythmPropertiesExclu {
    
    @scala.inline
    def apply(fontSize: String, lineHeight: Double): PickRhythmPropertiesExclu = {
      val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickRhythmPropertiesExclu]
    }
    
    @scala.inline
    implicit class PickRhythmPropertiesExcluMutableBuilder[Self <: PickRhythmPropertiesExclu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    }
  }
}
