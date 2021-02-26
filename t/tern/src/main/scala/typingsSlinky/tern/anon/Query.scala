package typingsSlinky.tern.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query[Q /* <: typingsSlinky.tern.ternMod.Query */] extends StObject {
  
  var query: js.UndefOr[Q] = js.native
}
object Query {
  
  @scala.inline
  def apply[Q /* <: typingsSlinky.tern.ternMod.Query */](): Query[Q] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query[Q]]
  }
  
  @scala.inline
  implicit class QueryMutableBuilder[Self <: Query[_], Q /* <: typingsSlinky.tern.ternMod.Query */] (val x: Self with Query[Q]) extends AnyVal {
    
    @scala.inline
    def setQuery(value: Q): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
