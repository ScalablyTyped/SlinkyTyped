package typingsSlinky.tern.anon

import typingsSlinky.tern.ternMod.RefsQuery
import typingsSlinky.tern.ternMod.RefsQueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryRefsQuery extends StObject {
  
  var query: RefsQuery = js.native
  
  var result: RefsQueryResult = js.native
}
object QueryRefsQuery {
  
  @scala.inline
  def apply(query: RefsQuery, result: RefsQueryResult): QueryRefsQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRefsQuery]
  }
  
  @scala.inline
  implicit class QueryRefsQueryMutableBuilder[Self <: QueryRefsQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: RefsQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: RefsQueryResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
