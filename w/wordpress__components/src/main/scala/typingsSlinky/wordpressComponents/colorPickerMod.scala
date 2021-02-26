package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.tinycolor2.mod.Instance
import typingsSlinky.wordpressComponents.colorPickerMod.ColorPicker.Props
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorPickerMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/color-picker", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object ColorPicker {
    
    @js.native
    trait OnChangeCompleteValue extends StObject {
      
      var color: Instance = js.native
      
      var draftHex: String = js.native
      
      var draftHsl: String = js.native
      
      var draftRgb: String = js.native
      
      var hex: String = js.native
      
      var hsl: String = js.native
      
      var hsv: String = js.native
      
      var oldHue: String = js.native
      
      var rgb: String = js.native
      
      var source: js.UndefOr[rgb] = js.native
    }
    object OnChangeCompleteValue {
      
      @scala.inline
      def apply(
        color: Instance,
        draftHex: String,
        draftHsl: String,
        draftRgb: String,
        hex: String,
        hsl: String,
        hsv: String,
        oldHue: String,
        rgb: String
      ): OnChangeCompleteValue = {
        val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], draftHex = draftHex.asInstanceOf[js.Any], draftHsl = draftHsl.asInstanceOf[js.Any], draftRgb = draftRgb.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], hsv = hsv.asInstanceOf[js.Any], oldHue = oldHue.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any])
        __obj.asInstanceOf[OnChangeCompleteValue]
      }
      
      @scala.inline
      implicit class OnChangeCompleteValueMutableBuilder[Self <: OnChangeCompleteValue] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColor(value: Instance): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDraftHex(value: String): Self = StObject.set(x, "draftHex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDraftHsl(value: String): Self = StObject.set(x, "draftHsl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDraftRgb(value: String): Self = StObject.set(x, "draftRgb", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHsl(value: String): Self = StObject.set(x, "hsl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHsv(value: String): Self = StObject.set(x, "hsv", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOldHue(value: String): Self = StObject.set(x, "oldHue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRgb(value: String): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSource(value: rgb): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      }
    }
    
    @js.native
    trait Props extends StObject {
      
      /**
        * Machine-readable color value.
        * @defaultValue "0071a1"
        */
      var color: js.UndefOr[String] = js.native
      
      /**
        * Should alpha be disabled?
        */
      var disableAlpha: js.UndefOr[Boolean] = js.native
      
      /**
        * A reference to the hue of the previous color, otherwise
        * dragging the saturation to zero will reset the current
        * hue to zero as well.
        *
        * @see https://github.com/casesandberg/react-color/issues/29#issuecomment-132686909.
        */
      var oldHue: js.UndefOr[Double] = js.native
      
      /**
        * Function to be called when color value changes.
        */
      def onChangeComplete(value: OnChangeCompleteValue): Unit = js.native
    }
    object Props {
      
      @scala.inline
      def apply(onChangeComplete: OnChangeCompleteValue => Unit): Props = {
        val __obj = js.Dynamic.literal(onChangeComplete = js.Any.fromFunction1(onChangeComplete))
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
        
        @scala.inline
        def setDisableAlpha(value: Boolean): Self = StObject.set(x, "disableAlpha", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisableAlphaUndefined: Self = StObject.set(x, "disableAlpha", js.undefined)
        
        @scala.inline
        def setOldHue(value: Double): Self = StObject.set(x, "oldHue", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOldHueUndefined: Self = StObject.set(x, "oldHue", js.undefined)
        
        @scala.inline
        def setOnChangeComplete(value: OnChangeCompleteValue => Unit): Self = StObject.set(x, "onChangeComplete", js.Any.fromFunction1(value))
      }
    }
  }
}
