package typingsSlinky.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.MetadataSettings._Impl, 'results'> */
@js.native
trait PickImplresults extends StObject {
  
  var results: String = js.native
}
object PickImplresults {
  
  @scala.inline
  def apply(results: String): PickImplresults = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplresults]
  }
  
  @scala.inline
  implicit class PickImplresultsMutableBuilder[Self <: PickImplresults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResults(value: String): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
