package typingsSlinky.semanticUiApi.anon

import typingsSlinky.semanticUiApi.semanticUiApiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'urlData'> */
@js.native
trait PickImplurlData extends StObject {
  
  var urlData: js.Any | `false` = js.native
}
object PickImplurlData {
  
  @scala.inline
  def apply(urlData: js.Any | `false`): PickImplurlData = {
    val __obj = js.Dynamic.literal(urlData = urlData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplurlData]
  }
  
  @scala.inline
  implicit class PickImplurlDataMutableBuilder[Self <: PickImplurlData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrlData(value: js.Any | `false`): Self = StObject.set(x, "urlData", value.asInstanceOf[js.Any])
  }
}
