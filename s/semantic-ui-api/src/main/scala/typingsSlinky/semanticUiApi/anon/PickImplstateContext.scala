package typingsSlinky.semanticUiApi.anon

import typingsSlinky.semanticUiApi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'stateContext'> */
@js.native
trait PickImplstateContext extends StObject {
  
  var stateContext: String | JQuery = js.native
}
object PickImplstateContext {
  
  @scala.inline
  def apply(stateContext: String | JQuery): PickImplstateContext = {
    val __obj = js.Dynamic.literal(stateContext = stateContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplstateContext]
  }
  
  @scala.inline
  implicit class PickImplstateContextMutableBuilder[Self <: PickImplstateContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStateContext(value: String | JQuery): Self = StObject.set(x, "stateContext", value.asInstanceOf[js.Any])
  }
}
