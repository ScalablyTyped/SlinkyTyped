package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressComponents.colorPaletteMod.ColorPalette.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorPaletteMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/color-palette", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object ColorPalette {
    
    @js.native
    trait Color extends StObject {
      
      /**
        * Machine-readable color value.
        */
      var color: String = js.native
      
      /**
        * Human-readable color name.
        */
      var name: String = js.native
    }
    object Color {
      
      @scala.inline
      def apply(color: String, name: String): Color = {
        val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[Color]
      }
      
      @scala.inline
      implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Props extends StObject {
      
      var className: js.UndefOr[String] = js.native
      
      /**
        * Whether the palette should have a clearing button or not.
        * @defaultValue `true`
        */
      var clearable: js.UndefOr[Boolean] = js.native
      
      /**
        * Array of `ColorPalette.Color` to use.
        */
      var colors: js.Array[Color] = js.native
      
      /**
        * Should custom color selection be disabled?
        * @defaultValue false
        */
      var disableCustomColors: js.UndefOr[Boolean] = js.native
      
      /**
        * Function to be called when color is changed. `color` may be
        * `undefined` if the color selection is the same as the current `value`.
        */
      def onChange(): Unit = js.native
      def onChange(color: Color): Unit = js.native
      
      /**
        * Current active color value.
        */
      var value: Color = js.native
    }
  }
}
