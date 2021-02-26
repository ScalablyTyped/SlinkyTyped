package typingsSlinky.semanticUiApi.anon

import typingsSlinky.semanticUiApi.semanticUiApiStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'hideError'> */
@js.native
trait PickImplhideError extends StObject {
  
  var hideError: auto | Boolean = js.native
}
object PickImplhideError {
  
  @scala.inline
  def apply(hideError: auto | Boolean): PickImplhideError = {
    val __obj = js.Dynamic.literal(hideError = hideError.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhideError]
  }
  
  @scala.inline
  implicit class PickImplhideErrorMutableBuilder[Self <: PickImplhideError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHideError(value: auto | Boolean): Self = StObject.set(x, "hideError", value.asInstanceOf[js.Any])
  }
}
