package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.menuMenuMenuMod.MenuMenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuMenu {
  
  @JSImport("semantic-ui-react", "MenuMenu")
  @js.native
  object component extends js.Object
  
  def withProps(p: MenuMenuProps): SharedBuilder_MenuMenuProps409808761 = new SharedBuilder_MenuMenuProps409808761(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: MenuMenu.type): SharedBuilder_MenuMenuProps409808761 = new SharedBuilder_MenuMenuProps409808761(js.Array(this.component, js.Dictionary.empty))()
}
