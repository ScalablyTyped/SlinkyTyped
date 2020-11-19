package typingsSlinky.semanticUiPopup.SemanticUI.Popup.SelectorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.SelectorSettings._Impl, 'popup'> & std.Partial<std.Pick<semantic-ui-popup.SemanticUI.Popup.SelectorSettings._Impl, keyof semantic-ui-popup.SemanticUI.Popup.SelectorSettings._Impl>> */
@js.native
trait Param extends js.Object {
  
  var popup: String with js.UndefOr[String] = js.native
}
object Param {
  
  @scala.inline
  def apply(popup: String with js.UndefOr[String]): Param = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Param]
  }
  
  @scala.inline
  implicit class ParamOps[Self <: Param] (val x: Self) extends AnyVal {
    
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
    def setPopup(value: String with js.UndefOr[String]): Self = this.set("popup", value.asInstanceOf[js.Any])
  }
}
