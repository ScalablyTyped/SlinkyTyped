package typingsSlinky.tern.anon

import typingsSlinky.tern.ternMod.PropertiesQuery
import typingsSlinky.tern.ternMod.PropertiesQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryPropertiesQuery extends js.Object {
  var query: PropertiesQuery
  var result: PropertiesQueryResult
}

object QueryPropertiesQuery {
  @scala.inline
  def apply(query: PropertiesQuery, result: PropertiesQueryResult): QueryPropertiesQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPropertiesQuery]
  }
}

