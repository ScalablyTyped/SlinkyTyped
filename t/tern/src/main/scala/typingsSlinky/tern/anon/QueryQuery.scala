package typingsSlinky.tern.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryQuery extends StObject {
  
  var query: typingsSlinky.tern.ternMod.Query = js.native
}
object QueryQuery {
  
  @scala.inline
  def apply(query: typingsSlinky.tern.ternMod.Query): QueryQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryQuery]
  }
  
  @scala.inline
  implicit class QueryQueryMutableBuilder[Self <: QueryQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: typingsSlinky.tern.ternMod.Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
