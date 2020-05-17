package typingsSlinky.tern.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query[Q /* <: typingsSlinky.tern.ternMod.Query */] extends js.Object {
  var query: js.UndefOr[Q] = js.native
}

object Query {
  @scala.inline
  def apply[Q](): Query[Q] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query[Q]]
  }
  @scala.inline
  implicit class QueryOps[Self[q] <: Query[q], Q] (val x: Self[Q]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Q] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Q]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Q] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Q] with Other]
    @scala.inline
    def withQuery(value: Q): Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self[Q] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
  }
  
}

