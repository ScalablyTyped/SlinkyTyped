package typingsSlinky.tern

import typingsSlinky.tern.ternMod.DocumentationQuery
import typingsSlinky.tern.ternMod.DocumentationQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQueryDocumentationQuery extends js.Object {
  var query: DocumentationQuery = js.native
  var result: DocumentationQueryResult = js.native
}

object AnonQueryDocumentationQuery {
  @scala.inline
  def apply(query: DocumentationQuery, result: DocumentationQueryResult): AnonQueryDocumentationQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQueryDocumentationQuery]
  }
  @scala.inline
  implicit class AnonQueryDocumentationQueryOps[Self <: AnonQueryDocumentationQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuery(value: DocumentationQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: DocumentationQueryResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

