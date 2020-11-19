package typingsSlinky.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'hideAdditions'> */
@js.native
trait PickImplhideAdditions extends js.Object {
  
  var hideAdditions: Boolean = js.native
}
object PickImplhideAdditions {
  
  @scala.inline
  def apply(hideAdditions: Boolean): PickImplhideAdditions = {
    val __obj = js.Dynamic.literal(hideAdditions = hideAdditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhideAdditions]
  }
  
  @scala.inline
  implicit class PickImplhideAdditionsOps[Self <: PickImplhideAdditions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHideAdditions(value: Boolean): Self = this.set("hideAdditions", value.asInstanceOf[js.Any])
  }
}
