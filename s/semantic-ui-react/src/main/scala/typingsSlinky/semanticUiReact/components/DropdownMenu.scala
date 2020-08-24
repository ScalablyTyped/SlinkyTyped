package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.dropdownMenuMod.DropdownMenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DropdownMenu {
  @JSImport("semantic-ui-react", "DropdownMenu")
  @js.native
  object component extends js.Object
  
  def withProps(p: DropdownMenuProps): SharedBuilder_DropdownMenuProps188553549 = new SharedBuilder_DropdownMenuProps188553549(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DropdownMenu.type): SharedBuilder_DropdownMenuProps188553549 = new SharedBuilder_DropdownMenuProps188553549(js.Array(this.component, js.Dictionary.empty))()
}

