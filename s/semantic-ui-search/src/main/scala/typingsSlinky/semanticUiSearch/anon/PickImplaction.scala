package typingsSlinky.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.FieldsSettings._Impl, 'action'> */
@js.native
trait PickImplaction extends StObject {
  
  var action: String = js.native
}
object PickImplaction {
  
  @scala.inline
  def apply(action: String): PickImplaction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplaction]
  }
  
  @scala.inline
  implicit class PickImplactionMutableBuilder[Self <: PickImplaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
