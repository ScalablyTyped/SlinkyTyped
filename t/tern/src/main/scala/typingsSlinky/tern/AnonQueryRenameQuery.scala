package typingsSlinky.tern

import typingsSlinky.tern.ternMod.RenameQuery
import typingsSlinky.tern.ternMod.RenameQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQueryRenameQuery extends js.Object {
  var query: RenameQuery = js.native
  var result: RenameQueryResult = js.native
}

object AnonQueryRenameQuery {
  @scala.inline
  def apply(query: RenameQuery, result: RenameQueryResult): AnonQueryRenameQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQueryRenameQuery]
  }
  @scala.inline
  implicit class AnonQueryRenameQueryOps[Self <: AnonQueryRenameQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuery(value: RenameQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: RenameQueryResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

