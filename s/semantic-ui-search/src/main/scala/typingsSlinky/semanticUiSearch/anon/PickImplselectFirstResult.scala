package typingsSlinky.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'selectFirstResult'> */
@js.native
trait PickImplselectFirstResult extends StObject {
  
  var selectFirstResult: Boolean = js.native
}
object PickImplselectFirstResult {
  
  @scala.inline
  def apply(selectFirstResult: Boolean): PickImplselectFirstResult = {
    val __obj = js.Dynamic.literal(selectFirstResult = selectFirstResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplselectFirstResult]
  }
  
  @scala.inline
  implicit class PickImplselectFirstResultMutableBuilder[Self <: PickImplselectFirstResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectFirstResult(value: Boolean): Self = StObject.set(x, "selectFirstResult", value.asInstanceOf[js.Any])
  }
}
