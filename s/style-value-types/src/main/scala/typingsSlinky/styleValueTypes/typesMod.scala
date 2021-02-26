package typingsSlinky.styleValueTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.styleValueTypes.typesMod.HSLA
    - typingsSlinky.styleValueTypes.typesMod.RGBA
  */
  trait Color extends StObject
  object Color {
    
    @scala.inline
    def HSLA(hue: Double, lightness: Double, saturation: Double): typingsSlinky.styleValueTypes.typesMod.HSLA = {
      val __obj = js.Dynamic.literal(hue = hue.asInstanceOf[js.Any], lightness = lightness.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.styleValueTypes.typesMod.HSLA]
    }
    
    @scala.inline
    def RGBA(blue: Double, green: Double, red: Double): typingsSlinky.styleValueTypes.typesMod.RGBA = {
      val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.styleValueTypes.typesMod.RGBA]
    }
  }
  
  @js.native
  trait HSLA extends Color {
    
    var alpha: js.UndefOr[Double] = js.native
    
    var hue: Double = js.native
    
    var lightness: Double = js.native
    
    var saturation: Double = js.native
  }
  object HSLA {
    
    @scala.inline
    def apply(hue: Double, lightness: Double, saturation: Double): HSLA = {
      val __obj = js.Dynamic.literal(hue = hue.asInstanceOf[js.Any], lightness = lightness.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSLA]
    }
    
    @scala.inline
    implicit class HSLAMutableBuilder[Self <: HSLA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      @scala.inline
      def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightness(value: Double): Self = StObject.set(x, "lightness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    }
  }
  
  type NumberMap = StringDictionary[Double]
  
  @js.native
  trait RGBA extends Color {
    
    var alpha: js.UndefOr[Double] = js.native
    
    var blue: Double = js.native
    
    var green: Double = js.native
    
    var red: Double = js.native
  }
  object RGBA {
    
    @scala.inline
    def apply(blue: Double, green: Double, red: Double): RGBA = {
      val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBA]
    }
    
    @scala.inline
    implicit class RGBAMutableBuilder[Self <: RGBA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      @scala.inline
      def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    }
  }
  
  type Transformer = js.Function1[/* v */ js.Any, js.Any]
  
  @js.native
  trait ValueType extends StObject {
    
    var default: js.UndefOr[js.Any] = js.native
    
    var createTransformer: js.UndefOr[js.Function1[/* template */ String, Transformer]] = js.native
    
    var getAnimatableNone: js.UndefOr[js.Function1[/* v */ js.Any, _]] = js.native
    
    def parse(v: js.Any): js.Any = js.native
    
    def test(v: js.Any): Boolean = js.native
    
    var transform: js.UndefOr[Transformer] = js.native
  }
  object ValueType {
    
    @scala.inline
    def apply(parse: js.Any => js.Any, test: js.Any => Boolean): ValueType = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[ValueType]
    }
    
    @scala.inline
    implicit class ValueTypeMutableBuilder[Self <: ValueType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateTransformer(value: /* template */ String => Transformer): Self = StObject.set(x, "createTransformer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateTransformerUndefined: Self = StObject.set(x, "createTransformer", js.undefined)
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setGetAnimatableNone(value: /* v */ js.Any => _): Self = StObject.set(x, "getAnimatableNone", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAnimatableNoneUndefined: Self = StObject.set(x, "getAnimatableNone", js.undefined)
      
      @scala.inline
      def setParse(value: js.Any => js.Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTest(value: js.Any => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransform(value: /* v */ js.Any => js.Any): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}
