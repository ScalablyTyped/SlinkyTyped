package typingsSlinky.semanticUiSidebar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl, 'mobile'> */
@js.native
trait PickImplmobileMobile extends js.Object {
  
  var mobile: js.RegExp = js.native
}
object PickImplmobileMobile {
  
  @scala.inline
  def apply(mobile: js.RegExp): PickImplmobileMobile = {
    val __obj = js.Dynamic.literal(mobile = mobile.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmobileMobile]
  }
  
  @scala.inline
  implicit class PickImplmobileMobileOps[Self <: PickImplmobileMobile] (val x: Self) extends AnyVal {
    
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
    def setMobile(value: js.RegExp): Self = this.set("mobile", value.asInstanceOf[js.Any])
  }
}
