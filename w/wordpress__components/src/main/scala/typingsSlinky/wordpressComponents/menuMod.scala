package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressComponents.menuMod.NavigableMenu.Props
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.both
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.horizontal
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/navigable-container/menu", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object NavigableMenu {
    
    @js.native
    trait Props
      extends typingsSlinky.wordpressComponents.tabbableMod.TabbableContainer.Props {
      
      /**
        * The orientation of the menu.
        * @defaultValue "vertical"
        */
      var orientation: js.UndefOr[vertical | horizontal | both] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(Props: typingsSlinky.wordpressComponents.tabbableMod.TabbableContainer.Props): Props = {
        val __obj = js.Dynamic.literal()
        js.Dynamic.global.Object.assign(__obj, Props)
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOrientation(value: vertical | horizontal | both): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      }
    }
  }
}
