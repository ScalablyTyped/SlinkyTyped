package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressComponents.buttonMod.Button.ButtonProps
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import typingsSlinky.wordpressComponents.iconButtonMod.IconButton.Props
import typingsSlinky.wordpressComponents.popoverMod.Popover.Position
import typingsSlinky.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconButtonMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/icon-button", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object IconButton {
    
    @js.native
    trait Props extends ButtonProps {
      
      /**
        * Icon to use. Either a Dashicon slug or a custom component.
        */
      var icon: Icon | ReactElement = js.native
      
      /**
        * Position for the label.
        * @defaultValue "top"
        */
      var labelPosition: js.UndefOr[Position] = js.native
      
      var shortcut: js.UndefOr[ShortcutType] = js.native
      
      /**
        * Tooltip text to display.
        * @defaultValue Props.label
        */
      var tooltip: js.UndefOr[String] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(icon: Icon | ReactElement): Props = {
        val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIcon(value: Icon | ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelPosition(value: Position): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
        
        @scala.inline
        def setShortcut(value: ShortcutType): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
        
        @scala.inline
        def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      }
    }
  }
}
