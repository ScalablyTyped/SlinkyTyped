package typingsSlinky.semanticUiDropdown.anon

import typingsSlinky.semanticUiApi.SemanticUI.ApiSettings
import typingsSlinky.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'apiSettings'> */
@js.native
trait PickImplapiSettings extends js.Object {
  
  var apiSettings: `false` | ApiSettings = js.native
}
object PickImplapiSettings {
  
  @scala.inline
  def apply(apiSettings: `false` | ApiSettings): PickImplapiSettings = {
    val __obj = js.Dynamic.literal(apiSettings = apiSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplapiSettings]
  }
  
  @scala.inline
  implicit class PickImplapiSettingsOps[Self <: PickImplapiSettings] (val x: Self) extends AnyVal {
    
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
    def setApiSettings(value: `false` | ApiSettings): Self = this.set("apiSettings", value.asInstanceOf[js.Any])
  }
}
