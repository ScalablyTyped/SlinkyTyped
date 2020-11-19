package typingsSlinky.tern.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryQuery extends js.Object {
  
  var query: typingsSlinky.tern.ternMod.Query = js.native
}
object QueryQuery {
  
  @scala.inline
  def apply(query: typingsSlinky.tern.ternMod.Query): QueryQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryQuery]
  }
  
  @scala.inline
  implicit class QueryQueryOps[Self <: QueryQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQuery(value: typingsSlinky.tern.ternMod.Query): Self = this.set("query", value.asInstanceOf[js.Any])
  }
}
