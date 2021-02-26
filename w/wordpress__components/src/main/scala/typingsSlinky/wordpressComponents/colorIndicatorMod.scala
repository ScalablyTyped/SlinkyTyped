package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.wordpressComponents.colorIndicatorMod.ColorIndicator.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorIndicatorMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/color-indicator", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object ColorIndicator {
    
    @js.native
    trait Props extends HTMLProps[HTMLSpanElement] {
      
      /**
        * A string color value.
        */
      var colorValue: String = js.native
    }
    object Props {
      
      @scala.inline
      def apply(colorValue: String): Props = {
        val __obj = js.Dynamic.literal(colorValue = colorValue.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColorValue(value: String): Self = StObject.set(x, "colorValue", value.asInstanceOf[js.Any])
      }
    }
  }
}
