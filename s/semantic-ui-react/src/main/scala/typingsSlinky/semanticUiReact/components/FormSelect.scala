package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.dropdownItemMod.DropdownItemProps
import typingsSlinky.semanticUiReact.formSelectMod.FormSelectProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormSelect {
  @JSImport("semantic-ui-react/dist/commonjs/collections/Form/FormSelect", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: FormSelectProps): SharedBuilder_FormSelectProps1696265872 = new SharedBuilder_FormSelectProps1696265872(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(options: js.Array[DropdownItemProps]): SharedBuilder_FormSelectProps1696265872 = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new SharedBuilder_FormSelectProps1696265872(js.Array(this.component, __props.asInstanceOf[FormSelectProps]))
  }
}

