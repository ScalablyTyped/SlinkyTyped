package typingsSlinky.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'maxResults'> */
@js.native
trait PickImplmaxResults extends StObject {
  
  var maxResults: Double = js.native
}
object PickImplmaxResults {
  
  @scala.inline
  def apply(maxResults: Double): PickImplmaxResults = {
    val __obj = js.Dynamic.literal(maxResults = maxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxResults]
  }
  
  @scala.inline
  implicit class PickImplmaxResultsMutableBuilder[Self <: PickImplmaxResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
  }
}
