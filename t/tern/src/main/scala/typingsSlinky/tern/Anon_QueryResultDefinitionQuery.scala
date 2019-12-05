package typingsSlinky.tern

import typingsSlinky.tern.libTernMod.DefinitionQuery
import typingsSlinky.tern.libTernMod.DefinitionQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryResultDefinitionQuery extends js.Object {
  var query: DefinitionQuery
  var result: DefinitionQueryResult
}

object Anon_QueryResultDefinitionQuery {
  @scala.inline
  def apply(query: DefinitionQuery, result: DefinitionQueryResult): Anon_QueryResultDefinitionQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_QueryResultDefinitionQuery]
  }
}

