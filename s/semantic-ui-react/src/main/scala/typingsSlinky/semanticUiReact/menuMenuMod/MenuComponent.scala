package typingsSlinky.semanticUiReact.menuMenuMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.semanticUiReact.menuHeaderMod.MenuHeaderProps
import typingsSlinky.semanticUiReact.menuItemMod.MenuItemProps
import typingsSlinky.semanticUiReact.menuMenuMenuMod.MenuMenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuComponent
  extends ComponentClass[MenuProps, js.Object] {
  
  var Header: ReactComponentClass[MenuHeaderProps] = js.native
  
  var Item: ReactComponentClass[MenuItemProps] = js.native
  
  var Menu: ReactComponentClass[MenuMenuProps] = js.native
}
