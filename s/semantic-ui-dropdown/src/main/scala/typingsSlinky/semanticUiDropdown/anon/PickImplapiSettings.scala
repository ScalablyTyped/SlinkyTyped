package typingsSlinky.semanticUiDropdown.anon

import typingsSlinky.semanticUiApi.SemanticUI.ApiSettings
import typingsSlinky.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'apiSettings'> */
@js.native
trait PickImplapiSettings extends StObject {
  
  var apiSettings: `false` | ApiSettings = js.native
}
object PickImplapiSettings {
  
  @scala.inline
  def apply(apiSettings: `false` | ApiSettings): PickImplapiSettings = {
    val __obj = js.Dynamic.literal(apiSettings = apiSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplapiSettings]
  }
  
  @scala.inline
  implicit class PickImplapiSettingsMutableBuilder[Self <: PickImplapiSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiSettings(value: `false` | ApiSettings): Self = StObject.set(x, "apiSettings", value.asInstanceOf[js.Any])
  }
}
