package typingsSlinky.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'pageDown'> */
@js.native
trait PickImplpageDown extends js.Object {
  
  var pageDown: Double = js.native
}
object PickImplpageDown {
  
  @scala.inline
  def apply(pageDown: Double): PickImplpageDown = {
    val __obj = js.Dynamic.literal(pageDown = pageDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpageDown]
  }
  
  @scala.inline
  implicit class PickImplpageDownOps[Self <: PickImplpageDown] (val x: Self) extends AnyVal {
    
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
    def setPageDown(value: Double): Self = this.set("pageDown", value.asInstanceOf[js.Any])
  }
}
