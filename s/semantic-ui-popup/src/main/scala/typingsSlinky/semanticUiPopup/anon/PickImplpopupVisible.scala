package typingsSlinky.semanticUiPopup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl, 'popupVisible'> */
@js.native
trait PickImplpopupVisible extends js.Object {
  
  var popupVisible: String = js.native
}
object PickImplpopupVisible {
  
  @scala.inline
  def apply(popupVisible: String): PickImplpopupVisible = {
    val __obj = js.Dynamic.literal(popupVisible = popupVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpopupVisible]
  }
  
  @scala.inline
  implicit class PickImplpopupVisibleOps[Self <: PickImplpopupVisible] (val x: Self) extends AnyVal {
    
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
    def setPopupVisible(value: String): Self = this.set("popupVisible", value.asInstanceOf[js.Any])
  }
}
