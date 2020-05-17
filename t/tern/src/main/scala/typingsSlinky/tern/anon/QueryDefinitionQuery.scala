package typingsSlinky.tern.anon

import typingsSlinky.tern.ternMod.DefinitionQuery
import typingsSlinky.tern.ternMod.DefinitionQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryDefinitionQuery extends js.Object {
  var query: DefinitionQuery = js.native
  var result: DefinitionQueryResult = js.native
}

object QueryDefinitionQuery {
  @scala.inline
  def apply(query: DefinitionQuery, result: DefinitionQueryResult): QueryDefinitionQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDefinitionQuery]
  }
  @scala.inline
  implicit class QueryDefinitionQueryOps[Self <: QueryDefinitionQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuery(value: DefinitionQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: DefinitionQueryResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

