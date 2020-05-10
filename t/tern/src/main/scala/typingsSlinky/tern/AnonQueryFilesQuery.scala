package typingsSlinky.tern

import typingsSlinky.tern.ternMod.FilesQuery
import typingsSlinky.tern.ternMod.FilesQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQueryFilesQuery extends js.Object {
  var query: FilesQuery = js.native
  var result: FilesQueryResult = js.native
}

object AnonQueryFilesQuery {
  @scala.inline
  def apply(query: FilesQuery, result: FilesQueryResult): AnonQueryFilesQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQueryFilesQuery]
  }
  @scala.inline
  implicit class AnonQueryFilesQueryOps[Self <: AnonQueryFilesQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuery(value: FilesQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: FilesQueryResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

