package typingsSlinky.semanticUiReact.components

import typingsSlinky.semanticUiReact.dropdownItemMod.DropdownItemProps
import typingsSlinky.semanticUiReact.formSelectMod.FormSelectProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormSelect {
  
  @scala.inline
  def apply(options: js.Array[DropdownItemProps]): SharedBuilder_FormSelectProps1696265872 = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new SharedBuilder_FormSelectProps1696265872(js.Array(this.component, __props.asInstanceOf[FormSelectProps]))
  }
  
  @JSImport("semantic-ui-react", "FormSelect")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FormSelectProps): SharedBuilder_FormSelectProps1696265872 = new SharedBuilder_FormSelectProps1696265872(js.Array(this.component, p.asInstanceOf[js.Any]))
}
