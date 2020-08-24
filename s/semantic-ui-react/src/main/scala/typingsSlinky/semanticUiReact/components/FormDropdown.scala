package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.formDropdownMod.FormDropdownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormDropdown {
  @JSImport("semantic-ui-react", "FormDropdown")
  @js.native
  object component extends js.Object
  
  def withProps(p: FormDropdownProps): SharedBuilder_FormDropdownProps_700647571 = new SharedBuilder_FormDropdownProps_700647571(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FormDropdown.type): SharedBuilder_FormDropdownProps_700647571 = new SharedBuilder_FormDropdownProps_700647571(js.Array(this.component, js.Dictionary.empty))()
}

