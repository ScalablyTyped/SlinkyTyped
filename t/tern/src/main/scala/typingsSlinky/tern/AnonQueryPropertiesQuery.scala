package typingsSlinky.tern

import typingsSlinky.tern.ternMod.PropertiesQuery
import typingsSlinky.tern.ternMod.PropertiesQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonQueryPropertiesQuery extends js.Object {
  var query: PropertiesQuery = js.native
  var result: PropertiesQueryResult = js.native
}

object AnonQueryPropertiesQuery {
  @scala.inline
  def apply(query: PropertiesQuery, result: PropertiesQueryResult): AnonQueryPropertiesQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQueryPropertiesQuery]
  }
  @scala.inline
  implicit class AnonQueryPropertiesQueryOps[Self <: AnonQueryPropertiesQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuery(value: PropertiesQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: PropertiesQueryResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

