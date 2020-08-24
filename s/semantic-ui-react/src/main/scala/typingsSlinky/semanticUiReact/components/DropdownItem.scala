package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.dropdownItemMod.DropdownItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DropdownItem {
  @JSImport("semantic-ui-react", "DropdownItem")
  @js.native
  object component extends js.Object
  
  def withProps(p: DropdownItemProps): SharedBuilder_DropdownItemProps_1338970085 = new SharedBuilder_DropdownItemProps_1338970085(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DropdownItem.type): SharedBuilder_DropdownItemProps_1338970085 = new SharedBuilder_DropdownItemProps_1338970085(js.Array(this.component, js.Dictionary.empty))()
}

