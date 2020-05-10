package typingsSlinky.tern

import typingsSlinky.tern.ternMod.RefsQuery
import typingsSlinky.tern.ternMod.RefsQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQueryRefsQuery extends js.Object {
  var query: RefsQuery = js.native
  var result: RefsQueryResult = js.native
}

object AnonQueryRefsQuery {
  @scala.inline
  def apply(query: RefsQuery, result: RefsQueryResult): AnonQueryRefsQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQueryRefsQuery]
  }
  @scala.inline
  implicit class AnonQueryRefsQueryOps[Self <: AnonQueryRefsQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuery(value: RefsQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: RefsQueryResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

