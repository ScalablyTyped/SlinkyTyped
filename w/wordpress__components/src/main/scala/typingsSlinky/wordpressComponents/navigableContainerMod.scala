package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.wordpressComponents.menuMod.NavigableMenu.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigableContainerMod {
  
  object NavigableMenu extends Shortcut {
    
    @JSImport("@wordpress/components/navigable-container", "NavigableMenu")
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `NavigableMenu.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object TabbableContainer extends Shortcut {
    
    @JSImport("@wordpress/components/navigable-container", "TabbableContainer")
    @js.native
    val ^ : ComponentType[typingsSlinky.wordpressComponents.tabbableMod.TabbableContainer.Props] = js.native
    
    type _To = ComponentType[typingsSlinky.wordpressComponents.tabbableMod.TabbableContainer.Props]
    
    /* This means you don't have to write `^`, but can instead just say `TabbableContainer.foo` */
    override def _to: ComponentType[typingsSlinky.wordpressComponents.tabbableMod.TabbableContainer.Props] = ^
  }
}
