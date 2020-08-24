package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.formCheckboxMod.FormCheckboxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormCheckbox {
  @JSImport("semantic-ui-react", "FormCheckbox")
  @js.native
  object component extends js.Object
  
  def withProps(p: FormCheckboxProps): SharedBuilder_FormCheckboxProps_2041231147 = new SharedBuilder_FormCheckboxProps_2041231147(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FormCheckbox.type): SharedBuilder_FormCheckboxProps_2041231147 = new SharedBuilder_FormCheckboxProps_2041231147(js.Array(this.component, js.Dictionary.empty))()
}

