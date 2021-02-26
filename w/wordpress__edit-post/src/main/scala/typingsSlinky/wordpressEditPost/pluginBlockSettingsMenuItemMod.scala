package typingsSlinky.wordpressEditPost

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import typingsSlinky.wordpressEditPost.pluginBlockSettingsMenuItemMod.PluginBlockSettingsMenuItem.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginBlockSettingsMenuItemMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/edit-post/components/block-settings-menu/plugin-block-settings-menu-item", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PluginBlockSettingsMenuItem {
    
    @js.native
    trait Props extends StObject {
      
      /**
        * An array containing a list of block names for which the item should be shown. If not present,
        * it'll be rendered for any block. If multiple blocks are selected, it'll be shown if and only if
        * all of them are in the whitelist.
        */
      var allowedBlocks: js.UndefOr[js.Array[String]] = js.native
      
      /**
        * A dashicon slug, or a custom JSX element.
        * @defaultValue `"admin-plugins"`
        */
      var icon: js.UndefOr[ReactElement | Icon] = js.native
      
      /**
        * The menu item text.
        */
      var label: String = js.native
      
      /**
        * Callback function to be executed when the user click the menu item.
        */
      var onClick: MouseEventHandler[HTMLButtonElement] = js.native
      
      /**
        * If it should be rendered smaller. (This is undocumented).
        */
      var small: js.UndefOr[Boolean] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(label: String, onClick: SyntheticMouseEvent[HTMLButtonElement] => Unit): Props = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowedBlocks(value: js.Array[String]): Self = StObject.set(x, "allowedBlocks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowedBlocksUndefined: Self = StObject.set(x, "allowedBlocks", js.undefined)
        
        @scala.inline
        def setAllowedBlocksVarargs(value: String*): Self = StObject.set(x, "allowedBlocks", js.Array(value :_*))
        
        @scala.inline
        def setIcon(value: ReactElement | Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
      }
    }
  }
}
