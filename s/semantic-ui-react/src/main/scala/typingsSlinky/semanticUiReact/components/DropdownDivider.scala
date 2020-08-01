package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.dropdownDividerMod.DropdownDividerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DropdownDivider {
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownDivider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: DropdownDividerProps): SharedBuilder_DropdownDividerProps1707744239 = new SharedBuilder_DropdownDividerProps1707744239(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DropdownDivider.type): SharedBuilder_DropdownDividerProps1707744239 = new SharedBuilder_DropdownDividerProps1707744239(js.Array(this.component, js.Dictionary.empty))()
}

