package typingsSlinky.semanticUiSearch.anon

import typingsSlinky.semanticUiApi.SemanticUI.ApiSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'apiSettings'> */
@js.native
trait PickImplapiSettings extends StObject {
  
  var apiSettings: ApiSettings = js.native
}
object PickImplapiSettings {
  
  @scala.inline
  def apply(apiSettings: ApiSettings): PickImplapiSettings = {
    val __obj = js.Dynamic.literal(apiSettings = apiSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplapiSettings]
  }
  
  @scala.inline
  implicit class PickImplapiSettingsMutableBuilder[Self <: PickImplapiSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiSettings(value: ApiSettings): Self = StObject.set(x, "apiSettings", value.asInstanceOf[js.Any])
  }
}
